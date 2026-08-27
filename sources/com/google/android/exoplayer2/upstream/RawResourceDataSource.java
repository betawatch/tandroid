package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class RawResourceDataSource extends g {
    public final Resources a;
    public final String b;
    public Uri c;
    public AssetFileDescriptor d;
    public FileInputStream e;
    public long f;
    public boolean h;

    public RawResourceDataSource(Context context) {
        super(false);
        this.a = context.getResources();
        this.b = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        this.c = null;
        try {
            try {
                FileInputStream fileInputStream = this.e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new u0(null, e9, 2000);
                    }
                } finally {
                    this.d = null;
                    if (this.h) {
                        this.h = false;
                        transferEnded();
                    }
                }
            } catch (IOException e10) {
                throw new u0(null, e10, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.h) {
                        this.h = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new u0(null, e11, 2000);
                }
            } finally {
                this.d = null;
                if (this.h) {
                    this.h = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (r7.matches("\\d+") != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    @Override // com.google.android.exoplayer2.upstream.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(q qVar) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri uri = qVar.a;
        long j10 = qVar.f;
        long j11 = qVar.e;
        this.c = uri;
        boolean equals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.a;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new u0("URI must either use scheme rawresource or android.resource", null, 1004);
                    }
                    String path = uri.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    parseInt = resources.getIdentifier(a9.p.p(new StringBuilder(), TextUtils.isEmpty(host) ? "" : s3.c.l(host, ":"), path), "raw", this.b);
                    if (parseInt == 0) {
                        throw new u0("Resource not found.", null, 2005);
                    }
                    transferInitializing(qVar);
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    this.d = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new u0("Resource is compressed: " + uri, null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.e = fileInputStream;
                    try {
                        if (length != -1 && j11 > length) {
                            throw new u0(null, null, 2008);
                        }
                        long startOffset = openRawResourceFd.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                        if (skip != j11) {
                            throw new u0(null, null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f = size;
                                if (size < 0) {
                                    throw new u0(null, null, 2008);
                                }
                            }
                        } else {
                            long j12 = length - skip;
                            this.f = j12;
                            if (j12 < 0) {
                                throw new n(2008);
                            }
                        }
                        if (j10 != -1) {
                            long j13 = this.f;
                            this.f = j13 == -1 ? j10 : Math.min(j13, j10);
                        }
                        this.h = true;
                        transferStarted(qVar);
                        return j10 != -1 ? j10 : this.f;
                    } catch (u0 e9) {
                        throw e9;
                    } catch (IOException e10) {
                        throw new u0(null, e10, 2000);
                    }
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.d = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e11) {
                throw new u0(null, e11, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            transferInitializing(qVar);
        } catch (NumberFormatException unused) {
            throw new u0("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e9) {
                    throw new u0(null, e9, 2000);
                }
            }
            FileInputStream fileInputStream = this.e;
            int i12 = d5.g0.a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j11 = this.f;
                if (j11 != -1) {
                    this.f = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
            if (this.f != -1) {
                throw new u0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}

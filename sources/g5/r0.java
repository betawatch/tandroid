package g5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r0 extends g {
    public final Resources a;
    public final String b;
    public Uri c;
    public AssetFileDescriptor d;
    public FileInputStream e;
    public long f;
    public boolean h;

    public r0(Context context) {
        super(false);
        this.a = context.getResources();
        this.b = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // g5.m
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
                    } catch (IOException e) {
                        throw new q0(null, e, 2000);
                    }
                } finally {
                    this.d = null;
                    if (this.h) {
                        this.h = false;
                        transferEnded();
                    }
                }
            } catch (IOException e6) {
                throw new q0(null, e6, 2000);
            }
        } catch (Throwable th2) {
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
                    throw th2;
                } catch (IOException e10) {
                    throw new q0(null, e10, 2000);
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

    @Override // g5.m
    public final Uri getUri() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r7.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    @Override // g5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(p pVar) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri uri = pVar.a;
        long j10 = pVar.f;
        long j11 = pVar.e;
        Uri normalizeScheme = uri.normalizeScheme();
        this.c = normalizeScheme;
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Resources resources = this.a;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", normalizeScheme.getScheme()) && normalizeScheme.getPathSegments().size() == 1) {
                        String lastPathSegment = normalizeScheme.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                        throw new q0("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
                    }
                    String path = normalizeScheme.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = normalizeScheme.getHost();
                    parseInt = resources.getIdentifier(android.support.v4.media.a.r(new StringBuilder(), TextUtils.isEmpty(host) ? "" : w2.k(host, ":"), path), "raw", this.b);
                    if (parseInt == 0) {
                        throw new q0("Resource not found.", null, 2005);
                    }
                    transferInitializing(pVar);
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    this.d = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new q0("Resource is compressed: " + normalizeScheme, null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.e = fileInputStream;
                    try {
                        if (length != -1 && j11 > length) {
                            throw new q0(null, null, 2008);
                        }
                        long startOffset = openRawResourceFd.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                        if (skip != j11) {
                            throw new q0(null, null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f = size;
                                if (size < 0) {
                                    throw new q0(null, null, 2008);
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
                        transferStarted(pVar);
                        return j10 != -1 ? j10 : this.f;
                    } catch (q0 e) {
                        throw e;
                    } catch (IOException e6) {
                        throw new q0(null, e6, 2000);
                    }
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.d = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e10) {
                throw new q0(null, e10, 2005);
            }
            String lastPathSegment2 = normalizeScheme.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            transferInitializing(pVar);
        } catch (NumberFormatException unused) {
            throw new q0("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e) {
                    throw new q0(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.e;
            int i12 = h5.d0.a;
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
                throw new q0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}

package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends g {
    public final ContentResolver a;
    public Uri b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public i(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        this.b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new h(e10, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e11) {
                throw new h(e11, 2000);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new h(e12, 2000);
                }
            } finally {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final long open(q qVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = qVar.a;
            long j10 = qVar.f;
            long j11 = qVar.e;
            this.b = uri;
            transferInitializing(qVar);
            boolean equals = "content".equals(qVar.a.getScheme());
            ContentResolver contentResolver = this.a;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.c = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new h(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.d = fileInputStream;
            if (length != -1 && j11 > length) {
                throw new h(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j11) - startOffset;
            if (skip != j11) {
                throw new h(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.e = -1L;
                } else {
                    long position = size - channel.position();
                    this.e = position;
                    if (position < 0) {
                        throw new h(null, 2008);
                    }
                }
            } else {
                long j12 = length - skip;
                this.e = j12;
                if (j12 < 0) {
                    throw new h(null, 2008);
                }
            }
            if (j10 != -1) {
                long j13 = this.e;
                this.e = j13 == -1 ? j10 : Math.min(j13, j10);
            }
            this.f = true;
            transferStarted(qVar);
            return j10 != -1 ? j10 : this.e;
        } catch (h e10) {
            throw e10;
        } catch (IOException e11) {
            throw new h(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new h(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            int i11 = d5.f0.a;
            int read = fileInputStream.read(bArr, i9, i10);
            if (read != -1) {
                long j11 = this.e;
                if (j11 != -1) {
                    this.e = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}

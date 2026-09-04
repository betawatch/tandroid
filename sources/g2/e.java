package g2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e extends c {
    public final ContentResolver a;
    public Uri b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public e(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // g2.h
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
                    } catch (IOException e7) {
                        throw new d(e7, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e10) {
                throw new d(e10, 2000);
            }
        } catch (Throwable th2) {
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
                    throw th2;
                } catch (IOException e11) {
                    throw new d(e11, 2000);
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

    @Override // g2.h
    public final Uri getUri() {
        return this.b;
    }

    @Override // g2.h
    public final long open(m mVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = mVar.a;
            long j3 = mVar.f;
            long j10 = mVar.e;
            Uri normalizeScheme = uri.normalizeScheme();
            this.b = normalizeScheme;
            transferInitializing(mVar);
            boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
            ContentResolver contentResolver = this.a;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.c = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new d(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.d = fileInputStream;
            if (length != -1 && j10 > length) {
                throw new d(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j10) - startOffset;
            if (skip != j10) {
                throw new d(null, 2008);
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
                        throw new d(null, 2008);
                    }
                }
            } else {
                long j11 = length - skip;
                this.e = j11;
                if (j11 < 0) {
                    throw new d(null, 2008);
                }
            }
            if (j3 != -1) {
                long j12 = this.e;
                this.e = j12 == -1 ? j3 : Math.min(j12, j3);
            }
            this.f = true;
            transferStarted(mVar);
            return j3 != -1 ? j3 : this.e;
        } catch (d e7) {
            throw e7;
        } catch (IOException e10) {
            throw new d(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // b2.k
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.e;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i11 = (int) Math.min(j3, i11);
                } catch (IOException e7) {
                    throw new d(e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = e2.d0.a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j10 = this.e;
                if (j10 != -1) {
                    this.e = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}

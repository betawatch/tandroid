package g5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // g5.m
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
                    } catch (IOException e) {
                        throw new h(e, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e6) {
                throw new h(e6, 2000);
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
        }
    }

    @Override // g5.m
    public final Uri getUri() {
        return this.b;
    }

    @Override // g5.m
    public final long open(p pVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = pVar.a;
            long j10 = pVar.f;
            long j11 = pVar.e;
            Uri normalizeScheme = uri.normalizeScheme();
            this.b = normalizeScheme;
            transferInitializing(pVar);
            boolean equals = "content".equals(normalizeScheme.getScheme());
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
                throw new h(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
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
            transferStarted(pVar);
            return j10 != -1 ? j10 : this.e;
        } catch (h e) {
            throw e;
        } catch (IOException e6) {
            throw new h(e6, e6 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e) {
                    throw new h(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            int i12 = h5.d0.a;
            int read = fileInputStream.read(bArr, i10, i11);
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

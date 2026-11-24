// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jw2 extends qg0 {
    public final ContentResolver a;
    public Uri b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public jw2(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // a83
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
                        throw new iw2(e, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new iw2(e2, 2000);
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
                } catch (IOException e3) {
                    throw new iw2(e3, 2000);
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

    @Override // a83
    public final Uri getUri() {
        return this.b;
    }

    @Override // a83
    public final long open(g83 g83Var) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = g83Var.a;
                long j2 = g83Var.f;
                long j3 = g83Var.e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.b = normalizeScheme;
                transferInitializing(g83Var);
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
                    i = 2000;
                    try {
                        throw new iw2(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new iw2(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                if (length != -1 && j3 > length) {
                    throw new iw2(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (skip != j3) {
                    throw new iw2(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.e = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.e = j;
                        if (j < 0) {
                            throw new iw2(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.e = j;
                    if (j < 0) {
                        throw new iw2(null, 2008);
                    }
                }
                if (j2 != -1) {
                    this.e = j == -1 ? j2 : Math.min(j, j2);
                }
                this.f = true;
                transferStarted(g83Var);
                return j2 != -1 ? j2 : this.e;
            } catch (iw2 e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // s73
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new iw2(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = hac.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.e;
                if (j2 != -1) {
                    this.e = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}

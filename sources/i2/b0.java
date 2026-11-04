package i2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import g2.n0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends c {
    public final Context a;
    public n b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public b0(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i3) {
        return Uri.parse("rawresource:///" + i3);
    }

    @Override // i2.h
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
                        throw new a0(null, e10, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e11) {
                throw new a0(null, e11, 2000);
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
                } catch (IOException e12) {
                    throw new a0(null, e12, 2000);
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

    @Override // i2.h
    public final Uri getUri() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar.a;
        }
        return null;
    }

    @Override // i2.h
    public final long open(n nVar) {
        Resources resourcesForApplication;
        int parseInt;
        int i3;
        Resources resources;
        this.b = nVar;
        transferInitializing(nVar);
        Uri uri = nVar.a;
        long j10 = nVar.f;
        long j11 = nVar.e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a0("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i3 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new a0("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new a0("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new a0("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(a1.g.C(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new a0("Resource not found.", null, 2005);
                }
            }
            i3 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i3);
            if (openRawResourceFd == null) {
                throw new a0("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.c = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
            this.d = fileInputStream;
            try {
                if (length != -1 && j11 > length) {
                    throw new a0(null, null, 2008);
                }
                long startOffset = this.c.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (skip != j11) {
                    throw new a0(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.e = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.e = size;
                        if (size < 0) {
                            throw new a0(null, null, 2008);
                        }
                    }
                } else {
                    long j12 = length - skip;
                    this.e = j12;
                    if (j12 < 0) {
                        throw new k(2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.e;
                    this.e = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f = true;
                transferStarted(nVar);
                return j10 != -1 ? j10 : this.e;
            } catch (a0 e11) {
                throw e11;
            } catch (IOException e12) {
                throw new a0(null, e12, 2000);
            }
        } catch (Resources.NotFoundException e13) {
            throw new a0(null, e13, 2005);
        }
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new a0(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = n0.a;
            int read = fileInputStream.read(bArr, i3, i10);
            if (read != -1) {
                long j11 = this.e;
                if (j11 != -1) {
                    this.e = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
            if (this.e != -1) {
                throw new a0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}

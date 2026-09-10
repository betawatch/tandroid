package g2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a0 extends c {
    public final Context a;
    public m b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public a0(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
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
                    } catch (IOException e) {
                        throw new z(null, e, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e7) {
                throw new z(null, e7, 2000);
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
                    throw new z(null, e10, 2000);
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
        m mVar = this.b;
        if (mVar != null) {
            return mVar.a;
        }
        return null;
    }

    @Override // g2.h
    public final long open(m mVar) {
        Resources resourcesForApplication;
        int parseInt;
        int i10;
        Resources resources;
        this.b = mVar;
        transferInitializing(mVar);
        Uri uri = mVar.a;
        long j3 = mVar.f;
        long j10 = mVar.e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new z("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new z("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new z("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
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
                } catch (PackageManager.NameNotFoundException e) {
                    throw new z("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new z("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(a4.a.C(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new z("Resource not found.", null, 2005);
                }
            }
            i10 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i10);
            if (openRawResourceFd == null) {
                throw new z("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.c = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
            this.d = fileInputStream;
            try {
                if (length != -1 && j10 > length) {
                    throw new z(null, null, 2008);
                }
                long startOffset = this.c.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (skip != j10) {
                    throw new z(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.e = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.e = size;
                        if (size < 0) {
                            throw new z(null, null, 2008);
                        }
                    }
                } else {
                    long j11 = length - skip;
                    this.e = j11;
                    if (j11 < 0) {
                        throw new j(2008);
                    }
                }
                if (j3 != -1) {
                    long j12 = this.e;
                    this.e = j12 == -1 ? j3 : Math.min(j12, j3);
                }
                this.f = true;
                transferStarted(mVar);
                return j3 != -1 ? j3 : this.e;
            } catch (z e7) {
                throw e7;
            } catch (IOException e10) {
                throw new z(null, e10, 2000);
            }
        } catch (Resources.NotFoundException e11) {
            throw new z(null, e11, 2005);
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
                } catch (IOException e) {
                    throw new z(null, e, 2000);
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
            if (this.e != -1) {
                throw new z("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}

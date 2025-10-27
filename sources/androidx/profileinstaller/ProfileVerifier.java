package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ProfileVerifier {
    private static final ResolvableFuture sFuture = ResolvableFuture.create();
    private static final Object SYNC_OBJ = new Object();
    private static CompilationStatus sCompilationStatus = null;

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static CompilationStatus writeProfileVerification(Context context, boolean z) {
        Cache readFromFile;
        Cache cache;
        int i;
        CompilationStatus compilationStatus;
        if (!z && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (!z) {
                try {
                    CompilationStatus compilationStatus2 = sCompilationStatus;
                    if (compilationStatus2 != null) {
                        return compilationStatus2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 28 && i2 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long packageLastUpdateTime = getPackageLastUpdateTime(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            readFromFile = Cache.readFromFile(file3);
                        } catch (IOException unused) {
                            return setCompilationStatus(131072, z2, z3);
                        }
                    } else {
                        readFromFile = null;
                    }
                    if (readFromFile != null && readFromFile.mPackageLastUpdateTime == packageLastUpdateTime && (i = readFromFile.mResultCode) != 2) {
                        i3 = i;
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (readFromFile != null && readFromFile.mResultCode == 2 && i3 == 1 && length < readFromFile.mInstalledCurrentProfileSize) {
                            i3 = 3;
                        }
                        cache = new Cache(1, i3, packageLastUpdateTime, length2);
                        if (readFromFile != null || !readFromFile.equals(cache)) {
                            cache.writeOnFile(file3);
                        }
                        return setCompilationStatus(i3, z2, z3);
                    }
                    if (z3) {
                        i3 = 2;
                    }
                    if (z) {
                        i3 = 2;
                    }
                    if (readFromFile != null) {
                        i3 = 3;
                    }
                    cache = new Cache(1, i3, packageLastUpdateTime, length2);
                    if (readFromFile != null) {
                    }
                    cache.writeOnFile(file3);
                    return setCompilationStatus(i3, z2, z3);
                } catch (PackageManager.NameNotFoundException unused2) {
                    return setCompilationStatus(65536, z2, z3);
                }
            }
            return setCompilationStatus(262144, false, false);
        }
    }

    private static CompilationStatus setCompilationStatus(int i, boolean z, boolean z2) {
        CompilationStatus compilationStatus = new CompilationStatus(i, z, z2);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    private static long getPackageLastUpdateTime(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    static class Cache {
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int i, int i2, long j, long j2) {
            this.mSchema = i;
            this.mResultCode = i2;
            this.mPackageLastUpdateTime = j;
            this.mInstalledCurrentProfileSize = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Cache)) {
                return false;
            }
            Cache cache = (Cache) obj;
            return this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        void writeOnFile(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        static Cache readFromFile(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class CompilationStatus {
        private final boolean mHasCurrentProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        CompilationStatus(int i, boolean z, boolean z2) {
            this.mResultCode = i;
            this.mHasCurrentProfile = z2;
            this.mHasReferenceProfile = z;
        }
    }

    private static class Api33Impl {
        static PackageInfo getPackageInfo(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }
}

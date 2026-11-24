// default package

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class acd {
    public static final cff a = new cff(23);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, Executor executor, cr8 cr8Var, boolean z) {
        boolean z2;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r6;
        fe3[] fe3VarArr;
        fe3[] fe3VarArr2;
        fe3[] fe3VarArr3;
        byte[] bArr2;
        ?? r62;
        boolean z3;
        boolean z4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        ee3 ee3Var;
        FileInputStream a2;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = readLong == packageInfo.lastUpdateTime;
                            if (z5) {
                                cr8Var.f(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        cs8.c(context, false);
                        return;
                    }
                }
                z5 = false;
                if (z5) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            ee3 ee3Var2 = new ee3(assets, executor, cr8Var, name, file2);
            byte[] bArr3 = (byte[]) ee3Var2.d;
            if (bArr3 == null) {
                ee3Var2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z2 = true;
                        ee3Var2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    ee3Var2.b(4, null);
                }
                ee3Var2.a = true;
                try {
                    try {
                        fileInputStream = ee3Var2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        cr8Var.f(6, e);
                        fileInputStream = null;
                        bArr = bcd.a;
                        r6 = 8;
                        r62 = 8;
                        if (fileInputStream != null) {
                        }
                        fe3VarArr2 = (fe3[]) ee3Var2.h;
                        if (fe3VarArr2 != null) {
                        }
                        cr8 cr8Var2 = (cr8) ee3Var2.c;
                        fe3VarArr3 = (fe3[]) ee3Var2.h;
                        byte[] bArr4 = (byte[]) ee3Var2.d;
                        if (fe3VarArr3 != null) {
                        }
                        bArr2 = (byte[]) ee3Var2.e;
                        if (bArr2 == null) {
                        }
                        if (z4) {
                        }
                        cs8.c(context, (z4 || !z) ? false : z2);
                    } catch (IOException e2) {
                        cr8Var.f(7, e2);
                        fileInputStream = null;
                        bArr = bcd.a;
                        r6 = 8;
                        r62 = 8;
                        if (fileInputStream != null) {
                        }
                        fe3VarArr2 = (fe3[]) ee3Var2.h;
                        if (fe3VarArr2 != null) {
                        }
                        cr8 cr8Var22 = (cr8) ee3Var2.c;
                        fe3VarArr3 = (fe3[]) ee3Var2.h;
                        byte[] bArr42 = (byte[]) ee3Var2.d;
                        if (fe3VarArr3 != null) {
                        }
                        bArr2 = (byte[]) ee3Var2.e;
                        if (bArr2 == null) {
                        }
                        if (z4) {
                        }
                        cs8.c(context, (z4 || !z) ? false : z2);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e3) {
                            cr8Var.f(7, e3);
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                cr8Var.f(7, e4);
                            }
                            fe3VarArr = null;
                            ee3Var2.h = fe3VarArr;
                            fe3VarArr2 = (fe3[]) ee3Var2.h;
                            if (fe3VarArr2 != null) {
                                if (i != 24) {
                                    switch (i) {
                                    }
                                }
                                try {
                                    a2 = ee3Var2.a(assets, "dexopt/baseline.profm");
                                    if (a2 == null) {
                                    }
                                } catch (FileNotFoundException e5) {
                                    cr8Var.f(9, e5);
                                } catch (IOException e6) {
                                    cr8Var.f(7, e6);
                                } catch (IllegalStateException e7) {
                                    ee3Var2.h = null;
                                    cr8Var.f(8, e7);
                                }
                            }
                            cr8 cr8Var222 = (cr8) ee3Var2.c;
                            fe3VarArr3 = (fe3[]) ee3Var2.h;
                            byte[] bArr422 = (byte[]) ee3Var2.d;
                            if (fe3VarArr3 != null) {
                                if (ee3Var2.a) {
                                }
                            }
                            bArr2 = (byte[]) ee3Var2.e;
                            if (bArr2 == null) {
                            }
                            if (z4) {
                            }
                            cs8.c(context, (z4 || !z) ? false : z2);
                        } catch (IllegalStateException e8) {
                            cr8Var.f(8, e8);
                            fileInputStream.close();
                            fe3VarArr = null;
                            ee3Var2.h = fe3VarArr;
                            fe3VarArr2 = (fe3[]) ee3Var2.h;
                            if (fe3VarArr2 != null) {
                            }
                            cr8 cr8Var2222 = (cr8) ee3Var2.c;
                            fe3VarArr3 = (fe3[]) ee3Var2.h;
                            byte[] bArr4222 = (byte[]) ee3Var2.d;
                            if (fe3VarArr3 != null) {
                            }
                            bArr2 = (byte[]) ee3Var2.e;
                            if (bArr2 == null) {
                            }
                            if (z4) {
                            }
                            cs8.c(context, (z4 || !z) ? false : z2);
                        }
                        if (!Arrays.equals(bArr, kfe.b(4, fileInputStream))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        fe3VarArr = bcd.g(fileInputStream, kfe.b(4, fileInputStream), (String) ee3Var2.g);
                        try {
                            fileInputStream.close();
                        } catch (IOException e9) {
                            cr8Var.f(7, e9);
                        }
                        ee3Var2.h = fe3VarArr;
                    }
                    fe3VarArr2 = (fe3[]) ee3Var2.h;
                    if (fe3VarArr2 != null && (i = Build.VERSION.SDK_INT) >= 24 && i <= 34) {
                        if (i != 24 && i != 25) {
                            switch (i) {
                            }
                        }
                        a2 = ee3Var2.a(assets, "dexopt/baseline.profm");
                        if (a2 == null) {
                            try {
                                if (!Arrays.equals(bcd.b, kfe.b(4, a2))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                ee3Var2.h = bcd.d(a2, kfe.b(4, a2), bArr3, fe3VarArr2);
                                a2.close();
                                ee3Var = ee3Var2;
                                if (ee3Var != null) {
                                    ee3Var2 = ee3Var;
                                }
                            } finally {
                            }
                        } else {
                            if (a2 != null) {
                                a2.close();
                            }
                            ee3Var = null;
                            if (ee3Var != null) {
                            }
                        }
                    }
                    cr8 cr8Var22222 = (cr8) ee3Var2.c;
                    fe3VarArr3 = (fe3[]) ee3Var2.h;
                    byte[] bArr42222 = (byte[]) ee3Var2.d;
                    if (fe3VarArr3 != null && bArr42222 != null) {
                        if (ee3Var2.a) {
                            sc8.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e10) {
                            cr8Var22222.f(7, e10);
                        } catch (IllegalStateException e11) {
                            cr8Var22222.f(8, e11);
                        }
                        if (bcd.i(byteArrayOutputStream, bArr42222, fe3VarArr3)) {
                            ee3Var2.e = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            ee3Var2.h = null;
                        } else {
                            cr8Var22222.f(5, null);
                            ee3Var2.h = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) ee3Var2.e;
                    if (bArr2 == null) {
                        z4 = false;
                        z2 = true;
                    } else {
                        try {
                            if (!ee3Var2.a) {
                                sc8.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) ee3Var2.f);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z2 = true;
                                                        try {
                                                            ee3Var2.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            ee3Var2.e = null;
                                                            ee3Var2.h = null;
                                                            z4 = true;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Throwable th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th3) {
                                                                th2.addSuppressed(th3);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            Throwable th6 = th;
                                            try {
                                                byteArrayInputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (FileNotFoundException e12) {
                                    e = e12;
                                    ee3Var2.b(6, e);
                                    z3 = r62;
                                    ee3Var2.e = null;
                                    ee3Var2.h = null;
                                    z4 = false;
                                    z2 = z3;
                                    if (z4) {
                                    }
                                    cs8.c(context, (z4 || !z) ? false : z2);
                                } catch (IOException e13) {
                                    e = e13;
                                    ee3Var2.b(7, e);
                                    z3 = r6;
                                    ee3Var2.e = null;
                                    ee3Var2.h = null;
                                    z4 = false;
                                    z2 = z3;
                                    if (z4) {
                                    }
                                    cs8.c(context, (z4 || !z) ? false : z2);
                                }
                            } catch (FileNotFoundException e14) {
                                e = e14;
                                r62 = 1;
                                ee3Var2.b(6, e);
                                z3 = r62;
                                ee3Var2.e = null;
                                ee3Var2.h = null;
                                z4 = false;
                                z2 = z3;
                                if (z4) {
                                }
                                cs8.c(context, (z4 || !z) ? false : z2);
                            } catch (IOException e15) {
                                e = e15;
                                r6 = 1;
                                ee3Var2.b(7, e);
                                z3 = r6;
                                ee3Var2.e = null;
                                ee3Var2.h = null;
                                z4 = false;
                                z2 = z3;
                                if (z4) {
                                }
                                cs8.c(context, (z4 || !z) ? false : z2);
                            }
                        } catch (Throwable th9) {
                            ee3Var2.e = null;
                            ee3Var2.h = null;
                            throw th9;
                        }
                    }
                    if (z4) {
                        a(packageInfo, filesDir);
                    }
                    cs8.c(context, (z4 || !z) ? false : z2);
                } finally {
                }
                bArr = bcd.a;
                r6 = 8;
                r62 = 8;
            }
            z2 = true;
            z4 = false;
            cs8.c(context, (z4 || !z) ? false : z2);
        } catch (PackageManager.NameNotFoundException e16) {
            cr8Var.f(7, e16);
            cs8.c(context, false);
        }
    }
}

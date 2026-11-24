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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ced {
    public static final dhf a = new dhf(23);

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
    public static void b(Context context, Executor executor, ft8 ft8Var, boolean z) {
        boolean z2;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r6;
        qf3[] qf3VarArr;
        qf3[] qf3VarArr2;
        qf3[] qf3VarArr3;
        byte[] bArr2;
        ?? r62;
        boolean z3;
        boolean z4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        pf3 pf3Var;
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
                                ft8Var.g(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        du8.c(context, false);
                        return;
                    }
                }
                z5 = false;
                if (z5) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            pf3 pf3Var2 = new pf3(assets, executor, ft8Var, name, file2);
            byte[] bArr3 = (byte[]) pf3Var2.d;
            if (bArr3 == null) {
                pf3Var2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z2 = true;
                        pf3Var2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    pf3Var2.b(4, null);
                }
                pf3Var2.a = true;
                try {
                    try {
                        fileInputStream = pf3Var2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        ft8Var.g(6, e);
                        fileInputStream = null;
                        bArr = ded.a;
                        r6 = 8;
                        r62 = 8;
                        if (fileInputStream != null) {
                        }
                        qf3VarArr2 = (qf3[]) pf3Var2.h;
                        if (qf3VarArr2 != null) {
                        }
                        ft8 ft8Var2 = (ft8) pf3Var2.c;
                        qf3VarArr3 = (qf3[]) pf3Var2.h;
                        byte[] bArr4 = (byte[]) pf3Var2.d;
                        if (qf3VarArr3 != null) {
                        }
                        bArr2 = (byte[]) pf3Var2.e;
                        if (bArr2 == null) {
                        }
                        if (z4) {
                        }
                        du8.c(context, (z4 || !z) ? false : z2);
                    } catch (IOException e2) {
                        ft8Var.g(7, e2);
                        fileInputStream = null;
                        bArr = ded.a;
                        r6 = 8;
                        r62 = 8;
                        if (fileInputStream != null) {
                        }
                        qf3VarArr2 = (qf3[]) pf3Var2.h;
                        if (qf3VarArr2 != null) {
                        }
                        ft8 ft8Var22 = (ft8) pf3Var2.c;
                        qf3VarArr3 = (qf3[]) pf3Var2.h;
                        byte[] bArr42 = (byte[]) pf3Var2.d;
                        if (qf3VarArr3 != null) {
                        }
                        bArr2 = (byte[]) pf3Var2.e;
                        if (bArr2 == null) {
                        }
                        if (z4) {
                        }
                        du8.c(context, (z4 || !z) ? false : z2);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e3) {
                            ft8Var.g(7, e3);
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                ft8Var.g(7, e4);
                            }
                            qf3VarArr = null;
                            pf3Var2.h = qf3VarArr;
                            qf3VarArr2 = (qf3[]) pf3Var2.h;
                            if (qf3VarArr2 != null) {
                                if (i != 24) {
                                    switch (i) {
                                    }
                                }
                                try {
                                    a2 = pf3Var2.a(assets, "dexopt/baseline.profm");
                                    if (a2 == null) {
                                    }
                                } catch (FileNotFoundException e5) {
                                    ft8Var.g(9, e5);
                                } catch (IOException e6) {
                                    ft8Var.g(7, e6);
                                } catch (IllegalStateException e7) {
                                    pf3Var2.h = null;
                                    ft8Var.g(8, e7);
                                }
                            }
                            ft8 ft8Var222 = (ft8) pf3Var2.c;
                            qf3VarArr3 = (qf3[]) pf3Var2.h;
                            byte[] bArr422 = (byte[]) pf3Var2.d;
                            if (qf3VarArr3 != null) {
                                if (pf3Var2.a) {
                                }
                            }
                            bArr2 = (byte[]) pf3Var2.e;
                            if (bArr2 == null) {
                            }
                            if (z4) {
                            }
                            du8.c(context, (z4 || !z) ? false : z2);
                        } catch (IllegalStateException e8) {
                            ft8Var.g(8, e8);
                            fileInputStream.close();
                            qf3VarArr = null;
                            pf3Var2.h = qf3VarArr;
                            qf3VarArr2 = (qf3[]) pf3Var2.h;
                            if (qf3VarArr2 != null) {
                            }
                            ft8 ft8Var2222 = (ft8) pf3Var2.c;
                            qf3VarArr3 = (qf3[]) pf3Var2.h;
                            byte[] bArr4222 = (byte[]) pf3Var2.d;
                            if (qf3VarArr3 != null) {
                            }
                            bArr2 = (byte[]) pf3Var2.e;
                            if (bArr2 == null) {
                            }
                            if (z4) {
                            }
                            du8.c(context, (z4 || !z) ? false : z2);
                        }
                        if (!Arrays.equals(bArr, lhe.b(4, fileInputStream))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        qf3VarArr = ded.g(fileInputStream, lhe.b(4, fileInputStream), (String) pf3Var2.g);
                        try {
                            fileInputStream.close();
                        } catch (IOException e9) {
                            ft8Var.g(7, e9);
                        }
                        pf3Var2.h = qf3VarArr;
                    }
                    qf3VarArr2 = (qf3[]) pf3Var2.h;
                    if (qf3VarArr2 != null && (i = Build.VERSION.SDK_INT) >= 24 && i <= 34) {
                        if (i != 24 && i != 25) {
                            switch (i) {
                            }
                        }
                        a2 = pf3Var2.a(assets, "dexopt/baseline.profm");
                        if (a2 == null) {
                            try {
                                if (!Arrays.equals(ded.b, lhe.b(4, a2))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                pf3Var2.h = ded.d(a2, lhe.b(4, a2), bArr3, qf3VarArr2);
                                a2.close();
                                pf3Var = pf3Var2;
                                if (pf3Var != null) {
                                    pf3Var2 = pf3Var;
                                }
                            } finally {
                            }
                        } else {
                            if (a2 != null) {
                                a2.close();
                            }
                            pf3Var = null;
                            if (pf3Var != null) {
                            }
                        }
                    }
                    ft8 ft8Var22222 = (ft8) pf3Var2.c;
                    qf3VarArr3 = (qf3[]) pf3Var2.h;
                    byte[] bArr42222 = (byte[]) pf3Var2.d;
                    if (qf3VarArr3 != null && bArr42222 != null) {
                        if (pf3Var2.a) {
                            dq9.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
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
                            ft8Var22222.g(7, e10);
                        } catch (IllegalStateException e11) {
                            ft8Var22222.g(8, e11);
                        }
                        if (ded.i(byteArrayOutputStream, bArr42222, qf3VarArr3)) {
                            pf3Var2.e = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            pf3Var2.h = null;
                        } else {
                            ft8Var22222.g(5, null);
                            pf3Var2.h = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) pf3Var2.e;
                    if (bArr2 == null) {
                        z4 = false;
                        z2 = true;
                    } else {
                        try {
                            if (!pf3Var2.a) {
                                dq9.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) pf3Var2.f);
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
                                                            pf3Var2.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            pf3Var2.e = null;
                                                            pf3Var2.h = null;
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
                                    pf3Var2.b(6, e);
                                    z3 = r62;
                                    pf3Var2.e = null;
                                    pf3Var2.h = null;
                                    z4 = false;
                                    z2 = z3;
                                    if (z4) {
                                    }
                                    du8.c(context, (z4 || !z) ? false : z2);
                                } catch (IOException e13) {
                                    e = e13;
                                    pf3Var2.b(7, e);
                                    z3 = r6;
                                    pf3Var2.e = null;
                                    pf3Var2.h = null;
                                    z4 = false;
                                    z2 = z3;
                                    if (z4) {
                                    }
                                    du8.c(context, (z4 || !z) ? false : z2);
                                }
                            } catch (FileNotFoundException e14) {
                                e = e14;
                                r62 = 1;
                                pf3Var2.b(6, e);
                                z3 = r62;
                                pf3Var2.e = null;
                                pf3Var2.h = null;
                                z4 = false;
                                z2 = z3;
                                if (z4) {
                                }
                                du8.c(context, (z4 || !z) ? false : z2);
                            } catch (IOException e15) {
                                e = e15;
                                r6 = 1;
                                pf3Var2.b(7, e);
                                z3 = r6;
                                pf3Var2.e = null;
                                pf3Var2.h = null;
                                z4 = false;
                                z2 = z3;
                                if (z4) {
                                }
                                du8.c(context, (z4 || !z) ? false : z2);
                            }
                        } catch (Throwable th9) {
                            pf3Var2.e = null;
                            pf3Var2.h = null;
                            throw th9;
                        }
                    }
                    if (z4) {
                        a(packageInfo, filesDir);
                    }
                    du8.c(context, (z4 || !z) ? false : z2);
                } finally {
                }
                bArr = ded.a;
                r6 = 8;
                r62 = 8;
            }
            z2 = true;
            z4 = false;
            du8.c(context, (z4 || !z) ? false : z2);
        } catch (PackageManager.NameNotFoundException e16) {
            ft8Var.g(7, e16);
            du8.c(context, false);
        }
    }
}

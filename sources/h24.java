// default package

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h24 implements sq4 {
    public static HashMap E;
    public static final String[] e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f = {"goldfish"};
    public static final String[] h = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] n = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] r = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] s = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] w = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final ce3[] x;
    public static h24 y;
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    static {
        String str = null;
        byte b = 1;
        String str2 = "unknown";
        String str3 = "sdk";
        x = new ce3[]{new ce3("init.svc.qemud", str, b), new ce3("init.svc.qemu-props", str, b), new ce3("qemu.hw.mainkeys", str, b), new ce3("qemu.sf.fake_camera", str, b), new ce3("qemu.sf.lcd_density", str, b), new ce3("ro.bootloader", str2, b), new ce3("ro.bootmode", str2, b), new ce3("ro.hardware", "goldfish", b), new ce3("ro.kernel.android.qemud", str, b), new ce3("ro.kernel.qemu.gles", str, b), new ce3("ro.kernel.qemu", "1", b), new ce3("ro.product.device", "generic", b), new ce3("ro.product.model", str3, b), new ce3("ro.product.name", str3, b), new ce3("ro.serialno", null, b)};
    }

    public h24() {
        this.c = new Path();
        this.d = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d() {
        boolean z;
        boolean z2 = false;
        if (!Build.BOARD.toLowerCase().contains("nox") && !Build.BOOTLOADER.toLowerCase().contains("nox") && !Build.FINGERPRINT.startsWith("generic")) {
            String str = Build.MODEL;
            if (!str.toLowerCase().contains("google_sdk") && !str.toLowerCase().contains("droid4x") && !str.toLowerCase().contains("emulator") && !str.contains("Android SDK built for x86") && !Build.MANUFACTURER.toLowerCase().contains("genymotion")) {
                String str2 = Build.HARDWARE;
                if (!str2.toLowerCase().contains("goldfish") && !str2.toLowerCase().contains("vbox86") && !str2.toLowerCase().contains("android_x86") && !str2.toLowerCase().contains("nox") && !str2.toLowerCase().contains("ranchu")) {
                    String str3 = Build.PRODUCT;
                    if (!str3.equals("sdk") && !str3.equals("google_sdk") && !str3.equals("sdk_x86") && !str3.equals("vbox86p") && !str3.toLowerCase().contains("nox") && !Build.SERIAL.toLowerCase().contains("nox")) {
                        z = false;
                        if (!z) {
                            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                                z2 = true;
                            }
                            boolean z3 = z | z2;
                            if (!z3) {
                                return z3 | "google_sdk".equals(Build.PRODUCT);
                            }
                        }
                        return true;
                    }
                }
            }
        }
        z = true;
        if (!z) {
        }
        return true;
    }

    public static h24 m(Context context) {
        if (context == null) {
            w26.j("Context must not be null.");
            return null;
        }
        h24 h24Var = y;
        if (h24Var != null) {
            return h24Var;
        }
        Context applicationContext = context.getApplicationContext();
        h24 h24Var2 = new h24();
        ArrayList arrayList = new ArrayList();
        h24Var2.d = arrayList;
        h24Var2.c = applicationContext;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
        y = h24Var2;
        return h24Var2;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        i();
    }

    public final boolean b(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z = this.b;
        mu1 mu1Var = (mu1) this.d;
        ArrayList arrayList = mu1Var.M6;
        int i2 = i - mu1Var.D0.K;
        if (i2 < 0 || i2 >= arrayList.size()) {
            return false;
        }
        k27 k27Var = (k27) arrayList.get(i2);
        if (k27Var.U == 0) {
            return !z ? sparseArray.get(k27Var.e1(), null) == null : sparseArray.get(k27Var.e1(), null) != null;
        }
        return false;
    }

    public final boolean c() {
        String str;
        Context context = (Context) this.c;
        rr.b(context, "android.permission.READ_PHONE_STATE");
        if (e(1, e) || e(2, r) || e(3, s) || e(4, w)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (new String(bArr).contains(f[0])) {
                    return true;
                }
            }
        }
        if (e(5, h)) {
            return true;
        }
        if (rr.b(context, "android.permission.INTERNET") == 0) {
            String[] strArr = {"/system/bin/netcfg"};
            StringBuilder sb = new StringBuilder();
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(new File("/system/bin/"));
                processBuilder.redirectErrorStream(true);
                InputStream inputStream = processBuilder.start().getInputStream();
                byte[] bArr2 = new byte[1024];
                while (inputStream.read(bArr2) != -1) {
                    sb.append(new String(bArr2));
                }
                inputStream.close();
            } catch (Exception unused) {
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                for (String str2 : sb2.split("\n")) {
                    if ((str2.contains("wlan0") || str2.contains("tunl0") || str2.contains("eth0")) && str2.contains("10.0.2.15")) {
                        return true;
                    }
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 15; i3++) {
            ce3 ce3Var = x[i3];
            String str3 = ce3Var.b;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = ce3Var.c;
            if (str4 == null && str != null) {
                i2++;
            }
            if (str4 != null && str.contains(str4)) {
                i2++;
            }
        }
        return i2 >= 5 && e(6, n);
    }

    public final boolean e(int i, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (rr.b((Context) this.c, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                file = new File(str);
            } else if ((str.contains("/") && i == 3) || i == 4) {
                file = new File(Environment.getExternalStorageDirectory() + str);
            } else {
                file = new File(str);
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.a) {
            return;
        }
        this.a = true;
        iu4 iu4Var = (iu4) this.c;
        if (iu4Var != null) {
            iu4Var.run();
        }
        c05 c05Var = (c05) this.d;
        if (c05Var == null || this.b) {
            return;
        }
        c05Var.run();
    }

    public final void g() {
        if (this.a) {
            this.a = false;
            i();
        }
    }

    public final boolean h() {
        if (this.a) {
            return this.b;
        }
        boolean z = true;
        try {
            this.a = true;
            boolean z2 = this.b;
            if (!z2) {
                z2 = d();
                this.b = z2;
            }
            if (!z2) {
                z2 = c();
                this.b = z2;
            }
            if (!z2) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.c).getPackageManager();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z = false;
                this.b = z;
                z2 = z;
            }
            if (z2) {
                return z2;
            }
            boolean a = t8d.a();
            this.b = a;
            return a;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void i() {
        boolean z = this.a && ((fi4) this.d).run();
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            Window window = (Window) this.c;
            HashMap hashMap = E;
            if (hashMap == null) {
                hashMap = new HashMap();
                E = hashMap;
            }
            Integer num = (Integer) hashMap.get(window);
            int max = Math.max(0, (num == null ? 0 : num.intValue()) + i);
            HashMap hashMap2 = E;
            if (max <= 0) {
                hashMap2.remove(window);
            } else {
                hashMap2.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap3 = E;
                if (hashMap3 == null || hashMap3.get(window) == null) {
                    window.clearFlags(TLObject.FLAG_13);
                    gl.f2();
                } else {
                    window.addFlags(TLObject.FLAG_13);
                    gl.f2();
                }
            }
        }
    }

    public final boolean j(Rect rect, boolean z, boolean z2) {
        Rect rect2 = (Rect) this.d;
        boolean z3 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z2 && this.b == z && z2 && z) ? false : true;
        this.a = z2;
        this.b = z;
        rect2.set(rect);
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(float f2, float f3, int i, boolean z) {
        s49 K;
        mu1 mu1Var = (mu1) this.d;
        ArrayList arrayList = mu1Var.M6;
        SparseArray[] sparseArrayArr = mu1Var.o6;
        int i2 = i - mu1Var.D0.K;
        if (this.b) {
            z = !z;
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        k27 k27Var = (k27) arrayList.get(i2);
        if (z) {
            if (sparseArrayArr[0].indexOfKey(k27Var.e1()) >= 0 || sparseArrayArr[1].indexOfKey(k27Var.e1()) >= 0) {
                return;
            }
        } else if (sparseArrayArr[0].indexOfKey(k27Var.e1()) < 0 && sparseArrayArr[1].indexOfKey(k27Var.e1()) < 0) {
            return;
        }
        if (k27Var.U == 0) {
            if (z) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                    this.a = true;
                    K = mu1Var.A0.K(i);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof gb2) {
                            mu1Var.Fa(view, f2, f3, false);
                            return;
                        }
                    }
                    mu1Var.x4(k27Var, false, true);
                    mu1Var.wc();
                    mu1Var.sd(false);
                }
            }
            this.a = false;
            K = mu1Var.A0.K(i);
            if (K != null) {
            }
            mu1Var.x4(k27Var, false, true);
            mu1Var.wc();
            mu1Var.sd(false);
        }
    }

    @Override // sq4
    public final void onSuccess(Object obj) {
        tu6 tu6Var = (tu6) obj;
        tv6 tv6Var = ((lw6) this.d).j;
        hw6 hw6Var = new hw6(this, tu6Var, this.a, this.b, (su6) this.c, (byte) 0);
        tv6Var.getClass();
        hw6Var.run();
    }

    public h24(iu4 iu4Var, c05 c05Var) {
        this.c = iu4Var;
        this.d = c05Var;
    }

    public h24(Window window, fi4 fi4Var) {
        this.a = false;
        this.b = false;
        this.c = window;
        this.d = fi4Var;
    }

    @Override // sq4
    public final void k(Throwable th) {
    }
}

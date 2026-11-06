package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n6 {
    public static final String[] e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f = {"goldfish"};
    public static final String[] g = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] h = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] i = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] j = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] k = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final m6[] l = {new m6(0, "init.svc.qemud", null), new m6(0, "init.svc.qemu-props", null), new m6(0, "qemu.hw.mainkeys", null), new m6(0, "qemu.sf.fake_camera", null), new m6(0, "qemu.sf.lcd_density", null), new m6(0, "ro.bootloader", "unknown"), new m6(0, "ro.bootmode", "unknown"), new m6(0, "ro.hardware", "goldfish"), new m6(0, "ro.kernel.android.qemud", null), new m6(0, "ro.kernel.qemu.gles", null), new m6(0, "ro.kernel.qemu", "1"), new m6(0, "ro.product.device", "generic"), new m6(0, "ro.product.model", "sdk"), new m6(0, "ro.product.name", "sdk"), new m6(0, "ro.serialno", null)};
    public static n6 m;
    public static HashMap n;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;

    public n6(Window window, j9 j9Var) {
        this.a = false;
        this.b = false;
        this.c = window;
        this.d = j9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        boolean z9;
        boolean z10 = false;
        if (!Build.BOARD.toLowerCase().contains("nox") && !Build.BOOTLOADER.toLowerCase().contains("nox") && !Build.FINGERPRINT.startsWith("generic")) {
            String str = Build.MODEL;
            if (!str.toLowerCase().contains("google_sdk") && !str.toLowerCase().contains("droid4x") && !str.toLowerCase().contains("emulator") && !str.contains("Android SDK built for x86") && !Build.MANUFACTURER.toLowerCase().contains("genymotion")) {
                String str2 = Build.HARDWARE;
                if (!str2.toLowerCase().contains("goldfish") && !str2.toLowerCase().contains("vbox86") && !str2.toLowerCase().contains("android_x86") && !str2.toLowerCase().contains("nox") && !str2.toLowerCase().contains("ranchu")) {
                    String str3 = Build.PRODUCT;
                    if (!str3.equals("sdk") && !str3.equals("google_sdk") && !str3.equals("sdk_x86") && !str3.equals("vbox86p") && !str3.toLowerCase().contains("nox") && !Build.SERIAL.toLowerCase().contains("nox")) {
                        z9 = false;
                        if (!z9) {
                            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                                z10 = true;
                            }
                            boolean z11 = z9 | z10;
                            if (!z11) {
                                return z11 | "google_sdk".equals(Build.PRODUCT);
                            }
                        }
                        return true;
                    }
                }
            }
        }
        z9 = true;
        if (!z9) {
        }
        return true;
    }

    public static n6 h(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        if (m == null) {
            m = new n6(context.getApplicationContext());
        }
        return m;
    }

    public void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        g();
    }

    public boolean b() {
        String str;
        Context context = (Context) this.c;
        f0.d.b(context, "android.permission.READ_PHONE_STATE");
        if (d(1, e) || d(2, i) || d(3, j) || d(4, k)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i7 = 0; i7 < 2; i7++) {
            File file = fileArr[i7];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (new String(bArr).contains(f[0])) {
                    return true;
                }
            }
        }
        if (d(5, g)) {
            return true;
        }
        if (f0.d.b(context, "android.permission.INTERNET") == 0) {
            String[] strArr = {"/system/bin/netcfg"};
            StringBuilder sb2 = new StringBuilder();
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(new File("/system/bin/"));
                processBuilder.redirectErrorStream(true);
                InputStream inputStream = processBuilder.start().getInputStream();
                byte[] bArr2 = new byte[1024];
                while (inputStream.read(bArr2) != -1) {
                    sb2.append(new String(bArr2));
                }
                inputStream.close();
            } catch (Exception unused) {
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                for (String str2 : sb3.split("\n")) {
                    if ((str2.contains("wlan0") || str2.contains("tunl0") || str2.contains("eth0")) && str2.contains("10.0.2.15")) {
                        return true;
                    }
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 15; i11++) {
            m6 m6Var = l[i11];
            String str3 = m6Var.b;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = m6Var.c;
            if (str4 == null && str != null) {
                i10++;
            }
            if (str4 != null && str.contains(str4)) {
                i10++;
            }
        }
        return i10 >= 5 && d(6, h);
    }

    public boolean d(int i7, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (f0.d.b((Context) this.c, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                file = new File(str);
            } else if ((str.contains("/") && i7 == 3) || i7 == 4) {
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

    public void e() {
        if (this.a) {
            this.a = false;
            g();
        }
    }

    public boolean f() {
        if (this.a) {
            return this.b;
        }
        boolean z9 = true;
        try {
            this.a = true;
            if (!this.b) {
                this.b = c();
            }
            if (!this.b) {
                this.b = b();
            }
            if (!this.b) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.c).getPackageManager();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z9 = false;
                this.b = z9;
            }
            if (!this.b) {
                this.b = b6.b();
            }
            return this.b;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        boolean z9 = this.a && ((j9) this.d).run();
        if (z9 != this.b) {
            this.b = z9;
            int i7 = z9 ? 1 : -1;
            Window window = (Window) this.c;
            if (n == null) {
                n = new HashMap();
            }
            Integer num = (Integer) n.get(window);
            int max = Math.max(0, (num == null ? 0 : num.intValue()) + i7);
            if (max <= 0) {
                n.remove(window);
            } else {
                n.put(window, Integer.valueOf(max));
            }
            if (window == null) {
                return;
            }
            HashMap hashMap = n;
            if (hashMap == null || hashMap.get(window) == null) {
                window.clearFlags(TLObject.FLAG_13);
                g0.h2();
            } else {
                window.addFlags(TLObject.FLAG_13);
                g0.h2();
            }
        }
    }

    public n6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.c = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }
}

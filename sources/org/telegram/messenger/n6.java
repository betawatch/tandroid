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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class n6 {
    public static final String[] e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f = {"goldfish"};
    public static final String[] g = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] h = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] i = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] j = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] k = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final f5.a[] l;
    public static n6 m;
    public static HashMap n;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;

    static {
        int i7 = 2;
        String str = null;
        String str2 = "unknown";
        String str3 = "sdk";
        l = new f5.a[]{new f5.a(i7, "init.svc.qemud", str), new f5.a(i7, "init.svc.qemu-props", str), new f5.a(i7, "qemu.hw.mainkeys", str), new f5.a(i7, "qemu.sf.fake_camera", str), new f5.a(i7, "qemu.sf.lcd_density", str), new f5.a(i7, "ro.bootloader", str2), new f5.a(i7, "ro.bootmode", str2), new f5.a(i7, "ro.hardware", "goldfish"), new f5.a(i7, "ro.kernel.android.qemud", str), new f5.a(i7, "ro.kernel.qemu.gles", str), new f5.a(i7, "ro.kernel.qemu", "1"), new f5.a(i7, "ro.product.device", "generic"), new f5.a(i7, "ro.product.model", str3), new f5.a(i7, "ro.product.name", str3), new f5.a(i7, "ro.serialno", null)};
    }

    public n6(Window window, h9 h9Var) {
        this.a = false;
        this.b = false;
        this.c = window;
        this.d = h9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        boolean z10;
        boolean z11 = false;
        if (!Build.BOARD.toLowerCase().contains("nox") && !Build.BOOTLOADER.toLowerCase().contains("nox") && !Build.FINGERPRINT.startsWith("generic")) {
            String str = Build.MODEL;
            if (!str.toLowerCase().contains("google_sdk") && !str.toLowerCase().contains("droid4x") && !str.toLowerCase().contains("emulator") && !str.contains("Android SDK built for x86") && !Build.MANUFACTURER.toLowerCase().contains("genymotion")) {
                String str2 = Build.HARDWARE;
                if (!str2.toLowerCase().contains("goldfish") && !str2.toLowerCase().contains("vbox86") && !str2.toLowerCase().contains("android_x86") && !str2.toLowerCase().contains("nox") && !str2.toLowerCase().contains("ranchu")) {
                    String str3 = Build.PRODUCT;
                    if (!str3.equals("sdk") && !str3.equals("google_sdk") && !str3.equals("sdk_x86") && !str3.equals("vbox86p") && !str3.toLowerCase().contains("nox") && !Build.SERIAL.toLowerCase().contains("nox")) {
                        z10 = false;
                        if (!z10) {
                            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                                z11 = true;
                            }
                            boolean z12 = z10 | z11;
                            if (!z12) {
                                return z12 | "google_sdk".equals(Build.PRODUCT);
                            }
                        }
                        return true;
                    }
                }
            }
        }
        z10 = true;
        if (!z10) {
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
            f5.a aVar = l[i11];
            String str3 = aVar.b;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = aVar.c;
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
        boolean z10 = true;
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
                z10 = false;
                this.b = z10;
            }
            if (!this.b) {
                this.b = c6.b();
            }
            return this.b;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        boolean z10 = this.a && ((h9) this.d).run();
        if (z10 != this.b) {
            this.b = z10;
            int i7 = z10 ? 1 : -1;
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

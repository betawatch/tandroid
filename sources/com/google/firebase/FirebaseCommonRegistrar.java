package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        lp2 b = mp2.b(tc3.class);
        b.a(new wd3(2, 0, y90.class));
        b.f = new k93((byte) 8);
        arrayList.add(b.b());
        xw8 xw8Var = new xw8(md0.class, Executor.class);
        lp2 lp2Var = new lp2(oa3.class, qd5.class, rd5.class);
        lp2Var.a(wd3.b(Context.class));
        lp2Var.a(wd3.b(jg4.class));
        lp2Var.a(new wd3(2, 0, pd5.class));
        lp2Var.a(new wd3(1, 1, tc3.class));
        lp2Var.a(new wd3(xw8Var, 1, 0));
        lp2Var.f = new ma3(xw8Var, (byte) 0);
        arrayList.add(lp2Var.b());
        arrayList.add(one.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(one.a("fire-core", "22.2.1"));
        arrayList.add(one.a("device-name", b(Build.PRODUCT)));
        arrayList.add(one.a("device-model", b(Build.DEVICE)));
        arrayList.add(one.a("device-brand", b(Build.BRAND)));
        arrayList.add(one.b("android-target-sdk", new w44((byte) 12)));
        arrayList.add(one.b("android-min-sdk", new w44((byte) 13)));
        arrayList.add(one.b("android-platform", new w44((byte) 14)));
        arrayList.add(one.b("android-installer", new w44((byte) 15)));
        try {
            rv5.b.getClass();
            str = "2.2.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(one.a("kotlin", str));
        }
        return arrayList;
    }
}

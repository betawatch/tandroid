package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        eq2 b = fq2.b(md3.class);
        b.a(new qe3(2, 0, aa0.class));
        b.f = new da3((byte) 14);
        arrayList.add(b.b());
        h09 h09Var = new h09(od0.class, Executor.class);
        eq2 eq2Var = new eq2(hb3.class, rf5.class, sf5.class);
        eq2Var.a(qe3.b(Context.class));
        eq2Var.a(qe3.b(ji4.class));
        eq2Var.a(new qe3(2, 0, qf5.class));
        eq2Var.a(new qe3(1, 1, md3.class));
        eq2Var.a(new qe3(h09Var, 1, 0));
        eq2Var.f = new fb3(h09Var, (byte) 0);
        arrayList.add(eq2Var.b());
        arrayList.add(ise.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ise.a("fire-core", "22.2.1"));
        arrayList.add(ise.a("device-name", b(Build.PRODUCT)));
        arrayList.add(ise.a("device-model", b(Build.DEVICE)));
        arrayList.add(ise.a("device-brand", b(Build.BRAND)));
        arrayList.add(ise.b("android-target-sdk", new su3((byte) 24)));
        arrayList.add(ise.b("android-min-sdk", new su3((byte) 25)));
        arrayList.add(ise.b("android-platform", new su3((byte) 26)));
        arrayList.add(ise.b("android-installer", new su3((byte) 27)));
        try {
            wx5.b.getClass();
            str = "2.2.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(ise.a("kotlin", str));
        }
        return arrayList;
    }
}

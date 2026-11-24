package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        wq2 b = xq2.b(ge3.class);
        b.a(new if3(2, 0, ya0.class));
        b.f = new wa3((byte) 9);
        arrayList.add(b.b());
        yy8 yy8Var = new yy8(me0.class, Executor.class);
        wq2 wq2Var = new wq2(ac3.class, of5.class, pf5.class);
        wq2Var.a(if3.b(Context.class));
        wq2Var.a(if3.b(li4.class));
        wq2Var.a(new if3(2, 0, nf5.class));
        wq2Var.a(new if3(1, 1, ge3.class));
        wq2Var.a(new if3(yy8Var, 1, 0));
        wq2Var.f = new yb3(yy8Var, (byte) 0);
        arrayList.add(wq2Var.b());
        arrayList.add(rpe.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(rpe.a("fire-core", "22.2.1"));
        arrayList.add(rpe.a("device-name", b(Build.PRODUCT)));
        arrayList.add(rpe.a("device-model", b(Build.DEVICE)));
        arrayList.add(rpe.a("device-brand", b(Build.BRAND)));
        arrayList.add(rpe.b("android-target-sdk", new h64((byte) 14)));
        arrayList.add(rpe.b("android-min-sdk", new h64((byte) 15)));
        arrayList.add(rpe.b("android-platform", new h64((byte) 16)));
        arrayList.add(rpe.b("android-installer", new h64((byte) 17)));
        try {
            rx5.b.getClass();
            str = "2.2.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(rpe.a("kotlin", str));
        }
        return arrayList;
    }
}

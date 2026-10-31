package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k2.k0;
import l9.h;
import mg.l;
import oa.c;
import oa.d;
import oa.e;
import oa.f;
import r9.a;
import r9.j;
import r9.r;
import w7.v9;
import za.b;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        n0 a2 = a.a(b.class);
        a2.a(new j(2, 0, za.a.class));
        a2.f = new xg.a(28);
        arrayList.add(a2.b());
        r rVar = new r(n9.a.class, Executor.class);
        n0 n0Var = new n0(c.class, new Class[]{e.class, f.class});
        n0Var.a(j.a(Context.class));
        n0Var.a(j.a(h.class));
        n0Var.a(new j(2, 0, d.class));
        n0Var.a(new j(1, 1, b.class));
        n0Var.a(new j(rVar, 1, 0));
        n0Var.f = new l(rVar, 4);
        arrayList.add(n0Var.b());
        arrayList.add(v9.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(v9.a("fire-core", "20.4.2"));
        arrayList.add(v9.a("device-name", b(Build.PRODUCT)));
        arrayList.add(v9.a("device-model", b(Build.DEVICE)));
        arrayList.add(v9.a("device-brand", b(Build.BRAND)));
        arrayList.add(v9.b("android-target-sdk", new k0(6)));
        arrayList.add(v9.b("android-min-sdk", new k0(7)));
        arrayList.add(v9.b("android-platform", new k0(8)));
        arrayList.add(v9.b("android-installer", new k0(9)));
        try {
            ad.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(v9.a("kotlin", str));
        }
        return arrayList;
    }
}

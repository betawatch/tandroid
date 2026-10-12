package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ji.m5;
import k2.y0;
import l9.h;
import oa.c;
import oa.d;
import oa.e;
import oa.f;
import r9.a;
import r9.j;
import r9.r;
import w7.w8;
import ya.b;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        a2.a(new j(2, 0, ya.a.class));
        a2.f = new t0.a(26);
        arrayList.add(a2.b());
        r rVar = new r(n9.a.class, Executor.class);
        n0 n0Var = new n0(c.class, new Class[]{e.class, f.class});
        n0Var.a(j.a(Context.class));
        n0Var.a(j.a(h.class));
        n0Var.a(new j(2, 0, d.class));
        n0Var.a(new j(1, 1, b.class));
        n0Var.a(new j(rVar, 1, 0));
        n0Var.f = new m5(rVar, 12);
        arrayList.add(n0Var.b());
        arrayList.add(w8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(w8.a("fire-core", "20.4.2"));
        arrayList.add(w8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(w8.a("device-model", b(Build.DEVICE)));
        arrayList.add(w8.a("device-brand", b(Build.BRAND)));
        arrayList.add(w8.b("android-target-sdk", new y0(3)));
        arrayList.add(w8.b("android-min-sdk", new y0(4)));
        arrayList.add(w8.b("android-platform", new y0(5)));
        arrayList.add(w8.b("android-installer", new y0(6)));
        try {
            id.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(w8.a("kotlin", str));
        }
        return arrayList;
    }
}

package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k2.f0;
import l9.h;
import oa.d;
import oa.e;
import oa.f;
import r9.a;
import r9.j;
import r9.r;
import w7.w8;
import ya.b;
import ya.c;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        m0 a2 = a.a(c.class);
        a2.a(new j(2, 0, ya.a.class));
        a2.f = new b(0);
        arrayList.add(a2.b());
        r rVar = new r(n9.a.class, Executor.class);
        m0 m0Var = new m0(oa.c.class, new Class[]{e.class, f.class});
        m0Var.a(j.a(Context.class));
        m0Var.a(j.a(h.class));
        m0Var.a(new j(2, 0, d.class));
        m0Var.a(new j(1, 1, c.class));
        m0Var.a(new j(rVar, 1, 0));
        m0Var.f = new j5.b(rVar, 21);
        arrayList.add(m0Var.b());
        arrayList.add(w8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(w8.a("fire-core", "20.4.2"));
        arrayList.add(w8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(w8.a("device-model", b(Build.DEVICE)));
        arrayList.add(w8.a("device-brand", b(Build.BRAND)));
        arrayList.add(w8.b("android-target-sdk", new f0(5)));
        arrayList.add(w8.b("android-min-sdk", new f0(6)));
        arrayList.add(w8.b("android-platform", new f0(7)));
        arrayList.add(w8.b("android-installer", new f0(8)));
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

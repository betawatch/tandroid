package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k2.v;
import na.c;
import na.d;
import na.e;
import na.f;
import q9.a;
import q9.j;
import q9.s;
import w7.p8;
import x2.h;
import xa.b;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        i0 a2 = a.a(b.class);
        a2.a(new j(2, 0, xa.a.class));
        a2.f = new h(1);
        arrayList.add(a2.b());
        s sVar = new s(m9.a.class, Executor.class);
        i0 i0Var = new i0(c.class, new Class[]{e.class, f.class});
        i0Var.a(j.a(Context.class));
        i0Var.a(j.a(k9.h.class));
        i0Var.a(new j(2, 0, d.class));
        i0Var.a(new j(1, 1, b.class));
        i0Var.a(new j(sVar, 1, 0));
        i0Var.f = new v(sVar, 7);
        arrayList.add(i0Var.b());
        arrayList.add(p8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(p8.a("fire-core", "20.4.2"));
        arrayList.add(p8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(p8.a("device-model", b(Build.DEVICE)));
        arrayList.add(p8.a("device-brand", b(Build.BRAND)));
        arrayList.add(p8.b("android-target-sdk", new j2.e(13)));
        arrayList.add(p8.b("android-min-sdk", new j2.e(14)));
        arrayList.add(p8.b("android-platform", new j2.e(15)));
        arrayList.add(p8.b("android-installer", new j2.e(16)));
        try {
            gd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(p8.a("kotlin", str));
        }
        return arrayList;
    }
}

package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import hi.y1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k9.h;
import na.d;
import na.e;
import na.f;
import q9.a;
import q9.j;
import q9.r;
import u2.c;
import w7.o8;
import xa.b;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        a2.f = new c(19);
        arrayList.add(a2.b());
        r rVar = new r(m9.a.class, Executor.class);
        i0 i0Var = new i0(na.c.class, new Class[]{e.class, f.class});
        i0Var.a(j.a(Context.class));
        i0Var.a(j.a(h.class));
        i0Var.a(new j(2, 0, d.class));
        i0Var.a(new j(1, 1, b.class));
        i0Var.a(new j(rVar, 1, 0));
        i0Var.f = new y1(rVar, 28);
        arrayList.add(i0Var.b());
        arrayList.add(o8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(o8.a("fire-core", "20.4.2"));
        arrayList.add(o8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(o8.a("device-model", b(Build.DEVICE)));
        arrayList.add(o8.a("device-brand", b(Build.BRAND)));
        arrayList.add(o8.b("android-target-sdk", new j2.h(5)));
        arrayList.add(o8.b("android-min-sdk", new j2.h(6)));
        arrayList.add(o8.b("android-platform", new j2.h(7)));
        arrayList.add(o8.b("android-installer", new j2.h(8)));
        try {
            gd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(o8.a("kotlin", str));
        }
        return arrayList;
    }
}

package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k9.h;
import m4.w;
import na.d;
import na.e;
import na.f;
import q9.a;
import q9.j;
import q9.r;
import w7.o8;
import xa.b;
import xa.c;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        i0 a2 = a.a(c.class);
        a2.a(new j(2, 0, xa.a.class));
        a2.f = new b(0);
        arrayList.add(a2.b());
        r rVar = new r(m9.a.class, Executor.class);
        i0 i0Var = new i0(na.c.class, new Class[]{e.class, f.class});
        i0Var.a(j.a(Context.class));
        i0Var.a(j.a(h.class));
        i0Var.a(new j(2, 0, d.class));
        i0Var.a(new j(1, 1, c.class));
        i0Var.a(new j(rVar, 1, 0));
        i0Var.f = new w(rVar, 7);
        arrayList.add(i0Var.b());
        arrayList.add(o8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(o8.a("fire-core", "20.4.2"));
        arrayList.add(o8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(o8.a("device-model", b(Build.DEVICE)));
        arrayList.add(o8.a("device-brand", b(Build.BRAND)));
        arrayList.add(o8.b("android-target-sdk", new j2.e(9)));
        arrayList.add(o8.b("android-min-sdk", new j2.e(10)));
        arrayList.add(o8.b("android-platform", new j2.e(11)));
        arrayList.add(o8.b("android-installer", new j2.e(12)));
        try {
            hd.b.b.getClass();
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

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
import k9.h;
import na.c;
import na.d;
import na.e;
import na.f;
import q9.a;
import q9.j;
import q9.r;
import u2.l0;
import w7.q8;
import xa.b;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        int i10 = 15;
        a2.f = new l0(i10);
        arrayList.add(a2.b());
        r rVar = new r(m9.a.class, Executor.class);
        i0 i0Var = new i0(c.class, new Class[]{e.class, f.class});
        i0Var.a(j.a(Context.class));
        i0Var.a(j.a(h.class));
        i0Var.a(new j(2, 0, d.class));
        i0Var.a(new j(1, 1, b.class));
        i0Var.a(new j(rVar, 1, 0));
        i0Var.f = new v(rVar, 9);
        arrayList.add(i0Var.b());
        arrayList.add(q8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(q8.a("fire-core", "20.4.2"));
        arrayList.add(q8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(q8.a("device-model", b(Build.DEVICE)));
        arrayList.add(q8.a("device-brand", b(Build.BRAND)));
        arrayList.add(q8.b("android-target-sdk", new j2.e(13)));
        arrayList.add(q8.b("android-min-sdk", new j2.e(14)));
        arrayList.add(q8.b("android-platform", new j2.e(i10)));
        arrayList.add(q8.b("android-installer", new j2.e(16)));
        try {
            gd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(q8.a("kotlin", str));
        }
        return arrayList;
    }
}

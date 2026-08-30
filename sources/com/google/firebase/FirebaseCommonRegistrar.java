package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import c9.a;
import c9.b;
import c9.l;
import c9.t;
import com.google.firebase.components.ComponentRegistrar;
import j3.q0;
import j7.l8;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w8.g;
import z9.c;
import z9.d;
import z9.e;
import z9.f;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        a b10 = b.b(ja.b.class);
        b10.a(new l(2, 0, ja.a.class));
        b10.g = new q0(17);
        arrayList.add(b10.b());
        t tVar = new t(y8.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, f.class});
        aVar.a(l.b(Context.class));
        aVar.a(l.b(g.class));
        aVar.a(new l(2, 0, d.class));
        aVar.a(new l(1, 1, ja.b.class));
        aVar.a(new l(tVar, 1, 0));
        aVar.g = new rh.e(tVar, 21);
        arrayList.add(aVar.b());
        arrayList.add(l8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(l8.a("fire-core", "20.4.2"));
        arrayList.add(l8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(l8.a("device-model", b(Build.DEVICE)));
        arrayList.add(l8.a("device-brand", b(Build.BRAND)));
        arrayList.add(l8.b("android-target-sdk", new s0.b(24)));
        arrayList.add(l8.b("android-min-sdk", new s0.b(25)));
        arrayList.add(l8.b("android-platform", new s0.b(26)));
        arrayList.add(l8.b("android-installer", new s0.b(27)));
        try {
            sc.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(l8.a("kotlin", str));
        }
        return arrayList;
    }
}

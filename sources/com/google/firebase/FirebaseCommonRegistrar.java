package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b8.r1;
import bb.b;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n9.h;
import ra.d;
import ra.e;
import ra.f;
import ra.g;
import t9.a;
import t9.j;
import t9.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        l0 a10 = a.a(b.class);
        int i3 = 0;
        a10.a(new j(2, 0, bb.a.class));
        a10.f = new a3.j(10);
        arrayList.add(a10.b());
        r rVar = new r(p9.a.class, Executor.class);
        l0 l0Var = new l0(d.class, new Class[]{f.class, g.class});
        l0Var.a(j.a(Context.class));
        l0Var.a(j.a(h.class));
        l0Var.a(new j(2, 0, e.class));
        l0Var.a(new j(1, 1, b.class));
        l0Var.a(new j(rVar, 1, 0));
        l0Var.f = new ra.b(rVar, i3);
        arrayList.add(l0Var.b());
        arrayList.add(r1.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(r1.a("fire-core", "22.2.1"));
        arrayList.add(r1.a("device-name", b(Build.PRODUCT)));
        arrayList.add(r1.a("device-model", b(Build.DEVICE)));
        arrayList.add(r1.a("device-brand", b(Build.BRAND)));
        arrayList.add(r1.b("android-target-sdk", new l2.d(28)));
        arrayList.add(r1.b("android-min-sdk", new l2.d(29)));
        arrayList.add(r1.b("android-platform", new n9.j(i3)));
        arrayList.add(r1.b("android-installer", new n9.j(1)));
        try {
            dd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(r1.a("kotlin", str));
        }
        return arrayList;
    }
}

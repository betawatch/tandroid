package com.google.firebase;

import a3.l;
import a8.h8;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import cb.b;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o9.g;
import sa.c;
import sa.d;
import sa.e;
import sa.f;
import u9.a;
import u9.j;
import u9.r;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        j0 a10 = a.a(b.class);
        a10.a(new j(2, 0, cb.a.class));
        a10.f = new l(29);
        arrayList.add(a10.b());
        r rVar = new r(q9.a.class, Executor.class);
        j0 j0Var = new j0(c.class, new Class[]{e.class, f.class});
        j0Var.a(j.a(Context.class));
        j0Var.a(j.a(g.class));
        j0Var.a(new j(2, 0, d.class));
        j0Var.a(new j(1, 1, b.class));
        j0Var.a(new j(rVar, 1, 0));
        j0Var.f = new ab.r(rVar, 1);
        arrayList.add(j0Var.b());
        arrayList.add(h8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h8.a("fire-core", "22.2.1"));
        arrayList.add(h8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(h8.a("device-model", b(Build.DEVICE)));
        arrayList.add(h8.a("device-brand", b(Build.BRAND)));
        arrayList.add(h8.b("android-target-sdk", new ni.a(4)));
        arrayList.add(h8.b("android-min-sdk", new ni.a(5)));
        arrayList.add(h8.b("android-platform", new ni.a(6)));
        arrayList.add(h8.b("android-installer", new ni.a(7)));
        try {
            gd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(h8.a("kotlin", str));
        }
        return arrayList;
    }
}

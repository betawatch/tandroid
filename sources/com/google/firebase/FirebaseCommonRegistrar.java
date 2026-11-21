package com.google.firebase;

import a3.l;
import a8.i8;
import ab.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import cb.b;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n2.a0;
import o9.g;
import sa.c;
import sa.d;
import sa.e;
import sa.f;
import u9.a;
import u9.i;
import u9.q;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        a10.a(new i(2, 0, cb.a.class));
        a10.f = new l(26);
        arrayList.add(a10.b());
        q qVar = new q(q9.a.class, Executor.class);
        j0 j0Var = new j0(c.class, new Class[]{e.class, f.class});
        j0Var.a(i.a(Context.class));
        j0Var.a(i.a(g.class));
        j0Var.a(new i(2, 0, d.class));
        j0Var.a(new i(1, 1, b.class));
        j0Var.a(new i(qVar, 1, 0));
        j0Var.f = new r(qVar, 1);
        arrayList.add(j0Var.b());
        arrayList.add(i8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(i8.a("fire-core", "22.2.1"));
        arrayList.add(i8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(i8.a("device-model", b(Build.DEVICE)));
        arrayList.add(i8.a("device-brand", b(Build.BRAND)));
        arrayList.add(i8.b("android-target-sdk", new a0(9)));
        arrayList.add(i8.b("android-min-sdk", new a0(10)));
        arrayList.add(i8.b("android-platform", new a0(11)));
        arrayList.add(i8.b("android-installer", new a0(12)));
        try {
            gd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(i8.a("kotlin", str));
        }
        return arrayList;
    }
}

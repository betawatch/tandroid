package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m4.x0;
import m9.h;
import org.telegram.ui.Components.voip.j1;
import pa.c;
import pa.e;
import pa.f;
import s9.a;
import s9.j;
import s9.r;
import vg.d;
import w7.o5;
import za.b;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        a2.a(new j(2, 0, za.a.class));
        a2.f = new d(16);
        arrayList.add(a2.b());
        r rVar = new r(o9.a.class, Executor.class);
        n0 n0Var = new n0(c.class, new Class[]{e.class, f.class});
        n0Var.a(j.a(Context.class));
        n0Var.a(j.a(h.class));
        n0Var.a(new j(2, 0, pa.d.class));
        n0Var.a(new j(1, 1, b.class));
        n0Var.a(new j(rVar, 1, 0));
        n0Var.f = new j1(rVar, 4);
        arrayList.add(n0Var.b());
        arrayList.add(o5.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(o5.a("fire-core", "20.4.2"));
        arrayList.add(o5.a("device-name", b(Build.PRODUCT)));
        arrayList.add(o5.a("device-model", b(Build.DEVICE)));
        arrayList.add(o5.a("device-brand", b(Build.BRAND)));
        arrayList.add(o5.b("android-target-sdk", new x0(12)));
        arrayList.add(o5.b("android-min-sdk", new x0(13)));
        arrayList.add(o5.b("android-platform", new x0(14)));
        arrayList.add(o5.b("android-installer", new x0(15)));
        try {
            jd.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(o5.a("kotlin", str));
        }
        return arrayList;
    }
}

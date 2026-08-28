package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import f7.c7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import s8.h;
import tg.b;
import v9.c;
import v9.d;
import v9.e;
import v9.f;
import y8.a;
import y8.j;
import y8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        b a2 = a.a(fa.b.class);
        a2.a(new j(2, 0, fa.a.class));
        a2.f = new a9.b(26);
        arrayList.add(a2.b());
        r rVar = new r(u8.a.class, Executor.class);
        b bVar = new b(c.class, new Class[]{e.class, f.class});
        bVar.a(j.a(Context.class));
        bVar.a(j.a(h.class));
        bVar.a(new j(2, 0, d.class));
        bVar.a(new j(1, 1, fa.b.class));
        bVar.a(new j(rVar, 1, 0));
        bVar.f = new t0.c(rVar, 4);
        arrayList.add(bVar.b());
        arrayList.add(c7.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(c7.a("fire-core", "20.4.2"));
        arrayList.add(c7.a("device-name", b(Build.PRODUCT)));
        arrayList.add(c7.a("device-model", b(Build.DEVICE)));
        arrayList.add(c7.a("device-brand", b(Build.BRAND)));
        arrayList.add(c7.b("android-target-sdk", new s0.b(18)));
        arrayList.add(c7.b("android-min-sdk", new s0.b(19)));
        arrayList.add(c7.b("android-platform", new s0.b(20)));
        arrayList.add(c7.b("android-installer", new s0.b(21)));
        try {
            oc.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(c7.a("kotlin", str));
        }
        return arrayList;
    }
}

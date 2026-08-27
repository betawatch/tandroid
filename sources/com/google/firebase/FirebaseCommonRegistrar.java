package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import f9.z;
import g7.i7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import t8.h;
import ug.b;
import w9.c;
import w9.d;
import w9.e;
import w9.f;
import z8.a;
import z8.i;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        b a2 = a.a(ga.b.class);
        a2.a(new i(2, 0, ga.a.class));
        a2.f = new z(7);
        arrayList.add(a2.b());
        q qVar = new q(v8.a.class, Executor.class);
        b bVar = new b(c.class, new Class[]{e.class, f.class});
        bVar.a(i.a(Context.class));
        bVar.a(i.a(h.class));
        bVar.a(new i(2, 0, d.class));
        bVar.a(new i(1, 1, ga.b.class));
        bVar.a(new i(qVar, 1, 0));
        bVar.f = new t0.c(qVar, 4);
        arrayList.add(bVar.b());
        arrayList.add(i7.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(i7.a("fire-core", "20.4.2"));
        arrayList.add(i7.a("device-name", b(Build.PRODUCT)));
        arrayList.add(i7.a("device-model", b(Build.DEVICE)));
        arrayList.add(i7.a("device-brand", b(Build.BRAND)));
        arrayList.add(i7.b("android-target-sdk", new r4.a(26)));
        arrayList.add(i7.b("android-min-sdk", new r4.a(27)));
        arrayList.add(i7.b("android-platform", new r4.a(28)));
        arrayList.add(i7.b("android-installer", new r4.a(29)));
        try {
            pc.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(i7.a("kotlin", str));
        }
        return arrayList;
    }
}

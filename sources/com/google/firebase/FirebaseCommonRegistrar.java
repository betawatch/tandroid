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
import j7.m8;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w8.g;
import z9.c;
import z9.d;
import z9.e;
import z9.f;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int i10 = 23;
        aVar.g = new sf.g(tVar, i10);
        arrayList.add(aVar.b());
        arrayList.add(m8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(m8.a("fire-core", "20.4.2"));
        arrayList.add(m8.a("device-name", b(Build.PRODUCT)));
        arrayList.add(m8.a("device-model", b(Build.DEVICE)));
        arrayList.add(m8.a("device-brand", b(Build.BRAND)));
        arrayList.add(m8.b("android-target-sdk", new sg.a(i10)));
        arrayList.add(m8.b("android-min-sdk", new sg.a(24)));
        arrayList.add(m8.b("android-platform", new sg.a(25)));
        arrayList.add(m8.b("android-installer", new sg.a(26)));
        try {
            sc.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(m8.a("kotlin", str));
        }
        return arrayList;
    }
}

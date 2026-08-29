package com.google.firebase;

import a9.a;
import a9.b;
import a9.m;
import a9.v;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import eg.c;
import h7.v7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import sf.f1;
import sg.j;
import u8.g;
import x9.d;
import x9.e;
import x9.f;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        a b10 = b.b(ha.b.class);
        b10.a(new m(2, 0, ha.a.class));
        int i10 = 16;
        b10.g = new c(i10);
        arrayList.add(b10.b());
        v vVar = new v(w8.a.class, Executor.class);
        a aVar = new a(x9.c.class, new Class[]{e.class, f.class});
        aVar.a(m.b(Context.class));
        aVar.a(m.b(g.class));
        aVar.a(new m(2, 0, d.class));
        aVar.a(new m(1, 1, ha.b.class));
        aVar.a(new m(vVar, 1, 0));
        aVar.g = new f1(vVar, i10);
        arrayList.add(aVar.b());
        arrayList.add(v7.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(v7.a("fire-core", "20.4.2"));
        arrayList.add(v7.a("device-name", b(Build.PRODUCT)));
        arrayList.add(v7.a("device-model", b(Build.DEVICE)));
        arrayList.add(v7.a("device-brand", b(Build.BRAND)));
        arrayList.add(v7.b("android-target-sdk", new j(6)));
        arrayList.add(v7.b("android-min-sdk", new j(7)));
        arrayList.add(v7.b("android-platform", new j(8)));
        arrayList.add(v7.b("android-installer", new j(9)));
        try {
            qc.b.b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(v7.a("kotlin", str));
        }
        return arrayList;
    }
}

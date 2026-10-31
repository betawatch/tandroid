package bb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 a = new f0();
    public static final a4.l b;

    static {
        la.d dVar = new la.d();
        dVar.e(e0.class, g.a);
        dVar.e(n0.class, h.a);
        dVar.e(j.class, e.a);
        dVar.e(b.class, d.a);
        dVar.e(a.class, c.a);
        dVar.e(q.class, f.a);
        dVar.d = true;
        b = new a4.l(dVar, 26);
    }

    public static b a(l9.h hVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        hVar.a();
        String str = hVar.c.b;
        kotlin.jvm.internal.i.d(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.i.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.i.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? valueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        q b10 = r.b(context);
        hVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, r.a(context)));
    }
}

package db;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 {
    public static final p0 a = new p0();
    public static final hi.d b;

    static {
        oa.d dVar = new oa.d();
        dVar.c(o0.class, g.a);
        dVar.c(w0.class, h.a);
        dVar.c(k.class, e.a);
        dVar.c(b.class, d.a);
        dVar.c(a.class, c.a);
        dVar.c(e0.class, f.a);
        dVar.d = true;
        b = new hi.d(dVar, 19);
    }

    public static b a(n9.h hVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        hVar.a();
        String str = hVar.c.b;
        kotlin.jvm.internal.j.d(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        x xVar = x.b;
        kotlin.jvm.internal.j.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? valueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        e0 b10 = f0.b(context);
        hVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, f0.a(context)));
    }
}

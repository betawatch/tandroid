package la;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import vh.p1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 {
    public static final c0 a = new c0();
    public static final p1 b;

    static {
        w9.d dVar = new w9.d();
        dVar.d(b0.class, g.a);
        dVar.d(k0.class, h.a);
        dVar.d(j.class, e.a);
        dVar.d(b.class, d.a);
        dVar.d(a.class, c.a);
        dVar.d(p.class, f.a);
        dVar.d = true;
        b = new p1(dVar);
    }

    public static b a(w8.g gVar) {
        gVar.a();
        Context context = gVar.a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.c.b;
        kotlin.jvm.internal.j.d(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.j.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? valueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        p b10 = q.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, q.a(context)));
    }
}

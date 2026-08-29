package ja;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 a = new f0();
    public static final o1.a b;

    static {
        u9.d dVar = new u9.d();
        dVar.i(e0.class, g.a);
        dVar.i(n0.class, h.a);
        dVar.i(j.class, e.a);
        dVar.i(b.class, d.a);
        dVar.i(a.class, c.a);
        dVar.i(q.class, f.a);
        dVar.d = true;
        b = new o1.a(dVar, 27);
    }

    public static b a(u8.g gVar) {
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
        q b10 = r.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, r.a(context)));
    }
}

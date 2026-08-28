package ha;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 a = new f0();
    public static final n2.p b;

    static {
        s9.d dVar = new s9.d();
        dVar.l(e0.class, g.a);
        dVar.l(n0.class, h.a);
        dVar.l(j.class, e.a);
        dVar.l(b.class, d.a);
        dVar.l(a.class, c.a);
        dVar.l(q.class, f.a);
        dVar.d = true;
        b = new n2.p(dVar, 21);
    }

    public static b a(s8.h hVar) {
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

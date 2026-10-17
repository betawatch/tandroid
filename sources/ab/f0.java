package ab;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import ki.t1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 a = new f0();
    public static final t1 b;

    static {
        la.d dVar = new la.d();
        dVar.a(e0.class, g.a);
        dVar.a(n0.class, h.a);
        dVar.a(j.class, e.a);
        dVar.a(b.class, d.a);
        dVar.a(a.class, c.a);
        dVar.a(q.class, f.a);
        dVar.d = true;
        b = new t1(dVar, 4);
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

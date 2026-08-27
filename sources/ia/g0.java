package ia;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g0 {
    public static final g0 a = new g0();
    public static final n2.b0 b;

    static {
        t9.d dVar = new t9.d();
        dVar.d(f0.class, g.a);
        dVar.d(o0.class, h.a);
        dVar.d(j.class, e.a);
        dVar.d(b.class, d.a);
        dVar.d(a.class, c.a);
        dVar.d(r.class, f.a);
        dVar.d = true;
        b = new n2.b0(dVar, 22);
    }

    public static b a(t8.h hVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        hVar.a();
        String str = hVar.c.b;
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
        hVar.a();
        r b10 = s.b(context);
        hVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, s.a(context)));
    }
}

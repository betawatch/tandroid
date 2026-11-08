package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class q0 {
    public static final q0 a = new q0();
    public static final org.telegram.ui.Components.n b;

    static {
        pa.d dVar = new pa.d();
        dVar.b(p0.class, g.a);
        dVar.b(x0.class, h.a);
        dVar.b(k.class, e.a);
        dVar.b(b.class, d.a);
        dVar.b(a.class, c.a);
        dVar.b(f0.class, f.a);
        dVar.d = true;
        b = new org.telegram.ui.Components.n(dVar);
    }

    public static b a(o9.g gVar) {
        gVar.a();
        Context context = gVar.a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.c.b;
        kotlin.jvm.internal.j.d(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        y yVar = y.b;
        kotlin.jvm.internal.j.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? valueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        f0 b10 = g0.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, g0.a(context)));
    }
}

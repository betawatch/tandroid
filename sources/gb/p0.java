package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.Cells.c5;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class p0 {
    public static final p0 a = new p0();
    public static final c5 b;

    static {
        pa.d dVar = new pa.d();
        dVar.b(o0.class, g.a);
        dVar.b(v0.class, h.a);
        dVar.b(k.class, e.a);
        dVar.b(b.class, d.a);
        dVar.b(a.class, c.a);
        dVar.b(e0.class, f.a);
        dVar.d = true;
        b = new c5(dVar);
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
        e0 b10 = f0.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, f0.a(context)));
    }
}

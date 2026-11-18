package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.Cells.b5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p0 {
    public static final p0 a = new p0();
    public static final b5 b;

    static {
        pa.d dVar = new pa.d();
        dVar.b(o0.class, g.a);
        dVar.b(v0.class, h.a);
        dVar.b(k.class, e.a);
        dVar.b(b.class, d.a);
        dVar.b(a.class, c.a);
        dVar.b(e0.class, f.a);
        dVar.d = true;
        b = new b5(dVar);
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

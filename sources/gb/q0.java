package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.ActionBar.i5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class q0 {
    public static final q0 a = new q0();
    public static final i5 b;

    static {
        pa.d dVar = new pa.d();
        dVar.c(p0.class, g.a);
        dVar.c(w0.class, h.a);
        dVar.c(k.class, e.a);
        dVar.c(b.class, d.a);
        dVar.c(a.class, c.a);
        dVar.c(f0.class, f.a);
        dVar.d = true;
        b = new i5(dVar);
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
        z zVar = z.b;
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

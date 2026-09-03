package la;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.Components.tp0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c0 {
    public static final c0 a = new c0();
    public static final tp0 b;

    static {
        w9.d dVar = new w9.d();
        dVar.b(b0.class, g.a);
        dVar.b(k0.class, h.a);
        dVar.b(j.class, e.a);
        dVar.b(b.class, d.a);
        dVar.b(a.class, c.a);
        dVar.b(p.class, f.a);
        dVar.d = true;
        b = new tp0(dVar, 23);
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

package bb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import li.h5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 a = new f0();
    public static final h5 b;

    static {
        ma.d dVar = new ma.d();
        dVar.d(e0.class, g.a);
        dVar.d(n0.class, h.a);
        dVar.d(j.class, e.a);
        dVar.d(b.class, d.a);
        dVar.d(a.class, c.a);
        dVar.d(q.class, f.a);
        dVar.d = true;
        b = new h5(dVar);
    }

    public static b a(m9.h hVar) {
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

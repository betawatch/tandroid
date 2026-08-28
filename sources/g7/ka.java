package g7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ka {
    public static ta j;
    public static final ya k;
    public final String a;
    public final String b;
    public final ja c;
    public final ya.k d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new ya(objArr);
    }

    public ka(Context context, ya.k kVar, ja jaVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = ya.c.a(context);
        this.d = kVar;
        this.c = jaVar;
        oa.b();
        this.g = "vision-common";
        ya.f a2 = ya.f.a();
        d7.p pVar = new d7.p(this, 3);
        a2.getClass();
        this.e = ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        kVar.getClass();
        d7.q qVar = new d7.q(kVar, 2);
        a3.getClass();
        this.f = ya.f.b(qVar);
        ya yaVar = k;
        this.h = yaVar.containsKey("vision-common") ? i6.e.d(context, (String) yaVar.get("vision-common"), false) : -1;
    }
}

package h7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ka {
    public static ta j;
    public static final ya k;
    public final String a;
    public final String b;
    public final ja c;
    public final za.k d;
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

    public ka(Context context, za.k kVar, ja jaVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = za.c.a(context);
        this.d = kVar;
        this.c = jaVar;
        oa.b();
        this.g = "vision-common";
        za.f a2 = za.f.a();
        e7.p pVar = new e7.p(this, 5);
        a2.getClass();
        this.e = za.f.b(pVar);
        za.f a3 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 2);
        a3.getClass();
        this.f = za.f.b(qVar);
        ya yaVar = k;
        this.h = yaVar.containsKey("vision-common") ? j6.e.d(context, (String) yaVar.get("vision-common"), false) : -1;
    }
}

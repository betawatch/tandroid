package h7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a9 {
    public static l9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final y8 c;
    public final ab.l d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new d(objArr);
    }

    public a9(Context context, ab.l lVar, y8 y8Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = ab.c.a(context);
        this.d = lVar;
        this.c = y8Var;
        f9.b();
        this.g = str;
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 4);
        a2.getClass();
        this.e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 1);
        a10.getClass();
        this.f = ab.g.b(qVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? k6.e.d(context, (String) dVar.get(str), false) : -1;
    }
}

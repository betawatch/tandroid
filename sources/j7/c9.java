package j7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c9 {
    public static n9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final a9 c;
    public final cb.l d;
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

    public c9(Context context, cb.l lVar, a9 a9Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = cb.c.a(context);
        this.d = lVar;
        this.c = a9Var;
        h9.b();
        this.g = str;
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 4);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 1);
        a10.getClass();
        this.f = cb.g.b(pVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? m6.e.d(context, (String) dVar.get(str), false) : -1;
    }
}

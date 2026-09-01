package l7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class la {
    public static w k;
    public static final b0 l;
    public final String a;
    public final String b;
    public final ia c;
    public final cb.l d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new b0(objArr);
    }

    public la(Context context, cb.l lVar, ia iaVar) {
        this.a = context.getPackageName();
        this.b = cb.c.a(context);
        this.d = lVar;
        this.c = iaVar;
        oa.b();
        this.g = "play-services-mlkit-image-labeling";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 6);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 3);
        a10.getClass();
        this.f = cb.g.b(pVar);
        b0 b0Var = l;
        this.h = b0Var.containsKey("play-services-mlkit-image-labeling") ? m6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : b6.j.c.a(this.g);
    }

    public final boolean c(u7 u7Var, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(u7Var) == null || j10 - ((Long) hashMap.get(u7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

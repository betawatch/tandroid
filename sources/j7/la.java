package j7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class la {
    public static w k;
    public static final b0 l;
    public final String a;
    public final String b;
    public final ia c;
    public final ab.l d;
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

    public la(Context context, ab.l lVar, ia iaVar) {
        this.a = context.getPackageName();
        this.b = ab.c.a(context);
        this.d = lVar;
        this.c = iaVar;
        oa.b();
        this.g = "play-services-mlkit-image-labeling";
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 6);
        a2.getClass();
        this.e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 3);
        a10.getClass();
        this.f = ab.g.b(qVar);
        b0 b0Var = l;
        this.h = b0Var.containsKey("play-services-mlkit-image-labeling") ? k6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : z5.i.c.a(this.g);
    }

    public final boolean c(u7 u7Var, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(u7Var) == null || j10 - ((Long) hashMap.get(u7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

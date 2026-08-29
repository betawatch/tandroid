package l7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class wf {
    public static m k;
    public static final r l;
    public final String a;
    public final String b;
    public final uf c;
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
        l = new r(objArr);
    }

    public wf(Context context, ab.l lVar, uf ufVar) {
        this.a = context.getPackageName();
        this.b = ab.c.a(context);
        this.d = lVar;
        this.c = ufVar;
        zf.b();
        this.g = "subject-segmentation";
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 7);
        a2.getClass();
        this.e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 4);
        a10.getClass();
        this.f = ab.g.b(qVar);
        r rVar = l;
        this.h = rVar.containsKey("subject-segmentation") ? k6.e.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(hbVar, elapsedRealtime)) {
            this.i.put(hbVar, Long.valueOf(elapsedRealtime));
            ab.q.a.execute(new c2.p(this, vfVar.zza(), hbVar, c(), false, 7));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return z5.i.c.a(this.g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

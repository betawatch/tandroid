package n7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class xf {
    public static m k;
    public static final r l;
    public final String a;
    public final String b;
    public final vf c;
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
        l = new r(objArr);
    }

    public xf(Context context, cb.l lVar, vf vfVar) {
        this.a = context.getPackageName();
        this.b = cb.c.a(context);
        this.d = lVar;
        this.c = vfVar;
        ag.b();
        this.g = "subject-segmentation";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 7);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 4);
        a10.getClass();
        this.f = cb.g.b(pVar);
        r rVar = l;
        this.h = rVar.containsKey("subject-segmentation") ? m6.e.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(wf wfVar, ib ibVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(ibVar, elapsedRealtime)) {
            this.i.put(ibVar, Long.valueOf(elapsedRealtime));
            cb.o.a.execute(new c2.p(this, wfVar.zza(), ibVar, c(), false, 7));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return b6.j.c.a(this.g);
    }

    public final boolean d(ib ibVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(ibVar) == null || j10 - ((Long) hashMap.get(ibVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

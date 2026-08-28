package j7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class wf {
    public static m k;
    public static final r l;
    public final String a;
    public final String b;
    public final uf c;
    public final ya.k d;
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

    public wf(Context context, ya.k kVar, uf ufVar) {
        this.a = context.getPackageName();
        this.b = ya.c.a(context);
        this.d = kVar;
        this.c = ufVar;
        zf.b();
        this.g = "subject-segmentation";
        ya.f a2 = ya.f.a();
        d7.p pVar = new d7.p(this, 7);
        a2.getClass();
        this.e = ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        kVar.getClass();
        d7.q qVar = new d7.q(kVar, 4);
        a3.getClass();
        this.f = ya.f.b(qVar);
        r rVar = l;
        this.h = rVar.containsKey("subject-segmentation") ? i6.e.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(hbVar, elapsedRealtime)) {
            this.i.put(hbVar, Long.valueOf(elapsedRealtime));
            ya.m.a.execute(new af.f(this, vfVar.zza(), hbVar, c(), false, 6));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return x5.i.c.a(this.g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

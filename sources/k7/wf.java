package k7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class wf {
    public static m k;
    public static final r l;
    public final String a;
    public final String b;
    public final uf c;
    public final za.k d;
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

    public wf(Context context, za.k kVar, uf ufVar) {
        this.a = context.getPackageName();
        this.b = za.c.a(context);
        this.d = kVar;
        this.c = ufVar;
        zf.b();
        this.g = "subject-segmentation";
        za.f a2 = za.f.a();
        e7.p pVar = new e7.p(this, 7);
        a2.getClass();
        this.e = za.f.b(pVar);
        za.f a3 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 4);
        a3.getClass();
        this.f = za.f.b(qVar);
        r rVar = l;
        this.h = rVar.containsKey("subject-segmentation") ? j6.e.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(hbVar, elapsedRealtime)) {
            this.i.put(hbVar, Long.valueOf(elapsedRealtime));
            za.m.a.execute(new bf.e(this, vfVar.zza(), hbVar, c(), false, 6));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return y5.i.c.a(this.g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

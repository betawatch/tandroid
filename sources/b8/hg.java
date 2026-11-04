package b8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class hg {
    public static r k;
    public static final w l;
    public final String a;
    public final String b;
    public final bg c;
    public final mb.k d;
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
        l = new w(objArr);
    }

    public hg(Context context, mb.k kVar, bg bgVar) {
        this.a = context.getPackageName();
        this.b = mb.c.a(context);
        this.d = kVar;
        this.c = bgVar;
        pg.b();
        this.g = "subject-segmentation";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 0);
        a10.getClass();
        this.e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 0);
        a11.getClass();
        this.f = mb.f.b(egVar);
        w wVar = l;
        this.h = wVar.containsKey("subject-segmentation") ? a7.f.d(context, (String) wVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(gg ggVar, ob obVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(obVar, elapsedRealtime)) {
            this.i.put(obVar, Long.valueOf(elapsedRealtime));
            mb.m.a.execute(new cg(this, ggVar.zza(), obVar, c(), 0));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return p6.j.c.a(this.g);
    }

    public final boolean d(ob obVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(obVar) == null || j10 - ((Long) hashMap.get(obVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

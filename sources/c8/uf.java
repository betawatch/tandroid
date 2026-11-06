package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class uf {
    public static m k;
    public static final r l;
    public final String a;
    public final String b;
    public final sf c;
    public final pb.k d;
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

    public uf(Context context, pb.k kVar, sf sfVar) {
        this.a = context.getPackageName();
        this.b = pb.c.a(context);
        this.d = kVar;
        this.c = sfVar;
        xf.b();
        this.g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.oa oaVar = new a8.oa(kVar, 1);
        a11.getClass();
        this.f = pb.f.b(oaVar);
        r rVar = l;
        this.h = rVar.containsKey("subject-segmentation") ? b7.f.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(tf tfVar, fb fbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(fbVar, elapsedRealtime)) {
            this.i.put(fbVar, Long.valueOf(elapsedRealtime));
            pb.m.a.execute(new a8.pa(this, tfVar.zza(), fbVar, c(), 1));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.c.a(this.g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.i;
        return hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

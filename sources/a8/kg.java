package a8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class kg {
    public static r k;
    public static final w l;
    public final String a;
    public final String b;
    public final eg c;
    public final sb.k d;
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

    public kg(Context context, sb.k kVar, eg egVar) {
        this.a = context.getPackageName();
        this.b = sb.c.a(context);
        this.d = kVar;
        this.c = egVar;
        sg.b();
        this.g = "subject-segmentation";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 0);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 0);
        a10.getClass();
        this.f = sb.f.b(hgVar);
        w wVar = l;
        this.h = wVar.containsKey("subject-segmentation") ? z6.e.d(context, (String) wVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(jg jgVar, rb rbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(rbVar, elapsedRealtime)) {
            this.i.put(rbVar, Long.valueOf(elapsedRealtime));
            sb.m.a.execute(new fg(this, jgVar.zza(), rbVar, c(), 0));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return o6.i.c.a(this.g);
    }

    public final boolean d(rb rbVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(rbVar) == null || j10 - ((Long) hashMap.get(rbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

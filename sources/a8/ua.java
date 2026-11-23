package a8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class ua {
    public static a0 k;
    public static final f0 l;
    public final String a;
    public final String b;
    public final oa c;
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
        l = new f0(objArr);
    }

    public ua(Context context, pb.k kVar, oa oaVar) {
        this.a = context.getPackageName();
        this.b = pb.c.a(context);
        this.d = kVar;
        this.c = oaVar;
        cb.b();
        this.g = "play-services-mlkit-image-labeling";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 1);
        a10.getClass();
        this.e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 0);
        a11.getClass();
        this.f = pb.f.b(paVar);
        f0 f0Var = l;
        this.h = f0Var.containsKey("play-services-mlkit-image-labeling") ? b7.f.d(context, (String) f0Var.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(this.g);
    }

    public final boolean c(a8 a8Var, long j3) {
        HashMap hashMap = this.i;
        return hashMap.get(a8Var) == null || j3 - ((Long) hashMap.get(a8Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

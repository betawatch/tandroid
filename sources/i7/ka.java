package i7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ka {
    public static w k;
    public static final b0 l;
    public final String a;
    public final String b;
    public final ha c;
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
        l = new b0(objArr);
    }

    public ka(Context context, za.k kVar, ha haVar) {
        this.a = context.getPackageName();
        this.b = za.c.a(context);
        this.d = kVar;
        this.c = haVar;
        na.b();
        this.g = "play-services-mlkit-image-labeling";
        za.f a2 = za.f.a();
        e7.p pVar = new e7.p(this, 6);
        a2.getClass();
        this.e = za.f.b(pVar);
        za.f a3 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 3);
        a3.getClass();
        this.f = za.f.b(qVar);
        b0 b0Var = l;
        this.h = b0Var.containsKey("play-services-mlkit-image-labeling") ? j6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : y5.i.c.a(this.g);
    }

    public final boolean c(t7 t7Var, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(t7Var) == null || j10 - ((Long) hashMap.get(t7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}

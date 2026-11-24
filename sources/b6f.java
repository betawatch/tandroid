// default package

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b6f {
    public static ihd k;
    public static final hid l;
    public final String a;
    public final String b;
    public final p5f c;
    public final uha d;
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
        l = new hid(objArr);
    }

    public b6f(Context context, uha uhaVar, p5f p5fVar) {
        this.a = context.getPackageName();
        this.b = ao2.a(context);
        this.d = uhaVar;
        this.c = p5fVar;
        q7f.C0();
        this.g = "play-services-mlkit-image-labeling";
        ni6.q();
        this.e = ni6.E(new mg7(this, (byte) 7));
        ni6.q();
        uhaVar.getClass();
        this.f = ni6.E(new kze(uhaVar, (byte) 2));
        hid hidVar = l;
        this.h = hidVar.containsKey("play-services-mlkit-image-labeling") ? nt3.d(context, (String) hidVar.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : r26.c.a(this.g);
    }

    public final boolean c(hve hveVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(hveVar) == null || j - ((Long) hashMap.get(hveVar)).longValue() > 30000;
    }
}

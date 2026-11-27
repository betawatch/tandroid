// default package

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class j2f {
    public static imf j;
    public static final vad k;
    public final String a;
    public final String b;
    public final q1f c;
    public final lja d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new vad(objArr);
    }

    public j2f(Context context, lja ljaVar, q1f q1fVar, String str) {
        this.a = context.getPackageName();
        this.b = in2.a(context);
        this.d = ljaVar;
        this.c = q1fVar;
        z3f.p();
        this.g = str;
        ri6.v();
        this.e = ri6.G(new tg7(this, (byte) 5));
        ri6.v();
        ljaVar.getClass();
        this.f = ri6.G(new z1f(ljaVar, (byte) 0));
        vad vadVar = k;
        this.h = vadVar.containsKey(str) ? vs3.d(context, (String) vadVar.get(str), false) : -1;
    }
}

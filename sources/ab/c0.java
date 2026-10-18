package ab;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c0 implements t {
    public static final w e = new w();
    public static final m1.c f = w7.s.a(s.a);
    public final Context a;
    public final kd.h b;
    public final AtomicReference c;
    public final n4.s d;

    public c0(Context context, kd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 14;
        this.d = new n4.s(3, new qf.b(i10, ((k1.z) f.a(context, w.a[0]).b).c, new y(3, null)), this);
        be.f0.q(be.f0.b(hVar), new v(this, null, 0));
    }
}

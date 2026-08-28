package ha;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c0 implements t {
    public static final w e = new w();
    public static final m1.c f = g7.o.a(s.a);
    public final Context a;
    public final qc.h b;
    public final AtomicReference c;
    public final g5.b d;

    public c0(Context context, qc.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i9 = 15;
        this.d = new g5.b(7, new g5.b(i9, ((k1.z) f.a(context, w.a[0]).b).c, new y(3, null)), this);
        hd.f0.q(hd.f0.b(hVar), new v(this, null, 0));
    }
}

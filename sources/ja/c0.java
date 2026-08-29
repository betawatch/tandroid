package ja;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c0 implements t {
    public static final w e = new w();
    public static final m1.c f = i7.x.a(s.a);
    public final Context a;
    public final sc.h b;
    public final AtomicReference c;
    public final g9.l d;

    public c0(Context context, sc.h hVar) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        boolean z10 = false;
        boolean z11 = false;
        this.d = new g9.l(new g9.l(((k1.a0) f.a(context, w.a[0]).b).c, new y(3, null), z10, 23), this, z11, 13);
        jd.e0.q(jd.e0.b(hVar), new v(this, null, 0));
    }
}

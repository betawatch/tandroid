package bb;

import a8.fe;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c0 implements t {
    public static final w e = new w();
    public static final m1.c f = fe.a(s.a);
    public final Context a;
    public final ld.h b;
    public final AtomicReference c;
    public final rf.b d;

    public c0(Context context, ld.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 18;
        this.d = new rf.b(8, new rf.b(i10, ((k1.z) f.a(context, w.a[0]).b).c, new y(3, null)), this);
        ce.f0.q(ce.f0.b(hVar), new v(this, null, 0));
    }
}

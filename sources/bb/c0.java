package bb;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c0 implements t {
    public static final w e = new w();
    public static final m1.c f = w7.v.a(s.a);
    public final Context a;
    public final cd.h b;
    public final AtomicReference c;
    public final hf.b d;

    public c0(Context context, cd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 4;
        this.d = new hf.b(6, new u9.b(i10, ((k1.z) f.a(context, w.a[0]).a).c, new y(3, null)), this);
        td.e0.q(td.e0.b(hVar), new v(this, null, 0));
    }
}

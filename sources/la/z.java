package la;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import n7.qa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z implements s {
    public static final v e = new v();
    public static final m1.c f = k7.p.a(r.a);
    public final Context a;
    public final uc.h b;
    public final AtomicReference c;
    public final f7.b d;

    public z(Context context, uc.h hVar) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 6;
        this.d = new f7.b(26, new qa(i10, ((k1.d0) f.a(context, v.a[0]).b).c, new x(3, null)), this);
        ld.e0.q(ld.e0.b(hVar), new u(this, null, 0));
    }
}

package ia;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d0 implements u {
    public static final x e = new x();
    public static final m1.c f = h7.o.a(t.a);
    public final Context a;
    public final rc.h b;
    public final AtomicReference c;
    public final g5.b d;

    public d0(Context context, rc.h hVar) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 17;
        this.d = new g5.b(10, new g5.b(i10, ((k1.z) f.a(context, x.a[0]).b).c, new z(3, null)), this);
        id.f0.q(id.f0.b(hVar), new w(this, null, 0));
    }
}

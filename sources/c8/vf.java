package c8;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class vf implements rf {
    public final u9.n a;
    public final qf b;

    public vf(Context context, qf qfVar) {
        this.b = qfVar;
        m5.a aVar = m5.a.e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new a8.xa(c10, 2));
        }
        this.a = new u9.n(new a8.xa(c10, 3));
    }

    @Override // c8.rf
    public final void a(a8.wa waVar) {
        this.b.getClass();
        ((o5.r) this.a.get()).a(waVar.b != 0 ? l5.a.a(waVar.E()) : new l5.a(null, waVar.E(), l5.d.b, null), new ni.a(3));
    }
}

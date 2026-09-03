package n7;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class yf implements uf {
    public final c9.p a;
    public final tf b;

    public yf(Context context, tf tfVar) {
        this.b = tfVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 6));
        }
        this.a = new c9.p(new j7.e9(c3, 7));
    }

    @Override // n7.uf
    public final void a(b4.e0 e0Var) {
        this.b.getClass();
        ((y2.p) this.a.get()).a(e0Var.b != 0 ? new v2.a(null, e0Var.E(), v2.d.a, null) : new v2.a(null, e0Var.E(), v2.d.b, null), new sg.a(29));
    }
}

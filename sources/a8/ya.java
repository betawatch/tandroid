package a8;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class ya implements sa {
    public final u9.n a;
    public final ma b;

    public ya(Context context, ma maVar) {
        this.b = maVar;
        m5.a aVar = m5.a.e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new xa(c10, 0));
        }
        this.a = new u9.n(new xa(c10, 1));
    }

    @Override // a8.sa
    public final void a(wa waVar) {
        this.b.getClass();
        ((o5.r) this.a.get()).a(waVar.b != 0 ? l5.a.a(waVar.E()) : new l5.a(null, waVar.E(), l5.d.b, null), new ni.a(3));
    }
}

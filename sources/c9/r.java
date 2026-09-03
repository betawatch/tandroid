package c9;

import androidx.emoji2.text.w;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r implements ba.b {
    public static final w c = new w(7);
    public static final g d = new g(1);
    public ba.a a;
    public volatile ba.b b;

    public r(w wVar, ba.b bVar) {
        this.a = wVar;
        this.b = bVar;
    }

    public final void a(ba.a aVar) {
        ba.b bVar;
        ba.b bVar2;
        ba.b bVar3 = this.b;
        g gVar = d;
        if (bVar3 != gVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.a = new c1.b(1, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override // ba.b
    public final Object get() {
        return this.b.get();
    }
}

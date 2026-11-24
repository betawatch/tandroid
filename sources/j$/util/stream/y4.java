package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class y4 extends d {
    public final w3 h;

    public y4(y4 y4Var, Spliterator spliterator) {
        super(y4Var, spliterator);
        this.h = y4Var.h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        r4 Y = this.h.Y();
        aVar.Q(this.b, Y);
        return Y;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new y4(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            r4 r4Var = (r4) ((y4) dVar).f;
            r4Var.w((r4) ((y4) this.e).f);
            this.f = r4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public y4(w3 w3Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = w3Var;
    }
}

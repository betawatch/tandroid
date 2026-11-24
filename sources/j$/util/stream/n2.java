package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public class n2 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public n2(n2 n2Var, Spliterator spliterator) {
        super(n2Var, spliterator);
        this.h = n2Var.h;
        this.i = n2Var.i;
        this.j = n2Var.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new n2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final h2 a() {
        z1 z1Var = (z1) this.i.apply(this.h.F(this.b));
        this.h.Q(this.b, z1Var);
        return z1Var.build();
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (h2) this.j.apply((h2) ((n2) dVar).f, (h2) ((n2) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public n2(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}

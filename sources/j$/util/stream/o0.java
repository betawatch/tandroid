package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class o0 extends s0 {
    final /* synthetic */ t0 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(t0 t0Var, Predicate predicate) {
        super(t0Var);
        this.c = t0Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        t0 t0Var = this.c;
        z = t0Var.a;
        if (test == z) {
            this.a = true;
            z2 = t0Var.b;
            this.b = z2;
        }
    }
}

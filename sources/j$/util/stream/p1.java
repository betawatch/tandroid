package j$.util.stream;

import java.util.function.Predicate;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class p1 extends t1 {
    public final /* synthetic */ u1 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(u1 u1Var, Predicate predicate) {
        super(u1Var);
        this.c = u1Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        u1 u1Var = this.c;
        if (test == u1Var.a) {
            this.a = true;
            this.b = u1Var.b;
        }
    }
}

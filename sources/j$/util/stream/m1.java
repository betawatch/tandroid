package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class m1 extends q1 {
    public final /* synthetic */ r1 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(r1 r1Var, Predicate predicate) {
        super(r1Var);
        this.c = r1Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        r1 r1Var = this.c;
        if (test == r1Var.a) {
            this.a = true;
            this.b = r1Var.b;
        }
    }
}

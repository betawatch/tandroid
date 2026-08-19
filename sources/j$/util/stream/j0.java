package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class j0 extends n0 {
    public final /* synthetic */ o0 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o0 o0Var, Predicate predicate) {
        super(o0Var);
        this.c = o0Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        o0 o0Var = this.c;
        if (test == o0Var.a) {
            this.a = true;
            this.b = o0Var.b;
        }
    }
}

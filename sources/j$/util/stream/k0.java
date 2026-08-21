package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class k0 extends o0 {
    public final /* synthetic */ p0 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, Predicate predicate) {
        super(p0Var);
        this.c = p0Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        p0 p0Var = this.c;
        if (test == p0Var.a) {
            this.a = true;
            this.b = p0Var.b;
        }
    }
}

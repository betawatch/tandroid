package j$.util.stream;

import j$.util.function.Predicate;

/* loaded from: classes2.dex */
final class m0 extends q0 {
    final /* synthetic */ r0 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m0(Predicate predicate, r0 r0Var) {
        super(r0Var);
        this.c = r0Var;
        this.d = predicate;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        r0 r0Var = this.c;
        z = r0Var.a;
        if (test == z) {
            this.a = true;
            z2 = r0Var.b;
            this.b = z2;
        }
    }
}

package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class s extends d2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new r(this, m2Var, 0);
            case 1:
                return new U(this, m2Var, 0);
            case 2:
                return new d0(this, m2Var, 0);
            case 3:
                return new n(this, m2Var, 1);
            case 4:
                return new n(this, m2Var, 2);
            case 5:
                return new n(this, m2Var, 3);
            default:
                return new m(this, m2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e2 e2Var, Consumer consumer) {
        super(e2Var, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}

package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class u extends U1 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        switch (this.m) {
            case 0:
                return new s(this, d2Var, 1);
            case 1:
                return new V(this, d2Var, 2);
            case 2:
                return new e0(this, d2Var, 1);
            case 3:
                return new n(this, d2Var, 1);
            default:
                return new n(this, d2Var, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(V1 v1, Consumer consumer) {
        super(v1, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}

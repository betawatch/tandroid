package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class j4 extends t3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    @Override // j$.util.stream.t3
    public final o4 D0() {
        return new i4(this.i, this.h);
    }

    public j4(w6 w6Var, IntBinaryOperator intBinaryOperator, int i10) {
        this.h = intBinaryOperator;
        this.i = i10;
    }
}

package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class m4 extends w3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public m4(c7 c7Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        return new l4(this.i, this.h);
    }
}

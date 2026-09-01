package fg;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g1 extends Scroller {
    public final /* synthetic */ h1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, Context context) {
        super(context);
        this.a = h1Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (this.a.u0 ? 3 : 1) * i14);
    }
}

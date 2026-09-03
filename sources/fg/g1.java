package fg;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

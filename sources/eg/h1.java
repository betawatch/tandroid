package eg;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h1 extends Scroller {
    public final /* synthetic */ i1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, Context context) {
        super(context);
        this.a = i1Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (this.a.u0 ? 3 : 1) * i14);
    }
}

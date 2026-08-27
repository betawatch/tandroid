package ag;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z1 extends Scroller {
    public final /* synthetic */ a2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, Context context) {
        super(context);
        this.a = a2Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (this.a.t0 ? 3 : 1) * i14);
    }
}

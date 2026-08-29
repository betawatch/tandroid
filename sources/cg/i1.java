package cg;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i1 extends Scroller {
    public final /* synthetic */ j1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, Context context) {
        super(context);
        this.a = j1Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (this.a.t0 ? 3 : 1) * i14);
    }
}

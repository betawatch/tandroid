// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class at5 extends ilb {
    public final /* synthetic */ bt5 E;
    public final zz3 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at5(bt5 bt5Var, Context context) {
        super(context);
        this.E = bt5Var;
        this.x = new zz3(this, (byte) 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zz3 zz3Var = this.x;
        hl.r(zz3Var);
        if (this.y) {
            hl.d3(zz3Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.r(this.x);
    }
}

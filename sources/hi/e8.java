package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e8 extends n8 {
    public final /* synthetic */ l8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(l8 l8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, b8 b8Var) {
        super(context, e6Var, b8Var);
        this.N = l8Var;
    }

    @Override // hi.n8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        l8 l8Var = this.N;
        l8Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (l8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = l8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        l8 l8Var = this.N;
        l8Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (l8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = l8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}

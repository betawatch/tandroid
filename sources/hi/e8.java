package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e8 extends n8 {
    public final /* synthetic */ l8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(l8 l8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, b8 b8Var) {
        super(context, i6Var, b8Var);
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

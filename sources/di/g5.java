package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.m30;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g5 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ h5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(h5 h5Var, Context context) {
        super(context);
        this.b = h5Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i7, i10, i11, i12);
        h5 h5Var = this.b;
        m30 m30Var = h5Var.i;
        if (m30Var == null || m30Var.d.getChildCount() < 2 || h5Var.t == null || (frameLayout = h5Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - h5Var.m.getTranslationX();
        float translationY = iArr[1] - h5Var.m.getTranslationY();
        View childAt = m30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        h5Var.t.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - m30Var.getMeasuredHeight());
        h5Var.t.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.g0.L(12.0f));
    }
}

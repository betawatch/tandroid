package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m5 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ n5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, Context context) {
        super(context);
        this.b = n5Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i3, i10, i11, i12);
        n5 n5Var = this.b;
        x20 x20Var = n5Var.i;
        if (x20Var == null || x20Var.d.getChildCount() < 2 || n5Var.r == null || (frameLayout = n5Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - n5Var.m.getTranslationX();
        float translationY = iArr[1] - n5Var.m.getTranslationY();
        View childAt = x20Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        n5Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - x20Var.getMeasuredHeight());
        n5Var.r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.g0.L(12.0f));
    }
}

package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n40;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j4 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ k4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var, Context context) {
        super(context);
        this.b = k4Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z4, i10, i11, i12, i13);
        k4 k4Var = this.b;
        n40 n40Var = k4Var.i;
        if (n40Var == null || n40Var.d.getChildCount() < 2 || k4Var.r == null || (frameLayout = k4Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - k4Var.m.getTranslationX();
        float translationY = iArr[1] - k4Var.m.getTranslationY();
        View childAt = n40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        k4Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - n40Var.getMeasuredHeight());
        k4Var.r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

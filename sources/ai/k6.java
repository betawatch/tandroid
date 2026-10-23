package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u40;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class k6 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ l6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, Context context) {
        super(context);
        this.b = l6Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        l6 l6Var = this.b;
        u40 u40Var = l6Var.i;
        if (u40Var == null || u40Var.d.getChildCount() < 2 || l6Var.r == null || (frameLayout = l6Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - l6Var.m.getTranslationX();
        float translationY = iArr[1] - l6Var.m.getTranslationY();
        View childAt = u40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        l6Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - u40Var.getMeasuredHeight());
        l6Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

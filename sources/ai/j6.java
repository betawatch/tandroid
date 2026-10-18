package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u40;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class j6 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ k6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(k6 k6Var, Context context) {
        super(context);
        this.b = k6Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        k6 k6Var = this.b;
        u40 u40Var = k6Var.i;
        if (u40Var == null || u40Var.d.getChildCount() < 2 || k6Var.r == null || (frameLayout = k6Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - k6Var.m.getTranslationX();
        float translationY = iArr[1] - k6Var.m.getTranslationY();
        View childAt = u40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        k6Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - u40Var.getMeasuredHeight());
        k6Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

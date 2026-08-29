package jh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j40;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k4 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ l4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(l4 l4Var, Context context) {
        super(context);
        this.b = l4Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        l4 l4Var = this.b;
        j40 j40Var = l4Var.i;
        if (j40Var == null || j40Var.d.getChildCount() < 2 || l4Var.r == null || (frameLayout = l4Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - l4Var.m.getTranslationX();
        float translationY = iArr[1] - l4Var.m.getTranslationY();
        View childAt = j40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        l4Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - j40Var.getMeasuredHeight());
        l4Var.r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

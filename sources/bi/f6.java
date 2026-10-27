package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w40;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f6 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ g6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(g6 g6Var, Context context) {
        super(context);
        this.b = g6Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        g6 g6Var = this.b;
        w40 w40Var = g6Var.i;
        if (w40Var == null || w40Var.d.getChildCount() < 2 || g6Var.r == null || (frameLayout = g6Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - g6Var.m.getTranslationX();
        float translationY = iArr[1] - g6Var.m.getTranslationY();
        View childAt = w40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        g6Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - w40Var.getMeasuredHeight());
        g6Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

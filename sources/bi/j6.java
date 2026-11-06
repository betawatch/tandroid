package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.b30;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z9, i7, i10, i11, i12);
        k6 k6Var = this.b;
        b30 b30Var = k6Var.i;
        if (b30Var == null || b30Var.d.getChildCount() < 2 || k6Var.r == null || (frameLayout = k6Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - k6Var.m.getTranslationX();
        float translationY = iArr[1] - k6Var.m.getTranslationY();
        View childAt = b30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        k6Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - b30Var.getMeasuredHeight());
        k6Var.r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.g0.L(12.0f));
    }
}

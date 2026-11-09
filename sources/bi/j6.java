package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c30;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        c30 c30Var = k6Var.i;
        if (c30Var == null || c30Var.d.getChildCount() < 2 || k6Var.r == null || (frameLayout = k6Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - k6Var.m.getTranslationX();
        float translationY = iArr[1] - k6Var.m.getTranslationY();
        View childAt = c30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        k6Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - c30Var.getMeasuredHeight());
        k6Var.r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.g0.L(12.0f));
    }
}

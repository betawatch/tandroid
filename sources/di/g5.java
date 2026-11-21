package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.p30;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        p30 p30Var = h5Var.i;
        if (p30Var == null || p30Var.d.getChildCount() < 2 || h5Var.t == null || (frameLayout = h5Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - h5Var.m.getTranslationX();
        float translationY = iArr[1] - h5Var.m.getTranslationY();
        View childAt = p30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        h5Var.t.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - p30Var.getMeasuredHeight());
        h5Var.t.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.g0.L(12.0f));
    }
}

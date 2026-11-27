// default package

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k78 extends NestedScrollView {
    public View W;
    public final /* synthetic */ r78 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k78(r78 r78Var, Activity activity) {
        super(activity);
        this.a0 = r78Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.W == null || this.a0.n1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c = super.c(rect);
        int currentActionBarHeight = a.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + c);
        return currentActionBarHeight > 0 ? ik8.B(10.0f, currentActionBarHeight, c) : c;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}

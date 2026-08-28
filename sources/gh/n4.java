package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v30;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n4 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ o4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(o4 o4Var, Context context) {
        super(context);
        this.b = o4Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i9, i10, i11, i12);
        o4 o4Var = this.b;
        v30 v30Var = o4Var.i;
        if (v30Var == null || v30Var.d.getChildCount() < 2 || o4Var.r == null || (frameLayout = o4Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - o4Var.m.getTranslationX();
        float translationY = iArr[1] - o4Var.m.getTranslationY();
        View childAt = v30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        o4Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - v30Var.getMeasuredHeight());
        o4Var.r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

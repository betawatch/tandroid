package hh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a40;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l4 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ m4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(m4 m4Var, Context context) {
        super(context);
        this.b = m4Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        m4 m4Var = this.b;
        a40 a40Var = m4Var.i;
        if (a40Var == null || a40Var.d.getChildCount() < 2 || m4Var.r == null || (frameLayout = m4Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - m4Var.m.getTranslationX();
        float translationY = iArr[1] - m4Var.m.getTranslationY();
        View childAt = a40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        m4Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - a40Var.getMeasuredHeight());
        m4Var.r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

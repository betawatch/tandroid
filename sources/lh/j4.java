package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o40;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j4 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ k4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var, Context context) {
        super(context);
        this.b = k4Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z4, i10, i11, i12, i13);
        k4 k4Var = this.b;
        o40 o40Var = k4Var.i;
        if (o40Var == null || o40Var.d.getChildCount() < 2 || k4Var.r == null || (frameLayout = k4Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - k4Var.m.getTranslationX();
        float translationY = iArr[1] - k4Var.m.getTranslationY();
        View childAt = o40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        k4Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - o40Var.getMeasuredHeight());
        k4Var.r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}

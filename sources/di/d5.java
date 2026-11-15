package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e30;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d5 extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ e5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(e5 e5Var, Context context) {
        super(context);
        this.b = e5Var;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i7, i10, i11, i12);
        e5 e5Var = this.b;
        e30 e30Var = e5Var.i;
        if (e30Var == null || e30Var.d.getChildCount() < 2 || e5Var.r == null || (frameLayout = e5Var.m) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - e5Var.m.getTranslationX();
        float translationY = iArr[1] - e5Var.m.getTranslationY();
        View childAt = e30Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        e5Var.r.setTranslationY(((translationY2 - translationY) - r1.getMeasuredHeight()) - e30Var.getMeasuredHeight());
        e5Var.r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - org.telegram.messenger.g0.L(12.0f));
    }
}

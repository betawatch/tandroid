// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class aua extends FrameLayout {
    public final int[] a;
    public final /* synthetic */ bua b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aua(bua buaVar, Context context) {
        super(context);
        this.b = buaVar;
        this.a = new int[2];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        super.onLayout(z, i, i2, i3, i4);
        bua buaVar = this.b;
        zh5 zh5Var = buaVar.i;
        if (zh5Var == null || zh5Var.d.getChildCount() < 2 || buaVar.u == null || (frameLayout = buaVar.n) == null) {
            return;
        }
        int[] iArr = this.a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - buaVar.n.getTranslationX();
        float translationY = iArr[1] - buaVar.n.getTranslationY();
        View childAt = zh5Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        buaVar.u.setTranslationY(((translationY2 - translationY) - r8.getMeasuredHeight()) - zh5Var.getMeasuredHeight());
        buaVar.u.o(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - hl.L(12.0f));
    }
}

package ci;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class h4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ i4 c;

    public h4(i4 i4Var, boolean z10, View view) {
        this.c = i4Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        i4 i4Var = this.c;
        if (z10) {
            i4Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i4Var.j);
        view2.addOnLayoutChangeListener(i4Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i4 i4Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(i4Var.j);
        view2.removeOnLayoutChangeListener(i4Var.i);
    }
}

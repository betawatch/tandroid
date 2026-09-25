package ci;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

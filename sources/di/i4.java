package di;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ j4 c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.c = j4Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        j4 j4Var = this.c;
        if (z10) {
            j4Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.j);
        view2.addOnLayoutChangeListener(j4Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.j);
        view2.removeOnLayoutChangeListener(j4Var.i);
    }
}

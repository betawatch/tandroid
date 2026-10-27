package fi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ z3 c;

    public y3(z3 z3Var, boolean z10, View view) {
        this.c = z3Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        z3 z3Var = this.c;
        if (z10) {
            z3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(z3Var.j);
        view2.addOnLayoutChangeListener(z3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        z3 z3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(z3Var.j);
        view2.removeOnLayoutChangeListener(z3Var.i);
    }
}

package nh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ w3 c;

    public v3(w3 w3Var, boolean z10, View view) {
        this.c = w3Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        w3 w3Var = this.c;
        if (z10) {
            w3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(w3Var.j);
        view2.addOnLayoutChangeListener(w3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        w3 w3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(w3Var.j);
        view2.removeOnLayoutChangeListener(w3Var.i);
    }
}

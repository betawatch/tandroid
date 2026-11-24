// default package

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lx5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ mx5 c;

    public lx5(mx5 mx5Var, boolean z, View view) {
        this.c = mx5Var;
        this.a = z;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z = this.a;
        mx5 mx5Var = this.c;
        if (z) {
            mx5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(mx5Var.j);
        view2.addOnLayoutChangeListener(mx5Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        mx5 mx5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(mx5Var.j);
        view2.removeOnLayoutChangeListener(mx5Var.i);
    }
}

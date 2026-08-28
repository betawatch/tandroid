package kh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ b4 c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.c = b4Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        b4 b4Var = this.c;
        if (z10) {
            b4Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.j);
        view2.addOnLayoutChangeListener(b4Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.j);
        view2.removeOnLayoutChangeListener(b4Var.i);
    }
}

package lh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ a4 c;

    public z3(a4 a4Var, boolean z10, View view) {
        this.c = a4Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        a4 a4Var = this.c;
        if (z10) {
            a4Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(a4Var.j);
        view2.addOnLayoutChangeListener(a4Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        a4 a4Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(a4Var.j);
        view2.removeOnLayoutChangeListener(a4Var.i);
    }
}

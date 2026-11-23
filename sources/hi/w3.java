package hi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ x3 c;

    public w3(x3 x3Var, boolean z10, View view) {
        this.c = x3Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        x3 x3Var = this.c;
        if (z10) {
            x3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(x3Var.j);
        view2.addOnLayoutChangeListener(x3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        x3 x3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(x3Var.j);
        view2.removeOnLayoutChangeListener(x3Var.i);
    }
}

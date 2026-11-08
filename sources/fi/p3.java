package fi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class p3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ q3 c;

    public p3(q3 q3Var, boolean z9, View view) {
        this.c = q3Var;
        this.a = z9;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z9 = this.a;
        q3 q3Var = this.c;
        if (z9) {
            q3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(q3Var.j);
        view2.addOnLayoutChangeListener(q3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        q3 q3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(q3Var.j);
        view2.removeOnLayoutChangeListener(q3Var.i);
    }
}

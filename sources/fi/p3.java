package fi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

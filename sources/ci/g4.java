package ci;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ h4 c;

    public g4(h4 h4Var, boolean z10, View view) {
        this.c = h4Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        h4 h4Var = this.c;
        if (z10) {
            h4Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h4Var.j);
        view2.addOnLayoutChangeListener(h4Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h4 h4Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(h4Var.j);
        view2.removeOnLayoutChangeListener(h4Var.i);
    }
}

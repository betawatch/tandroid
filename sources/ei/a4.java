package ei;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

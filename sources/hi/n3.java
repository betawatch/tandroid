package hi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class n3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ o3 c;

    public n3(o3 o3Var, boolean z10, View view) {
        this.c = o3Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        o3 o3Var = this.c;
        if (z10) {
            o3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(o3Var.j);
        view2.addOnLayoutChangeListener(o3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        o3 o3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(o3Var.j);
        view2.removeOnLayoutChangeListener(o3Var.i);
    }
}

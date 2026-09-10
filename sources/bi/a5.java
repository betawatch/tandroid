package bi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ b5 c;

    public a5(b5 b5Var, boolean z10, View view) {
        this.c = b5Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        b5 b5Var = this.c;
        if (z10) {
            b5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b5Var.j);
        view2.addOnLayoutChangeListener(b5Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b5 b5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(b5Var.j);
        view2.removeOnLayoutChangeListener(b5Var.i);
    }
}

package hi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ p3 c;

    public o3(p3 p3Var, boolean z10, View view) {
        this.c = p3Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        p3 p3Var = this.c;
        if (z10) {
            p3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(p3Var.j);
        view2.addOnLayoutChangeListener(p3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        p3 p3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(p3Var.j);
        view2.removeOnLayoutChangeListener(p3Var.i);
    }
}

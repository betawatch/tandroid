package ei;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

// default package

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class lv5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ mv5 c;

    public lv5(mv5 mv5Var, boolean z, View view) {
        this.c = mv5Var;
        this.a = z;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z = this.a;
        mv5 mv5Var = this.c;
        if (z) {
            mv5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(mv5Var.j);
        view2.addOnLayoutChangeListener(mv5Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        mv5 mv5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(mv5Var.j);
        view2.removeOnLayoutChangeListener(mv5Var.i);
    }
}

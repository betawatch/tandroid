// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cq implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cq(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ViewTreeObserver viewTreeObserver = ((dq) obj2).X.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener((vp) obj);
                    break;
                }
                break;
            default:
                fu5 fu5Var = (fu5) obj2;
                fu5Var.m = null;
                fu5Var.v((ViewGroup) obj);
                View view2 = fu5Var.v0;
                if (view2 != null) {
                    view2.setPressed(false);
                    fu5Var.v0 = null;
                }
                if (fu5Var.u0 != null && (view = fu5Var.f) != null) {
                    view.setOnTouchListener(null);
                }
                fu5Var.u0 = null;
                fu5Var.O();
                Runnable runnable = fu5Var.p;
                if (runnable != null) {
                    runnable.run();
                    fu5Var.p = null;
                    break;
                }
                break;
        }
    }
}

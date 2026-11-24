// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bq implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bq(Object obj, Object obj2, byte b) {
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
                ViewTreeObserver viewTreeObserver = ((cq) obj2).X.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener((up) obj);
                    break;
                }
                break;
            default:
                cs5 cs5Var = (cs5) obj2;
                cs5Var.m = null;
                cs5Var.v((ViewGroup) obj);
                View view2 = cs5Var.s0;
                if (view2 != null) {
                    view2.setPressed(false);
                    cs5Var.s0 = null;
                }
                if (cs5Var.r0 != null && (view = cs5Var.f) != null) {
                    view.setOnTouchListener(null);
                }
                cs5Var.r0 = null;
                cs5Var.O();
                Runnable runnable = cs5Var.p;
                if (runnable != null) {
                    runnable.run();
                    cs5Var.p = null;
                    break;
                }
                break;
        }
    }
}

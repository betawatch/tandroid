// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class br implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ br(Object obj, Object obj2, byte b) {
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
                ViewTreeObserver viewTreeObserver = ((cr) obj2).X.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener((uq) obj);
                    break;
                }
                break;
            default:
                bu5 bu5Var = (bu5) obj2;
                bu5Var.m = null;
                bu5Var.v((ViewGroup) obj);
                View view2 = bu5Var.s0;
                if (view2 != null) {
                    view2.setPressed(false);
                    bu5Var.s0 = null;
                }
                if (bu5Var.r0 != null && (view = bu5Var.f) != null) {
                    view.setOnTouchListener(null);
                }
                bu5Var.r0 = null;
                bu5Var.O();
                Runnable runnable = bu5Var.p;
                if (runnable != null) {
                    runnable.run();
                    bu5Var.p = null;
                    break;
                }
                break;
        }
    }
}

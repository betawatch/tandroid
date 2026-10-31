package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ androidx.mediarouter.app.i a;
    public final /* synthetic */ m0 b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.b = m0Var;
        this.a = iVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

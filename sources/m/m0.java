package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ androidx.mediarouter.app.k a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, androidx.mediarouter.app.k kVar) {
        this.b = n0Var;
        this.a = kVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.S.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

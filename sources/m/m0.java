package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class m0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ androidx.mediarouter.app.i a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, androidx.mediarouter.app.i iVar) {
        this.b = n0Var;
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

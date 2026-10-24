package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

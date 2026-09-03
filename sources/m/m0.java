package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        ViewTreeObserver viewTreeObserver = this.b.T.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

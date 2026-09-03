package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ androidx.mediarouter.app.k a;
    public final /* synthetic */ m0 b;

    public l0(m0 m0Var, androidx.mediarouter.app.k kVar) {
        this.b = m0Var;
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

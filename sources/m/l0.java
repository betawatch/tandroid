package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class l0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ androidx.mediarouter.app.j a;
    public final /* synthetic */ m0 b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.b = m0Var;
        this.a = jVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

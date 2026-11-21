package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        ViewTreeObserver viewTreeObserver = this.b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

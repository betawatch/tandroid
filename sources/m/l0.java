package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

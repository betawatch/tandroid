package l;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {
    public final /* synthetic */ w a;

    public u(w wVar) {
        this.a = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}

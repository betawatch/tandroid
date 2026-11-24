// default package

import android.widget.PopupWindow;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j27 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ l27 a;

    public j27(l27 l27Var) {
        this.a = l27Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}

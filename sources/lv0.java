// default package

import android.webkit.WebView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class lv0 implements WebView.FindListener {
    public final /* synthetic */ nv0 a;

    public lv0(nv0 nv0Var) {
        this.a = nv0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i, int i2, boolean z) {
        nv0 nv0Var = this.a;
        nv0Var.H = i;
        nv0Var.I = i2;
        Runnable runnable = nv0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}

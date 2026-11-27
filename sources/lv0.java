// default package

import android.webkit.WebView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

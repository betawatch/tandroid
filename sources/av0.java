// default package

import android.webkit.WebView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class av0 implements WebView.FindListener {
    public final /* synthetic */ cv0 a;

    public av0(cv0 cv0Var) {
        this.a = cv0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i, int i2, boolean z) {
        cv0 cv0Var = this.a;
        cv0Var.H = i;
        cv0Var.I = i2;
        Runnable runnable = cv0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}

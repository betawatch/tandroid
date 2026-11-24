// default package

import android.webkit.WebView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kw0 implements WebView.FindListener {
    public final /* synthetic */ mw0 a;

    public kw0(mw0 mw0Var) {
        this.a = mw0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i, int i2, boolean z) {
        mw0 mw0Var = this.a;
        mw0Var.H = i;
        mw0Var.I = i2;
        Runnable runnable = mw0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}

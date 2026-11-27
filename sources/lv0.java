// default package

import android.webkit.WebView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

package ki;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ x1(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                this.b.w();
                break;
        }
    }
}

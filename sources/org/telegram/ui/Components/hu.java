package org.telegram.ui.Components;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hu extends WebViewClient {
    public final /* synthetic */ mu a;

    public hu(mu muVar) {
        this.a = muVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        mu muVar = this.a;
        ImageView imageView = muVar.x;
        if (muVar.y) {
            return;
        }
        muVar.n.setVisibility(4);
        muVar.h.setVisibility(4);
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.c6 c6Var;
        mu muVar = this.a;
        try {
            if (!AndroidUtilities.isSafeToShow(muVar.getContext())) {
                return true;
            }
            Context context = muVar.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) muVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new rp(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.a.y) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        ye.d.s(webView.getContext(), str);
        return true;
    }
}

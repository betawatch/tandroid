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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bu extends WebViewClient {
    public final /* synthetic */ gu a;

    public bu(gu guVar) {
        this.a = guVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        gu guVar = this.a;
        ImageView imageView = guVar.x;
        if (guVar.y) {
            return;
        }
        guVar.n.setVisibility(4);
        guVar.h.setVisibility(4);
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.b6 b6Var;
        gu guVar = this.a;
        try {
            if (!AndroidUtilities.isSafeToShow(guVar.getContext())) {
                return true;
            }
            Context context = guVar.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) guVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new np(this, 10));
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
        ve.e.s(webView.getContext(), str);
        return true;
    }
}

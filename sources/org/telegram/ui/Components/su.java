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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class su extends WebViewClient {
    public final /* synthetic */ xu a;

    public su(xu xuVar) {
        this.a = xuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xu xuVar = this.a;
        ImageView imageView = xuVar.x;
        if (xuVar.y) {
            return;
        }
        xuVar.n.setVisibility(4);
        xuVar.h.setVisibility(4);
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.d6 d6Var;
        xu xuVar = this.a;
        try {
            if (!AndroidUtilities.isSafeToShow(xuVar.getContext())) {
                return true;
            }
            Context context = xuVar.getContext();
            d6Var = ((org.telegram.ui.ActionBar.e3) xuVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new zp(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.a.y) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        nf.f.s(webView.getContext(), str);
        return true;
    }
}

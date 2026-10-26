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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yu extends WebViewClient {
    public final /* synthetic */ dv a;

    public yu(dv dvVar) {
        this.a = dvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        dv dvVar = this.a;
        ImageView imageView = dvVar.x;
        if (dvVar.y) {
            return;
        }
        dvVar.n.setVisibility(4);
        dvVar.h.setVisibility(4);
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.u6 u6Var;
        dv dvVar = this.a;
        try {
            if (!AndroidUtilities.isSafeToShow(dvVar.getContext())) {
                return true;
            }
            Context context = dvVar.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) dvVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new bq(this, 11));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.p();
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
        qf.d.r(webView.getContext(), str);
        return true;
    }
}

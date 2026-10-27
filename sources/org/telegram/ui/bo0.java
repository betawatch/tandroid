package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bo0 extends WebViewClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ro0 b;

    public bo0(ro0 ro0Var, Context context) {
        this.b = ro0Var;
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ro0 ro0Var = this.b;
        ro0Var.z0 = false;
        ro0Var.I0(true, false);
        ro0Var.L0();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ro0 ro0Var = this.b;
        try {
            if (!AndroidUtilities.isSafeToShow(ro0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ro0Var.getParentActivity(), 0, ro0Var.Y0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nj0(this, 9));
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
        Uri parse;
        boolean equals;
        ro0 ro0Var;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            ro0Var = this.b;
        } catch (Exception unused) {
        }
        if (equals) {
            ro0Var.u0();
            return true;
        }
        if (!ro0.h1.contains(parse.getScheme())) {
            if (!ro0.g1.contains(parse.getScheme())) {
                try {
                    if (ro0Var.getParentActivity() != null) {
                        ro0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
                    alertDialog$Builder.a.R = ro0Var.p0;
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.p();
                }
            }
            return false;
        }
        return true;
    }
}

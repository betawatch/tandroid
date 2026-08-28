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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nn0 extends WebViewClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ co0 b;

    public nn0(co0 co0Var, Context context) {
        this.b = co0Var;
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        co0 co0Var = this.b;
        co0Var.v0 = false;
        co0Var.G0(true, false);
        co0Var.K0();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        co0 co0Var = this.b;
        try {
            if (!AndroidUtilities.isSafeToShow(co0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity(), 0, co0Var.U0);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new zk0(this, 7));
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
        Uri parse;
        boolean equals;
        co0 co0Var;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            co0Var = this.b;
        } catch (Exception unused) {
        }
        if (equals) {
            co0Var.s0();
            return true;
        }
        if (!co0.d1.contains(parse.getScheme())) {
            if (!co0.c1.contains(parse.getScheme())) {
                try {
                    if (co0Var.getParentActivity() != null) {
                        co0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
                    alertDialog$Builder.a.N = co0Var.l0;
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}

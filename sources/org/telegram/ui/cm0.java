package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cm0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ qm0 c;

    public /* synthetic */ cm0(qm0 qm0Var, Context context, int i10) {
        this.a = i10;
        this.c = qm0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                qm0 qm0Var = this.c;
                qm0Var.z0 = false;
                qm0Var.N0(true, false);
                qm0Var.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                qm0 qm0Var2 = this.c;
                qm0Var2.z0 = false;
                qm0Var2.N0(true, false);
                qm0Var2.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = this.a;
        qm0 qm0Var = this.c;
        switch (i10) {
            case 0:
                try {
                    if (!org.telegram.messenger.i0.M1(qm0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qm0Var.getParentActivity(), qm0Var.Y0);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = org.telegram.messenger.dd.L0(2131752104, null);
                        x1Var.T = org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131752105, null), new kg0(this, 10));
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.i0.M1(qm0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, qm0Var.getParentActivity(), qm0Var.Y0);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = org.telegram.messenger.dd.L0(2131752104, null);
                        x1Var2.T = org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131752105, null), new kg0(this, 12));
                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                        alertDialog$Builder2.p();
                        break;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return false;
                }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r8 = super.shouldOverrideUrlLoading(r13, r14);
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        int i10 = this.a;
        Context context = this.b;
        boolean z10 = true;
        qm0 qm0Var = this.c;
        switch (i10) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        qm0Var.z0();
                    } else if (!qm0.h1.contains(parse2.getScheme())) {
                        if (qm0.g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (qm0Var.getParentActivity() != null) {
                                qm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), org.telegram.messenger.at.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = qm0Var.p0;
                            x1Var.T = org.telegram.messenger.dd.L0(2131747445, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                qm0Var.D = !str.equals(qm0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    qm0Var.z0();
                } else if (!qm0.h1.contains(parse.getScheme())) {
                    if (!qm0.g1.contains(parse.getScheme())) {
                        try {
                            if (qm0Var.getParentActivity() != null) {
                                qm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), org.telegram.messenger.at.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                            x1Var2.R = qm0Var.p0;
                            x1Var2.T = org.telegram.messenger.dd.L0(2131747445, null);
                            alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z10;
        }
    }
}

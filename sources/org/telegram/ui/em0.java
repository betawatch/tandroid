package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class em0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ sm0 c;

    public /* synthetic */ em0(sm0 sm0Var, Context context, int i10) {
        this.a = i10;
        this.c = sm0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                sm0 sm0Var = this.c;
                sm0Var.z0 = false;
                sm0Var.M0(true, false);
                sm0Var.P0();
                break;
            default:
                super.onPageFinished(webView, str);
                sm0 sm0Var2 = this.c;
                sm0Var2.z0 = false;
                sm0Var2.M0(true, false);
                sm0Var2.P0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = this.a;
        sm0 sm0Var = this.c;
        switch (i10) {
            case 0:
                try {
                    if (!org.telegram.messenger.i0.M1(sm0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sm0Var.getParentActivity(), sm0Var.Y0);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = org.telegram.messenger.cd.L0(2131752104, null);
                        x1Var.T = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752105, null), new mg0(this, 10));
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.i0.M1(sm0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, sm0Var.getParentActivity(), sm0Var.Y0);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = org.telegram.messenger.cd.L0(2131752104, null);
                        x1Var2.T = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752105, null), new mg0(this, 12));
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
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
        sm0 sm0Var = this.c;
        switch (i10) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        sm0Var.y0();
                    } else if (!sm0.h1.contains(parse2.getScheme())) {
                        if (sm0.g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (sm0Var.getParentActivity() != null) {
                                sm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), org.telegram.messenger.zs.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = sm0Var.p0;
                            x1Var.T = org.telegram.messenger.cd.L0(2131747445, null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                sm0Var.D = !str.equals(sm0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    sm0Var.y0();
                } else if (!sm0.h1.contains(parse.getScheme())) {
                    if (!sm0.g1.contains(parse.getScheme())) {
                        try {
                            if (sm0Var.getParentActivity() != null) {
                                sm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), org.telegram.messenger.zs.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                            x1Var2.R = sm0Var.p0;
                            x1Var2.T = org.telegram.messenger.cd.L0(2131747445, null);
                            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z10;
        }
    }
}

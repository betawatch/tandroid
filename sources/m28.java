// default package

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m28 extends WebViewClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ p c;

    public /* synthetic */ m28(p pVar, Context context, byte b) {
        this.a = b;
        this.c = pVar;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                super.onPageFinished(webView, str);
                pVar.A0 = false;
                pVar.N0(true, false);
                pVar.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                pVar.A0 = false;
                pVar.N0(true, false);
                pVar.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                try {
                    if (hl.K1(pVar.getParentActivity())) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pVar.Z0, pVar.getParentActivity());
                        id idVar = alertDialog$Builder.a;
                        idVar.S = ob6.M0(2131752069, null);
                        idVar.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new fe7(this, (byte) 26), null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        alertDialog$Builder.o();
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return false;
                }
                break;
            default:
                try {
                    if (hl.K1(pVar.getParentActivity())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, pVar.Z0, pVar.getParentActivity());
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.S = ob6.M0(2131752069, null);
                        idVar2.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new fe7(this, (byte) 28), null);
                        alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                        alertDialog$Builder2.o();
                        break;
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return false;
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        r8 = super.shouldOverrideUrlLoading(r13, r14);
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        byte b = this.a;
        Context context = this.b;
        boolean z = true;
        p pVar = this.c;
        switch (b) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        pVar.h0();
                    } else if (!p.i1.contains(parse2.getScheme())) {
                        if (p.h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (pVar.getParentActivity() != null) {
                                pVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), jn7.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = pVar.q0;
                            idVar.U = ob6.M0(2131747156, null);
                            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                            alertDialog$Builder.o();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                pVar.E = !str.equals(pVar.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    pVar.h0();
                } else if (!p.i1.contains(parse.getScheme())) {
                    if (!p.h1.contains(parse.getScheme())) {
                        try {
                            if (pVar.getParentActivity() != null) {
                                pVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), jn7.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            id idVar2 = alertDialog$Builder2.a;
                            idVar2.S = pVar.q0;
                            idVar2.U = ob6.M0(2131747156, null);
                            alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                            alertDialog$Builder2.o();
                        }
                    }
                    z = super.shouldOverrideUrlLoading(webView, str);
                }
                return z;
        }
    }
}

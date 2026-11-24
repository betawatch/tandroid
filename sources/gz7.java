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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gz7 extends WebViewClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ p c;

    public /* synthetic */ gz7(p pVar, Context context, byte b) {
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
                pVar.M0(true, false);
                pVar.P0();
                break;
            default:
                super.onPageFinished(webView, str);
                pVar.A0 = false;
                pVar.M0(true, false);
                pVar.P0();
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
                    if (gl.K1(pVar.getParentActivity())) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pVar.Z0, pVar.getParentActivity());
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = k96.M0(2131752092, null);
                        hdVar.U = gl.N2(k96.M0(2131752093, null), -1, 0, new oq7(this, (byte) 11), null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        alertDialog$Builder.o();
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return false;
                }
                break;
            default:
                try {
                    if (gl.K1(pVar.getParentActivity())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, pVar.Z0, pVar.getParentActivity());
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.S = k96.M0(2131752092, null);
                        hdVar2.U = gl.N2(k96.M0(2131752093, null), -1, 0, new oq7(this, (byte) 13), null);
                        alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                        alertDialog$Builder2.o();
                        break;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
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
                                pVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = pVar.q0;
                            hdVar.U = k96.M0(2131747236, null);
                            alertDialog$Builder.j(k96.M0(2131747638, null), null);
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
                                pVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            hd hdVar2 = alertDialog$Builder2.a;
                            hdVar2.S = pVar.q0;
                            hdVar2.U = k96.M0(2131747236, null);
                            alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                            alertDialog$Builder2.o();
                        }
                    }
                    z = super.shouldOverrideUrlLoading(webView, str);
                }
                return z;
        }
    }
}

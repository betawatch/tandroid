// default package

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class mxc extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ rxc d;

    public mxc(rxc rxcVar, InputStream inputStream) {
        this.d = rxcVar;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a;
        String str2;
        if (this.a) {
            this.a = false;
            String v2 = hl.v2(null, R.raw.instant);
            boolean z = f11.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(qd4.y("<script>\n", v2.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        rxc rxcVar = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            lyc lycVar = rxcVar.b;
            ni6 ni6Var = lycVar != null ? (ni6) ((HashMap) lycVar.d).get(str) : null;
            if (ni6Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            oi6 oi6Var = (oi6) ni6Var.a.get("content-type");
            String str3 = oi6Var == null ? null : oi6Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a = ni6Var.a();
                str2 = str3;
            } catch (IOException e) {
                cc4.g(e, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                lyc lycVar2 = rxcVar.b;
                ni6 ni6Var2 = lycVar2 != null ? (ni6) ((ArrayList) lycVar2.c).get(0) : null;
                if (ni6Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a = ni6Var2.a();
                } catch (IOException e2) {
                    cc4.g(e2, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a = this.c;
            }
        }
        return new WebResourceResponse(str2, null, a);
    }
}

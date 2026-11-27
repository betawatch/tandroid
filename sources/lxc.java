// default package

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.web.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class lxc implements ValueCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lxc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                rxc rxcVar = (rxc) this.b;
                nv0 nv0Var = (nv0) this.c;
                File file = (File) this.d;
                nv0Var.saveWebArchive(file.getAbsolutePath(), false, new lxc(rxcVar, nv0Var, file, (a) this.e, (byte) 1));
                return;
            case 1:
                rxc rxcVar2 = (rxc) this.b;
                nv0 nv0Var2 = (nv0) this.c;
                File file2 = (File) this.d;
                a aVar = (a) this.e;
                nv0Var2.evaluateJavascript(hl.v2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new vu0());
                try {
                    lyc lycVar = new lyc(file2);
                    rxcVar2.b = lycVar;
                    if (!((ArrayList) lycVar.c).isEmpty()) {
                        aVar.a(((ni6) ((ArrayList) rxcVar2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                aVar.a(null);
                return;
            default:
                pyc pycVar = (pyc) this.b;
                jwc jwcVar = (jwc) this.c;
                WebView webView = (WebView) this.d;
                cv5 cv5Var = (cv5) this.e;
                String str = (String) obj;
                hl.r(jwcVar);
                synchronized (pycVar.a) {
                    if (pycVar.u || pycVar.o != webView || pycVar.p != cv5Var || pycVar.r) {
                        return;
                    }
                    if (!"true".equals(str)) {
                        cc4.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                        pycVar.q();
                        return;
                    } else {
                        if (!pycVar.j(webView)) {
                            pycVar.h();
                            return;
                        }
                        pycVar.s = false;
                        pycVar.r = true;
                        cc4.b("WEB proxy: Base64 bridge ready");
                        pycVar.n(16, 0, new byte[]{1});
                        return;
                    }
                }
        }
    }
}

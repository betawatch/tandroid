// default package

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lw0 implements DownloadListener {
    public final /* synthetic */ mw0 a;

    public lw0(mw0 mw0Var) {
        this.a = mw0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.substring(r2 + 1)) != false) goto L9;
     */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String guessFileName;
        StringBuilder m = mlb.m("onDownloadStart ", str, " ", str2, " ");
        kt6.v(m, str3, " ", str4, " ");
        m.append(j);
        String sb = m.toString();
        mw0 mw0Var = this.a;
        mw0Var.b(sb);
        try {
            if (str.startsWith("blob:")) {
                return;
            }
            try {
                List<String> pathSegments = Uri.parse(str).getPathSegments();
                guessFileName = pathSegments.get(pathSegments.size() - 1);
                int lastIndexOf = guessFileName.lastIndexOf(".");
                if (lastIndexOf > 0) {
                }
            } catch (Exception unused) {
            }
            guessFileName = URLUtil.guessFileName(str, str3, str4);
            String U = gm.U(guessFileName);
            da7 da7Var = new da7((Object) this, (Object) str, (Object) str4, (Object) str2, (Object) U, (byte) 9);
            if (er3.q(z8c.t0).c(8, j)) {
                da7Var.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mw0Var.getContext());
            he heVar = alertDialog$Builder.a;
            heVar.S = jb6.M0(2131742593, null);
            heVar.U = gm.S2(j > 0 ? jb6.a0(null, null, 2131742594, U, gm.i0(j, false, false)) : jb6.a0(null, null, 2131742595, U));
            alertDialog$Builder.j(jb6.M0(2131742592, null), new xg0(da7Var, (byte) 16));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-2);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

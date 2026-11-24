// default package

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class bv0 implements DownloadListener {
    public final /* synthetic */ cv0 a;

    public bv0(cv0 cv0Var) {
        this.a = cv0Var;
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
        StringBuilder l = yjb.l("onDownloadStart ", str, " ", str2, " ");
        ls6.u(l, str3, " ", str4, " ");
        l.append(j);
        String sb = l.toString();
        cv0 cv0Var = this.a;
        cv0Var.b(sb);
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
            String U = gl.U(guessFileName);
            b87 b87Var = new b87((Object) this, (Object) str, (Object) str4, (Object) str2, (Object) U, (byte) 9);
            if (up3.q(y6c.t0).c(8, j)) {
                b87Var.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cv0Var.getContext());
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = k96.M0(2131742667, null);
            hdVar.U = gl.T2(j > 0 ? k96.a0(null, null, 2131742668, U, gl.i0(j, false, false)) : k96.a0(null, null, 2131742669, U));
            alertDialog$Builder.j(k96.M0(2131742666, null), new sg0(b87Var, (byte) 13));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-2);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}

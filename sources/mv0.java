// default package

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class mv0 implements DownloadListener {
    public final /* synthetic */ nv0 a;

    public mv0(nv0 nv0Var) {
        this.a = nv0Var;
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
        StringBuilder l = xnb.l("onDownloadStart ", str, " ", str2, " ");
        qu6.u(l, str3, " ", str4, " ");
        l.append(j);
        String sb = l.toString();
        nv0 nv0Var = this.a;
        nv0Var.b(sb);
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
            String U = hl.U(guessFileName);
            la7 la7Var = new la7((Object) this, (Object) str, (Object) str4, (Object) str2, (Object) U, (byte) 9);
            if (lq3.q(yac.t0).c(8, j)) {
                la7Var.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nv0Var.getContext());
            id idVar = alertDialog$Builder.a;
            idVar.S = ob6.M0(2131742561, null);
            idVar.U = hl.S2(j > 0 ? ob6.a0(null, null, 2131742562, U, hl.i0(j, false, false)) : ob6.a0(null, null, 2131742563, U));
            alertDialog$Builder.j(ob6.M0(2131742560, null), new tg0(la7Var, (byte) 14));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-2);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

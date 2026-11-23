package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.ks;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = i7;
        this.c = context;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        Context context = this.c;
        switch (i7) {
            case 0:
                new gb(context, h6Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.g0.L2(hd.N0(2131754172, null), h6Var, new fs(t1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.v(t1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N0 = hd.N0(2131754171, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = U2;
                alertDialog$Builder.k(hd.N0(2131754173, null), null);
                t1VarArr[0] = alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.Wallet.n6.M0(context, h6Var);
                break;
        }
    }

    public /* synthetic */ a(ks ksVar, org.telegram.ui.ActionBar.h6 h6Var, Context context) {
        this.a = 1;
        this.b = h6Var;
        this.c = context;
    }
}

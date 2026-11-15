package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i7;
        this.c = context;
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        Context context = this.c;
        switch (i7) {
            case 0:
                new cb(context, e6Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.g0.L2(hd.M0(2131754175, null), e6Var, new wr(t1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(V2);
                while (matcher.find()) {
                    V2.setSpan(new org.telegram.messenger.v(t1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = hd.M0(2131754174, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = V2;
                alertDialog$Builder.k(hd.M0(2131754176, null), null);
                t1VarArr[0] = alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.Wallet.y5.I0(context, e6Var);
                break;
        }
    }

    public /* synthetic */ a(bs bsVar, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.a = 1;
        this.b = e6Var;
        this.c = context;
    }
}

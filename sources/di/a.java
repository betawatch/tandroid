package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.is;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i7;
        this.c = context;
        this.b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        Context context = this.c;
        switch (i7) {
            case 0:
                new gb(context, i6Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.g0.L2(gd.M0(2131754173, null), i6Var, new ds(u1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.v(u1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                String M0 = gd.M0(2131754172, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = U2;
                alertDialog$Builder.k(gd.M0(2131754174, null), null);
                u1VarArr[0] = alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.Wallet.n6.M0(context, i6Var);
                break;
        }
    }

    public /* synthetic */ a(is isVar, org.telegram.ui.ActionBar.i6 i6Var, Context context) {
        this.a = 1;
        this.b = i6Var;
        this.c = context;
    }
}

package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.g0.L2(gd.N0(2131754172, null), i6Var, new cs(t1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.v(t1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                String N0 = gd.N0(2131754171, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = U2;
                alertDialog$Builder.k(gd.N0(2131754173, null), null);
                t1VarArr[0] = alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.Wallet.o6.M0(context, i6Var);
                break;
        }
    }

    public /* synthetic */ a(hs hsVar, org.telegram.ui.ActionBar.i6 i6Var, Context context) {
        this.a = 1;
        this.b = i6Var;
        this.c = context;
    }
}

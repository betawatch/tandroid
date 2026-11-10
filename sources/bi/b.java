package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ur;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ b(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
                new uc(context, h6Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.g0.L2(org.telegram.messenger.id.M0(2131754175, null), h6Var, new pr(u1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(V2);
                while (matcher.find()) {
                    V2.setSpan(new org.telegram.messenger.v(u1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String M0 = org.telegram.messenger.id.M0(2131754174, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = V2;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754176, null), null);
                u1VarArr[0] = alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.Wallet.z5.I0(context, h6Var);
                break;
        }
    }

    public /* synthetic */ b(ur urVar, org.telegram.ui.ActionBar.h6 h6Var, Context context) {
        this.a = 1;
        this.b = h6Var;
        this.c = context;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;

    public /* synthetic */ cs(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = i10;
        this.b = context;
        this.c = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        Context context = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.i0.U2(org.telegram.messenger.i0.K2(org.telegram.messenger.dd.L0(2131754175, null), p6Var, new as(x1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.w(x1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                String L0 = org.telegram.messenger.dd.L0(2131754174, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = U2;
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754176, null), null);
                x1VarArr[0] = alertDialog$Builder.p();
                break;
            case 1:
                org.telegram.ui.Wallet.b6.I0(context, p6Var);
                break;
            default:
                new rh.y7(context, p6Var).show();
                break;
        }
    }

    public /* synthetic */ cs(gs gsVar, org.telegram.ui.ActionBar.p6 p6Var, Context context) {
        this.a = 0;
        this.c = p6Var;
        this.b = context;
    }
}

package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p81 b;

    public /* synthetic */ e81(p81 p81Var, int i10) {
        this.a = i10;
        this.b = p81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p81 p81Var = this.b;
                af.g.s(p81Var.getParentActivity(), p81Var.getMessagesController().premiumManageSubscriptionUrl);
                p81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                p81 p81Var2 = this.b;
                p81Var2.getClass();
                p81Var2.presentFragment(new i(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                p81 p81Var3 = this.b;
                p81Var3.getClass();
                p81Var3.presentFragment(new qg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                p81.V(this.b);
                break;
            default:
                p81.Y(this.b);
                break;
        }
    }
}

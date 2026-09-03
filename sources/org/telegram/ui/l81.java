package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ l81(w81 w81Var, int i10) {
        this.a = i10;
        this.b = w81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w81 w81Var = this.b;
                ze.d.s(w81Var.getParentActivity(), w81Var.getMessagesController().premiumManageSubscriptionUrl);
                w81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                w81 w81Var2 = this.b;
                w81Var2.getClass();
                w81Var2.presentFragment(new i(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                w81 w81Var3 = this.b;
                w81Var3.getClass();
                w81Var3.presentFragment(new wg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                w81.V(this.b);
                break;
            default:
                w81.Y(this.b);
                break;
        }
    }
}

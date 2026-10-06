package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y81 b;

    public /* synthetic */ m81(y81 y81Var, int i10) {
        this.a = i10;
        this.b = y81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y81 y81Var = this.b;
                nf.f.s(y81Var.getParentActivity(), y81Var.getMessagesController().premiumManageSubscriptionUrl);
                y81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                y81 y81Var2 = this.b;
                y81Var2.getClass();
                y81Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                y81 y81Var3 = this.b;
                y81Var3.getClass();
                y81Var3.presentFragment(new zg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                y81.X(this.b);
                break;
            default:
                y81.W(this.b);
                break;
        }
    }
}

package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z71 b;

    public /* synthetic */ n71(z71 z71Var, int i10) {
        this.a = i10;
        this.b = z71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z71 z71Var = this.b;
                pf.d.r(z71Var.getParentActivity(), z71Var.getMessagesController().premiumManageSubscriptionUrl);
                z71Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                z71 z71Var2 = this.b;
                z71Var2.getClass();
                z71Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                z71 z71Var3 = this.b;
                z71Var3.getClass();
                z71Var3.presentFragment(new xf1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                z71.V(this.b);
                break;
            default:
                z71.Z(this.b);
                break;
        }
    }
}

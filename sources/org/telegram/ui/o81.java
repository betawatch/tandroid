package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ o81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z81 z81Var = this.b;
                nf.f.s(z81Var.getParentActivity(), z81Var.getMessagesController().premiumManageSubscriptionUrl);
                z81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                z81 z81Var2 = this.b;
                z81Var2.getClass();
                z81Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                z81 z81Var3 = this.b;
                z81Var3.getClass();
                z81Var3.presentFragment(new zg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                z81.V(this.b);
                break;
            default:
                z81.Z(this.b);
                break;
        }
    }
}

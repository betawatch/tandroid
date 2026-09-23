package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x81 b;

    public /* synthetic */ l81(x81 x81Var, int i10) {
        this.a = i10;
        this.b = x81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x81 x81Var = this.b;
                nf.f.s(x81Var.getParentActivity(), x81Var.getMessagesController().premiumManageSubscriptionUrl);
                x81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                x81 x81Var2 = this.b;
                x81Var2.getClass();
                x81Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                x81 x81Var3 = this.b;
                x81Var3.getClass();
                x81Var3.presentFragment(new zg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                x81.V(this.b);
                break;
            default:
                x81.Z(this.b);
                break;
        }
    }
}

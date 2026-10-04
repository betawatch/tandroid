package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a91 b;

    public /* synthetic */ p81(a91 a91Var, int i10) {
        this.a = i10;
        this.b = a91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a91 a91Var = this.b;
                nf.f.s(a91Var.getParentActivity(), a91Var.getMessagesController().premiumManageSubscriptionUrl);
                a91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                a91 a91Var2 = this.b;
                a91Var2.getClass();
                a91Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                a91 a91Var3 = this.b;
                a91Var3.getClass();
                a91Var3.presentFragment(new bh1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                a91.Y(this.b);
                break;
            default:
                a91.b0(this.b);
                break;
        }
    }
}

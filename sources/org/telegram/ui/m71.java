package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ m71(x71 x71Var, int i10) {
        this.a = i10;
        this.b = x71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.b;
                we.e.s(x71Var.getParentActivity(), x71Var.getMessagesController().premiumManageSubscriptionUrl);
                x71Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                x71 x71Var2 = this.b;
                x71Var2.getClass();
                x71Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                x71 x71Var3 = this.b;
                x71Var3.getClass();
                x71Var3.presentFragment(new zf1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                x71.V(this.b);
                break;
            default:
                x71.Y(this.b);
                break;
        }
    }
}

package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c81 b;

    public /* synthetic */ p71(c81 c81Var, int i10) {
        this.a = i10;
        this.b = c81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c81 c81Var = this.b;
                pf.d.r(c81Var.getParentActivity(), c81Var.getMessagesController().premiumManageSubscriptionUrl);
                c81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                c81 c81Var2 = this.b;
                c81Var2.getClass();
                c81Var2.presentFragment(new g(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                c81 c81Var3 = this.b;
                c81Var3.getClass();
                c81Var3.presentFragment(new bg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                c81.V(this.b);
                break;
            default:
                c81.Z(this.b);
                break;
        }
    }
}

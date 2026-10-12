package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ d91(o91 o91Var, int i10) {
        this.a = i10;
        this.b = o91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o91 o91Var = this.b;
                pf.d.s(o91Var.getParentActivity(), o91Var.getMessagesController().premiumManageSubscriptionUrl);
                o91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                o91 o91Var2 = this.b;
                o91Var2.getClass();
                o91Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                o91 o91Var3 = this.b;
                o91Var3.getClass();
                o91Var3.presentFragment(new oh1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                o91.V(this.b);
                break;
            default:
                o91.Z(this.b);
                break;
        }
    }
}

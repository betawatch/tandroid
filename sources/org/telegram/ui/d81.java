package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o81 b;

    public /* synthetic */ d81(o81 o81Var, int i10) {
        this.a = i10;
        this.b = o81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o81 o81Var = this.b;
                af.g.s(o81Var.getParentActivity(), o81Var.getMessagesController().premiumManageSubscriptionUrl);
                o81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                o81 o81Var2 = this.b;
                o81Var2.getClass();
                o81Var2.presentFragment(new i(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                o81 o81Var3 = this.b;
                o81Var3.getClass();
                o81Var3.presentFragment(new og1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                o81.V(this.b);
                break;
            default:
                o81.Y(this.b);
                break;
        }
    }
}

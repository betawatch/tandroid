package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d81 b;

    public /* synthetic */ q71(d81 d81Var, int i10) {
        this.a = i10;
        this.b = d81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d81 d81Var = this.b;
                qf.d.r(d81Var.getParentActivity(), d81Var.getMessagesController().premiumManageSubscriptionUrl);
                d81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                d81 d81Var2 = this.b;
                d81Var2.getClass();
                d81Var2.presentFragment(new g(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                d81 d81Var3 = this.b;
                d81Var3.getClass();
                d81Var3.presentFragment(new dg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                d81.W(this.b);
                break;
            default:
                d81.Z(this.b);
                break;
        }
    }
}

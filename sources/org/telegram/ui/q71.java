package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b81 b;

    public /* synthetic */ q71(b81 b81Var, int i10) {
        this.a = i10;
        this.b = b81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b81 b81Var = this.b;
                ye.d.s(b81Var.getParentActivity(), b81Var.getMessagesController().premiumManageSubscriptionUrl);
                b81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                b81 b81Var2 = this.b;
                b81Var2.getClass();
                b81Var2.presentFragment(new i(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                b81 b81Var3 = this.b;
                b81Var3.getClass();
                b81Var3.presentFragment(new cg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                b81.V(this.b);
                break;
            default:
                b81.Y(this.b);
                break;
        }
    }
}

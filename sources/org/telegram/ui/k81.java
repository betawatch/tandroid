package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v81 b;

    public /* synthetic */ k81(v81 v81Var, int i10) {
        this.a = i10;
        this.b = v81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v81 v81Var = this.b;
                af.g.s(v81Var.getParentActivity(), v81Var.getMessagesController().premiumManageSubscriptionUrl);
                v81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                v81 v81Var2 = this.b;
                v81Var2.getClass();
                v81Var2.presentFragment(new i(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                v81 v81Var3 = this.b;
                v81Var3.getClass();
                v81Var3.presentFragment(new vg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                v81.V(this.b);
                break;
            default:
                v81.Y(this.b);
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ uq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    yu0Var.O0(n2Var, yu0Var.j1, this.c);
                    break;
                }
            default:
                nr0 nr0Var = (nr0) this.d;
                if (nr0Var.e.h() && nr0Var.h.getCurrentPosition() != 0) {
                    nr0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.q1 q1Var = new xh.q1(nr0Var.getContext(), i10, nr0Var.c, null, null);
                        q1Var.V(BirthdayController.getInstance(i10).isToday(nr0Var.c));
                        q1Var.show();
                        break;
                    }
                }
        }
    }
}

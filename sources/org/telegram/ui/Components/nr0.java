package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ nr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qv0 qv0Var = (qv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    qv0Var.O0(n2Var, qv0Var.j1, this.c);
                    break;
                }
            default:
                gs0 gs0Var = (gs0) this.d;
                if (gs0Var.e.h() && gs0Var.h.getCurrentPosition() != 0) {
                    gs0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.q1 q1Var = new xh.q1(gs0Var.getContext(), i10, gs0Var.c, null, null);
                        q1Var.T(BirthdayController.getInstance(i10).isToday(gs0Var.c));
                        q1Var.show();
                        break;
                    }
                }
        }
    }
}

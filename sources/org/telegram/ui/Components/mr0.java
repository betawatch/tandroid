package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ mr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pv0 pv0Var = (pv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = pv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    pv0Var.O0(n2Var, pv0Var.j1, this.c);
                    break;
                }
            default:
                fs0 fs0Var = (fs0) this.d;
                if (fs0Var.e.h() && fs0Var.h.getCurrentPosition() != 0) {
                    fs0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.q1 q1Var = new xh.q1(fs0Var.getContext(), i10, fs0Var.c, null, null);
                        q1Var.T(BirthdayController.getInstance(i10).isToday(fs0Var.c));
                        q1Var.show();
                        break;
                    }
                }
        }
    }
}

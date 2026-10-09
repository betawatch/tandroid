package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ zr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bw0 bw0Var = (bw0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.lc.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    bw0Var.O0(n2Var, bw0Var.j1, this.c);
                    break;
                }
            default:
                rs0 rs0Var = (rs0) this.d;
                if (rs0Var.e.h() && rs0Var.h.getCurrentPosition() != 0) {
                    rs0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.m1.f0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.r1 r1Var = new xh.r1(rs0Var.getContext(), i10, rs0Var.c, null, null);
                        r1Var.W(BirthdayController.getInstance(i10).isToday(rs0Var.c));
                        r1Var.show();
                        break;
                    }
                }
        }
    }
}

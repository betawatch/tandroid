package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ jr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lv0 lv0Var = (lv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    lv0Var.O0(n2Var, lv0Var.j1, this.c);
                    break;
                }
            default:
                bs0 bs0Var = (bs0) this.d;
                if (bs0Var.e.h() && bs0Var.h.getCurrentPosition() != 0) {
                    bs0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.r1 r1Var = new xh.r1(bs0Var.getContext(), i10, bs0Var.c, null, null);
                        r1Var.V(BirthdayController.getInstance(i10).isToday(bs0Var.c));
                        r1Var.show();
                        break;
                    }
                }
        }
    }
}

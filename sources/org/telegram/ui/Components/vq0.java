package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ vq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zu0 zu0Var = (zu0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
                if (!this.b) {
                    o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.oc.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    zu0Var.O0(o2Var, zu0Var.j1, this.c);
                    break;
                }
            default:
                or0 or0Var = (or0) this.d;
                if (or0Var.e.h() && or0Var.h.getCurrentPosition() != 0) {
                    or0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.q1 q1Var = new xh.q1(or0Var.getContext(), i10, or0Var.c, null, null);
                        q1Var.V(BirthdayController.getInstance(i10).isToday(or0Var.c));
                        q1Var.show();
                        break;
                    }
                }
        }
    }
}

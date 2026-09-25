package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ hr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jv0 jv0Var = (jv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
                if (!this.b) {
                    m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    jv0Var.O0(m2Var, jv0Var.j1, this.c);
                    break;
                }
            default:
                zr0 zr0Var = (zr0) this.d;
                if (zr0Var.e.h() && zr0Var.h.getCurrentPosition() != 0) {
                    zr0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        xh.r1 r1Var = new xh.r1(zr0Var.getContext(), i10, zr0Var.c, null, null);
                        r1Var.V(BirthdayController.getInstance(i10).isToday(zr0Var.c));
                        r1Var.show();
                        break;
                    }
                }
        }
    }
}

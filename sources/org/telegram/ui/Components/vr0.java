package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ vr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xv0 xv0Var = (xv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
                if (!this.b) {
                    m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    di.kc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    xv0Var.P0(m2Var, xv0Var.j1, this.c);
                    break;
                }
            default:
                ns0 ns0Var = (ns0) this.d;
                if (ns0Var.e.h() && ns0Var.h.getCurrentPosition() != 0) {
                    ns0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        yh.p1 p1Var = new yh.p1(ns0Var.getContext(), i10, ns0Var.c, null, null);
                        p1Var.W(BirthdayController.getInstance(i10).isToday(ns0Var.c));
                        p1Var.show();
                        break;
                    }
                }
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ qr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sv0 sv0Var = (sv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    sv0Var.Q0(n2Var, sv0Var.j1, this.c);
                    break;
                }
            default:
                is0 is0Var = (is0) this.d;
                if (is0Var.e.h() && is0Var.h.getCurrentPosition() != 0) {
                    is0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        yh.p1 p1Var = new yh.p1(is0Var.getContext(), i10, is0Var.c, null, null);
                        p1Var.W(BirthdayController.getInstance(i10).isToday(is0Var.c));
                        p1Var.show();
                        break;
                    }
                }
        }
    }
}

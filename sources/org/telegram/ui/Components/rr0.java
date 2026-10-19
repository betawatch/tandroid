package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ rr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tv0 tv0Var = (tv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    tv0Var.Q0(n2Var, tv0Var.j1, this.c);
                    break;
                }
            default:
                js0 js0Var = (js0) this.d;
                if (js0Var.e.h() && js0Var.h.getCurrentPosition() != 0) {
                    js0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        yh.o1 o1Var = new yh.o1(js0Var.getContext(), i10, js0Var.c, null, null);
                        o1Var.W(BirthdayController.getInstance(i10).isToday(js0Var.c));
                        o1Var.show();
                        break;
                    }
                }
        }
    }
}

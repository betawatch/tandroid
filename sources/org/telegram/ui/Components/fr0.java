package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ fr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                iv0 iv0Var = (iv0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
                if (!this.b) {
                    p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    bi.ce.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    iv0Var.O0(p2Var, iv0Var.j1, this.c);
                    break;
                }
            default:
                wr0 wr0Var = (wr0) this.d;
                if (wr0Var.e.h() && wr0Var.h.getCurrentPosition() != 0) {
                    wr0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        sg.p1.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        wh.p1 p1Var = new wh.p1(wr0Var.getContext(), i10, wr0Var.c, null, null);
                        p1Var.V(BirthdayController.getInstance(i10).isToday(wr0Var.c));
                        p1Var.show();
                        break;
                    }
                }
        }
    }
}

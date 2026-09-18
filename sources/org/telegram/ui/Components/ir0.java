package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ ir0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kv0 kv0Var = (kv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.v1;
                if (!this.b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    kv0Var.O0(n2Var, kv0Var.j1, this.c);
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

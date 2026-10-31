package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ aq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zt0 zt0Var = (zt0) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
                if (!this.b) {
                    k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                    vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    zt0Var.V0(k2Var, zt0Var.l1, this.c);
                    break;
                }
            default:
                vq0 vq0Var = (vq0) this.d;
                if (vq0Var.e.h() && vq0Var.h.getCurrentPosition() != 0) {
                    vq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        mg.i2.l1(2, org.telegram.messenger.y1.a(i10).b());
                        break;
                    } else {
                        ph.l1 l1Var = new ph.l1(vq0Var.getContext(), i10, vq0Var.c, null, null);
                        l1Var.e1(org.telegram.messenger.y1.a(i10).c(vq0Var.c));
                        l1Var.show();
                        break;
                    }
                }
        }
    }
}

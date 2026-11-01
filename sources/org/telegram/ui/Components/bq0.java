package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ bq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                au0 au0Var = (au0) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
                if (!this.b) {
                    k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                    vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    au0Var.W0(k2Var, au0Var.l1, this.c);
                    break;
                }
            default:
                wq0 wq0Var = (wq0) this.d;
                if (wq0Var.e.h() && wq0Var.h.getCurrentPosition() != 0) {
                    wq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        mg.i2.l1(2, org.telegram.messenger.y1.a(i10).b());
                        break;
                    } else {
                        ph.l1 l1Var = new ph.l1(wq0Var.getContext(), i10, wq0Var.c, null, null);
                        l1Var.e1(org.telegram.messenger.y1.a(i10).c(wq0Var.c));
                        l1Var.show();
                        break;
                    }
                }
        }
    }
}

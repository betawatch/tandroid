package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jh0 extends org.telegram.ui.Cells.q1 {
    public int hd;
    public int id;
    public int jd;
    public final /* synthetic */ kh0 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(kh0 kh0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, true, null, p6Var);
        this.kd = kh0Var;
        this.hd = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.id = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.jd = -1;
    }

    @Override // org.telegram.ui.Cells.q1
    public final nh.h S2() {
        return nh.h.d(1, this, this.kd.E);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.gb.x0 || i11 == 0 || this.hd == Integer.MAX_VALUE || i13 == 0 || this.id == Integer.MAX_VALUE) {
            return;
        }
        if (this.jd == (getMessageObject() == null ? 0 : getMessageObject().f1())) {
            if (!this.kd.v0) {
                setTranslationY(-(i11 - this.hd));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            }
            this.hd = getTop();
            this.id = getBottom();
            this.jd = getMessageObject() != null ? getMessageObject().f1() : 0;
        }
    }
}

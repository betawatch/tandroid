package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dg0 extends org.telegram.ui.Cells.q1 {
    public int ld;
    public int md;
    public int nd;
    public final /* synthetic */ eg0 od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, true, null, h6Var);
        this.od = eg0Var;
        this.ld = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.md = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.nd = -1;
    }

    @Override // org.telegram.ui.Cells.q1
    public final xh.e V2() {
        return xh.e.d(1, this, this.od.E);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.hb.x0 || i10 == 0 || this.ld == Integer.MAX_VALUE || i12 == 0 || this.md == Integer.MAX_VALUE) {
            return;
        }
        if (this.nd == (getMessageObject() == null ? 0 : getMessageObject().e1())) {
            if (!this.od.v0) {
                setTranslationY(-(i10 - this.ld));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.wq.h).start();
            }
            this.ld = getTop();
            this.md = getBottom();
            this.nd = getMessageObject() != null ? getMessageObject().e1() : 0;
        }
    }
}

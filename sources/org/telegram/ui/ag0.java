package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ag0 extends org.telegram.ui.Cells.q1 {
    public int kd;
    public int ld;
    public int md;
    public final /* synthetic */ bg0 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, true, null, f6Var);
        this.nd = bg0Var;
        this.kd = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.ld = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.md = -1;
    }

    @Override // org.telegram.ui.Cells.q1
    public final xh.e V2() {
        return xh.e.d(1, this, this.nd.E);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.hb.x0 || i10 == 0 || this.kd == Integer.MAX_VALUE || i12 == 0 || this.ld == Integer.MAX_VALUE) {
            return;
        }
        if (this.md == (getMessageObject() == null ? 0 : getMessageObject().f1())) {
            if (!this.nd.v0) {
                setTranslationY(-(i10 - this.kd));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            }
            this.kd = getTop();
            this.ld = getBottom();
            this.md = getMessageObject() != null ? getMessageObject().f1() : 0;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ag0 extends org.telegram.ui.Cells.q1 {
    public int Ad;
    public int Bd;
    public final /* synthetic */ bg0 Cd;
    public int zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, true, null, e6Var);
        this.Cd = bg0Var;
        this.zd = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ad = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Bd = -1;
    }

    @Override // org.telegram.ui.Cells.q1
    public final xh.e W2() {
        return xh.e.d(1, this, this.Cd.F);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.ib.x0 || i10 == 0 || this.zd == Integer.MAX_VALUE || i12 == 0 || this.Ad == Integer.MAX_VALUE) {
            return;
        }
        if (this.Bd == (getMessageObject() == null ? 0 : getMessageObject().e1())) {
            if (!this.Cd.A0) {
                setTranslationY(-(i10 - this.zd));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).start();
            }
            this.zd = getTop();
            this.Ad = getBottom();
            this.Bd = getMessageObject() != null ? getMessageObject().e1() : 0;
        }
    }
}

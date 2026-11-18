package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dg0 extends org.telegram.ui.Cells.q1 {
    public int Ad;
    public int Bd;
    public final /* synthetic */ eg0 Cd;
    public int zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, true, null, i6Var);
        this.Cd = eg0Var;
        this.zd = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ad = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Bd = -1;
    }

    @Override // org.telegram.ui.Cells.q1
    public final xh.e Y2() {
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
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.lr.h).start();
            }
            this.zd = getTop();
            this.Ad = getBottom();
            this.Bd = getMessageObject() != null ? getMessageObject().e1() : 0;
        }
    }
}

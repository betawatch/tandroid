package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mi0 extends org.telegram.ui.Cells.s1 {
    public int He;
    public int Ie;
    public int Je;
    public final /* synthetic */ ni0 Ke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, true, null, u6Var);
        this.Ke = ni0Var;
        this.He = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ie = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Je = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.Zc.w0 || i11 == 0 || this.He == Integer.MAX_VALUE || i13 == 0 || this.Ie == Integer.MAX_VALUE) {
            return;
        }
        if (this.Je == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Ke.v0) {
                setTranslationY(-(i11 - this.He));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).start();
            }
            this.He = getTop();
            this.Ie = getBottom();
            this.Je = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.s1
    public final xh.f y3() {
        return xh.f.d(1, this, this.Ke.E);
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bj0 extends org.telegram.ui.Cells.t1 {
    public int Fe;
    public int Ge;
    public int He;
    public final /* synthetic */ cj0 Ie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, true, null, f6Var);
        this.Ie = cj0Var;
        this.Fe = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ge = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.He = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.Zc.w0 || i11 == 0 || this.Fe == Integer.MAX_VALUE || i13 == 0 || this.Ge == Integer.MAX_VALUE) {
            return;
        }
        if (this.He == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Ie.w0) {
                setTranslationY(-(i11 - this.Fe));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.wr.h).start();
            }
            this.Fe = getTop();
            this.Ge = getBottom();
            this.He = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.t1
    public final uh.g w3() {
        return uh.g.d(1, this, this.Ie.F);
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fj0 extends org.telegram.ui.Cells.u1 {
    public int Ge;
    public int He;
    public int Ie;
    public final /* synthetic */ gj0 Je;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj0(gj0 gj0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, true, null, c6Var);
        this.Je = gj0Var;
        this.Ge = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.He = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ie = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.Zc.w0 || i11 == 0 || this.Ge == Integer.MAX_VALUE || i13 == 0 || this.He == Integer.MAX_VALUE) {
            return;
        }
        if (this.Ie == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Je.w0) {
                setTranslationY(-(i11 - this.Ge));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.es.h).start();
            }
            this.Ge = getTop();
            this.He = getBottom();
            this.Ie = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.u1
    public final wh.f w3() {
        return wh.f.d(1, this, this.Je.F);
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ki0 extends org.telegram.ui.Cells.t1 {
    public int Be;
    public int Ce;
    public int De;
    public final /* synthetic */ li0 Ee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(li0 li0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, true, null, b6Var);
        this.Ee = li0Var;
        this.Be = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ce = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.De = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (!this.Vc.w0 || i10 == 0 || this.Be == Integer.MAX_VALUE || i12 == 0 || this.Ce == Integer.MAX_VALUE) {
            return;
        }
        if (this.De == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Ee.s0) {
                setTranslationY(-(i10 - this.Be));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            }
            this.Be = getTop();
            this.Ce = getBottom();
            this.De = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.t1
    public final dh.k w3() {
        return dh.k.d(1, this, this.Ee.B);
    }
}

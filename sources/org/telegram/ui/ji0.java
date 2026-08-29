package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ji0 extends org.telegram.ui.Cells.s1 {
    public int Be;
    public int Ce;
    public int De;
    public final /* synthetic */ ki0 Ee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(ki0 ki0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, true, null, c6Var);
        this.Ee = ki0Var;
        this.Be = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ce = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.De = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.Vc.w0 || i11 == 0 || this.Be == Integer.MAX_VALUE || i13 == 0 || this.Ce == Integer.MAX_VALUE) {
            return;
        }
        if (this.De == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Ee.s0) {
                setTranslationY(-(i11 - this.Be));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).start();
            }
            this.Be = getTop();
            this.Ce = getBottom();
            this.De = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.s1
    public final gh.j w3() {
        return gh.j.d(1, this, this.Ee.B);
    }
}

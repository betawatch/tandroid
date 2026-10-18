package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class mi0 extends org.telegram.ui.Cells.u1 {
    public int Ge;
    public int He;
    public int Ie;
    public final /* synthetic */ ni0 Je;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, true, null, d6Var);
        this.Je = ni0Var;
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
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).start();
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

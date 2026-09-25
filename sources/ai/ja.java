package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class ja extends e6 {
    public final /* synthetic */ ka e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ka kaVar, Context context, jc jcVar, b6 b6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, jcVar, b6Var, d6Var);
        this.e4 = kaVar;
    }

    @Override // ai.e6
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.e4.g.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (i0.c) {
            i0.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.c) {
            i0.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}

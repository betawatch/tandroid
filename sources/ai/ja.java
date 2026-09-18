package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class ja extends f6 {
    public final /* synthetic */ ka e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ka kaVar, Context context, jc jcVar, c6 c6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, jcVar, c6Var, f6Var);
        this.e4 = kaVar;
    }

    @Override // ai.f6
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

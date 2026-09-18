package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wl0;
import s4.c1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class e extends l61 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, wl0 wl0Var, Activity activity, int i10, int i11, v vVar, e6 e6Var) {
        super(wl0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        i iVar = this.N;
        Activity parentActivity = iVar.getParentActivity();
        int i11 = j6.L6;
        e6Var = ((n2) iVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, e6Var);
        m4Var.setHeight(25);
        return new gl0(m4Var);
    }
}

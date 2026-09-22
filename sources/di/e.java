package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w51;
import s4.c1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class e extends w51 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ll0 ll0Var, Activity activity, int i10, int i11, v vVar, e6 e6Var) {
        super(ll0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.w51, s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        i iVar = this.N;
        Activity parentActivity = iVar.getParentActivity();
        int i11 = i6.L6;
        e6Var = ((n2) iVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, e6Var);
        m4Var.setHeight(25);
        return new vk0(m4Var);
    }
}

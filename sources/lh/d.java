package lh;

import android.app.Activity;
import android.view.ViewGroup;
import f2.q1;
import kh.b8;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d extends z41 {
    public final /* synthetic */ g J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, wk0 wk0Var, Activity activity, int i9, int i10, b8 b8Var, b6 b6Var) {
        super(wk0Var, activity, i9, i10, true, b8Var, b6Var);
        this.J = gVar;
    }

    @Override // org.telegram.ui.Components.z41, f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var;
        if (i9 != 42) {
            return super.x(viewGroup, i9);
        }
        g gVar = this.J;
        Activity parentActivity = gVar.getParentActivity();
        int i10 = f6.L6;
        b6Var = ((o2) gVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i10, 21, 0, false, b6Var);
        m4Var.setHeight(25);
        return new ik0(m4Var);
    }
}

package ci;

import ai.c0;
import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;
import s4.c1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e extends j61 {
    public final /* synthetic */ j N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, vl0 vl0Var, Activity activity, int i10, int i11, c0 c0Var, f6 f6Var) {
        super(vl0Var, activity, i10, i11, true, c0Var, f6Var);
        this.N = jVar;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        j jVar = this.N;
        Activity parentActivity = jVar.getParentActivity();
        int i11 = j6.L6;
        f6Var = ((p2) jVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, f6Var);
        m4Var.setHeight(25);
        return new fl0(m4Var);
    }
}

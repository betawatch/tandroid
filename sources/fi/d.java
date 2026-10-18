package fi;

import ai.q;
import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sl0;
import s4.b1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d extends s61 {
    public final /* synthetic */ g N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, im0 im0Var, Activity activity, int i10, int i11, q qVar, d6 d6Var) {
        super(im0Var, activity, i10, i11, true, qVar, d6Var);
        this.N = gVar;
    }

    @Override // org.telegram.ui.Components.s61, s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        g gVar = this.N;
        Activity parentActivity = gVar.getParentActivity();
        int i11 = h6.L6;
        d6Var = ((n2) gVar).resourceProvider;
        l4 l4Var = new l4(parentActivity, i11, 21, 0, false, d6Var);
        l4Var.setHeight(25);
        return new sl0(l4Var);
    }
}

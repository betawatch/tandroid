package fi;

import ai.q;
import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u61;
import s4.b1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class d extends u61 {
    public final /* synthetic */ g N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, jm0 jm0Var, Activity activity, int i10, int i11, q qVar, d6 d6Var) {
        super(jm0Var, activity, i10, i11, true, qVar, d6Var);
        this.N = gVar;
    }

    @Override // org.telegram.ui.Components.u61, s4.g0
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
        return new tl0(l4Var);
    }
}

package mh;

import ah.d1;
import ah.i1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.q30;
import org.telegram.ui.u50;
import s4.b1;
import s4.k;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class f extends k {
    public final /* synthetic */ h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override // s4.k
    public final float A(View view) {
        return 0.6f;
    }

    @Override // s4.e1
    public final void w(b1 b1Var) {
        i1 i1Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.S0;
        int b10 = b1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (i1Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = b1Var.a;
        if (!(view instanceof c) || (gVar = hVar.X0) == null) {
            return;
        }
        u50 u50Var = ((q30) gVar).a;
        Context context = u50Var.getContext();
        gl0 gl0Var = u50Var.K;
        i10 = ((h3) u50Var).currentAccount;
        d1 d1Var = new d1(context, null, gl0Var, (c) view, null, 0.0f, 0.0f, i1Var, i10, 1, false);
        d1.B = d1Var;
        d1Var.i.setTag(R.id.parent_tag, 1);
        u50Var.container.addView(d1Var.i);
        d1Var.s = true;
        d1Var.y = System.currentTimeMillis();
    }
}

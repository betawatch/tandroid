package oh;

import android.view.View;
import dh.g0;
import dh.j0;
import dh.n0;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.a20;
import org.telegram.ui.x30;
import u4.d1;
import u4.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends k {
    public final /* synthetic */ h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override // u4.k
    public final float A(View view) {
        return 0.6f;
    }

    @Override // u4.f1
    public final void w(d1 d1Var) {
        n0 n0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.T0;
        int b10 = d1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (n0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = d1Var.a;
        if (!(view instanceof c) || (gVar = hVar.Y0) == null) {
            return;
        }
        x30 x30Var = ((a20) gVar).a;
        j0 j0Var = new j0(x30Var.getContext(), null, x30Var.C1, (c) view, null, 0.0f, 0.0f, n0Var, x30Var.a, 1, false);
        j0.B = j0Var;
        g0 g0Var = j0Var.i;
        g0Var.setTag(R.id.parent_tag, 1);
        x30Var.c.addView(g0Var);
        j0Var.s = true;
        j0Var.y = System.currentTimeMillis();
    }
}

package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.g40;
import org.telegram.ui.i60;
import s4.c1;
import s4.j;
import zg.l0;
import zg.p0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f extends j {
    public final /* synthetic */ h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override // s4.j
    public final float A(View view) {
        return 0.6f;
    }

    @Override // s4.f1
    public final void w(c1 c1Var) {
        p0 p0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.U0;
        int b10 = c1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (p0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = c1Var.a;
        if (!(view instanceof c) || (gVar = hVar.Z0) == null) {
            return;
        }
        i60 i60Var = ((g40) gVar).a;
        Context context = i60Var.getContext();
        fk0 fk0Var = i60Var.K;
        i10 = ((f3) i60Var).currentAccount;
        l0 l0Var = new l0(context, null, fk0Var, (c) view, null, 0.0f, 0.0f, p0Var, i10, 1, false);
        l0.B = l0Var;
        l0Var.i.setTag(R.id.parent_tag, 1);
        i60Var.container.addView(l0Var.i);
        l0Var.s = true;
        l0Var.y = System.currentTimeMillis();
    }
}

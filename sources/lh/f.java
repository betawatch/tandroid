package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.b40;
import org.telegram.ui.d60;
import s4.c1;
import s4.j;
import zg.k0;
import zg.o0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        o0 o0Var;
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
        if (groupCallMessage == null || (o0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = c1Var.a;
        if (!(view instanceof c) || (gVar = hVar.Z0) == null) {
            return;
        }
        d60 d60Var = ((b40) gVar).a;
        Context context = d60Var.getContext();
        qk0 qk0Var = d60Var.K;
        i10 = ((e3) d60Var).currentAccount;
        k0 k0Var = new k0(context, null, qk0Var, (c) view, null, 0.0f, 0.0f, o0Var, i10, 1, false);
        k0.B = k0Var;
        k0Var.i.setTag(R.id.parent_tag, 1);
        d60Var.container.addView(k0Var.i);
        k0Var.s = true;
        k0Var.y = System.currentTimeMillis();
    }
}

package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.g40;
import org.telegram.ui.h60;
import s4.c1;
import s4.j;
import zg.i0;
import zg.m0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        m0 m0Var;
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
        if (groupCallMessage == null || (m0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = c1Var.a;
        if (!(view instanceof c) || (gVar = hVar.Z0) == null) {
            return;
        }
        h60 h60Var = ((g40) gVar).a;
        Context context = h60Var.getContext();
        sk0 sk0Var = h60Var.K;
        i10 = ((f3) h60Var).currentAccount;
        i0 i0Var = new i0(context, null, sk0Var, (c) view, null, 0.0f, 0.0f, m0Var, i10, 1, false);
        i0.B = i0Var;
        i0Var.i.setTag(R.id.parent_tag, 1);
        h60Var.container.addView(i0Var.i);
        i0Var.s = true;
        i0Var.y = System.currentTimeMillis();
    }
}

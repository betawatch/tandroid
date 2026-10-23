package mh;

import ah.d1;
import ah.i1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.n30;
import org.telegram.ui.q50;
import s4.b1;
import s4.k;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
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
        q50 q50Var = ((n30) gVar).a;
        Context context = q50Var.getContext();
        dl0 dl0Var = q50Var.K;
        i10 = ((f3) q50Var).currentAccount;
        d1 d1Var = new d1(context, null, dl0Var, (c) view, null, 0.0f, 0.0f, i1Var, i10, 1, false);
        d1.B = d1Var;
        d1Var.i.setTag(R.id.parent_tag, 1);
        q50Var.container.addView(d1Var.i);
        d1Var.s = true;
        d1Var.y = System.currentTimeMillis();
    }
}

package mh;

import ah.e1;
import ah.j1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.g40;
import org.telegram.ui.j60;
import s4.c1;
import s4.j;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        j1 j1Var;
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
        if (groupCallMessage == null || (j1Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = c1Var.a;
        if (!(view instanceof c) || (gVar = hVar.Z0) == null) {
            return;
        }
        j60 j60Var = ((g40) gVar).a;
        Context context = j60Var.getContext();
        fk0 fk0Var = j60Var.K;
        i10 = ((f3) j60Var).currentAccount;
        e1 e1Var = new e1(context, null, fk0Var, (c) view, null, 0.0f, 0.0f, j1Var, i10, 1, false);
        e1.B = e1Var;
        e1Var.i.setTag(R.id.parent_tag, 1);
        j60Var.container.addView(e1Var.i);
        e1Var.s = true;
        e1Var.y = System.currentTimeMillis();
    }
}

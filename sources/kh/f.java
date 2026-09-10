package kh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.h40;
import org.telegram.ui.j60;
import s4.c1;
import s4.j;
import yg.l0;
import yg.p0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        j60 j60Var = ((h40) gVar).a;
        Context context = j60Var.getContext();
        pk0 pk0Var = j60Var.K;
        i10 = ((h3) j60Var).currentAccount;
        l0 l0Var = new l0(context, null, pk0Var, (c) view, null, 0.0f, 0.0f, p0Var, i10, 1, false);
        l0.B = l0Var;
        l0Var.i.setTag(R.id.parent_tag, 1);
        j60Var.container.addView(l0Var.i);
        l0Var.s = true;
        l0Var.y = System.currentTimeMillis();
    }
}

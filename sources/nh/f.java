package nh;

import android.view.View;
import ch.i0;
import ch.l0;
import ch.p0;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.f40;
import org.telegram.ui.h20;
import v4.f1;
import v4.k;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f extends k {
    public final /* synthetic */ h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override // v4.k
    public final float A(View view) {
        return 0.6f;
    }

    @Override // v4.h1
    public final void w(f1 f1Var) {
        p0 p0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.T0;
        int b10 = f1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (p0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = f1Var.a;
        if (!(view instanceof c) || (gVar = hVar.Y0) == null) {
            return;
        }
        f40 f40Var = ((h20) gVar).a;
        l0 l0Var = new l0(f40Var.getContext(), null, f40Var.F1, (c) view, null, 0.0f, 0.0f, p0Var, f40Var.a, 1, false);
        l0.B = l0Var;
        i0 i0Var = l0Var.i;
        i0Var.setTag(R.id.parent_tag, 1);
        f40Var.c.addView(i0Var);
        l0Var.s = true;
        l0Var.y = System.currentTimeMillis();
    }
}

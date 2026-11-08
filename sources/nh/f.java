package nh;

import android.view.View;
import ch.h0;
import ch.k0;
import ch.o0;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.c40;
import org.telegram.ui.f20;
import v4.d1;
import v4.k;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

    @Override // v4.f1
    public final void w(d1 d1Var) {
        o0 o0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.S0;
        int b10 = d1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (o0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = d1Var.a;
        if (!(view instanceof c) || (gVar = hVar.X0) == null) {
            return;
        }
        c40 c40Var = ((f20) gVar).a;
        k0 k0Var = new k0(c40Var.getContext(), null, c40Var.B1, (c) view, null, 0.0f, 0.0f, o0Var, c40Var.a, 1, false);
        k0.B = k0Var;
        h0 h0Var = k0Var.i;
        h0Var.setTag(R.id.parent_tag, 1);
        c40Var.c.addView(h0Var);
        k0Var.s = true;
        k0Var.y = System.currentTimeMillis();
    }
}

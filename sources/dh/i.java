package dh;

import android.view.View;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.b50;
import org.telegram.ui.e30;
import s4.c1;
import sg.h0;
import sg.k0;
import sg.o0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends s4.j {
    public final /* synthetic */ k F;

    public i(k kVar) {
        this.F = kVar;
    }

    @Override // s4.j
    public final float A(View view) {
        return 0.6f;
    }

    @Override // s4.f1
    public final void w(c1 c1Var) {
        o0 o0Var;
        j jVar;
        k kVar = this.F;
        h hVar = kVar.S0;
        int b10 = c1Var.b();
        List list = hVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) hVar.c.get(b10);
        }
        if (groupCallMessage == null || (o0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = c1Var.a;
        if (!(view instanceof d) || (jVar = kVar.X0) == null) {
            return;
        }
        b50 b50Var = ((e30) jVar).a;
        k0 k0Var = new k0(b50Var.getContext(), null, b50Var.B1, (d) view, null, 0.0f, 0.0f, o0Var, b50Var.a, 1, false);
        k0.B = k0Var;
        h0 h0Var = k0Var.i;
        h0Var.setTag(R.id.parent_tag, 1);
        b50Var.c.addView(h0Var);
        k0Var.s = true;
        k0Var.y = System.currentTimeMillis();
    }
}

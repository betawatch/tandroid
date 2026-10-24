package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d20 implements qe.a {
    public final ViewGroup a;
    public final mh.c b;

    public d20(ci.h4 h4Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(h4Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        wh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = h4Var;
        h4Var.addView(cVar);
    }

    @Override // qe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class x10 implements oe.a {
    public final ViewGroup a;
    public final lh.c b;

    public x10(ai.w5 w5Var, GroupCallMessage groupCallMessage) {
        lh.c cVar = new lh.c(w5Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        vh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = w5Var;
        w5Var.addView(cVar);
    }

    @Override // oe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u10 implements oe.a {
    public final ViewGroup a;
    public final lh.c b;

    public u10(ai.x5 x5Var, GroupCallMessage groupCallMessage) {
        lh.c cVar = new lh.c(x5Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        vh.o oVar = cVar.v;
        oVar.setMaxLines(1);
        oVar.setSingleLine(true);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = x5Var;
        x5Var.addView(cVar);
    }

    @Override // oe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

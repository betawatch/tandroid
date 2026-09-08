package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u10 implements oe.a {
    public final ViewGroup a;
    public final mh.c b;

    public u10(bi.g5 g5Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(g5Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        wh.p pVar = cVar.v;
        pVar.setMaxLines(1);
        pVar.setSingleLine(true);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = g5Var;
        g5Var.addView(cVar);
    }

    @Override // oe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

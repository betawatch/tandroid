package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y00 implements we.a {
    public final ViewGroup a;
    public final nh.c b;

    public y00(bi.t2 t2Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(t2Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = t2Var;
        t2Var.addView(cVar);
    }

    @Override // we.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

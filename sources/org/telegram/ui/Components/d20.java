package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class d20 implements qe.a {
    public final ViewGroup a;
    public final mh.c b;

    public d20(ci.i4 i4Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(i4Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        wh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = i4Var;
        i4Var.addView(cVar);
    }

    @Override // qe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

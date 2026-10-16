package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h20 implements qe.a {
    public final ViewGroup a;
    public final mh.c b;

    public h20(bi.i5 i5Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(i5Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        wh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = i5Var;
        i5Var.addView(cVar);
    }

    @Override // qe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

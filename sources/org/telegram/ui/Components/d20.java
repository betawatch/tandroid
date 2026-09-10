package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d20 implements oe.a {
    public final ViewGroup a;
    public final kh.c b;

    public d20(bi.l4 l4Var, GroupCallMessage groupCallMessage) {
        kh.c cVar = new kh.c(l4Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        uh.o oVar = cVar.v;
        oVar.setMaxLines(1);
        oVar.setSingleLine(true);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = l4Var;
        l4Var.addView(cVar);
    }

    @Override // oe.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

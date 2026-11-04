package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h00 implements te.a {
    public final ViewGroup a;
    public final oh.c b;

    public h00(ai.d2 d2Var, GroupCallMessage groupCallMessage) {
        oh.c cVar = new oh.c(d2Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        yh.l lVar = cVar.w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = d2Var;
        d2Var.addView(cVar);
    }

    @Override // te.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

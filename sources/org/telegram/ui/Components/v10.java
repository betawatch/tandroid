package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class v10 implements oe.a {
    public final ViewGroup a;
    public final lh.c b;

    public v10(ai.w5 w5Var, GroupCallMessage groupCallMessage) {
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

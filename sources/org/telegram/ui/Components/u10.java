package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u10 implements ae.a {
    public final ViewGroup a;
    public final yg.c b;

    public u10(dh.d dVar, GroupCallMessage groupCallMessage) {
        yg.c cVar = new yg.c(dVar.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        ih.s sVar = cVar.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = dVar;
        dVar.addView(cVar);
    }

    @Override // ae.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

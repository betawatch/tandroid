package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v10 implements ae.a {
    public final ViewGroup a;
    public final zg.c b;

    public v10(eh.d dVar, GroupCallMessage groupCallMessage) {
        zg.c cVar = new zg.c(dVar.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        jh.s sVar = cVar.v;
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

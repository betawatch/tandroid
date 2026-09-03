package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v10 implements ae.a {
    public final ViewGroup a;
    public final yg.c b;

    public v10(dh.d dVar, GroupCallMessage groupCallMessage) {
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

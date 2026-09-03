package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

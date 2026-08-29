package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q10 implements yd.a {
    public final ViewGroup a;
    public final wg.c b;

    public q10(bh.d dVar, GroupCallMessage groupCallMessage) {
        wg.c cVar = new wg.c(dVar.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        gh.s sVar = cVar.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = dVar;
        dVar.addView(cVar);
    }

    @Override // yd.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

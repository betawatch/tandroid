package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l00 implements we.a {
    public final ViewGroup a;
    public final nh.c b;

    public l00(di.b4 b4Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(b4Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = b4Var;
        b4Var.addView(cVar);
    }

    @Override // we.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

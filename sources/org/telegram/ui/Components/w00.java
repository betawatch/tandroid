package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w00 implements we.a {
    public final ViewGroup a;
    public final nh.c b;

    public w00(bi.p2 p2Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(p2Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = p2Var;
        p2Var.addView(cVar);
    }

    @Override // we.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

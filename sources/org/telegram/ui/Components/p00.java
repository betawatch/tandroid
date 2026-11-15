package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p00 implements we.a {
    public final ViewGroup a;
    public final nh.c b;

    public p00(bi.v1 v1Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(v1Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = v1Var;
        v1Var.addView(cVar);
    }

    @Override // we.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

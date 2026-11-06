package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l00 implements we.a {
    public final ViewGroup a;
    public final nh.c b;

    public l00(di.a4 a4Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(a4Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = a4Var;
        a4Var.addView(cVar);
    }

    @Override // we.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

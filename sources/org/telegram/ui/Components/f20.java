package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f20 implements re.a {
    public final ViewGroup a;
    public final nh.c b;

    public f20(di.i4 i4Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(i4Var.getContext());
        this.b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.a = i4Var;
        i4Var.addView(cVar);
    }

    @Override // re.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

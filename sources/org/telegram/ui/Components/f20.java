package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

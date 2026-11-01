package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a10 implements ie.a {
    public final ViewGroup a;
    public final dh.d b;

    public a10(org.telegram.ui.Cells.a5 a5Var, GroupCallMessage groupCallMessage) {
        dh.d dVar = new dh.d(a5Var.getContext());
        this.b = dVar;
        dVar.setBackgroundColor(i0.b.o(-16777216, 34));
        nh.p pVar = dVar.w;
        pVar.setMaxLines(1);
        pVar.setSingleLine(true);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        dVar.set(groupCallMessage);
        dVar.setAlpha(0.0f);
        this.a = a5Var;
        a5Var.addView(dVar);
    }

    @Override // ie.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

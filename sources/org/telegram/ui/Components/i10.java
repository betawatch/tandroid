package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i10 implements xd.a {
    public final ViewGroup a;
    public final ug.d b;

    public i10(ag.d dVar, GroupCallMessage groupCallMessage) {
        ug.d dVar2 = new ug.d(dVar.getContext());
        this.b = dVar2;
        dVar2.setBackgroundColor(i0.b.k(-16777216, 34));
        eh.s sVar = dVar2.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        dVar2.set(groupCallMessage);
        dVar2.setAlpha(0.0f);
        this.a = dVar;
        dVar.addView(dVar2);
    }

    @Override // xd.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

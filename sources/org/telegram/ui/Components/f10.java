package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f10 implements wd.a {
    public final ViewGroup a;
    public final tg.d b;

    public f10(dh.g gVar, GroupCallMessage groupCallMessage) {
        tg.d dVar = new tg.d(gVar.getContext());
        this.b = dVar;
        dVar.setBackgroundColor(i0.a.k(-16777216, 34));
        dh.u uVar = dVar.v;
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setEllipsize(TextUtils.TruncateAt.END);
        dVar.set(groupCallMessage);
        dVar.setAlpha(0.0f);
        this.a = gVar;
        gVar.addView(dVar);
    }

    @Override // wd.a
    public final void a() {
        this.a.removeView(this.b);
    }
}

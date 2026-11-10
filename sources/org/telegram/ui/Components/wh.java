package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wh extends xh {
    public int b;
    public final /* synthetic */ ci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(ci ciVar, Context context) {
        super(context);
        this.c = ciVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ci.H4;
        org.telegram.ui.ActionBar.h6 h6Var = ciVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ql, h6Var);
        bVar.s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, h6Var);
        bVar.w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pl, h6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.a.setText(str);
        this.a.setTabAnimation(aVar);
        this.b = i7;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f(((long) this.b) == this.c.T2, false);
    }
}

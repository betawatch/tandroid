package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class oi extends pi {
    public int b;
    public final /* synthetic */ ui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(ui uiVar, Context context) {
        super(context);
        this.c = uiVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ui.I4;
        org.telegram.ui.ActionBar.h6 h6Var = uiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(c8.ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Tl, h6Var);
        bVar.s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Rl, h6Var);
        bVar.w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Sl, h6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, c8.ma.c(-1.0f, -1));
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
        this.a.f(((long) this.b) == this.c.U2, false);
    }
}

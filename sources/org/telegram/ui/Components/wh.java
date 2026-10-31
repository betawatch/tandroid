package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wh extends xh {
    public int b;
    public final /* synthetic */ bi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(bi biVar, Context context) {
        super(context);
        this.c = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i10 = bi.E4;
        org.telegram.ui.ActionBar.p6 p6Var = biVar.I0;
        gh.b bVar = new gh.b(context);
        bVar.d = p6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(w7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ql, p6Var);
        bVar.s = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ol, p6Var);
        bVar.w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Pl, p6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, gh.a aVar) {
        this.a.setText(str);
        this.a.setTabAnimation(aVar);
        this.b = i10;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f(((long) this.b) == this.c.Q2, false);
    }
}

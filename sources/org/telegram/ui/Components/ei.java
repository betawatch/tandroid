package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ei extends fi {
    public int b;
    public final /* synthetic */ ki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(ki kiVar, Context context) {
        super(context);
        this.c = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ki.I4;
        org.telegram.ui.ActionBar.e6 e6Var = kiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(c8.ja.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tl, e6Var);
        bVar.s = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Rl, e6Var);
        bVar.w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sl, e6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, c8.ja.c(-1.0f, -1));
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

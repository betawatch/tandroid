package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mi extends ni {
    public int b;
    public final /* synthetic */ si c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(si siVar, Context context) {
        super(context);
        this.c = siVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = si.I4;
        org.telegram.ui.ActionBar.i6 i6Var = siVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(c8.ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
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

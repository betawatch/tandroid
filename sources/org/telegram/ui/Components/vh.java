package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vh extends wh {
    public int b;
    public final /* synthetic */ bi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(bi biVar, Context context) {
        super(context);
        this.c = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i3 = bi.F4;
        org.telegram.ui.ActionBar.e6 e6Var = biVar.J0;
        rh.b bVar = new rh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(b8.mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, e6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, e6Var);
        bVar.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, e6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3, String str, rh.a aVar) {
        this.a.setText(str);
        this.a.setTabAnimation(aVar);
        this.b = i3;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f(((long) this.b) == this.c.R2, false);
    }
}

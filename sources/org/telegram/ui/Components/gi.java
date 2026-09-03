package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gi extends hi {
    public int b;
    public final /* synthetic */ mi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(mi miVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.c = miVar;
        setWillNotDraw(false);
        setFocusable(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        ch.b bVar = new ch.b(context);
        bVar.d = g6Var;
        bVar.N = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.b.setLayoutParams(k7.c6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.f();
        this.a = bVar;
        addView(bVar, k7.c6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, ch.a aVar) {
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
        this.a.e(((long) this.b) == this.c.T0, false);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ni extends oi {
    public int b;
    public final /* synthetic */ ti c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.c = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        qh.b bVar = new qh.b(context);
        bVar.d = u6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(kb1.h(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.cl, u6Var);
        bVar.s = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.al, u6Var);
        bVar.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.bl, u6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, kb1.g(-1.0f, -1));
    }

    public final void a(int i10, String str, qh.a aVar) {
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
        this.a.f(((long) this.b) == this.c.Z0, false);
    }
}

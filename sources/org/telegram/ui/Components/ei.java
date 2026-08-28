package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ei extends fi {
    public int b;
    public final /* synthetic */ ki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(ki kiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.c = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        wg.b bVar = new wg.b(context);
        bVar.d = b6Var;
        bVar.M = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.b.setLayoutParams(g7.e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cl, b6Var);
        bVar.s = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, b6Var);
        bVar.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.bl, b6Var);
        bVar.f();
        this.a = bVar;
        addView(bVar, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9, String str, wg.a aVar) {
        this.a.setText(str);
        this.a.setTabAnimation(aVar);
        this.b = i9;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e(((long) this.b) == this.c.S0, false);
    }
}

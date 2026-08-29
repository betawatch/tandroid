package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hi extends ii {
    public int b;
    public final /* synthetic */ ni c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(ni niVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.c = niVar;
        setWillNotDraw(false);
        setFocusable(true);
        c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        zg.b bVar = new zg.b(context);
        bVar.d = c6Var;
        bVar.M = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.b.setLayoutParams(i7.f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.a = bVar;
        addView(bVar, i7.f6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, zg.a aVar) {
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
        this.a.e(((long) this.b) == this.c.S0, false);
    }
}

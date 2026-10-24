package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ni extends oi {
    public int b;
    public final /* synthetic */ ti c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.c = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) tiVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = g6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b(false);
        bVar.b.setLayoutParams(w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.a();
        this.a = bVar;
        addView(bVar, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, ph.a aVar) {
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

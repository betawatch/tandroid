package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pi extends qi {
    public int b;
    public final /* synthetic */ vi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.c = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = c6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.b.setLayoutParams(w7.z5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.w = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.s = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.a = bVar;
        addView(bVar, w7.z5.d(-1.0f, -1));
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
        this.a.e(((long) this.b) == this.c.Z0, false);
    }
}

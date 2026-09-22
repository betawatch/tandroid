package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pi extends qi {
    public int b;
    public final /* synthetic */ vi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.c = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.b.setLayoutParams(w7.x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.a = bVar;
        addView(bVar, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
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
        this.a.e(((long) this.b) == this.c.W0, false);
    }
}

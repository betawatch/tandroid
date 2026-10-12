package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p71 extends o20 {
    public final di.g2 J;
    public final /* synthetic */ q71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p71(q71 q71Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = q71Var;
        di.g2 g2Var = this.r;
        this.J = g2Var;
        g2Var.setImeOptions(268435459);
        g2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        g2Var.addTextChangedListener(new di.h2(this, 14));
        g2Var.setOnEditorActionListener(new e1(this, 11));
    }

    @Override // org.telegram.ui.Components.o20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.F(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

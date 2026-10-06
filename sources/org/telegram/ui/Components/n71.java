package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class n71 extends f20 {
    public final ci.h2 J;
    public final /* synthetic */ o71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(o71 o71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = o71Var;
        ci.h2 h2Var = this.r;
        this.J = h2Var;
        h2Var.setImeOptions(268435459);
        h2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        h2Var.addTextChangedListener(new ci.i2(this, 14));
        h2Var.setOnEditorActionListener(new e1(this, 10));
    }

    @Override // org.telegram.ui.Components.f20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.C(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

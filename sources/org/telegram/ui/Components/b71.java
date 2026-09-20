package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b71 extends b20 {
    public final ci.h2 J;
    public final /* synthetic */ c71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(c71 c71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = c71Var;
        ci.h2 h2Var = this.r;
        this.J = h2Var;
        h2Var.setImeOptions(268435459);
        h2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        h2Var.addTextChangedListener(new ci.i2(this, 14));
        h2Var.setOnEditorActionListener(new e1(this, 10));
    }

    @Override // org.telegram.ui.Components.b20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.E(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

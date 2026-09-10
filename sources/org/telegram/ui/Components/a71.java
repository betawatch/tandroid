package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a71 extends k20 {
    public final bi.t2 J;
    public final /* synthetic */ b71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(b71 b71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = b71Var;
        bi.t2 t2Var = this.r;
        this.J = t2Var;
        t2Var.setImeOptions(268435459);
        t2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        t2Var.addTextChangedListener(new bi.u2(this, 14));
        t2Var.setOnEditorActionListener(new g1(this, 10));
    }

    @Override // org.telegram.ui.Components.k20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

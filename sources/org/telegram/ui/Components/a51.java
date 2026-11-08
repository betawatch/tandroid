package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a51 extends s00 {
    public final ah.i J;
    public final /* synthetic */ b51 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a51(b51 b51Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = b51Var;
        ah.i iVar = this.r;
        this.J = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.id.M0(2131743342, null));
        iVar.addTextChangedListener(new ah.j(this, 26));
        iVar.setOnEditorActionListener(new t0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

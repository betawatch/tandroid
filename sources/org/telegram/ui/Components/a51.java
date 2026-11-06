package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a51 extends r00 {
    public final ah.i J;
    public final /* synthetic */ b51 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a51(b51 b51Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = b51Var;
        ah.i iVar = this.r;
        this.J = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.hd.M0(2131743340, null));
        iVar.addTextChangedListener(new ah.j(this, 26));
        iVar.setOnEditorActionListener(new t0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

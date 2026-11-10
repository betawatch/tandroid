package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b51 extends r00 {
    public final ah.i J;
    public final /* synthetic */ c51 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(c51 c51Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.K = c51Var;
        ah.i iVar = this.r;
        this.J = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.id.M0(2131743339, null));
        iVar.addTextChangedListener(new ah.j(this, 26));
        iVar.setOnEditorActionListener(new s0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

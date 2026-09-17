package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class c8 extends fo0 {
    public final /* synthetic */ k8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(k8 k8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.l0 = k8Var;
    }

    @Override // org.telegram.ui.Components.fo0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}

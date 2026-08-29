package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class om extends org.telegram.ui.Components.jl0 implements lh.z6 {
    public final /* synthetic */ tn T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(tn tnVar, Context context, rn rnVar) {
        super(context, rnVar);
        this.T2 = tnVar;
    }

    @Override // lh.z6
    public final void a(int[] iArr) {
        tn tnVar = this.T2;
        iArr[0] = ((int) tnVar.o9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.x3.z(3.0f, tnVar.t0.getPaddingBottom(), tnVar.t0.getMeasuredHeight());
    }
}

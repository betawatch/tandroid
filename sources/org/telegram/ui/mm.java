package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class mm extends org.telegram.ui.Components.wk0 implements ih.c7 {
    public final /* synthetic */ qn T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(qn qnVar, Context context, on onVar) {
        super(context, onVar);
        this.T2 = qnVar;
    }

    @Override // ih.c7
    public final void a(int[] iArr) {
        qn qnVar = this.T2;
        iArr[0] = ((int) qnVar.o9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.l0.A(3.0f, qnVar.t0.getPaddingBottom(), qnVar.t0.getMeasuredHeight());
    }
}

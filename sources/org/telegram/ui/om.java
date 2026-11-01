package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class om extends org.telegram.ui.Components.uk0 implements th.l5 {
    public final /* synthetic */ un e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(un unVar, Context context, sn snVar) {
        super(context, snVar);
        this.e3 = unVar;
    }

    @Override // th.l5
    public final void a(int[] iArr) {
        un unVar = this.e3;
        iArr[0] = ((int) unVar.L9) - org.telegram.messenger.i0.L(4.0f);
        iArr[1] = org.telegram.messenger.m5.B(3.0f, unVar.z0.getPaddingBottom(), unVar.z0.getMeasuredHeight());
    }
}

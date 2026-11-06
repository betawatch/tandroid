package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nq0 extends av0 {
    public final /* synthetic */ xs0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(xs0 xs0Var, Context context, lz lzVar) {
        super(context, lzVar, 1, null);
        this.K = xs0Var;
    }

    @Override // org.telegram.ui.Components.av0
    public final void a() {
        invalidate();
        this.K.P0();
    }
}

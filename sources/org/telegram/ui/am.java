package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class am extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ hm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(hm hmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f = hmVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        wn wnVar = this.f.Q;
        int i10 = wn.fd;
        return wnVar.e9();
    }
}

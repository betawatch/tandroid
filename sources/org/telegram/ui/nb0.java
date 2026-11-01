package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nb0 extends zf.h0 {
    public boolean m0;
    public final /* synthetic */ xb0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(xb0 xb0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, p6Var, false, z10, z11);
        this.n0 = xb0Var;
        this.m0 = true;
    }

    @Override // zf.h0
    public final void K() {
        this.n0.D0(null);
    }

    @Override // zf.h0
    public final void O(ArrayList arrayList) {
        int i10;
        xb0 xb0Var = this.n0;
        org.telegram.messenger.kj kjVar = xb0Var.J0;
        if (kjVar != null && kjVar.C3()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    rb0 rb0Var = (rb0) arrayList.get(i11);
                    if (rb0Var != null && !org.telegram.messenger.i20.B(rb0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                xb0Var.r0 = ((rb0) arrayList.get(0)).a;
            }
            this.m0 = false;
            xb0Var.X.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.O(arrayList);
    }
}

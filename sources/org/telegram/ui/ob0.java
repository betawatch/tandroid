package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ob0 extends zf.h0 {
    public boolean m0;
    public final /* synthetic */ yb0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(yb0 yb0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, p6Var, false, z10, z11);
        this.n0 = yb0Var;
        this.m0 = true;
    }

    @Override // zf.h0
    public final void K() {
        this.n0.C0(null);
    }

    @Override // zf.h0
    public final void O(ArrayList arrayList) {
        int i10;
        yb0 yb0Var = this.n0;
        org.telegram.messenger.jj jjVar = yb0Var.J0;
        if (jjVar != null && jjVar.C3()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    sb0 sb0Var = (sb0) arrayList.get(i11);
                    if (sb0Var != null && !org.telegram.messenger.h20.B(sb0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                yb0Var.r0 = ((sb0) arrayList.get(0)).a;
            }
            this.m0 = false;
            yb0Var.X.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.O(arrayList);
    }
}

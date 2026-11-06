package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ha0 extends jg.r0 {
    public boolean d0;
    public final /* synthetic */ pa0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(pa0 pa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context, i7, j3, false, f6Var, false, z9, z10);
        this.e0 = pa0Var;
        this.d0 = true;
    }

    @Override // jg.r0
    public final void J() {
        this.e0.B0(null);
    }

    @Override // jg.r0
    public final void N(ArrayList arrayList) {
        int i7;
        pa0 pa0Var = this.e0;
        org.telegram.messenger.ij ijVar = pa0Var.D0;
        if (ijVar != null && ijVar.D3()) {
            if (arrayList != null) {
                i7 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    la0 la0Var = (la0) arrayList.get(i10);
                    if (la0Var != null && !org.telegram.messenger.t10.B(la0Var.c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.d0 && i7 == 1) {
                pa0Var.p0 = ((la0) arrayList.get(0)).a;
            }
            this.d0 = false;
            pa0Var.V.setVisibility(i7 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}

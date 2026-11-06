package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class et extends org.telegram.ui.Components.nc {
    public final /* synthetic */ org.telegram.ui.Components.yh0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(org.telegram.ui.Components.yh0 yh0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.e0 = yh0Var;
    }

    @Override // org.telegram.ui.Components.nc
    public final int c() {
        return org.telegram.messenger.qs.t3;
    }

    @Override // org.telegram.ui.Components.nc
    public final void d(int i7, boolean z9) {
        int i10;
        gt gtVar = (gt) this.e0.e;
        if (!z9) {
            gtVar.l1();
            return;
        }
        if (i7 < 0 || i7 >= gtVar.n3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            ft[] ftVarArr = gtVar.n3;
            i10 = -1;
            if (i11 >= ftVarArr.length) {
                i11 = -1;
                break;
            } else if (ftVarArr[i11].d == i7) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < gtVar.j3.size()) {
                ct ctVar = (ct) gtVar.j3.get(i12);
                if (ctVar != null && ctVar.a == 2 && ctVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            gtVar.e1(new l2.u(i10, 3), 0, true);
        } else {
            gtVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.nc
    public final int e() {
        return 10;
    }
}

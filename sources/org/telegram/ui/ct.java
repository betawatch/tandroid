package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ct extends org.telegram.ui.Components.lc {
    public final /* synthetic */ org.telegram.ui.Components.bi0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(org.telegram.ui.Components.bi0 bi0Var, Context context, int i3, int[] iArr, int[] iArr2) {
        super(context, i3, iArr, 1, iArr2);
        this.f0 = bi0Var;
    }

    @Override // org.telegram.ui.Components.lc
    public final int c() {
        return org.telegram.messenger.hs.t3;
    }

    @Override // org.telegram.ui.Components.lc
    public final void d(int i3, boolean z10) {
        int i10;
        et etVar = (et) this.f0.e;
        if (!z10) {
            etVar.l1();
            return;
        }
        if (i3 < 0 || i3 >= etVar.o3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            dt[] dtVarArr = etVar.o3;
            i10 = -1;
            if (i11 >= dtVarArr.length) {
                i11 = -1;
                break;
            } else if (dtVarArr[i11].d == i3) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < etVar.k3.size()) {
                at atVar = (at) etVar.k3.get(i12);
                if (atVar != null && atVar.a == 2 && atVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            etVar.e1(new k2.v(i10, 7), 0, true);
        } else {
            etVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.lc
    public final int e() {
        return 10;
    }
}

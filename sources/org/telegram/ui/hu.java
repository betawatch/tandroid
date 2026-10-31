package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hu extends org.telegram.ui.Components.ic {
    public final /* synthetic */ org.telegram.ui.Components.cj0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(org.telegram.ui.Components.cj0 cj0Var, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = cj0Var;
    }

    @Override // org.telegram.ui.Components.ic
    public final int c() {
        return org.telegram.messenger.zs.t3;
    }

    @Override // org.telegram.ui.Components.ic
    public final void d(int i10, boolean z10) {
        int i11;
        ju juVar = (ju) this.e0.e;
        if (!z10) {
            juVar.l1();
            return;
        }
        if (i10 < 0 || i10 >= juVar.n3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            iu[] iuVarArr = juVar.n3;
            i11 = -1;
            if (i12 >= iuVarArr.length) {
                i12 = -1;
                break;
            } else if (iuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < juVar.j3.size()) {
                fu fuVar = (fu) juVar.j3.get(i13);
                if (fuVar != null && fuVar.a == 2 && fuVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            juVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            juVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.ic
    public final int e() {
        return 10;
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gu extends org.telegram.ui.Components.ic {
    public final /* synthetic */ org.telegram.ui.Components.dj0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(org.telegram.ui.Components.dj0 dj0Var, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = dj0Var;
    }

    @Override // org.telegram.ui.Components.ic
    public final int c() {
        return org.telegram.messenger.at.t3;
    }

    @Override // org.telegram.ui.Components.ic
    public final void d(int i10, boolean z10) {
        int i11;
        iu iuVar = (iu) this.e0.e;
        if (!z10) {
            iuVar.l1();
            return;
        }
        if (i10 < 0 || i10 >= iuVar.n3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            hu[] huVarArr = iuVar.n3;
            i11 = -1;
            if (i12 >= huVarArr.length) {
                i12 = -1;
                break;
            } else if (huVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < iuVar.j3.size()) {
                eu euVar = (eu) iuVar.j3.get(i13);
                if (euVar != null && euVar.a == 2 && euVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            iuVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            iuVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.ic
    public final int e() {
        return 10;
    }
}

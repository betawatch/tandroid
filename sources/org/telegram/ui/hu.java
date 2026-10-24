package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hu extends org.telegram.ui.Components.dd {
    public final /* synthetic */ iu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(iu iuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = iuVar;
    }

    @Override // org.telegram.ui.Components.dd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d(int i10, boolean z10) {
        int i11;
        ku kuVar = (ku) this.e0.e;
        if (!z10) {
            kuVar.l1();
            return;
        }
        if (i10 < 0 || i10 >= kuVar.h3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            ju[] juVarArr = kuVar.h3;
            i11 = -1;
            if (i12 >= juVarArr.length) {
                i12 = -1;
                break;
            } else if (juVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < kuVar.d3.size()) {
                fu fuVar = (fu) kuVar.d3.get(i13);
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
            kuVar.f1(new i2.v(i11, 7), 0, true);
        } else {
            kuVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.dd
    public final int e() {
        return 10;
    }
}

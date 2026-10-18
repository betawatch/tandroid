package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gu extends org.telegram.ui.Components.dd {
    public final /* synthetic */ hu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(hu huVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = huVar;
    }

    @Override // org.telegram.ui.Components.dd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d(int i10, boolean z10) {
        int i11;
        ju juVar = (ju) this.e0.e;
        if (!z10) {
            juVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= juVar.e3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            iu[] iuVarArr = juVar.e3;
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
            if (i13 < juVar.a3.size()) {
                eu euVar = (eu) juVar.a3.get(i13);
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
            juVar.e1(new i2.v(i11, 7), 0, true);
        } else {
            juVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.dd
    public final int e() {
        return 10;
    }
}

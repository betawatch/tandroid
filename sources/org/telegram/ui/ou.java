package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ou extends org.telegram.ui.Components.dd {
    public final /* synthetic */ pu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(pu puVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = puVar;
    }

    @Override // org.telegram.ui.Components.dd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d(int i10, boolean z10) {
        int i11;
        ru ruVar = (ru) this.e0.e;
        if (!z10) {
            ruVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= ruVar.g3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            qu[] quVarArr = ruVar.g3;
            i11 = -1;
            if (i12 >= quVarArr.length) {
                i12 = -1;
                break;
            } else if (quVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < ruVar.c3.size()) {
                mu muVar = (mu) ruVar.c3.get(i13);
                if (muVar != null && muVar.a == 2 && muVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            ruVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            ruVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.dd
    public final int e() {
        return 10;
    }
}

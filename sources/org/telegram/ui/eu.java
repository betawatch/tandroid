package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class eu extends org.telegram.ui.Components.cd {
    public final /* synthetic */ fu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(fu fuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = fuVar;
    }

    @Override // org.telegram.ui.Components.cd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.cd
    public final void d(int i10, boolean z10) {
        int i11;
        hu huVar = (hu) this.e0.e;
        if (!z10) {
            huVar.m1();
            return;
        }
        if (i10 < 0 || i10 >= huVar.o3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            gu[] guVarArr = huVar.o3;
            i11 = -1;
            if (i12 >= guVarArr.length) {
                i12 = -1;
                break;
            } else if (guVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < huVar.k3.size()) {
                cu cuVar = (cu) huVar.k3.get(i13);
                if (cuVar != null && cuVar.a == 2 && cuVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            huVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            huVar.m1();
        }
    }

    @Override // org.telegram.ui.Components.cd
    public final int e() {
        return 10;
    }
}

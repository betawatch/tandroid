package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ht extends org.telegram.ui.Components.mc {
    public final /* synthetic */ org.telegram.ui.Components.yh0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(org.telegram.ui.Components.yh0 yh0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.e0 = yh0Var;
    }

    @Override // org.telegram.ui.Components.mc
    public final int c() {
        return org.telegram.messenger.qs.t3;
    }

    @Override // org.telegram.ui.Components.mc
    public final void d(int i7, boolean z9) {
        int i10;
        kt ktVar = (kt) this.e0.e;
        if (!z9) {
            ktVar.l1();
            return;
        }
        if (i7 < 0 || i7 >= ktVar.n3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            jt[] jtVarArr = ktVar.n3;
            i10 = -1;
            if (i11 >= jtVarArr.length) {
                i11 = -1;
                break;
            } else if (jtVarArr[i11].d == i7) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < ktVar.j3.size()) {
                ft ftVar = (ft) ktVar.j3.get(i12);
                if (ftVar != null && ftVar.a == 2 && ftVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            ktVar.e1(new l2.u(i10, 3), 0, true);
        } else {
            ktVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.mc
    public final int e() {
        return 10;
    }
}

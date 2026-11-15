package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ht extends org.telegram.ui.Components.ic {
    public final /* synthetic */ org.telegram.ui.Components.ci0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(org.telegram.ui.Components.ci0 ci0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f0 = ci0Var;
    }

    @Override // org.telegram.ui.Components.ic
    public final int c() {
        return org.telegram.messenger.ns.t3;
    }

    @Override // org.telegram.ui.Components.ic
    public final void d(int i7, boolean z10) {
        int i10;
        kt ktVar = (kt) this.f0.e;
        if (!z10) {
            ktVar.l1();
            return;
        }
        if (i7 < 0 || i7 >= ktVar.o3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            jt[] jtVarArr = ktVar.o3;
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
            if (i12 < ktVar.k3.size()) {
                ft ftVar = (ft) ktVar.k3.get(i12);
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
            ktVar.e1(new l2.t(i10, 3), 0, true);
        } else {
            ktVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.ic
    public final int e() {
        return 10;
    }
}

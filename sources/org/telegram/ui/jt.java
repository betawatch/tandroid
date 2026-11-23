package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jt extends org.telegram.ui.Components.qc {
    public final /* synthetic */ org.telegram.ui.Components.ni0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(org.telegram.ui.Components.ni0 ni0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f0 = ni0Var;
    }

    @Override // org.telegram.ui.Components.qc
    public final int c() {
        return org.telegram.messenger.ks.t3;
    }

    @Override // org.telegram.ui.Components.qc
    public final void d(int i7, boolean z10) {
        int i10;
        lt ltVar = (lt) this.f0.e;
        if (!z10) {
            ltVar.l1();
            return;
        }
        if (i7 < 0 || i7 >= ltVar.o3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            kt[] ktVarArr = ltVar.o3;
            i10 = -1;
            if (i11 >= ktVarArr.length) {
                i11 = -1;
                break;
            } else if (ktVarArr[i11].d == i7) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < ltVar.k3.size()) {
                gt gtVar = (gt) ltVar.k3.get(i12);
                if (gtVar != null && gtVar.a == 2 && gtVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            ltVar.e1(new l2.u(i10, 3), 0, true);
        } else {
            ltVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.qc
    public final int e() {
        return 10;
    }
}

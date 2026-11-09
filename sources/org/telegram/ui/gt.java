package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gt extends org.telegram.ui.Components.nc {
    public final /* synthetic */ org.telegram.ui.Components.zh0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(org.telegram.ui.Components.zh0 zh0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.e0 = zh0Var;
    }

    @Override // org.telegram.ui.Components.nc
    public final int c() {
        return org.telegram.messenger.qs.t3;
    }

    @Override // org.telegram.ui.Components.nc
    public final void d(int i7, boolean z9) {
        int i10;
        jt jtVar = (jt) this.e0.e;
        if (!z9) {
            jtVar.l1();
            return;
        }
        if (i7 < 0 || i7 >= jtVar.n3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            ht[] htVarArr = jtVar.n3;
            i10 = -1;
            if (i11 >= htVarArr.length) {
                i11 = -1;
                break;
            } else if (htVarArr[i11].d == i7) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < jtVar.j3.size()) {
                et etVar = (et) jtVar.j3.get(i12);
                if (etVar != null && etVar.a == 2 && etVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            jtVar.e1(new l2.u(i10, 3), 0, true);
        } else {
            jtVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.nc
    public final int e() {
        return 10;
    }
}

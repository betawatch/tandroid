package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pu extends org.telegram.ui.Components.dd {
    public final /* synthetic */ qu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(qu quVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = quVar;
    }

    @Override // org.telegram.ui.Components.dd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d(int i10, boolean z10) {
        int i11;
        su suVar = (su) this.e0.e;
        if (!z10) {
            suVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= suVar.g3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            ru[] ruVarArr = suVar.g3;
            i11 = -1;
            if (i12 >= ruVarArr.length) {
                i12 = -1;
                break;
            } else if (ruVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < suVar.c3.size()) {
                nu nuVar = (nu) suVar.c3.get(i13);
                if (nuVar != null && nuVar.a == 2 && nuVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            suVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            suVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.dd
    public final int e() {
        return 10;
    }
}

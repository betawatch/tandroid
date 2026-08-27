package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ku extends org.telegram.ui.Components.sc {
    public final /* synthetic */ lu a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(lu luVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.a0 = luVar;
    }

    @Override // org.telegram.ui.Components.sc
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.sc
    public final void d(int i10, boolean z10) {
        int i11;
        nu nuVar = (nu) this.a0.e;
        if (!z10) {
            nuVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= nuVar.c3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            mu[] muVarArr = nuVar.c3;
            i11 = -1;
            if (i12 >= muVarArr.length) {
                i12 = -1;
                break;
            } else if (muVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < nuVar.Y2.size()) {
                iu iuVar = (iu) nuVar.Y2.get(i13);
                if (iuVar != null && iuVar.a == 2 && iuVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            nuVar.e1(new h3.y(i11, 2), 0, true);
        } else {
            nuVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.sc
    public final int e() {
        return 10;
    }
}

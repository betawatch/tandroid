package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hu extends org.telegram.ui.Components.uc {
    public final /* synthetic */ iu a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(iu iuVar, Context context, int i9, int[] iArr, int[] iArr2) {
        super(context, i9, iArr, 1, iArr2);
        this.a0 = iuVar;
    }

    @Override // org.telegram.ui.Components.uc
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.uc
    public final void d(int i9, boolean z10) {
        int i10;
        ku kuVar = (ku) this.a0.e;
        if (!z10) {
            kuVar.j1();
            return;
        }
        if (i9 < 0 || i9 >= kuVar.c3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            ju[] juVarArr = kuVar.c3;
            i10 = -1;
            if (i11 >= juVarArr.length) {
                i11 = -1;
                break;
            } else if (juVarArr[i11].d == i9) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < kuVar.Y2.size()) {
                fu fuVar = (fu) kuVar.Y2.get(i12);
                if (fuVar != null && fuVar.a == 2 && fuVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            kuVar.e1(new h3.x(i10, 2), 0, true);
        } else {
            kuVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.uc
    public final int e() {
        return 10;
    }
}

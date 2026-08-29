package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class iu extends org.telegram.ui.Components.zc {
    public final /* synthetic */ ju a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(ju juVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.a0 = juVar;
    }

    @Override // org.telegram.ui.Components.zc
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.zc
    public final void d(int i10, boolean z10) {
        int i11;
        lu luVar = (lu) this.a0.e;
        if (!z10) {
            luVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= luVar.c3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            ku[] kuVarArr = luVar.c3;
            i11 = -1;
            if (i12 >= kuVarArr.length) {
                i12 = -1;
                break;
            } else if (kuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < luVar.Y2.size()) {
                gu guVar = (gu) luVar.Y2.get(i13);
                if (guVar != null && guVar.a == 2 && guVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            luVar.e1(new j3.x(i11, 2), 0, true);
        } else {
            luVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.zc
    public final int e() {
        return 10;
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kt extends org.telegram.ui.Components.rc {
    public final /* synthetic */ org.telegram.ui.Components.ni0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(org.telegram.ui.Components.ni0 ni0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f0 = ni0Var;
    }

    @Override // org.telegram.ui.Components.rc
    public final int c() {
        return org.telegram.messenger.ls.t3;
    }

    @Override // org.telegram.ui.Components.rc
    public final void d(int i7, boolean z10) {
        int i10;
        mt mtVar = (mt) this.f0.e;
        if (!z10) {
            mtVar.l1();
            return;
        }
        if (i7 < 0 || i7 >= mtVar.o3.length) {
            return;
        }
        int i11 = 0;
        while (true) {
            lt[] ltVarArr = mtVar.o3;
            i10 = -1;
            if (i11 >= ltVarArr.length) {
                i11 = -1;
                break;
            } else if (ltVarArr[i11].d == i7) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 < mtVar.k3.size()) {
                ht htVar = (ht) mtVar.k3.get(i12);
                if (htVar != null && htVar.a == 2 && htVar.h == i11) {
                    i10 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            mtVar.e1(new l2.t(i10, 3), 0, true);
        } else {
            mtVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.rc
    public final int e() {
        return 10;
    }
}

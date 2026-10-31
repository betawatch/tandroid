package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e1 extends s4.s {
    public final /* synthetic */ j1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j1 j1Var) {
        super(true);
        this.S = j1Var;
    }

    @Override // s4.s
    public final boolean B1(int i10) {
        byte b10;
        j1 j1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.s.items;
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) j1Var.w.b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (bjVar.a != bjVar.b && (b10 = bjVar.c) == bjVar.d && b10 != 0) {
            int size = j1Var.w.a.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) j1Var.w.a.get(i11);
                if (bjVar2 != bjVar) {
                    byte b11 = bjVar2.c;
                    byte b12 = bjVar.c;
                    if (b11 <= b12 && bjVar2.d >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.s
    public final boolean C1(View view) {
        return false;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final boolean y0() {
        return false;
    }
}

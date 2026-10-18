package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.mc1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p5 extends f5 {
    public final /* synthetic */ int T = 1;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(mc1 mc1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = mc1Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public int g(int i10) {
        switch (this.T) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.U;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : h6.ql[i10];
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public int h(int i10) {
        switch (this.T) {
            case 0:
                return ((SparseIntArray) this.U).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void n(int i10, int i11, int i12) {
        switch (this.T) {
            case 1:
                if (!((mc1) this.U).d2) {
                    super.n(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.n(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.T) {
            case 1:
                if (!((mc1) this.U).d2) {
                    super.o(i10, i11, i12, i13, i14, i15, z10, z11);
                    break;
                }
                break;
            default:
                super.o(i10, i11, i12, i13, i14, i15, z10, z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.U = sparseIntArray;
    }
}

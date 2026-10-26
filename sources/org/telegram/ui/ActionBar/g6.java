package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g6 extends l5 {
    public final /* synthetic */ int T = 1;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(tc1 tc1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = tc1Var;
    }

    @Override // org.telegram.ui.ActionBar.l5
    public int g(int i10) {
        switch (this.T) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.U;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : y6.ql[i10];
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.l5
    public int h(int i10) {
        switch (this.T) {
            case 0:
                return ((SparseIntArray) this.U).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.l5
    public void m(int i10, int i11, int i12) {
        switch (this.T) {
            case 1:
                if (!((tc1) this.U).e2) {
                    super.m(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.m(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l5
    public void n(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.T) {
            case 1:
                if (!((tc1) this.U).e2) {
                    super.n(i10, i11, i12, i13, i14, i15, z10, z11);
                    break;
                }
                break;
            default:
                super.n(i10, i11, i12, i13, i14, i15, z10, z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.U = sparseIntArray;
    }
}

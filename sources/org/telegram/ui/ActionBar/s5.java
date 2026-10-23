package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class s5 extends j5 {
    public final /* synthetic */ int T = 1;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(qc1 qc1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = qc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public int g(int i10) {
        switch (this.T) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.U;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : k6.ql[i10];
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.j5
    public int h(int i10) {
        switch (this.T) {
            case 0:
                return ((SparseIntArray) this.U).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.j5
    public void m(int i10, int i11, int i12) {
        switch (this.T) {
            case 1:
                if (!((qc1) this.U).e2) {
                    super.m(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.m(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.j5
    public void n(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.T) {
            case 1:
                if (!((qc1) this.U).e2) {
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
    public s5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.U = sparseIntArray;
    }
}

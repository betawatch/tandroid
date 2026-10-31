package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a6 extends c5 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6(boolean z10, SparseIntArray sparseIntArray, int i10) {
        super(2, z10, false, null);
        this.U = i10;
        this.V = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.c5
    public int h(int i10) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : t6.em[i10];
            case 1:
                return ((SparseIntArray) this.V).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c5
    public int j(int i10) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i10);
            case 1:
                return ((SparseIntArray) this.V).get(i10);
            default:
                return super.j(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c5
    public void p(int i10, int i11, int i12) {
        switch (this.U) {
            case 2:
                if (!((m91) this.V).e2) {
                    super.p(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.p(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c5
    public void q(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((m91) this.V).e2) {
                    super.q(i10, i11, i12, i13, i14, i15, z10, z11);
                    break;
                }
                break;
            default:
                super.q(i10, i11, i12, i13, i14, i15, z10, z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(m91 m91Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = 2;
        this.V = m91Var;
    }
}

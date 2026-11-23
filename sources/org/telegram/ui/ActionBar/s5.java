package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s5 extends u4 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(boolean z10, SparseIntArray sparseIntArray, int i7) {
        super(2, z10, false, null);
        this.U = i7;
        this.V = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public int g(int i7) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : n6.hm[i7];
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.u4
    public int i(int i7) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i7);
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.i(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void o(int i7, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((v71) this.V).f2) {
                    super.o(i7, i10, i11);
                    break;
                }
                break;
            default:
                super.o(i7, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void p(int i7, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((v71) this.V).f2) {
                    super.p(i7, i10, i11, i12, i13, i14, z10, z11);
                    break;
                }
                break;
            default:
                super.p(i7, i10, i11, i12, i13, i14, z10, z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(v71 v71Var, int i7, boolean z10) {
        super(i7, true, z10, null);
        this.U = 2;
        this.V = v71Var;
    }
}

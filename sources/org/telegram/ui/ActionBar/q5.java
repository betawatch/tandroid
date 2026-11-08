package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q5 extends t4 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(boolean z9, SparseIntArray sparseIntArray, int i7) {
        super(2, z9, false, null);
        this.U = i7;
        this.V = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int g(int i7) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : k6.em[i7];
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.g(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
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

    @Override // org.telegram.ui.ActionBar.t4
    public void o(int i7, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((v71) this.V).e2) {
                    super.o(i7, i10, i11);
                    break;
                }
                break;
            default:
                super.o(i7, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void p(int i7, int i10, int i11, int i12, int i13, int i14, boolean z9, boolean z10) {
        switch (this.U) {
            case 2:
                if (!((v71) this.V).e2) {
                    super.p(i7, i10, i11, i12, i13, i14, z9, z10);
                    break;
                }
                break;
            default:
                super.p(i7, i10, i11, i12, i13, i14, z9, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(v71 v71Var, int i7, boolean z9) {
        super(i7, true, z9, null);
        this.U = 2;
        this.V = v71Var;
    }
}

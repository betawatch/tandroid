package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.nc1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n5 extends d5 {
    public final /* synthetic */ int R = 1;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(nc1 nc1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.S = nc1Var;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public int g(int i10) {
        switch (this.R) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.S;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : g6.nl[i10];
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public int h(int i10) {
        switch (this.R) {
            case 0:
                return ((SparseIntArray) this.S).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void n(int i10, int i11, int i12) {
        switch (this.R) {
            case 1:
                if (!((nc1) this.S).Z1) {
                    super.n(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.n(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.R) {
            case 1:
                if (!((nc1) this.S).Z1) {
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
    public n5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.S = sparseIntArray;
    }
}

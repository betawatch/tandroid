package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.oc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n5 extends d5 {
    public final /* synthetic */ int R = 1;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(oc1 oc1Var, int i9, boolean z10) {
        super(i9, true, z10, null);
        this.S = oc1Var;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public int g(int i9) {
        switch (this.R) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.S;
                int indexOfKey = sparseIntArray.indexOfKey(i9);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : f6.nl[i9];
            default:
                return super.g(i9);
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public int h(int i9) {
        switch (this.R) {
            case 0:
                return ((SparseIntArray) this.S).get(i9);
            default:
                return super.h(i9);
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void n(int i9, int i10, int i11) {
        switch (this.R) {
            case 1:
                if (!((oc1) this.S).Z1) {
                    super.n(i9, i10, i11);
                    break;
                }
                break;
            default:
                super.n(i9, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d5
    public void o(int i9, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.R) {
            case 1:
                if (!((oc1) this.S).Z1) {
                    super.o(i9, i10, i11, i12, i13, i14, z10, z11);
                    break;
                }
                break;
            default:
                super.o(i9, i10, i11, i12, i13, i14, z10, z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.S = sparseIntArray;
    }
}

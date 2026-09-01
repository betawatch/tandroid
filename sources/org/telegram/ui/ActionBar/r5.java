package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.ed1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r5 extends h5 {
    public final /* synthetic */ int R = 1;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(ed1 ed1Var, int i10, boolean z4) {
        super(i10, true, z4, null);
        this.S = ed1Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public int g(int i10) {
        switch (this.R) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.S;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : k6.nl[i10];
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public int h(int i10) {
        switch (this.R) {
            case 0:
                return ((SparseIntArray) this.S).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void n(int i10, int i11, int i12) {
        switch (this.R) {
            case 1:
                if (!((ed1) this.S).a2) {
                    super.n(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.n(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z4, boolean z10) {
        switch (this.R) {
            case 1:
                if (!((ed1) this.S).a2) {
                    super.o(i10, i11, i12, i13, i14, i15, z4, z10);
                    break;
                }
                break;
            default:
                super.o(i10, i11, i12, i13, i14, i15, z4, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(boolean z4, SparseIntArray sparseIntArray) {
        super(2, z4, false, null);
        this.S = sparseIntArray;
    }
}

package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public int h(int i7) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : k6.em[i7];
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int j(int i7) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i7);
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.j(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void p(int i7, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((u71) this.V).e2) {
                    super.p(i7, i10, i11);
                    break;
                }
                break;
            default:
                super.p(i7, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void q(int i7, int i10, int i11, int i12, int i13, int i14, boolean z9, boolean z10) {
        switch (this.U) {
            case 2:
                if (!((u71) this.V).e2) {
                    super.q(i7, i10, i11, i12, i13, i14, z9, z10);
                    break;
                }
                break;
            default:
                super.q(i7, i10, i11, i12, i13, i14, z9, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(u71 u71Var, int i7, boolean z9) {
        super(i7, true, z9, null);
        this.U = 2;
        this.V = u71Var;
    }
}

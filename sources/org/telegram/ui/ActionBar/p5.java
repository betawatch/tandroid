package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.l71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p5 extends t4 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(boolean z10, SparseIntArray sparseIntArray, int i3) {
        super(2, z10, false, null);
        this.U = i3;
        this.V = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int h(int i3) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i3);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : k6.em[i3];
            case 1:
                return ((SparseIntArray) this.V).get(i3);
            default:
                return super.h(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public int j(int i3) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i3);
            case 1:
                return ((SparseIntArray) this.V).get(i3);
            default:
                return super.j(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void p(int i3, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((l71) this.V).f2) {
                    super.p(i3, i10, i11);
                    break;
                }
                break;
            default:
                super.p(i3, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.t4
    public void q(int i3, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((l71) this.V).f2) {
                    super.q(i3, i10, i11, i12, i13, i14, z10, z11);
                    break;
                }
                break;
            default:
                super.q(i3, i10, i11, i12, i13, i14, z10, z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(l71 l71Var, int i3, boolean z10) {
        super(i3, true, z10, null);
        this.U = 2;
        this.V = l71Var;
    }
}

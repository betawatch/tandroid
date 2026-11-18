package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s5 extends v4 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(boolean z10, SparseIntArray sparseIntArray, int i7) {
        super(2, z10, false, null);
        this.U = i7;
        this.V = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.v4
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

    @Override // org.telegram.ui.ActionBar.v4
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

    @Override // org.telegram.ui.ActionBar.v4
    public void o(int i7, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((x71) this.V).f2) {
                    super.o(i7, i10, i11);
                    break;
                }
                break;
            default:
                super.o(i7, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.v4
    public void p(int i7, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((x71) this.V).f2) {
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
    public s5(x71 x71Var, int i7, boolean z10) {
        super(i7, true, z10, null);
        this.U = 2;
        this.V = x71Var;
    }
}

package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q5 extends f5 {
    public final /* synthetic */ int R = 1;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(wd1 wd1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.S = wd1Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public int g(int i10) {
        switch (this.R) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.S;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : j6.nl[i10];
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public int h(int i10) {
        switch (this.R) {
            case 0:
                return ((SparseIntArray) this.S).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void n(int i10, int i11, int i12) {
        switch (this.R) {
            case 1:
                if (!((wd1) this.S).d2) {
                    super.n(i10, i11, i12);
                    break;
                }
                break;
            default:
                super.n(i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.R) {
            case 1:
                if (!((wd1) this.S).d2) {
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
    public q5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.S = sparseIntArray;
    }
}

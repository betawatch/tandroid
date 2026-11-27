// default package

import android.util.SparseIntArray;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mnb extends t37 {
    public final /* synthetic */ byte U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnb(boolean z, SparseIntArray sparseIntArray, byte b) {
        super(2, z, false, null);
        this.U = b;
        this.V = sparseIntArray;
    }

    @Override // t37
    public final int g(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) obj;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : aob.hm[i];
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.g(i);
        }
    }

    @Override // t37
    public final int i(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                return ((SparseIntArray) obj).get(i);
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.i(i);
        }
    }

    @Override // t37
    public final void o(int i, int i2, int i3) {
        switch (this.U) {
            case 2:
                if (!((pqb) this.V).f2) {
                    super.o(i, i2, i3);
                    break;
                }
                break;
            default:
                super.o(i, i2, i3);
                break;
        }
    }

    @Override // t37
    public final void p(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        switch (this.U) {
            case 2:
                if (!((pqb) this.V).f2) {
                    super.p(i, i2, i3, i4, i5, i6, z, z2);
                    break;
                }
                break;
            default:
                super.p(i, i2, i3, i4, i5, i6, z, z2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnb(pqb pqbVar, int i, boolean z) {
        super(i, true, z, null);
        this.U = (byte) 2;
        this.V = pqbVar;
    }
}

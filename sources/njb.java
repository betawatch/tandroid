// default package

import android.util.SparseIntArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class njb extends m17 {
    public final /* synthetic */ byte U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njb(boolean z, SparseIntArray sparseIntArray, byte b) {
        super(2, z, false, null);
        this.U = b;
        this.V = sparseIntArray;
    }

    @Override // m17
    public final int g(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) obj;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                return indexOfKey > 0 ? sparseIntArray.valueAt(indexOfKey) : bkb.gm[i];
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.g(i);
        }
    }

    @Override // m17
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

    @Override // m17
    public final void o(int i, int i2, int i3) {
        switch (this.U) {
            case 2:
                if (!((qmb) this.V).f2) {
                    super.o(i, i2, i3);
                    break;
                }
                break;
            default:
                super.o(i, i2, i3);
                break;
        }
    }

    @Override // m17
    public final void p(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        switch (this.U) {
            case 2:
                if (!((qmb) this.V).f2) {
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
    public njb(qmb qmbVar, int i, boolean z) {
        super(i, true, z, null);
        this.U = (byte) 2;
        this.V = qmbVar;
    }
}

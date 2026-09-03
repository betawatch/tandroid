package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hx0 extends f2.q {
    public int b;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final /* synthetic */ PrivacyControlActivity e;

    public hx0(PrivacyControlActivity privacyControlActivity) {
        this.e = privacyControlActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12 = this.c.get(i10, -1);
        return i12 == this.d.get(i11, -1) && i12 >= 0;
    }

    @Override // f2.q
    public final int d() {
        return this.e.o0;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.e;
        g(1, privacyControlActivity.J, sparseIntArray);
        g(2, privacyControlActivity.K, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.L, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.d0, sparseIntArray);
        g(7, privacyControlActivity.M, sparseIntArray);
        g(8, privacyControlActivity.O, sparseIntArray);
        g(9, privacyControlActivity.P, sparseIntArray);
        g(10, privacyControlActivity.Q, sparseIntArray);
        g(11, privacyControlActivity.R, sparseIntArray);
        g(12, privacyControlActivity.S, sparseIntArray);
        g(13, privacyControlActivity.T, sparseIntArray);
        g(14, privacyControlActivity.U, sparseIntArray);
        g(15, privacyControlActivity.V, sparseIntArray);
        i12 = privacyControlActivity.photoForRestRow;
        g(16, i12, sparseIntArray);
        i13 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i13, sparseIntArray);
        g(18, privacyControlActivity.W, sparseIntArray);
        g(19, privacyControlActivity.X, sparseIntArray);
        g(20, privacyControlActivity.Y, sparseIntArray);
        g(21, privacyControlActivity.Z, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.a0, sparseIntArray);
        g(24, privacyControlActivity.b0, sparseIntArray);
        g(25, privacyControlActivity.c0, sparseIntArray);
        g(26, privacyControlActivity.e0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.g0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.h0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.j0, sparseIntArray);
        g(33, privacyControlActivity.i0, sparseIntArray);
        g(34, privacyControlActivity.k0, sparseIntArray);
        g(35, privacyControlActivity.l0, sparseIntArray);
        g(36, privacyControlActivity.m0, sparseIntArray);
        g(37, privacyControlActivity.n0, sparseIntArray);
    }
}

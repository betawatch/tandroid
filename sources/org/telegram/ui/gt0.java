package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class gt0 extends v4.o {
    public int b;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final /* synthetic */ PrivacyControlActivity e;

    public gt0(PrivacyControlActivity privacyControlActivity) {
        this.e = privacyControlActivity;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        int i11 = this.c.get(i7, -1);
        return i11 == this.d.get(i10, -1) && i11 >= 0;
    }

    @Override // v4.o
    public final int d() {
        return this.e.s0;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.e;
        g(1, privacyControlActivity.N, sparseIntArray);
        g(2, privacyControlActivity.O, sparseIntArray);
        i7 = privacyControlActivity.everybodyRow;
        g(3, i7, sparseIntArray);
        g(4, privacyControlActivity.P, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.h0, sparseIntArray);
        g(7, privacyControlActivity.Q, sparseIntArray);
        g(8, privacyControlActivity.S, sparseIntArray);
        g(9, privacyControlActivity.T, sparseIntArray);
        g(10, privacyControlActivity.U, sparseIntArray);
        g(11, privacyControlActivity.V, sparseIntArray);
        g(12, privacyControlActivity.W, sparseIntArray);
        g(13, privacyControlActivity.X, sparseIntArray);
        g(14, privacyControlActivity.Y, sparseIntArray);
        g(15, privacyControlActivity.Z, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.a0, sparseIntArray);
        g(19, privacyControlActivity.b0, sparseIntArray);
        g(20, privacyControlActivity.c0, sparseIntArray);
        g(21, privacyControlActivity.d0, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.e0, sparseIntArray);
        g(24, privacyControlActivity.f0, sparseIntArray);
        g(25, privacyControlActivity.g0, sparseIntArray);
        g(26, privacyControlActivity.i0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.k0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.l0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.n0, sparseIntArray);
        g(33, privacyControlActivity.m0, sparseIntArray);
        g(34, privacyControlActivity.o0, sparseIntArray);
        g(35, privacyControlActivity.p0, sparseIntArray);
        g(36, privacyControlActivity.q0, sparseIntArray);
        g(37, privacyControlActivity.r0, sparseIntArray);
    }
}

package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bh0 extends f2.q {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final SparseIntArray i = new SparseIntArray();
    public final SparseIntArray j = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final /* synthetic */ kh0 m;

    public bh0(kh0 kh0Var) {
        this.m = kh0Var;
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
        int i12;
        int i13;
        int i14 = this.c;
        kh0 kh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = kh0Var.y) && i11 < kh0Var.A) || (i11 >= kh0Var.D && i11 < kh0Var.E))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= kh0Var.A) ? (TLRPC.TL_chatInviteExported) kh0Var.f0.get(i11 - kh0Var.D) : (TLRPC.TL_chatInviteExported) kh0Var.e0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = kh0Var.Q) && i11 < kh0Var.R) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.i.get(i10, -1);
        return i17 >= 0 && i17 == this.j.get(i11, -1);
    }

    @Override // f2.q
    public final int d() {
        return this.m.T;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kh0 kh0Var = this.m;
        g(1, kh0Var.r, sparseIntArray);
        g(2, kh0Var.s, sparseIntArray);
        g(3, kh0Var.v, sparseIntArray);
        g(4, kh0Var.w, sparseIntArray);
        g(5, kh0Var.x, sparseIntArray);
        g(6, kh0Var.H, sparseIntArray);
        g(7, kh0Var.J, sparseIntArray);
        g(8, kh0Var.K, sparseIntArray);
        g(9, kh0Var.M, sparseIntArray);
        g(10, kh0Var.N, sparseIntArray);
        g(11, kh0Var.O, sparseIntArray);
        g(12, kh0Var.L, sparseIntArray);
        g(13, kh0Var.B, sparseIntArray);
    }
}

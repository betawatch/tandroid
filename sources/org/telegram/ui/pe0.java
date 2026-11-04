package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pe0 extends u4.o {
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
    public final /* synthetic */ xe0 m;

    public pe0(xe0 xe0Var) {
        this.m = xe0Var;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        int i11;
        int i12;
        int i13 = this.c;
        xe0 xe0Var = this.m;
        if (((i3 >= i13 && i3 < this.d) || (i3 >= this.e && i3 < this.f)) && ((i10 >= (i12 = xe0Var.E) && i10 < xe0Var.F) || (i10 >= xe0Var.I && i10 < xe0Var.J))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i10 < i12 || i10 >= xe0Var.F) ? (TLRPC.TL_chatInviteExported) xe0Var.k0.get(i10 - xe0Var.I) : (TLRPC.TL_chatInviteExported) xe0Var.j0.get(i10 - i12);
            int i14 = this.c;
            return ((i3 < i14 || i3 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i3 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i3 - i14)).link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.g;
        if (i3 >= i15 && i3 < this.h && i10 >= (i11 = xe0Var.V) && i10 < xe0Var.W) {
            return i3 - i15 == i10 - i11;
        }
        int i16 = this.i.get(i3, -1);
        return i16 >= 0 && i16 == this.j.get(i10, -1);
    }

    @Override // u4.o
    public final int d() {
        return this.m.Y;
    }

    @Override // u4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        xe0 xe0Var = this.m;
        g(1, xe0Var.r, sparseIntArray);
        g(2, xe0Var.s, sparseIntArray);
        g(3, xe0Var.w, sparseIntArray);
        g(4, xe0Var.x, sparseIntArray);
        g(5, xe0Var.y, sparseIntArray);
        g(6, xe0Var.M, sparseIntArray);
        g(7, xe0Var.O, sparseIntArray);
        g(8, xe0Var.P, sparseIntArray);
        g(9, xe0Var.R, sparseIntArray);
        g(10, xe0Var.S, sparseIntArray);
        g(11, xe0Var.T, sparseIntArray);
        g(12, xe0Var.Q, sparseIntArray);
        g(13, xe0Var.G, sparseIntArray);
    }
}

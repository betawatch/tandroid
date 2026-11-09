package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h30 extends v4.o {
    public final /* synthetic */ e40 b;

    public h30(e40 e40Var) {
        this.b = e40Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        e40 e40Var = this.b;
        y30 y30Var = e40Var.G1;
        int i16 = y30Var.x;
        if (i16 >= 0) {
            int i17 = e40Var.Y4;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = y30Var.y;
        if (i18 >= 0) {
            int i19 = e40Var.l5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = y30Var.D;
        if (i20 >= 0) {
            int i21 = e40Var.m5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = y30Var.K;
        if (i22 >= 0) {
            int i23 = e40Var.X4;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = y30Var.J;
        if (i24 >= 0) {
            int i25 = e40Var.k5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = y30Var.I;
        if (i26 >= 0 && i26 == i10 && i7 == e40Var.j5) {
            return true;
        }
        int i27 = e40Var.z2;
        if (i7 == i27 - 1 && i10 == y30Var.F - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != y30Var.F - 1) {
            if (i10 >= y30Var.G && i10 < y30Var.H && i7 >= (i15 = e40Var.h5) && i7 < e40Var.i5) {
                return ((org.telegram.messenger.s3) e40Var.v2.get(i7 - i15)).equals((org.telegram.messenger.s3) e40Var.h2.get(i10 - e40Var.G1.G));
            }
            if (i10 >= y30Var.d && i10 < y30Var.e && i7 >= (i14 = e40Var.Z4) && i7 < e40Var.a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.u2.get(i7 - i14);
                return org.telegram.messenger.ij.B1(groupCallParticipant.peer) == org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) e40Var.R2.g.get(i10 - e40Var.G1.d)).peer) && (i7 == i10 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i10 >= y30Var.f && i10 < y30Var.h && i7 >= (i13 = e40Var.b5) && i7 < e40Var.c5) {
                return ((Long) e40Var.w2.get(i7 - i13)).equals((Long) e40Var.R2.j.get(i10 - e40Var.G1.f));
            }
            if (i10 >= y30Var.n && i10 < y30Var.r && i7 >= (i12 = e40Var.d5) && i7 < e40Var.e5) {
                return ((Long) e40Var.x2.get(i7 - i12)).equals((Long) e40Var.R2.m.get(i10 - e40Var.G1.n));
            }
            if (i10 >= y30Var.s && i10 < y30Var.w && i7 >= (i11 = e40Var.f5) && i7 < e40Var.g5) {
                return ((Long) e40Var.y2.get(i7 - i11)).equals((Long) e40Var.R2.l.get(i10 - e40Var.G1.s));
            }
        }
        return false;
    }

    @Override // v4.o
    public final int d() {
        return this.b.G1.F;
    }

    @Override // v4.o
    public final int e() {
        return this.b.z2;
    }
}

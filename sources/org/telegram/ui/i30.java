package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i30 extends v4.o {
    public final /* synthetic */ f40 b;

    public i30(f40 f40Var) {
        this.b = f40Var;
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
        f40 f40Var = this.b;
        z30 z30Var = f40Var.J1;
        int i16 = z30Var.x;
        if (i16 >= 0) {
            int i17 = f40Var.b5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = z30Var.y;
        if (i18 >= 0) {
            int i19 = f40Var.o5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = z30Var.D;
        if (i20 >= 0) {
            int i21 = f40Var.p5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = z30Var.K;
        if (i22 >= 0) {
            int i23 = f40Var.a5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = z30Var.J;
        if (i24 >= 0) {
            int i25 = f40Var.n5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = z30Var.I;
        if (i26 >= 0 && i26 == i10 && i7 == f40Var.m5) {
            return true;
        }
        int i27 = f40Var.C2;
        if (i7 == i27 - 1 && i10 == z30Var.F - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != z30Var.F - 1) {
            if (i10 >= z30Var.G && i10 < z30Var.H && i7 >= (i15 = f40Var.k5) && i7 < f40Var.l5) {
                return ((org.telegram.messenger.s3) f40Var.y2.get(i7 - i15)).equals((org.telegram.messenger.s3) f40Var.k2.get(i10 - f40Var.J1.G));
            }
            if (i10 >= z30Var.d && i10 < z30Var.e && i7 >= (i14 = f40Var.c5) && i7 < f40Var.d5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.x2.get(i7 - i14);
                return org.telegram.messenger.ij.B1(groupCallParticipant.peer) == org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) f40Var.U2.g.get(i10 - f40Var.J1.d)).peer) && (i7 == i10 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i10 >= z30Var.f && i10 < z30Var.h && i7 >= (i13 = f40Var.e5) && i7 < f40Var.f5) {
                return ((Long) f40Var.z2.get(i7 - i13)).equals((Long) f40Var.U2.j.get(i10 - f40Var.J1.f));
            }
            if (i10 >= z30Var.n && i10 < z30Var.r && i7 >= (i12 = f40Var.g5) && i7 < f40Var.h5) {
                return ((Long) f40Var.A2.get(i7 - i12)).equals((Long) f40Var.U2.m.get(i10 - f40Var.J1.n));
            }
            if (i10 >= z30Var.s && i10 < z30Var.w && i7 >= (i11 = f40Var.i5) && i7 < f40Var.j5) {
                return ((Long) f40Var.B2.get(i7 - i11)).equals((Long) f40Var.U2.l.get(i10 - f40Var.J1.s));
            }
        }
        return false;
    }

    @Override // v4.o
    public final int d() {
        return this.b.J1.F;
    }

    @Override // v4.o
    public final int e() {
        return this.b.C2;
    }
}

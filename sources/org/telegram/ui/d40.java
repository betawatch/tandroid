package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d40 extends s4.n {
    public final /* synthetic */ b50 b;

    public d40(b50 b50Var) {
        this.b = b50Var;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        b50 b50Var = this.b;
        v40 v40Var = b50Var.G1;
        int i17 = v40Var.x;
        if (i17 >= 0) {
            int i18 = b50Var.Y4;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = v40Var.y;
        if (i19 >= 0) {
            int i20 = b50Var.l5;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = v40Var.D;
        if (i21 >= 0) {
            int i22 = b50Var.m5;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = v40Var.K;
        if (i23 >= 0) {
            int i24 = b50Var.X4;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = v40Var.J;
        if (i25 >= 0) {
            int i26 = b50Var.k5;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = v40Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == b50Var.j5) {
            return true;
        }
        int i28 = b50Var.z2;
        if (i10 == i28 - 1 && i11 == v40Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != v40Var.F - 1) {
            if (i11 >= v40Var.G && i11 < v40Var.H && i10 >= (i16 = b50Var.h5) && i10 < b50Var.i5) {
                return ((org.telegram.messenger.v3) b50Var.v2.get(i10 - i16)).equals((org.telegram.messenger.v3) b50Var.h2.get(i11 - b50Var.G1.G));
            }
            if (i11 >= v40Var.d && i11 < v40Var.e && i10 >= (i15 = b50Var.Z4) && i10 < b50Var.a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) b50Var.u2.get(i10 - i15);
                return org.telegram.messenger.jj.C1(groupCallParticipant.peer) == org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) b50Var.R2.g.get(i11 - b50Var.G1.d)).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= v40Var.f && i11 < v40Var.h && i10 >= (i14 = b50Var.b5) && i10 < b50Var.c5) {
                return ((Long) b50Var.w2.get(i10 - i14)).equals((Long) b50Var.R2.j.get(i11 - b50Var.G1.f));
            }
            if (i11 >= v40Var.n && i11 < v40Var.r && i10 >= (i13 = b50Var.d5) && i10 < b50Var.e5) {
                return ((Long) b50Var.x2.get(i10 - i13)).equals((Long) b50Var.R2.m.get(i11 - b50Var.G1.n));
            }
            if (i11 >= v40Var.s && i11 < v40Var.w && i10 >= (i12 = b50Var.f5) && i10 < b50Var.g5) {
                return ((Long) b50Var.y2.get(i10 - i12)).equals((Long) b50Var.R2.l.get(i11 - b50Var.G1.s));
            }
        }
        return false;
    }

    @Override // s4.n
    public final int d() {
        return this.b.G1.F;
    }

    @Override // s4.n
    public final int e() {
        return this.b.z2;
    }
}

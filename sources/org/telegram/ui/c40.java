package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c40 extends s4.n {
    public final /* synthetic */ a50 b;

    public c40(a50 a50Var) {
        this.b = a50Var;
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
        a50 a50Var = this.b;
        u40 u40Var = a50Var.G1;
        int i17 = u40Var.x;
        if (i17 >= 0) {
            int i18 = a50Var.Y4;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = u40Var.y;
        if (i19 >= 0) {
            int i20 = a50Var.l5;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = u40Var.D;
        if (i21 >= 0) {
            int i22 = a50Var.m5;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = u40Var.K;
        if (i23 >= 0) {
            int i24 = a50Var.X4;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = u40Var.J;
        if (i25 >= 0) {
            int i26 = a50Var.k5;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = u40Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == a50Var.j5) {
            return true;
        }
        int i28 = a50Var.z2;
        if (i10 == i28 - 1 && i11 == u40Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != u40Var.F - 1) {
            if (i11 >= u40Var.G && i11 < u40Var.H && i10 >= (i16 = a50Var.h5) && i10 < a50Var.i5) {
                return ((org.telegram.messenger.v3) a50Var.v2.get(i10 - i16)).equals((org.telegram.messenger.v3) a50Var.h2.get(i11 - a50Var.G1.G));
            }
            if (i11 >= u40Var.d && i11 < u40Var.e && i10 >= (i15 = a50Var.Z4) && i10 < a50Var.a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) a50Var.u2.get(i10 - i15);
                return org.telegram.messenger.kj.C1(groupCallParticipant.peer) == org.telegram.messenger.kj.C1(((TLRPC.GroupCallParticipant) a50Var.R2.g.get(i11 - a50Var.G1.d)).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= u40Var.f && i11 < u40Var.h && i10 >= (i14 = a50Var.b5) && i10 < a50Var.c5) {
                return ((Long) a50Var.w2.get(i10 - i14)).equals((Long) a50Var.R2.j.get(i11 - a50Var.G1.f));
            }
            if (i11 >= u40Var.n && i11 < u40Var.r && i10 >= (i13 = a50Var.d5) && i10 < a50Var.e5) {
                return ((Long) a50Var.x2.get(i10 - i13)).equals((Long) a50Var.R2.m.get(i11 - a50Var.G1.n));
            }
            if (i11 >= u40Var.s && i11 < u40Var.w && i10 >= (i12 = a50Var.f5) && i10 < a50Var.g5) {
                return ((Long) a50Var.y2.get(i10 - i12)).equals((Long) a50Var.R2.l.get(i11 - a50Var.G1.s));
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

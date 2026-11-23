package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h30 extends v4.p {
    public final /* synthetic */ e40 b;

    public h30(e40 e40Var) {
        this.b = e40Var;
    }

    @Override // v4.p
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override // v4.p
    public final boolean b(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        e40 e40Var = this.b;
        y30 y30Var = e40Var.K1;
        int i16 = y30Var.x;
        if (i16 >= 0) {
            int i17 = e40Var.g5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = y30Var.y;
        if (i18 >= 0) {
            int i19 = e40Var.t5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = y30Var.E;
        if (i20 >= 0) {
            int i21 = e40Var.u5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = y30Var.L;
        if (i22 >= 0) {
            int i23 = e40Var.f5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = y30Var.K;
        if (i24 >= 0) {
            int i25 = e40Var.s5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = y30Var.J;
        if (i26 >= 0 && i26 == i10 && i7 == e40Var.r5) {
            return true;
        }
        int i27 = e40Var.D2;
        if (i7 == i27 - 1 && i10 == y30Var.G - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != y30Var.G - 1) {
            if (i10 >= y30Var.H && i10 < y30Var.I && i7 >= (i15 = e40Var.p5) && i7 < e40Var.q5) {
                return ((org.telegram.messenger.u3) e40Var.z2.get(i7 - i15)).equals((org.telegram.messenger.u3) e40Var.l2.get(i10 - e40Var.K1.H));
            }
            if (i10 >= y30Var.d && i10 < y30Var.e && i7 >= (i14 = e40Var.h5) && i7 < e40Var.i5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.y2.get(i7 - i14);
                return org.telegram.messenger.fj.B1(groupCallParticipant.peer) == org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) e40Var.V2.g.get(i10 - e40Var.K1.d)).peer) && (i7 == i10 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i10 >= y30Var.f && i10 < y30Var.h && i7 >= (i13 = e40Var.j5) && i7 < e40Var.k5) {
                return ((Long) e40Var.A2.get(i7 - i13)).equals((Long) e40Var.V2.j.get(i10 - e40Var.K1.f));
            }
            if (i10 >= y30Var.n && i10 < y30Var.r && i7 >= (i12 = e40Var.l5) && i7 < e40Var.m5) {
                return ((Long) e40Var.B2.get(i7 - i12)).equals((Long) e40Var.V2.m.get(i10 - e40Var.K1.n));
            }
            if (i10 >= y30Var.s && i10 < y30Var.w && i7 >= (i11 = e40Var.n5) && i7 < e40Var.o5) {
                return ((Long) e40Var.C2.get(i7 - i11)).equals((Long) e40Var.V2.l.get(i10 - e40Var.K1.s));
            }
        }
        return false;
    }

    @Override // v4.p
    public final int d() {
        return this.b.K1.G;
    }

    @Override // v4.p
    public final int e() {
        return this.b.D2;
    }
}

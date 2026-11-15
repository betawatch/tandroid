package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f30 extends v4.o {
    public final /* synthetic */ c40 b;

    public f30(c40 c40Var) {
        this.b = c40Var;
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
        c40 c40Var = this.b;
        w30 w30Var = c40Var.K1;
        int i16 = w30Var.x;
        if (i16 >= 0) {
            int i17 = c40Var.g5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = w30Var.y;
        if (i18 >= 0) {
            int i19 = c40Var.t5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = w30Var.E;
        if (i20 >= 0) {
            int i21 = c40Var.u5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = w30Var.L;
        if (i22 >= 0) {
            int i23 = c40Var.f5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = w30Var.K;
        if (i24 >= 0) {
            int i25 = c40Var.s5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = w30Var.J;
        if (i26 >= 0 && i26 == i10 && i7 == c40Var.r5) {
            return true;
        }
        int i27 = c40Var.D2;
        if (i7 == i27 - 1 && i10 == w30Var.G - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != w30Var.G - 1) {
            if (i10 >= w30Var.H && i10 < w30Var.I && i7 >= (i15 = c40Var.p5) && i7 < c40Var.q5) {
                return ((org.telegram.messenger.s3) c40Var.z2.get(i7 - i15)).equals((org.telegram.messenger.s3) c40Var.l2.get(i10 - c40Var.K1.H));
            }
            if (i10 >= w30Var.d && i10 < w30Var.e && i7 >= (i14 = c40Var.h5) && i7 < c40Var.i5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.y2.get(i7 - i14);
                return org.telegram.messenger.gj.B1(groupCallParticipant.peer) == org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) c40Var.V2.g.get(i10 - c40Var.K1.d)).peer) && (i7 == i10 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i10 >= w30Var.f && i10 < w30Var.h && i7 >= (i13 = c40Var.j5) && i7 < c40Var.k5) {
                return ((Long) c40Var.A2.get(i7 - i13)).equals((Long) c40Var.V2.j.get(i10 - c40Var.K1.f));
            }
            if (i10 >= w30Var.n && i10 < w30Var.r && i7 >= (i12 = c40Var.l5) && i7 < c40Var.m5) {
                return ((Long) c40Var.B2.get(i7 - i12)).equals((Long) c40Var.V2.m.get(i10 - c40Var.K1.n));
            }
            if (i10 >= w30Var.s && i10 < w30Var.w && i7 >= (i11 = c40Var.n5) && i7 < c40Var.o5) {
                return ((Long) c40Var.C2.get(i7 - i11)).equals((Long) c40Var.V2.l.get(i10 - c40Var.K1.s));
            }
        }
        return false;
    }

    @Override // v4.o
    public final int d() {
        return this.b.K1.G;
    }

    @Override // v4.o
    public final int e() {
        return this.b.D2;
    }
}

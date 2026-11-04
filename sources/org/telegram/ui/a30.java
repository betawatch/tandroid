package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a30 extends u4.o {
    public final /* synthetic */ x30 b;

    public a30(x30 x30Var) {
        this.b = x30Var;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return true;
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        x30 x30Var = this.b;
        r30 r30Var = x30Var.H1;
        int i16 = r30Var.x;
        if (i16 >= 0) {
            int i17 = x30Var.Z4;
            if (i3 == i17 && i10 == i16) {
                return true;
            }
            if ((i3 == i17 && i10 != i16) || (i3 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = r30Var.y;
        if (i18 >= 0) {
            int i19 = x30Var.m5;
            if (i3 == i19 && i10 == i18) {
                return true;
            }
            if ((i3 == i19 && i10 != i18) || (i3 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = r30Var.E;
        if (i20 >= 0) {
            int i21 = x30Var.n5;
            if (i3 == i21 && i10 == i20) {
                return true;
            }
            if ((i3 == i21 && i10 != i20) || (i3 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = r30Var.L;
        if (i22 >= 0) {
            int i23 = x30Var.Y4;
            if (i3 == i23 && i10 == i22) {
                return true;
            }
            if ((i3 == i23 && i10 != i22) || (i3 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = r30Var.K;
        if (i24 >= 0) {
            int i25 = x30Var.l5;
            if (i3 == i25 && i10 == i24) {
                return true;
            }
            if ((i3 == i25 && i10 != i24) || (i3 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = r30Var.J;
        if (i26 >= 0 && i26 == i10 && i3 == x30Var.k5) {
            return true;
        }
        int i27 = x30Var.A2;
        if (i3 == i27 - 1 && i10 == r30Var.G - 1) {
            return true;
        }
        if (i3 != i27 - 1 && i10 != r30Var.G - 1) {
            if (i10 >= r30Var.H && i10 < r30Var.I && i3 >= (i15 = x30Var.i5) && i3 < x30Var.j5) {
                return ((org.telegram.messenger.s3) x30Var.w2.get(i3 - i15)).equals((org.telegram.messenger.s3) x30Var.i2.get(i10 - x30Var.H1.H));
            }
            if (i10 >= r30Var.d && i10 < r30Var.e && i3 >= (i14 = x30Var.a5) && i3 < x30Var.b5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) x30Var.v2.get(i3 - i14);
                return org.telegram.messenger.zi.C1(groupCallParticipant.peer) == org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) x30Var.S2.g.get(i10 - x30Var.H1.d)).peer) && (i3 == i10 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i10 >= r30Var.f && i10 < r30Var.h && i3 >= (i13 = x30Var.c5) && i3 < x30Var.d5) {
                return ((Long) x30Var.x2.get(i3 - i13)).equals((Long) x30Var.S2.j.get(i10 - x30Var.H1.f));
            }
            if (i10 >= r30Var.n && i10 < r30Var.r && i3 >= (i12 = x30Var.e5) && i3 < x30Var.f5) {
                return ((Long) x30Var.y2.get(i3 - i12)).equals((Long) x30Var.S2.m.get(i10 - x30Var.H1.n));
            }
            if (i10 >= r30Var.s && i10 < r30Var.w && i3 >= (i11 = x30Var.g5) && i3 < x30Var.h5) {
                return ((Long) x30Var.z2.get(i3 - i11)).equals((Long) x30Var.S2.l.get(i10 - x30Var.H1.s));
            }
        }
        return false;
    }

    @Override // u4.o
    public final int d() {
        return this.b.H1.G;
    }

    @Override // u4.o
    public final int e() {
        return this.b.A2;
    }
}

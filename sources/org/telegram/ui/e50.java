package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e50 extends f2.q {
    public final /* synthetic */ c60 b;

    public e50(c60 c60Var) {
        this.b = c60Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c60 c60Var = this.b;
        w50 w50Var = c60Var.M;
        int i17 = w50Var.w;
        if (i17 >= 0) {
            int i18 = c60Var.e3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = w50Var.x;
        if (i19 >= 0) {
            int i20 = c60Var.r3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = w50Var.y;
        if (i21 >= 0) {
            int i22 = c60Var.s3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = w50Var.H;
        if (i23 >= 0) {
            int i24 = c60Var.d3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = w50Var.G;
        if (i25 >= 0) {
            int i26 = c60Var.q3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = w50Var.F;
        if (i27 >= 0 && i27 == i11 && i10 == c60Var.p3) {
            return true;
        }
        int i28 = c60Var.F0;
        if (i10 == i28 - 1 && i11 == w50Var.C - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != w50Var.C - 1) {
            if (i11 >= w50Var.D && i11 < w50Var.E && i10 >= (i16 = c60Var.n3) && i10 < c60Var.o3) {
                return ((ChatObject.VideoParticipant) c60Var.B0.get(i10 - i16)).equals((ChatObject.VideoParticipant) c60Var.n0.get(i11 - c60Var.M.D));
            }
            if (i11 >= w50Var.d && i11 < w50Var.e && i10 >= (i15 = c60Var.f3) && i10 < c60Var.g3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c60Var.A0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(c60Var.X0.visibleParticipants.get(i11 - c60Var.M.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= w50Var.f && i11 < w50Var.h && i10 >= (i14 = c60Var.h3) && i10 < c60Var.i3) {
                return ((Long) c60Var.C0.get(i10 - i14)).equals(c60Var.X0.invitedUsers.get(i11 - c60Var.M.f));
            }
            if (i11 >= w50Var.n && i11 < w50Var.r && i10 >= (i13 = c60Var.j3) && i10 < c60Var.k3) {
                return ((Long) c60Var.D0.get(i10 - i13)).equals(c60Var.X0.shadyJoinParticipants.get(i11 - c60Var.M.n));
            }
            if (i11 >= w50Var.s && i11 < w50Var.v && i10 >= (i12 = c60Var.l3) && i10 < c60Var.m3) {
                return ((Long) c60Var.E0.get(i10 - i12)).equals(c60Var.X0.shadyLeftParticipants.get(i11 - c60Var.M.s));
            }
        }
        return false;
    }

    @Override // f2.q
    public final int d() {
        return this.b.M.C;
    }

    @Override // f2.q
    public final int e() {
        return this.b.F0;
    }
}

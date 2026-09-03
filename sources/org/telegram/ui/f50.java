package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f50 extends f2.q {
    public final /* synthetic */ d60 b;

    public f50(d60 d60Var) {
        this.b = d60Var;
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
        d60 d60Var = this.b;
        x50 x50Var = d60Var.M;
        int i17 = x50Var.w;
        if (i17 >= 0) {
            int i18 = d60Var.e3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = x50Var.x;
        if (i19 >= 0) {
            int i20 = d60Var.r3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = x50Var.y;
        if (i21 >= 0) {
            int i22 = d60Var.s3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = x50Var.H;
        if (i23 >= 0) {
            int i24 = d60Var.d3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = x50Var.G;
        if (i25 >= 0) {
            int i26 = d60Var.q3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = x50Var.F;
        if (i27 >= 0 && i27 == i11 && i10 == d60Var.p3) {
            return true;
        }
        int i28 = d60Var.F0;
        if (i10 == i28 - 1 && i11 == x50Var.C - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != x50Var.C - 1) {
            if (i11 >= x50Var.D && i11 < x50Var.E && i10 >= (i16 = d60Var.n3) && i10 < d60Var.o3) {
                return ((ChatObject.VideoParticipant) d60Var.B0.get(i10 - i16)).equals((ChatObject.VideoParticipant) d60Var.n0.get(i11 - d60Var.M.D));
            }
            if (i11 >= x50Var.d && i11 < x50Var.e && i10 >= (i15 = d60Var.f3) && i10 < d60Var.g3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) d60Var.A0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(d60Var.X0.visibleParticipants.get(i11 - d60Var.M.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= x50Var.f && i11 < x50Var.h && i10 >= (i14 = d60Var.h3) && i10 < d60Var.i3) {
                return ((Long) d60Var.C0.get(i10 - i14)).equals(d60Var.X0.invitedUsers.get(i11 - d60Var.M.f));
            }
            if (i11 >= x50Var.n && i11 < x50Var.r && i10 >= (i13 = d60Var.j3) && i10 < d60Var.k3) {
                return ((Long) d60Var.D0.get(i10 - i13)).equals(d60Var.X0.shadyJoinParticipants.get(i11 - d60Var.M.n));
            }
            if (i11 >= x50Var.s && i11 < x50Var.v && i10 >= (i12 = d60Var.l3) && i10 < d60Var.m3) {
                return ((Long) d60Var.E0.get(i10 - i12)).equals(d60Var.X0.shadyLeftParticipants.get(i11 - d60Var.M.s));
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

package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class e50 extends s4.o {
    public final /* synthetic */ d60 b;

    public e50(d60 d60Var) {
        this.b = d60Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        d60 d60Var = this.b;
        x50 x50Var = d60Var.P;
        int i17 = x50Var.w;
        if (i17 >= 0) {
            int i18 = d60Var.h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = x50Var.x;
        if (i19 >= 0) {
            int i20 = d60Var.u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = x50Var.y;
        if (i21 >= 0) {
            int i22 = d60Var.v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = x50Var.K;
        if (i23 >= 0) {
            int i24 = d60Var.g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = x50Var.J;
        if (i25 >= 0) {
            int i26 = d60Var.t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = x50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == d60Var.s3) {
            return true;
        }
        int i28 = d60Var.I0;
        if (i10 == i28 - 1 && i11 == x50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != x50Var.F - 1) {
            if (i11 >= x50Var.G && i11 < x50Var.H && i10 >= (i16 = d60Var.q3) && i10 < d60Var.r3) {
                return ((ChatObject.VideoParticipant) d60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) d60Var.q0.get(i11 - d60Var.P.G));
            }
            if (i11 >= x50Var.d && i11 < x50Var.e && i10 >= (i15 = d60Var.i3) && i10 < d60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) d60Var.D0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(d60Var.a1.visibleParticipants.get(i11 - d60Var.P.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= x50Var.f && i11 < x50Var.h && i10 >= (i14 = d60Var.k3) && i10 < d60Var.l3) {
                return ((Long) d60Var.F0.get(i10 - i14)).equals(d60Var.a1.invitedUsers.get(i11 - d60Var.P.f));
            }
            if (i11 >= x50Var.n && i11 < x50Var.r && i10 >= (i13 = d60Var.m3) && i10 < d60Var.n3) {
                return ((Long) d60Var.G0.get(i10 - i13)).equals(d60Var.a1.shadyJoinParticipants.get(i11 - d60Var.P.n));
            }
            if (i11 >= x50Var.s && i11 < x50Var.v && i10 >= (i12 = d60Var.o3) && i10 < d60Var.p3) {
                return ((Long) d60Var.H0.get(i10 - i12)).equals(d60Var.a1.shadyLeftParticipants.get(i11 - d60Var.P.s));
            }
        }
        return false;
    }

    @Override // s4.o
    public final int d() {
        return this.b.P.F;
    }

    @Override // s4.o
    public final int e() {
        return this.b.I0;
    }
}

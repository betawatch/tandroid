package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l50 extends s4.o {
    public final /* synthetic */ k60 b;

    public l50(k60 k60Var) {
        this.b = k60Var;
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
        k60 k60Var = this.b;
        e60 e60Var = k60Var.P;
        int i17 = e60Var.w;
        if (i17 >= 0) {
            int i18 = k60Var.h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = e60Var.x;
        if (i19 >= 0) {
            int i20 = k60Var.u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = e60Var.y;
        if (i21 >= 0) {
            int i22 = k60Var.v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = e60Var.K;
        if (i23 >= 0) {
            int i24 = k60Var.g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = e60Var.J;
        if (i25 >= 0) {
            int i26 = k60Var.t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = e60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == k60Var.s3) {
            return true;
        }
        int i28 = k60Var.I0;
        if (i10 == i28 - 1 && i11 == e60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != e60Var.F - 1) {
            if (i11 >= e60Var.G && i11 < e60Var.H && i10 >= (i16 = k60Var.q3) && i10 < k60Var.r3) {
                return ((ChatObject.VideoParticipant) k60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) k60Var.q0.get(i11 - k60Var.P.G));
            }
            if (i11 >= e60Var.d && i11 < e60Var.e && i10 >= (i15 = k60Var.i3) && i10 < k60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) k60Var.D0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(k60Var.a1.visibleParticipants.get(i11 - k60Var.P.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= e60Var.f && i11 < e60Var.h && i10 >= (i14 = k60Var.k3) && i10 < k60Var.l3) {
                return ((Long) k60Var.F0.get(i10 - i14)).equals(k60Var.a1.invitedUsers.get(i11 - k60Var.P.f));
            }
            if (i11 >= e60Var.n && i11 < e60Var.r && i10 >= (i13 = k60Var.m3) && i10 < k60Var.n3) {
                return ((Long) k60Var.G0.get(i10 - i13)).equals(k60Var.a1.shadyJoinParticipants.get(i11 - k60Var.P.n));
            }
            if (i11 >= e60Var.s && i11 < e60Var.v && i10 >= (i12 = k60Var.o3) && i10 < k60Var.p3) {
                return ((Long) k60Var.H0.get(i10 - i12)).equals(k60Var.a1.shadyLeftParticipants.get(i11 - k60Var.P.s));
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

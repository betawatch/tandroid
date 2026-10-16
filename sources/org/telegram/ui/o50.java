package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o50 extends s4.o {
    public final /* synthetic */ n60 b;

    public o50(n60 n60Var) {
        this.b = n60Var;
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
        n60 n60Var = this.b;
        h60 h60Var = n60Var.P;
        int i17 = h60Var.w;
        if (i17 >= 0) {
            int i18 = n60Var.h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = h60Var.x;
        if (i19 >= 0) {
            int i20 = n60Var.u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = h60Var.y;
        if (i21 >= 0) {
            int i22 = n60Var.v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = h60Var.K;
        if (i23 >= 0) {
            int i24 = n60Var.g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = h60Var.J;
        if (i25 >= 0) {
            int i26 = n60Var.t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = h60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == n60Var.s3) {
            return true;
        }
        int i28 = n60Var.I0;
        if (i10 == i28 - 1 && i11 == h60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != h60Var.F - 1) {
            if (i11 >= h60Var.G && i11 < h60Var.H && i10 >= (i16 = n60Var.q3) && i10 < n60Var.r3) {
                return ((ChatObject.VideoParticipant) n60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) n60Var.q0.get(i11 - n60Var.P.G));
            }
            if (i11 >= h60Var.d && i11 < h60Var.e && i10 >= (i15 = n60Var.i3) && i10 < n60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) n60Var.D0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(n60Var.a1.visibleParticipants.get(i11 - n60Var.P.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= h60Var.f && i11 < h60Var.h && i10 >= (i14 = n60Var.k3) && i10 < n60Var.l3) {
                return ((Long) n60Var.F0.get(i10 - i14)).equals(n60Var.a1.invitedUsers.get(i11 - n60Var.P.f));
            }
            if (i11 >= h60Var.n && i11 < h60Var.r && i10 >= (i13 = n60Var.m3) && i10 < n60Var.n3) {
                return ((Long) n60Var.G0.get(i10 - i13)).equals(n60Var.a1.shadyJoinParticipants.get(i11 - n60Var.P.n));
            }
            if (i11 >= h60Var.s && i11 < h60Var.v && i10 >= (i12 = n60Var.o3) && i10 < n60Var.p3) {
                return ((Long) n60Var.H0.get(i10 - i12)).equals(n60Var.a1.shadyLeftParticipants.get(i11 - n60Var.P.s));
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

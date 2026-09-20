package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j50 extends s4.o {
    public final /* synthetic */ i60 b;

    public j50(i60 i60Var) {
        this.b = i60Var;
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
        i60 i60Var = this.b;
        c60 c60Var = i60Var.P;
        int i17 = c60Var.w;
        if (i17 >= 0) {
            int i18 = i60Var.h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = c60Var.x;
        if (i19 >= 0) {
            int i20 = i60Var.u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = c60Var.y;
        if (i21 >= 0) {
            int i22 = i60Var.v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = c60Var.K;
        if (i23 >= 0) {
            int i24 = i60Var.g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = c60Var.J;
        if (i25 >= 0) {
            int i26 = i60Var.t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = c60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == i60Var.s3) {
            return true;
        }
        int i28 = i60Var.I0;
        if (i10 == i28 - 1 && i11 == c60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != c60Var.F - 1) {
            if (i11 >= c60Var.G && i11 < c60Var.H && i10 >= (i16 = i60Var.q3) && i10 < i60Var.r3) {
                return ((ChatObject.VideoParticipant) i60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) i60Var.q0.get(i11 - i60Var.P.G));
            }
            if (i11 >= c60Var.d && i11 < c60Var.e && i10 >= (i15 = i60Var.i3) && i10 < i60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) i60Var.D0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(i60Var.a1.visibleParticipants.get(i11 - i60Var.P.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= c60Var.f && i11 < c60Var.h && i10 >= (i14 = i60Var.k3) && i10 < i60Var.l3) {
                return ((Long) i60Var.F0.get(i10 - i14)).equals(i60Var.a1.invitedUsers.get(i11 - i60Var.P.f));
            }
            if (i11 >= c60Var.n && i11 < c60Var.r && i10 >= (i13 = i60Var.m3) && i10 < i60Var.n3) {
                return ((Long) i60Var.G0.get(i10 - i13)).equals(i60Var.a1.shadyJoinParticipants.get(i11 - i60Var.P.n));
            }
            if (i11 >= c60Var.s && i11 < c60Var.v && i10 >= (i12 = i60Var.o3) && i10 < i60Var.p3) {
                return ((Long) i60Var.H0.get(i10 - i12)).equals(i60Var.a1.shadyLeftParticipants.get(i11 - i60Var.P.s));
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

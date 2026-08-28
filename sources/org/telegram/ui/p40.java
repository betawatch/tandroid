package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p40 extends f2.s {
    public final /* synthetic */ o50 b;

    public p40(o50 o50Var) {
        this.b = o50Var;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        o50 o50Var = this.b;
        i50 i50Var = o50Var.L;
        int i16 = i50Var.w;
        if (i16 >= 0) {
            int i17 = o50Var.d3;
            if (i9 == i17 && i10 == i16) {
                return true;
            }
            if ((i9 == i17 && i10 != i16) || (i9 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = i50Var.x;
        if (i18 >= 0) {
            int i19 = o50Var.q3;
            if (i9 == i19 && i10 == i18) {
                return true;
            }
            if ((i9 == i19 && i10 != i18) || (i9 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = i50Var.y;
        if (i20 >= 0) {
            int i21 = o50Var.r3;
            if (i9 == i21 && i10 == i20) {
                return true;
            }
            if ((i9 == i21 && i10 != i20) || (i9 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = i50Var.G;
        if (i22 >= 0) {
            int i23 = o50Var.c3;
            if (i9 == i23 && i10 == i22) {
                return true;
            }
            if ((i9 == i23 && i10 != i22) || (i9 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = i50Var.F;
        if (i24 >= 0) {
            int i25 = o50Var.p3;
            if (i9 == i25 && i10 == i24) {
                return true;
            }
            if ((i9 == i25 && i10 != i24) || (i9 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = i50Var.E;
        if (i26 >= 0 && i26 == i10 && i9 == o50Var.o3) {
            return true;
        }
        int i27 = o50Var.E0;
        if (i9 == i27 - 1 && i10 == i50Var.B - 1) {
            return true;
        }
        if (i9 != i27 - 1 && i10 != i50Var.B - 1) {
            if (i10 >= i50Var.C && i10 < i50Var.D && i9 >= (i15 = o50Var.m3) && i9 < o50Var.n3) {
                return ((ChatObject.VideoParticipant) o50Var.A0.get(i9 - i15)).equals((ChatObject.VideoParticipant) o50Var.m0.get(i10 - o50Var.L.C));
            }
            if (i10 >= i50Var.d && i10 < i50Var.e && i9 >= (i14 = o50Var.e3) && i9 < o50Var.f3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) o50Var.z0.get(i9 - i14);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(o50Var.W0.visibleParticipants.get(i10 - o50Var.L.d).peer) && (i9 == i10 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i10 >= i50Var.f && i10 < i50Var.h && i9 >= (i13 = o50Var.g3) && i9 < o50Var.h3) {
                return ((Long) o50Var.B0.get(i9 - i13)).equals(o50Var.W0.invitedUsers.get(i10 - o50Var.L.f));
            }
            if (i10 >= i50Var.n && i10 < i50Var.r && i9 >= (i12 = o50Var.i3) && i9 < o50Var.j3) {
                return ((Long) o50Var.C0.get(i9 - i12)).equals(o50Var.W0.shadyJoinParticipants.get(i10 - o50Var.L.n));
            }
            if (i10 >= i50Var.s && i10 < i50Var.v && i9 >= (i11 = o50Var.k3) && i9 < o50Var.l3) {
                return ((Long) o50Var.D0.get(i9 - i11)).equals(o50Var.W0.shadyLeftParticipants.get(i10 - o50Var.L.s));
            }
        }
        return false;
    }

    @Override // f2.s
    public final int d() {
        return this.b.L.B;
    }

    @Override // f2.s
    public final int e() {
        return this.b.E0;
    }
}

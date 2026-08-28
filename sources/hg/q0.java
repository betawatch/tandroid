package hg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q0 extends p0 {
    public final /* synthetic */ s0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, p0 p0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(p0Var, s0Var.n, s0Var.z, reactionCount, z10, z11, s0Var.B);
        this.h0 = s0Var;
    }

    @Override // hg.p0
    public final float k() {
        return this.h0.a;
    }

    @Override // hg.p0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // hg.p0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // hg.p0
    public final boolean n() {
        s0 s0Var = this.h0;
        int id2 = s0Var.A.getId();
        long groupId = s0Var.A.getGroupId();
        n0 n0Var = n0.B;
        if (n0Var == null) {
            return false;
        }
        int i9 = n0Var.a;
        if (i9 != 2 && i9 != 0) {
            return false;
        }
        long j10 = n0Var.o;
        return ((j10 != 0 && groupId == j10) || id2 == n0Var.n) && n0Var.p.equals(this.s);
    }

    @Override // hg.p0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}

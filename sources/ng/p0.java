package ng;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p0 extends o0 {
    public final /* synthetic */ r0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, o0 o0Var, TLRPC.ReactionCount reactionCount, boolean z4, boolean z10) {
        super(o0Var, r0Var.n, r0Var.z, reactionCount, z4, z10, r0Var.B);
        this.h0 = r0Var;
    }

    @Override // ng.o0
    public final float k() {
        return this.h0.a;
    }

    @Override // ng.o0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // ng.o0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // ng.o0
    public final boolean n() {
        r0 r0Var = this.h0;
        int id2 = r0Var.A.getId();
        long groupId = r0Var.A.getGroupId();
        m0 m0Var = m0.B;
        if (m0Var == null) {
            return false;
        }
        int i10 = m0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j10 = m0Var.o;
        return ((j10 != 0 && groupId == j10) || id2 == m0Var.n) && m0Var.p.equals(this.s);
    }

    @Override // ng.o0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}

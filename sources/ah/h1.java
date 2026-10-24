package ah;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h1 extends g1 {
    public final /* synthetic */ j1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, g1 g1Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(g1Var, j1Var.n, j1Var.z, reactionCount, z10, z11, j1Var.B);
        this.h0 = j1Var;
    }

    @Override // ah.g1
    public final float k() {
        return this.h0.a;
    }

    @Override // ah.g1
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // ah.g1
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // ah.g1
    public final boolean n() {
        j1 j1Var = this.h0;
        int id2 = j1Var.A.getId();
        long groupId = j1Var.A.getGroupId();
        d1 d1Var = d1.B;
        if (d1Var == null) {
            return false;
        }
        int i10 = d1Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j10 = d1Var.o;
        return ((j10 != 0 && groupId == j10) || id2 == d1Var.n) && d1Var.p.equals(this.s);
    }

    @Override // ah.g1
    public final void o() {
        this.h0.H.remove(this.s);
    }
}

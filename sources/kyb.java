// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kyb {
    public TLRPC.TL_forumTopic a;
    public vr9 b;
    public final /* synthetic */ oyb c;

    public kyb(oyb oybVar) {
        this.c = oybVar;
    }

    public final long a() {
        vr9 vr9Var = this.b;
        if (vr9Var != null) {
            return vr9Var.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        int i = oyb.r0;
        return this.c.c ? pg3.n(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}

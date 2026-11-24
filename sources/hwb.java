// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hwb {
    public TLRPC.TL_forumTopic a;
    public up9 b;
    public final /* synthetic */ lwb c;

    public hwb(lwb lwbVar) {
        this.c = lwbVar;
    }

    public final long a() {
        up9 up9Var = this.b;
        if (up9Var != null) {
            return up9Var.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        int i = lwb.r0;
        return this.c.c ? cf3.n(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}

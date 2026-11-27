// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j0c {
    public TLRPC.TL_forumTopic a;
    public mt9 b;
    public final /* synthetic */ n0c c;

    public j0c(n0c n0cVar) {
        this.c = n0cVar;
    }

    public final long a() {
        mt9 mt9Var = this.b;
        if (mt9Var != null) {
            return mt9Var.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        int i = n0c.r0;
        return this.c.c ? wf3.n(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}

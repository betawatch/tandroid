// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

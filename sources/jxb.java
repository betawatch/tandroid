// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jxb extends ja {
    public final TLRPC.TL_forumTopic c;

    public jxb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jxb.class == obj.getClass()) {
            jxb jxbVar = (jxb) obj;
            int i = this.a;
            if (i == jxbVar.a && i == 0 && this.c.id == jxbVar.c.id) {
                return true;
            }
        }
        return false;
    }
}

// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kzb extends ka {
    public final TLRPC.TL_forumTopic c;

    public kzb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kzb.class == obj.getClass()) {
            kzb kzbVar = (kzb) obj;
            int i = this.a;
            if (i == kzbVar.a && i == 0 && this.c.id == kzbVar.c.id) {
                return true;
            }
        }
        return false;
    }
}

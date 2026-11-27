// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

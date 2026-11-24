// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ivb extends ja {
    public final TLRPC.TL_forumTopic c;

    public ivb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ivb.class == obj.getClass()) {
            ivb ivbVar = (ivb) obj;
            int i = this.a;
            if (i == ivbVar.a && i == 0 && this.c.id == ivbVar.c.id) {
                return true;
            }
        }
        return false;
    }
}

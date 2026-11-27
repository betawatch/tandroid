// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gf7 {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public gf7(long j, TLRPC.Message message, TLRPC.Message message2) {
        this.a = r47.Q1(j, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}

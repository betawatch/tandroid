// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hf7 {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public hf7(long j, TLRPC.Message message, TLRPC.Message message2) {
        this.a = r47.Q1(j, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}

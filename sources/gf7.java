// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

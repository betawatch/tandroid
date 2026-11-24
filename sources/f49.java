// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f49 {
    public final int a;
    public final TLRPC.InputPeer b;
    public final int c;
    public final byte[] d;
    public final pp8 e;
    public final qac f;
    public String g;
    public boolean h;
    public boolean i;
    public final ArrayList j = new ArrayList();

    public f49(int i, TLRPC.InputPeer inputPeer, int i2, byte[] bArr, pp8 pp8Var, qac qacVar) {
        this.a = i;
        this.b = inputPeer;
        this.c = i2;
        this.d = bArr;
        this.e = pp8Var;
        this.f = qacVar;
    }

    public final void a() {
        if (this.h || this.i) {
            return;
        }
        byte b = 1;
        this.i = true;
        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
        String str = this.g;
        tL_messages_getPollVotes.limit = str != null ? 10 : 15;
        tL_messages_getPollVotes.peer = this.b;
        tL_messages_getPollVotes.id = this.c;
        tL_messages_getPollVotes.option = this.d;
        tL_messages_getPollVotes.offset = str;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getPollVotes, new kc((byte) 0), new a49(this, b));
    }
}

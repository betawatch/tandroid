// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ep6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ TLRPC.messages_Messages c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ep6(hs6 hs6Var, TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = messages_messages;
        this.d = i;
        this.e = j;
        this.f = arrayList;
        this.h = i2;
        this.n = i3;
        this.r = z;
        this.s = i4;
        this.w = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gm.c3(new ep6(this.b, this.c, this.d ? 1 : 0, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                break;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i = messages_messages.count;
                hs6 hs6Var = this.b;
                oc7 messagesController = hs6Var.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                boolean z = this.d;
                messagesController.d4(arrayList, z);
                hs6Var.getMessagesController().X3(messages_messages.chats, z);
                hs6Var.getNotificationCenter().k(33, Long.valueOf(this.e), Integer.valueOf(i), this.f, Integer.valueOf(this.h), Integer.valueOf(this.n), Boolean.valueOf(this.r), Boolean.valueOf(this.s != 0), Integer.valueOf(this.w));
                break;
        }
    }
}

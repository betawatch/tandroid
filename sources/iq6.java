// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
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
    public /* synthetic */ iq6(ls6 ls6Var, TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5, byte b) {
        this.a = b;
        this.b = ls6Var;
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
                hl.c3(new iq6(this.b, this.c, this.d ? 1 : 0, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                break;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i = messages_messages.count;
                ls6 ls6Var = this.b;
                uc7 messagesController = ls6Var.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                boolean z = this.d;
                messagesController.j4(arrayList, z);
                ls6Var.getMessagesController().c4(messages_messages.chats, z);
                ls6Var.getNotificationCenter().k(33, Long.valueOf(this.e), Integer.valueOf(i), this.f, Integer.valueOf(this.h), Integer.valueOf(this.n), Boolean.valueOf(this.r), Boolean.valueOf(this.s != 0), Integer.valueOf(this.w));
                break;
        }
    }
}

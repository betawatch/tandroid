// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class en6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
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
    public /* synthetic */ en6(hq6 hq6Var, TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5, byte b) {
        this.a = b;
        this.b = hq6Var;
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
                gl.d3(new en6(this.b, this.c, this.d ? 1 : 0, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                break;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i = messages_messages.count;
                hq6 hq6Var = this.b;
                na7 messagesController = hq6Var.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                boolean z = this.d;
                messagesController.a4(arrayList, z);
                hq6Var.getMessagesController().U3(messages_messages.chats, z);
                hq6Var.getNotificationCenter().k(32, Long.valueOf(this.e), Integer.valueOf(i), this.f, Integer.valueOf(this.h), Integer.valueOf(this.n), Boolean.valueOf(this.r), Boolean.valueOf(this.s != 0), Integer.valueOf(this.w));
                break;
        }
    }
}

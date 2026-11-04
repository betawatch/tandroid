package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ TLRPC.messages_Messages c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int w;

    public /* synthetic */ gf(li liVar, TLRPC.messages_Messages messages_messages, int i3, long j10, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.a = i14;
        this.b = liVar;
        this.c = messages_messages;
        this.d = i3;
        this.e = j10;
        this.f = arrayList;
        this.h = i10;
        this.n = i11;
        this.r = z10;
        this.s = i12;
        this.w = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new gf(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i3 = messages_messages.count;
                li liVar = this.b;
                hp messagesController = liVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                messagesController.Y3(arrayList, i10 != 0);
                liVar.getMessagesController().S3(messages_messages.chats, i10 != 0);
                liVar.getNotificationCenter().k(32, Long.valueOf(this.e), Integer.valueOf(i3), this.f, Integer.valueOf(this.h), Integer.valueOf(this.n), Boolean.valueOf(this.r), Boolean.valueOf(this.s != 0), Integer.valueOf(this.w));
                break;
        }
    }
}

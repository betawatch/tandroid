package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class pf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ TLRPC.messages_Messages c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int w;

    public /* synthetic */ pf(ui uiVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z9, int i12, int i13, int i14) {
        this.a = i14;
        this.b = uiVar;
        this.c = messages_messages;
        this.d = i7;
        this.e = j3;
        this.f = arrayList;
        this.h = i10;
        this.n = i11;
        this.r = z9;
        this.s = i12;
        this.w = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new pf(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i7 = messages_messages.count;
                ui uiVar = this.b;
                qp messagesController = uiVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                messagesController.Y3(arrayList, i10 != 0);
                uiVar.getMessagesController().S3(messages_messages.chats, i10 != 0);
                uiVar.getNotificationCenter().k(32, Long.valueOf(this.e), Integer.valueOf(i7), this.f, Integer.valueOf(this.h), Integer.valueOf(this.n), Boolean.valueOf(this.r), Boolean.valueOf(this.s != 0), Integer.valueOf(this.w));
                break;
        }
    }
}

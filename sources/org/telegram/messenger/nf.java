package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements Runnable {
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

    public /* synthetic */ nf(ui uiVar, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.a = i15;
        this.b = uiVar;
        this.c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f = arrayList;
        this.h = i11;
        this.n = i12;
        this.r = z10;
        this.s = i13;
        this.w = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new nf(this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i10 = messages_messages.count;
                ui uiVar = this.b;
                vp messagesController = uiVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i11 = this.d;
                messagesController.V3(arrayList, i11 != 0);
                uiVar.getMessagesController().P3(messages_messages.chats, i11 != 0);
                uiVar.getNotificationCenter().k(32, Long.valueOf(this.e), Integer.valueOf(i10), this.f, Integer.valueOf(this.h), Integer.valueOf(this.n), Boolean.valueOf(this.r), Boolean.valueOf(this.s != 0), Integer.valueOf(this.w));
                break;
        }
    }
}

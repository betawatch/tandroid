package org.telegram.ui.Cells;

import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.xp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d6 {
    public final int a;
    public boolean b;
    public boolean c;
    public int e;
    public long f;
    public int g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public d6(int i3) {
        this.a = i3;
    }

    public static /* synthetic */ void a(d6 d6Var, TLObject tLObject, qr qrVar, long j10, int i3, ArrayList arrayList) {
        ArrayList arrayList2 = d6Var.d;
        int i10 = d6Var.a;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (i3 != d6Var.e) {
                return;
            }
            d6Var.c();
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        hp.s1(i10).Y3(messages_messages.users, false);
        hp.s1(i10).S3(messages_messages.chats, false);
        qrVar.m1(messages_messages.users, messages_messages.chats, true, true);
        qrVar.h1(3, 0, 0, -j10, 0L, messages_messages, false);
        if (i3 == d6Var.e && !messages_messages.messages.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new cg.d(16)));
            TLRPC.Message message = (TLRPC.Message) k2.p1.h(1, messages_messages.messages);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.Message message2 = arrayList3.get(i11);
                    i11++;
                    TLRPC.Message message3 = message2;
                    if (message3.grouped_id == j11) {
                        arrayList2.add(new zi(i10, message3, false, true));
                    }
                }
            } else {
                arrayList2.add(new zi(i10, message, false, true));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            d6Var.c();
        }
    }

    public static /* synthetic */ void b(final d6 d6Var, final int i3, final ArrayList arrayList, final long j10, int i10, final qr qrVar) {
        int i11 = d6Var.a;
        ArrayList arrayList2 = d6Var.d;
        if (i3 != d6Var.e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new cg.d(15)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j11) {
                        arrayList2.add(new zi(i11, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new zi(i11, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                d6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = hp.s1(i11).h1(j10);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Cells.c6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new ci.d8(d6.this, tLObject, qrVar, j10, i3, arrayList));
            }
        });
    }

    public final void c() {
        int i3 = 0;
        this.b = false;
        this.c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void d(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull == null || (userFull.flags2 & 64) == 0) {
            this.e++;
            this.c = true;
            arrayList.clear();
            c();
            return;
        }
        long j10 = userFull.personal_channel_id;
        int i3 = userFull.personal_channel_message;
        if (this.c || this.b) {
            if (this.f == j10 && this.g == i3) {
                return;
            }
            this.c = false;
            arrayList.clear();
        }
        int i10 = this.e + 1;
        this.e = i10;
        this.b = true;
        this.f = j10;
        this.g = i3;
        int i11 = this.a;
        long e10 = h10.i(i11).e();
        qr a02 = qr.a0(i11);
        a02.a.c(new xp(this, i3, a02, j10, e10, i10));
    }
}

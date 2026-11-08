package org.telegram.ui.Cells;

import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.gq;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e6 {
    public final int a;
    public boolean b;
    public boolean c;
    public int e;
    public long f;
    public int g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public e6(int i7) {
        this.a = i7;
    }

    public static /* synthetic */ void a(e6 e6Var, TLObject tLObject, yr yrVar, long j3, int i7, ArrayList arrayList) {
        ArrayList arrayList2 = e6Var.d;
        int i10 = e6Var.a;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (i7 != e6Var.e) {
                return;
            }
            e6Var.c();
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        qp.s1(i10).Y3(messages_messages.users, false);
        qp.s1(i10).S3(messages_messages.chats, false);
        yrVar.m1(messages_messages.users, messages_messages.chats, true, true);
        yrVar.h1(3, 0, 0, -j3, 0L, messages_messages, false);
        if (i7 == e6Var.e && !messages_messages.messages.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(16)));
            TLRPC.Message message = (TLRPC.Message) jg.g.i(1, messages_messages.messages);
            long j10 = message.grouped_id;
            if (j10 != 0) {
                ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.Message message2 = arrayList3.get(i11);
                    i11++;
                    TLRPC.Message message3 = message2;
                    if (message3.grouped_id == j10) {
                        arrayList2.add(new ij(i10, message3, false, true));
                    }
                }
            } else {
                arrayList2.add(new ij(i10, message, false, true));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            e6Var.c();
        }
    }

    public static /* synthetic */ void b(final e6 e6Var, final int i7, final ArrayList arrayList, final long j3, int i10, final yr yrVar) {
        int i11 = e6Var.a;
        ArrayList arrayList2 = e6Var.d;
        if (i7 != e6Var.e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(15)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j10 = message.grouped_id;
            if (j10 != 0) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j10) {
                        arrayList2.add(new ij(i11, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new ij(i11, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                e6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = qp.s1(i11).h1(j3);
        for (int i13 = 10; i13 >= 0; i13--) {
            int i14 = i10 - i13;
            if (i14 >= 0) {
                tL_channels_getMessages.id.add(Integer.valueOf(i14));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Cells.d6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new bi.d9(e6.this, tLObject, yrVar, j3, i7, arrayList));
            }
        });
    }

    public final void c() {
        int i7 = 0;
        this.b = false;
        this.c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
        long j3 = userFull.personal_channel_id;
        int i7 = userFull.personal_channel_message;
        if (this.c || this.b) {
            if (this.f == j3 && this.g == i7) {
                return;
            }
            this.c = false;
            arrayList.clear();
        }
        int i10 = this.e + 1;
        this.e = i10;
        this.b = true;
        this.f = j3;
        this.g = i7;
        int i11 = this.a;
        long e10 = p10.i(i11).e();
        yr a02 = yr.a0(i11);
        a02.a.c(new gq(this, i7, a02, j3, e10, i10));
    }
}

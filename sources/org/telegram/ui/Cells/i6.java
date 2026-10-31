package org.telegram.ui.Cells;

import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.mq;
import org.telegram.messenger.n00;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i6 {
    public final int a;
    public boolean b;
    public boolean c;
    public int e;
    public long f;
    public int g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public i6(int i10) {
        this.a = i10;
    }

    public static /* synthetic */ void a(i6 i6Var, TLObject tLObject, hs hsVar, long j10, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = i6Var.d;
        int i11 = i6Var.a;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (i10 != i6Var.e) {
                return;
            }
            i6Var.c();
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        vp.r1(i11).V3(messages_messages.users, false);
        vp.r1(i11).P3(messages_messages.chats, false);
        hsVar.m1(messages_messages.users, messages_messages.chats, true, true);
        hsVar.h1(3, 0, 0, -j10, 0L, messages_messages, false);
        if (i10 == i6Var.e && !messages_messages.messages.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(7)));
            TLRPC.Message message = (TLRPC.Message) i0.a.g(1, messages_messages.messages);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.Message message2 = arrayList3.get(i12);
                    i12++;
                    TLRPC.Message message3 = message2;
                    if (message3.grouped_id == j11) {
                        arrayList2.add(new jj(i11, message3, false, true));
                    }
                }
            } else {
                arrayList2.add(new jj(i11, message, false, true));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            i6Var.c();
        }
    }

    public static /* synthetic */ void b(final i6 i6Var, final int i10, final ArrayList arrayList, final long j10, int i11, final hs hsVar) {
        int i12 = i6Var.a;
        ArrayList arrayList2 = i6Var.d;
        if (i10 != i6Var.e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(6)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j11) {
                        arrayList2.add(new jj(i12, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new jj(i12, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                i6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = vp.r1(i12).g1(j10);
        for (int i14 = 10; i14 >= 0; i14--) {
            int i15 = i11 - i14;
            if (i15 >= 0) {
                tL_channels_getMessages.id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Cells.h6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.i0.g3(new n00(i6.this, tLObject, hsVar, j10, i10, arrayList, 1));
            }
        });
    }

    public final void c() {
        int i10 = 0;
        this.b = false;
        this.c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        int i10 = userFull.personal_channel_message;
        if (this.c || this.b) {
            if (this.f == j10 && this.g == i10) {
                return;
            }
            this.c = false;
            arrayList.clear();
        }
        int i11 = this.e + 1;
        this.e = i11;
        this.b = true;
        this.f = j10;
        this.g = i10;
        int i12 = this.a;
        long e = d20.i(i12).e();
        hs a02 = hs.a0(i12);
        a02.a.c(new mq(this, i10, a02, j10, e, i11));
    }
}

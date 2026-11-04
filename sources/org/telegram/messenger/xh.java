package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ xh(li liVar, rz rzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i3, sz szVar, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.e = liVar;
        this.f = rzVar;
        this.h = hVar;
        this.s = atomicInteger;
        this.w = runnable;
        this.c = i3;
        this.x = szVar;
        this.n = hVar2;
        this.r = hVar3;
        this.b = z10;
        this.d = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039f A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:195:0x0462, B:210:0x03ff, B:215:0x033e, B:217:0x0399, B:219:0x039f, B:221:0x03a5, B:223:0x03d5, B:224:0x03da, B:226:0x03e4, B:228:0x03f3, B:232:0x03fb, B:234:0x0369, B:236:0x040a, B:238:0x041b, B:241:0x042d, B:246:0x0439, B:248:0x043f, B:250:0x044e, B:256:0x0473, B:258:0x0484, B:259:0x048e, B:261:0x0494, B:263:0x04a5, B:266:0x04bb, B:268:0x04c5, B:270:0x04cd), top: B:194:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fb A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:195:0x0462, B:210:0x03ff, B:215:0x033e, B:217:0x0399, B:219:0x039f, B:221:0x03a5, B:223:0x03d5, B:224:0x03da, B:226:0x03e4, B:228:0x03f3, B:232:0x03fb, B:234:0x0369, B:236:0x040a, B:238:0x041b, B:241:0x042d, B:246:0x0439, B:248:0x043f, B:250:0x044e, B:256:0x0473, B:258:0x0484, B:259:0x048e, B:261:0x0494, B:263:0x04a5, B:266:0x04bb, B:268:0x04c5, B:270:0x04cd), top: B:194:0x0462 }] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v5, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r11v6, types: [a0.h] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v23, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r3v17, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x03f8 -> B:199:0x035e). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r23;
        Runnable runnable;
        int i3;
        ArrayList arrayList;
        final long j10;
        a0.h hVar;
        final Runnable runnable2;
        int i10;
        int i11;
        ArrayList arrayList2;
        a0.h hVar2;
        a0.h hVar3;
        int i12;
        Runnable runnable3;
        boolean z10;
        ?? r82;
        ?? r12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        xh xhVar = this;
        int i13 = xhVar.a;
        Object obj = xhVar.x;
        Object obj2 = xhVar.w;
        Object obj3 = xhVar.s;
        Object obj4 = xhVar.r;
        Object obj5 = xhVar.n;
        Object obj6 = xhVar.h;
        Object obj7 = xhVar.f;
        Object obj8 = xhVar.e;
        switch (i13) {
            case 0:
                final li liVar = (li) obj8;
                a0.h hVar4 = (a0.h) obj6;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ?? r11 = (Runnable) obj2;
                int i14 = xhVar.c;
                sz szVar = (sz) obj;
                a0.h hVar5 = (a0.h) obj5;
                a0.h hVar6 = (a0.h) obj4;
                sz.a((rz) obj7);
                try {
                    liVar.getMessagesController().P1().k.d(hVar4, new yh(1, atomicInteger, r11), i14, true, szVar);
                } catch (Exception e10) {
                    e = e10;
                    r23 = r11;
                }
                if (!hVar5.i()) {
                    rz d = sz.d(szVar, "loadReplyMessagesForMessages: getting reply messages");
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    int m10 = hVar5.m();
                    int i15 = 0;
                    Runnable runnable4 = r11;
                    while (true) {
                        boolean z11 = xhVar.b;
                        a0.h hVar7 = hVar6;
                        long j11 = xhVar.d;
                        if (i15 < m10) {
                            AtomicInteger atomicInteger2 = atomicInteger;
                            try {
                                long j12 = hVar5.j(i15);
                                i10 = m10;
                                ArrayList arrayList10 = (ArrayList) hVar7.f(-j12);
                                if (arrayList10 == null) {
                                    i11 = i15;
                                    arrayList2 = arrayList7;
                                    hVar2 = hVar5;
                                    runnable = runnable4;
                                } else {
                                    i11 = i15;
                                    int i16 = 0;
                                    Runnable runnable5 = runnable4;
                                    while (i16 < 2) {
                                        if (i16 != 1 || z11) {
                                            hVar3 = hVar5;
                                            if (i16 == 1) {
                                                SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().b;
                                                Locale locale = Locale.US;
                                                i12 = i16;
                                                String join = TextUtils.join(",", arrayList10);
                                                runnable3 = runnable5;
                                                StringBuilder sb2 = new StringBuilder();
                                                z10 = z11;
                                                sb2.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                                                sb2.append(join);
                                                sb2.append(") AND uid = ");
                                                sb2.append(j11);
                                                SQLiteCursor sQLiteCursor = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                                r82 = 0;
                                                r12 = sQLiteCursor;
                                                if (r12.next()) {
                                                    ?? byteBufferValue = r12.byteBufferValue(r82);
                                                    if (byteBufferValue != 0) {
                                                        ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                                        arrayList4 = arrayList7;
                                                        TLdeserialize.readAttachPath(byteBufferValue, liVar.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLdeserialize.id = r12.intValue(1);
                                                        TLdeserialize.date = r12.intValue(2);
                                                        TLdeserialize.dialog_id = j11;
                                                        qr.e(TLdeserialize, arrayList8, arrayList9, null);
                                                        arrayList5.add(TLdeserialize);
                                                        TLRPC.Peer peer = TLdeserialize.peer_id;
                                                        long j13 = peer != null ? peer.channel_id : 0L;
                                                        ArrayList arrayList11 = (ArrayList) hVar7.f(j13);
                                                        if (arrayList11 != null) {
                                                            arrayList11.remove(Integer.valueOf(TLdeserialize.id));
                                                            if (arrayList11.isEmpty()) {
                                                                hVar7.l(j13);
                                                            }
                                                        }
                                                    } else {
                                                        arrayList4 = arrayList7;
                                                    }
                                                    arrayList7 = arrayList4;
                                                    sQLiteCursor = r12;
                                                    r82 = 0;
                                                    r12 = sQLiteCursor;
                                                    if (r12.next()) {
                                                    }
                                                } else {
                                                    arrayList3 = arrayList7;
                                                    r12.dispose();
                                                }
                                            } else {
                                                i12 = i16;
                                                runnable3 = runnable5;
                                                z10 = z11;
                                                SQLiteDatabase sQLiteDatabase2 = liVar.getMessagesStorage().b;
                                                Locale locale2 = Locale.US;
                                                r82 = 0;
                                                r12 = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList10) + ") AND uid = " + j11, new Object[0]);
                                                if (r12.next()) {
                                                }
                                            }
                                        } else {
                                            i12 = i16;
                                            hVar3 = hVar5;
                                            runnable3 = runnable5;
                                            z10 = z11;
                                            arrayList3 = arrayList7;
                                        }
                                        i16 = i12 + 1;
                                        arrayList7 = arrayList3;
                                        hVar5 = hVar3;
                                        runnable5 = runnable3;
                                        z11 = z10;
                                    }
                                    arrayList2 = arrayList7;
                                    hVar2 = hVar5;
                                    runnable = runnable5;
                                    ArrayList arrayList12 = new ArrayList();
                                    int size = arrayList10.size();
                                    int i17 = 0;
                                    while (i17 < size) {
                                        Object obj9 = arrayList10.get(i17);
                                        i17++;
                                        int intValue = ((Integer) obj9).intValue();
                                        if (zi.g3(intValue)) {
                                            arrayList12.add(Integer.valueOf(zi.S(intValue)));
                                        }
                                    }
                                    if (!arrayList12.isEmpty()) {
                                        ArrayList Y = liVar.getMessagesStorage().Y(arrayList12, j11);
                                        int size2 = Y.size();
                                        int i18 = 0;
                                        while (i18 < size2) {
                                            Object obj10 = Y.get(i18);
                                            i18++;
                                            TLRPC.TL_message b10 = cg.v.b((TL_ephemeral.EphemeralMessage) obj10);
                                            qr.e(b10, arrayList8, arrayList9, null);
                                            arrayList5.add(b10);
                                        }
                                    }
                                }
                                try {
                                    i15 = i11 + 1;
                                    xhVar = this;
                                    hVar6 = hVar7;
                                    arrayList7 = arrayList2;
                                    m10 = i10;
                                    hVar5 = hVar2;
                                    atomicInteger = atomicInteger2;
                                    runnable4 = runnable;
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                runnable = runnable4;
                            }
                        } else {
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            a0.h hVar8 = hVar5;
                            runnable = runnable4;
                            boolean z12 = z11;
                            ArrayList arrayList13 = arrayList7;
                            if (arrayList8.isEmpty()) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                                liVar.getMessagesStorage().n0(arrayList8, arrayList6, false);
                            }
                            if (arrayList9.isEmpty()) {
                                arrayList = arrayList13;
                            } else {
                                arrayList = arrayList13;
                                liVar.getMessagesStorage().Q(TextUtils.join(",", arrayList9), arrayList);
                            }
                            long j14 = j11;
                            r11 = hVar7;
                            sz szVar2 = szVar;
                            liVar.l(arrayList5, hVar8, arrayList6, arrayList, j14, true);
                            final a0.h hVar9 = hVar8;
                            try {
                                if (r11.i()) {
                                    sz.a(d);
                                    if (atomicInteger3.decrementAndGet() == 0 && runnable != null) {
                                        g0.h3(runnable);
                                    }
                                } else {
                                    sz.a(d);
                                    int m11 = r11.m();
                                    int i19 = i3;
                                    r11 = r11;
                                    while (i19 < m11) {
                                        final a0.h hVar10 = hVar9;
                                        final long j15 = r11.j(i19);
                                        if (z12) {
                                            final rz d10 = sz.d(szVar2, "loadReplyMessagesForMessages: load scheduled");
                                            final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                                            tL_messages_getScheduledMessages.peer = liVar.getMessagesController().j1(j14);
                                            tL_messages_getScheduledMessages.id = (ArrayList) r11.n(i19);
                                            ConnectionsManager connectionsManager = liVar.getConnectionsManager();
                                            final sz szVar3 = szVar2;
                                            final long j16 = j14;
                                            hVar = r11;
                                            final Runnable runnable6 = runnable;
                                            final boolean z13 = z12;
                                            try {
                                                RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.messenger.ci
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        Runnable runnable7;
                                                        TLRPC.TL_messages_getMessages tL_messages_getMessages;
                                                        sz.a(d10);
                                                        if (tL_error == null) {
                                                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            int i20 = 0;
                                                            while (i20 < messages_messages.messages.size()) {
                                                                if (messages_messages.messages.get(i20) instanceof TLRPC.TL_messageEmpty) {
                                                                    messages_messages.messages.remove(i20);
                                                                    i20--;
                                                                }
                                                                i20++;
                                                            }
                                                            int size3 = messages_messages.messages.size();
                                                            TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages2 = tL_messages_getScheduledMessages;
                                                            int size4 = tL_messages_getScheduledMessages2.id.size();
                                                            final li liVar2 = li.this;
                                                            final long j17 = j15;
                                                            final long j18 = j16;
                                                            final a0.h hVar11 = hVar10;
                                                            final boolean z14 = z13;
                                                            if (size3 < size4) {
                                                                if (j17 != 0) {
                                                                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                                    tL_channels_getMessages.channel = liVar2.getMessagesController().h1(j17);
                                                                    tL_channels_getMessages.id = tL_messages_getScheduledMessages2.id;
                                                                    tL_messages_getMessages = tL_channels_getMessages;
                                                                } else {
                                                                    TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                                                                    tL_messages_getMessages2.id = tL_messages_getScheduledMessages2.id;
                                                                    tL_messages_getMessages = tL_messages_getMessages2;
                                                                }
                                                                liVar2.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.ng
                                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                                                        li liVar3 = li.this;
                                                                        liVar3.getClass();
                                                                        if (tL_error != null) {
                                                                            return;
                                                                        }
                                                                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                                        TLRPC.messages_Messages messages_messages3 = messages_messages;
                                                                        messages_messages3.messages.addAll(messages_messages2.messages);
                                                                        messages_messages3.users.addAll(messages_messages2.users);
                                                                        messages_messages3.chats.addAll(messages_messages2.chats);
                                                                        int i21 = 0;
                                                                        while (true) {
                                                                            int size5 = messages_messages3.messages.size();
                                                                            long j19 = j18;
                                                                            if (i21 >= size5) {
                                                                                zi.b0(messages_messages3.messages, j17);
                                                                                zb.X(messages_messages3.messages);
                                                                                ArrayList<TLRPC.Message> arrayList14 = messages_messages3.messages;
                                                                                ArrayList<TLRPC.User> arrayList15 = messages_messages3.users;
                                                                                ArrayList<TLRPC.Chat> arrayList16 = messages_messages3.chats;
                                                                                a0.h hVar12 = hVar11;
                                                                                liVar3.l(arrayList14, hVar12, arrayList15, arrayList16, j19, false);
                                                                                liVar3.getMessagesStorage().m1(messages_messages3.users, messages_messages3.chats, true, true);
                                                                                liVar3.T1(hVar12, messages_messages3.messages, z14);
                                                                                return;
                                                                            }
                                                                            TLRPC.Message message = messages_messages3.messages.get(i21);
                                                                            if (message.dialog_id == 0) {
                                                                                message.dialog_id = j19;
                                                                            }
                                                                            i21++;
                                                                        }
                                                                    }
                                                                });
                                                            } else {
                                                                for (int i21 = 0; i21 < messages_messages.messages.size(); i21++) {
                                                                    TLRPC.Message message = messages_messages.messages.get(i21);
                                                                    if (message.dialog_id == 0) {
                                                                        message.dialog_id = j18;
                                                                    }
                                                                }
                                                                zi.b0(messages_messages.messages, j17);
                                                                zb.X(messages_messages.messages);
                                                                liVar2.l(messages_messages.messages, hVar11, messages_messages.users, messages_messages.chats, j18, false);
                                                                liVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                                liVar2.T1(hVar11, messages_messages.messages, z14);
                                                            }
                                                        } else {
                                                            sz.c(szVar3, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
                                                        }
                                                        if (atomicInteger3.decrementAndGet() != 0 || (runnable7 = runnable6) == null) {
                                                            return;
                                                        }
                                                        g0.h3(runnable7);
                                                    }
                                                };
                                                j10 = j16;
                                                hVar9 = hVar10;
                                                z12 = z13;
                                                szVar2 = szVar3;
                                                runnable2 = runnable6;
                                                int sendRequest = connectionsManager.sendRequest(tL_messages_getScheduledMessages, requestDelegate);
                                                if (i14 != 0) {
                                                    liVar.getConnectionsManager().bindRequestToGuid(sendRequest, i14);
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                r23 = runnable6;
                                            }
                                        } else {
                                            hVar9 = hVar10;
                                            j10 = j14;
                                            hVar = r11;
                                            runnable2 = runnable;
                                            if (j15 != 0) {
                                                final rz d11 = sz.d(szVar2, "loadReplyMessagesForMessages: load channel messages");
                                                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                tL_channels_getMessages.channel = liVar.getMessagesController().h1(j15);
                                                tL_channels_getMessages.id = (ArrayList) hVar.n(i19);
                                                ConnectionsManager connectionsManager2 = liVar.getConnectionsManager();
                                                final AtomicInteger atomicInteger4 = atomicInteger3;
                                                final boolean z14 = z12;
                                                final sz szVar4 = szVar2;
                                                try {
                                                    RequestDelegate requestDelegate2 = new RequestDelegate() { // from class: org.telegram.messenger.di
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            Runnable runnable7;
                                                            long j17;
                                                            li liVar2 = li.this;
                                                            liVar2.getClass();
                                                            sz.a(d11);
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                int i20 = 0;
                                                                while (true) {
                                                                    int size3 = messages_messages.messages.size();
                                                                    j17 = j10;
                                                                    if (i20 >= size3) {
                                                                        break;
                                                                    }
                                                                    TLRPC.Message message = messages_messages.messages.get(i20);
                                                                    if (message.dialog_id == 0) {
                                                                        message.dialog_id = j17;
                                                                    }
                                                                    i20++;
                                                                }
                                                                zi.b0(messages_messages.messages, j15);
                                                                zb.X(messages_messages.messages);
                                                                ArrayList<TLRPC.Message> arrayList14 = messages_messages.messages;
                                                                ArrayList<TLRPC.User> arrayList15 = messages_messages.users;
                                                                ArrayList<TLRPC.Chat> arrayList16 = messages_messages.chats;
                                                                a0.h hVar11 = hVar9;
                                                                liVar2.l(arrayList14, hVar11, arrayList15, arrayList16, j17, false);
                                                                liVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                                liVar2.T1(hVar11, messages_messages.messages, z14);
                                                            } else {
                                                                sz.c(szVar4, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
                                                            }
                                                            if (atomicInteger4.decrementAndGet() != 0 || (runnable7 = runnable2) == null) {
                                                                return;
                                                            }
                                                            g0.h3(runnable7);
                                                        }
                                                    };
                                                    hVar9 = hVar9;
                                                    z12 = z14;
                                                    szVar2 = szVar4;
                                                    runnable2 = runnable2;
                                                    atomicInteger3 = atomicInteger4;
                                                    int sendRequest2 = connectionsManager2.sendRequest(tL_channels_getMessages, requestDelegate2);
                                                    if (i14 != 0) {
                                                        liVar.getConnectionsManager().bindRequestToGuid(sendRequest2, i14);
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    r23 = runnable2;
                                                }
                                            } else {
                                                rz d12 = sz.d(szVar2, "loadReplyMessagesForMessages: load messages");
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                tL_messages_getMessages.id = (ArrayList) hVar.n(i19);
                                                sz szVar5 = szVar2;
                                                AtomicInteger atomicInteger5 = atomicInteger3;
                                                boolean z15 = z12;
                                                z12 = z15;
                                                szVar2 = szVar5;
                                                atomicInteger3 = atomicInteger5;
                                                int sendRequest3 = liVar.getConnectionsManager().sendRequest(tL_messages_getMessages, new ei.l7(liVar, d12, j10, hVar9, z15, szVar5, atomicInteger5, runnable2));
                                                if (i14 != 0) {
                                                    liVar.getConnectionsManager().bindRequestToGuid(sendRequest3, i14);
                                                }
                                            }
                                        }
                                        i19++;
                                        r11 = hVar;
                                        j14 = j10;
                                        runnable = runnable2;
                                    }
                                }
                            } catch (Exception e15) {
                                e = e15;
                                r23 = i10;
                            }
                        }
                        e = e11;
                        r23 = runnable;
                        if (r23 != 0) {
                            g0.h3(r23);
                        }
                        a8.g(e, true);
                        break;
                    }
                } else {
                    sz.c(szVar, "loadReplyMessagesForMessages: empty replyMessageOwners");
                    if (atomicInteger.decrementAndGet() == 0 && r11 != 0) {
                        g0.h3(r11);
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                String str4 = LaunchActivity.E1;
                if (str != null) {
                    String[] split = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str5 : split) {
                        str5.getClass();
                        switch (str5) {
                            case "ban_users":
                            case "restrict_members":
                                tL_chatAdminRights.ban_users = true;
                                break;
                            case "anonymous":
                                tL_chatAdminRights.anonymous = true;
                                break;
                            case "change_info":
                                tL_chatAdminRights.change_info = true;
                                break;
                            case "delete_messages":
                                tL_chatAdminRights.delete_messages = true;
                                break;
                            case "edit_messages":
                                tL_chatAdminRights.edit_messages = true;
                                break;
                            case "manage_call":
                            case "manage_video_chats":
                                tL_chatAdminRights.manage_call = true;
                                break;
                            case "manage_chat":
                            case "other":
                                tL_chatAdminRights.other = true;
                                break;
                            case "manage_topics":
                            case "manage_topic":
                                tL_chatAdminRights.manage_topics = true;
                                break;
                            case "promote_members":
                            case "add_admins":
                                tL_chatAdminRights.add_admins = true;
                                break;
                            case "invite_users":
                                tL_chatAdminRights.invite_users = true;
                                break;
                            case "post_messages":
                                tL_chatAdminRights.post_messages = true;
                                break;
                            case "pin_messages":
                                tL_chatAdminRights.pin_messages = true;
                                break;
                        }
                    }
                } else {
                    tL_chatAdminRights = null;
                }
                if (tL_chatAdminRights == null && tL_chatAdminRights3 == null) {
                    tL_chatAdminRights2 = null;
                } else {
                    if (tL_chatAdminRights != null) {
                        if (tL_chatAdminRights3 == null) {
                            tL_chatAdminRights2 = tL_chatAdminRights;
                        } else {
                            tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights3.change_info;
                            tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights3.post_messages;
                            tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights3.edit_messages;
                            tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights3.add_admins;
                            tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights3.delete_messages;
                            tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights3.ban_users;
                            tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights3.invite_users;
                            tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights3.pin_messages;
                            tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights3.manage_call;
                            tL_chatAdminRights3.anonymous = tL_chatAdminRights.anonymous || tL_chatAdminRights3.anonymous;
                            tL_chatAdminRights3.other = tL_chatAdminRights.other || tL_chatAdminRights3.other;
                        }
                    }
                    tL_chatAdminRights2 = tL_chatAdminRights3;
                }
                boolean z16 = xhVar.b;
                int i20 = xhVar.c;
                if (!z16 || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    org.telegram.ui.ip ipVar = new org.telegram.ui.ip(user.id, -xhVar.d, tL_chatAdminRights2, null, null, str3, 2, true, !z16, str2);
                    ipVar.Y0 = new i80(uwVar, i20);
                    ((ActionBarLayout) launchActivity.M()).T(ipVar, false);
                    break;
                } else {
                    hp.s1(launchActivity.P).m(chat.id, user, 0, str2, uwVar, true, new zo0(launchActivity, i20, chat, uwVar, 9), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ xh(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i3, TLRPC.Chat chat, org.telegram.ui.uw uwVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.h = tL_chatAdminRights;
        this.b = z10;
        this.n = str2;
        this.c = i3;
        this.r = chat;
        this.s = uwVar;
        this.w = user;
        this.d = j10;
        this.x = str3;
    }
}

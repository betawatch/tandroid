package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.c11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fi implements Runnable {
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

    public /* synthetic */ fi(ui uiVar, k00 k00Var, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, l00 l00Var, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.e = uiVar;
        this.f = k00Var;
        this.h = hVar;
        this.s = atomicInteger;
        this.w = runnable;
        this.c = i10;
        this.x = l00Var;
        this.n = hVar2;
        this.r = hVar3;
        this.b = z10;
        this.d = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0399 A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:194:0x045e, B:209:0x03f9, B:214:0x0345, B:216:0x0393, B:218:0x0399, B:220:0x039f, B:222:0x03cf, B:223:0x03d4, B:225:0x03de, B:227:0x03ed, B:231:0x03f5, B:233:0x0363, B:235:0x0404, B:237:0x0417, B:240:0x0429, B:245:0x0435, B:247:0x043b, B:249:0x044a, B:252:0x046e, B:254:0x047b, B:255:0x0485, B:257:0x048b, B:258:0x0499, B:260:0x04ad, B:262:0x04b7, B:264:0x04bf, B:269:0x04fa, B:271:0x0500, B:273:0x05a2, B:280:0x051b, B:285:0x0557, B:287:0x055d, B:293:0x0569, B:298:0x0595, B:300:0x059b, B:308:0x05ad, B:311:0x05b8), top: B:193:0x045e }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f5 A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:194:0x045e, B:209:0x03f9, B:214:0x0345, B:216:0x0393, B:218:0x0399, B:220:0x039f, B:222:0x03cf, B:223:0x03d4, B:225:0x03de, B:227:0x03ed, B:231:0x03f5, B:233:0x0363, B:235:0x0404, B:237:0x0417, B:240:0x0429, B:245:0x0435, B:247:0x043b, B:249:0x044a, B:252:0x046e, B:254:0x047b, B:255:0x0485, B:257:0x048b, B:258:0x0499, B:260:0x04ad, B:262:0x04b7, B:264:0x04bf, B:269:0x04fa, B:271:0x0500, B:273:0x05a2, B:280:0x051b, B:285:0x0557, B:287:0x055d, B:293:0x0569, B:298:0x0595, B:300:0x059b, B:308:0x05ad, B:311:0x05b8), top: B:193:0x045e }] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:209:0x03f2 -> B:196:0x035e). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Runnable runnable;
        int i10;
        ArrayList arrayList;
        final long j10;
        a0.h hVar;
        int i11;
        a0.h hVar2;
        int i12;
        ArrayList arrayList2;
        a0.h hVar3;
        int i13;
        int i14;
        Runnable runnable2;
        ?? r82;
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList3;
        ArrayList arrayList4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        fi fiVar = this;
        int i15 = fiVar.a;
        Object obj = fiVar.x;
        Object obj2 = fiVar.w;
        Object obj3 = fiVar.s;
        Object obj4 = fiVar.r;
        Object obj5 = fiVar.n;
        Object obj6 = fiVar.h;
        Object obj7 = fiVar.f;
        Object obj8 = fiVar.e;
        switch (i15) {
            case 0:
                final ui uiVar = (ui) obj8;
                a0.h hVar4 = (a0.h) obj6;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                Runnable runnable3 = (Runnable) obj2;
                int i16 = fiVar.c;
                l00 l00Var = (l00) obj;
                a0.h hVar5 = (a0.h) obj5;
                a0.h hVar6 = (a0.h) obj4;
                l00.a((k00) obj7);
                try {
                    uiVar.getMessagesController().O1().k.d(hVar4, new t6(29, atomicInteger, runnable3), i16, true, l00Var);
                } catch (Exception e) {
                    e = e;
                    runnable = runnable3;
                }
                if (!hVar5.i()) {
                    k00 d = l00.d(l00Var, "loadReplyMessagesForMessages: getting reply messages");
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    int m10 = hVar5.m();
                    int i17 = 0;
                    while (true) {
                        final boolean z10 = fiVar.b;
                        long j11 = fiVar.d;
                        if (i17 >= m10) {
                            final AtomicInteger atomicInteger2 = atomicInteger;
                            a0.h hVar7 = hVar5;
                            Runnable runnable4 = runnable3;
                            ArrayList arrayList10 = arrayList7;
                            if (arrayList8.isEmpty()) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                                uiVar.getMessagesStorage().n0(arrayList8, arrayList6, false);
                            }
                            if (arrayList9.isEmpty()) {
                                arrayList = arrayList10;
                            } else {
                                arrayList = arrayList10;
                                uiVar.getMessagesStorage().Q(TextUtils.join(",", arrayList9), arrayList);
                            }
                            long j12 = j11;
                            l00 l00Var2 = l00Var;
                            uiVar.l(arrayList5, hVar7, arrayList6, arrayList, j12, true);
                            final a0.h hVar8 = hVar7;
                            if (!hVar6.i()) {
                                l00.a(d);
                                int m11 = hVar6.m();
                                int i18 = i10;
                                while (i18 < m11) {
                                    final a0.h hVar9 = hVar8;
                                    final long j13 = hVar6.j(i18);
                                    if (z10) {
                                        final k00 d10 = l00.d(l00Var2, "loadReplyMessagesForMessages: load scheduled");
                                        final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                                        tL_messages_getScheduledMessages.peer = uiVar.getMessagesController().i1(j12);
                                        tL_messages_getScheduledMessages.id = (ArrayList) hVar6.n(i18);
                                        hVar = hVar6;
                                        final l00 l00Var3 = l00Var2;
                                        final long j14 = j12;
                                        final Runnable runnable5 = runnable4;
                                        try {
                                            j10 = j14;
                                            hVar8 = hVar9;
                                            l00Var2 = l00Var3;
                                            runnable4 = runnable5;
                                            int sendRequest = uiVar.getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate() { // from class: org.telegram.messenger.ji
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    Runnable runnable6;
                                                    TLRPC.TL_messages_getMessages tL_messages_getMessages;
                                                    l00.a(d10);
                                                    if (tL_error == null) {
                                                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                        int i19 = 0;
                                                        while (i19 < messages_messages.messages.size()) {
                                                            if (messages_messages.messages.get(i19) instanceof TLRPC.TL_messageEmpty) {
                                                                messages_messages.messages.remove(i19);
                                                                i19--;
                                                            }
                                                            i19++;
                                                        }
                                                        int size = messages_messages.messages.size();
                                                        TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages2 = tL_messages_getScheduledMessages;
                                                        int size2 = tL_messages_getScheduledMessages2.id.size();
                                                        final ui uiVar2 = ui.this;
                                                        final long j15 = j13;
                                                        final long j16 = j14;
                                                        final a0.h hVar10 = hVar9;
                                                        final boolean z11 = z10;
                                                        if (size < size2) {
                                                            if (j15 != 0) {
                                                                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                                tL_channels_getMessages.channel = uiVar2.getMessagesController().g1(j15);
                                                                tL_channels_getMessages.id = tL_messages_getScheduledMessages2.id;
                                                                tL_messages_getMessages = tL_channels_getMessages;
                                                            } else {
                                                                TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                                                                tL_messages_getMessages2.id = tL_messages_getScheduledMessages2.id;
                                                                tL_messages_getMessages = tL_messages_getMessages2;
                                                            }
                                                            uiVar2.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.ug
                                                                @Override // org.telegram.tgnet.RequestDelegate
                                                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                                                    ui uiVar3 = ui.this;
                                                                    uiVar3.getClass();
                                                                    if (tL_error != null) {
                                                                        return;
                                                                    }
                                                                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                                    TLRPC.messages_Messages messages_messages3 = messages_messages;
                                                                    messages_messages3.messages.addAll(messages_messages2.messages);
                                                                    messages_messages3.users.addAll(messages_messages2.users);
                                                                    messages_messages3.chats.addAll(messages_messages2.chats);
                                                                    int i20 = 0;
                                                                    while (true) {
                                                                        int size3 = messages_messages3.messages.size();
                                                                        long j17 = j16;
                                                                        if (i20 >= size3) {
                                                                            jj.b0(messages_messages3.messages, j15);
                                                                            hc.X(messages_messages3.messages);
                                                                            ArrayList<TLRPC.Message> arrayList11 = messages_messages3.messages;
                                                                            ArrayList<TLRPC.User> arrayList12 = messages_messages3.users;
                                                                            ArrayList<TLRPC.Chat> arrayList13 = messages_messages3.chats;
                                                                            a0.h hVar11 = hVar10;
                                                                            uiVar3.l(arrayList11, hVar11, arrayList12, arrayList13, j17, false);
                                                                            uiVar3.getMessagesStorage().m1(messages_messages3.users, messages_messages3.chats, true, true);
                                                                            uiVar3.T1(hVar11, messages_messages3.messages, z11);
                                                                            return;
                                                                        }
                                                                        TLRPC.Message message = messages_messages3.messages.get(i20);
                                                                        if (message.dialog_id == 0) {
                                                                            message.dialog_id = j17;
                                                                        }
                                                                        i20++;
                                                                    }
                                                                }
                                                            });
                                                        } else {
                                                            for (int i20 = 0; i20 < messages_messages.messages.size(); i20++) {
                                                                TLRPC.Message message = messages_messages.messages.get(i20);
                                                                if (message.dialog_id == 0) {
                                                                    message.dialog_id = j16;
                                                                }
                                                            }
                                                            jj.b0(messages_messages.messages, j15);
                                                            hc.X(messages_messages.messages);
                                                            uiVar2.l(messages_messages.messages, hVar10, messages_messages.users, messages_messages.chats, j16, false);
                                                            uiVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                            uiVar2.T1(hVar10, messages_messages.messages, z11);
                                                        }
                                                    } else {
                                                        l00.c(l00Var3, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
                                                    }
                                                    if (atomicInteger2.decrementAndGet() != 0 || (runnable6 = runnable5) == null) {
                                                        return;
                                                    }
                                                    i0.g3(runnable6);
                                                }
                                            });
                                            if (i16 != 0) {
                                                uiVar.getConnectionsManager().bindRequestToGuid(sendRequest, i16);
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            runnable = runnable5;
                                        }
                                    } else {
                                        hVar8 = hVar9;
                                        j10 = j12;
                                        hVar = hVar6;
                                        if (j13 != 0) {
                                            final k00 d11 = l00.d(l00Var2, "loadReplyMessagesForMessages: load channel messages");
                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                            tL_channels_getMessages.channel = uiVar.getMessagesController().g1(j13);
                                            tL_channels_getMessages.id = (ArrayList) hVar.n(i18);
                                            ConnectionsManager connectionsManager = uiVar.getConnectionsManager();
                                            final boolean z11 = z10;
                                            final AtomicInteger atomicInteger3 = atomicInteger2;
                                            final Runnable runnable6 = runnable4;
                                            final l00 l00Var4 = l00Var2;
                                            try {
                                                RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.messenger.ki
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                        Runnable runnable7;
                                                        long j15;
                                                        ui uiVar2 = ui.this;
                                                        uiVar2.getClass();
                                                        l00.a(d11);
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size = messages_messages.messages.size();
                                                                j15 = j10;
                                                                if (i19 >= size) {
                                                                    break;
                                                                }
                                                                TLRPC.Message message = messages_messages.messages.get(i19);
                                                                if (message.dialog_id == 0) {
                                                                    message.dialog_id = j15;
                                                                }
                                                                i19++;
                                                            }
                                                            jj.b0(messages_messages.messages, j13);
                                                            hc.X(messages_messages.messages);
                                                            ArrayList<TLRPC.Message> arrayList11 = messages_messages.messages;
                                                            ArrayList<TLRPC.User> arrayList12 = messages_messages.users;
                                                            ArrayList<TLRPC.Chat> arrayList13 = messages_messages.chats;
                                                            a0.h hVar10 = hVar8;
                                                            uiVar2.l(arrayList11, hVar10, arrayList12, arrayList13, j15, false);
                                                            uiVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                            uiVar2.T1(hVar10, messages_messages.messages, z11);
                                                        } else {
                                                            l00.c(l00Var4, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
                                                        }
                                                        if (atomicInteger3.decrementAndGet() != 0 || (runnable7 = runnable6) == null) {
                                                            return;
                                                        }
                                                        i0.g3(runnable7);
                                                    }
                                                };
                                                hVar8 = hVar8;
                                                l00Var2 = l00Var4;
                                                runnable4 = runnable6;
                                                z10 = z11;
                                                atomicInteger2 = atomicInteger3;
                                                int sendRequest2 = connectionsManager.sendRequest(tL_channels_getMessages, requestDelegate);
                                                if (i16 != 0) {
                                                    uiVar.getConnectionsManager().bindRequestToGuid(sendRequest2, i16);
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                runnable = runnable6;
                                            }
                                        } else {
                                            k00 d12 = l00.d(l00Var2, "loadReplyMessagesForMessages: load messages");
                                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                            tL_messages_getMessages.id = (ArrayList) hVar.n(i18);
                                            ConnectionsManager connectionsManager2 = uiVar.getConnectionsManager();
                                            l00 l00Var5 = l00Var2;
                                            boolean z12 = z10;
                                            AtomicInteger atomicInteger4 = atomicInteger2;
                                            Runnable runnable7 = runnable4;
                                            try {
                                                li liVar = new li(uiVar, d12, j10, hVar8, z12, l00Var5, atomicInteger4, runnable7);
                                                l00Var2 = l00Var5;
                                                atomicInteger2 = atomicInteger4;
                                                runnable4 = runnable7;
                                                z10 = z12;
                                                int sendRequest3 = connectionsManager2.sendRequest(tL_messages_getMessages, liVar);
                                                if (i16 != 0) {
                                                    uiVar.getConnectionsManager().bindRequestToGuid(sendRequest3, i16);
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                runnable = runnable7;
                                            }
                                        }
                                    }
                                    i18++;
                                    hVar6 = hVar;
                                    j12 = j10;
                                }
                                break;
                            } else {
                                l00.a(d);
                                if (atomicInteger2.decrementAndGet() == 0 && runnable4 != null) {
                                    i0.g3(runnable4);
                                    break;
                                }
                            }
                        } else {
                            AtomicInteger atomicInteger5 = atomicInteger;
                            long j15 = hVar5.j(i17);
                            ArrayList arrayList11 = (ArrayList) hVar6.f(-j15);
                            if (arrayList11 == null) {
                                i11 = i17;
                                hVar2 = hVar5;
                                i12 = m10;
                                runnable = runnable3;
                                arrayList2 = arrayList7;
                            } else {
                                i11 = i17;
                                int i19 = 0;
                                while (i19 < 2) {
                                    if (i19 != 1 || z10) {
                                        hVar3 = hVar5;
                                        if (i19 == 1) {
                                            SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                                            Locale locale = Locale.US;
                                            i13 = i19;
                                            String join = TextUtils.join(",", arrayList11);
                                            i14 = m10;
                                            StringBuilder sb2 = new StringBuilder();
                                            runnable2 = runnable3;
                                            sb2.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                                            sb2.append(join);
                                            sb2.append(") AND uid = ");
                                            sb2.append(j11);
                                            SQLiteCursor sQLiteCursor2 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                            r82 = 0;
                                            sQLiteCursor = sQLiteCursor2;
                                            if (sQLiteCursor.next()) {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r82);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                                    arrayList4 = arrayList7;
                                                    TLdeserialize.readAttachPath(byteBufferValue, uiVar.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    TLdeserialize.id = sQLiteCursor.intValue(1);
                                                    TLdeserialize.date = sQLiteCursor.intValue(2);
                                                    TLdeserialize.dialog_id = j11;
                                                    hs.e(TLdeserialize, arrayList8, arrayList9, null);
                                                    arrayList5.add(TLdeserialize);
                                                    TLRPC.Peer peer = TLdeserialize.peer_id;
                                                    long j16 = peer != null ? peer.channel_id : 0L;
                                                    ArrayList arrayList12 = (ArrayList) hVar6.f(j16);
                                                    if (arrayList12 != null) {
                                                        arrayList12.remove(Integer.valueOf(TLdeserialize.id));
                                                        if (arrayList12.isEmpty()) {
                                                            hVar6.l(j16);
                                                        }
                                                    }
                                                } else {
                                                    arrayList4 = arrayList7;
                                                }
                                                arrayList7 = arrayList4;
                                                sQLiteCursor2 = sQLiteCursor;
                                                r82 = 0;
                                                sQLiteCursor = sQLiteCursor2;
                                                if (sQLiteCursor.next()) {
                                                }
                                            } else {
                                                arrayList3 = arrayList7;
                                                sQLiteCursor.dispose();
                                            }
                                        } else {
                                            i13 = i19;
                                            i14 = m10;
                                            runnable2 = runnable3;
                                            SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                                            Locale locale2 = Locale.US;
                                            r82 = 0;
                                            sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList11) + ") AND uid = " + j11, new Object[0]);
                                            if (sQLiteCursor.next()) {
                                            }
                                        }
                                    } else {
                                        i13 = i19;
                                        hVar3 = hVar5;
                                        i14 = m10;
                                        runnable2 = runnable3;
                                        arrayList3 = arrayList7;
                                    }
                                    i19 = i13 + 1;
                                    arrayList7 = arrayList3;
                                    hVar5 = hVar3;
                                    m10 = i14;
                                    runnable3 = runnable2;
                                }
                                hVar2 = hVar5;
                                i12 = m10;
                                runnable = runnable3;
                                arrayList2 = arrayList7;
                                ArrayList arrayList13 = new ArrayList();
                                int size = arrayList11.size();
                                int i20 = 0;
                                while (i20 < size) {
                                    Object obj9 = arrayList11.get(i20);
                                    i20++;
                                    int intValue = ((Integer) obj9).intValue();
                                    if (jj.f3(intValue)) {
                                        arrayList13.add(Integer.valueOf(jj.S(intValue)));
                                    }
                                }
                                if (!arrayList13.isEmpty()) {
                                    ArrayList Y = uiVar.getMessagesStorage().Y(arrayList13, j11);
                                    int size2 = Y.size();
                                    int i21 = 0;
                                    while (i21 < size2) {
                                        Object obj10 = Y.get(i21);
                                        i21++;
                                        TLRPC.TL_message b10 = rf.s.b((TL_ephemeral.EphemeralMessage) obj10);
                                        hs.e(b10, arrayList8, arrayList9, null);
                                        arrayList5.add(b10);
                                    }
                                }
                            }
                            try {
                                i17 = i11 + 1;
                                fiVar = this;
                                arrayList7 = arrayList2;
                                hVar5 = hVar2;
                                atomicInteger = atomicInteger5;
                                m10 = i12;
                                runnable3 = runnable;
                            } catch (Exception e12) {
                                e = e12;
                            }
                        }
                        if (runnable != null) {
                            i0.g3(runnable);
                        }
                        f8.g(e, true);
                        break;
                    }
                } else {
                    l00.c(l00Var, "loadReplyMessagesForMessages: empty replyMessageOwners");
                    if (atomicInteger.decrementAndGet() == 0 && runnable3 != null) {
                        i0.g3(runnable3);
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                if (str != null) {
                    String[] split = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str4 : split) {
                        str4.getClass();
                        switch (str4) {
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
                boolean z13 = fiVar.b;
                int i22 = fiVar.c;
                if (!z13 || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    org.telegram.ui.iq iqVar = new org.telegram.ui.iq(user.id, -fiVar.d, tL_chatAdminRights2, null, null, str3, 2, true, !z13, str2);
                    iqVar.X0 = new p90(ayVar, i22);
                    ((ActionBarLayout) launchActivity.M()).S(iqVar, false);
                    break;
                } else {
                    vp.r1(launchActivity.O).m(chat.id, user, 0, str2, ayVar, true, new c11(launchActivity, i22, chat, ayVar, 3), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ fi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i10, TLRPC.Chat chat, org.telegram.ui.ay ayVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.h = tL_chatAdminRights;
        this.b = z10;
        this.n = str2;
        this.c = i10;
        this.r = chat;
        this.s = ayVar;
        this.w = user;
        this.d = j10;
        this.x = str3;
    }
}

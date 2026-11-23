package bi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.gi;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.tz;
import org.telegram.messenger.ur;
import org.telegram.messenger.uz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.np;
import org.telegram.ui.o80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ w4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, ai.y1 y1Var, lc lcVar, c1.a aVar, di.f2 f2Var) {
        this.e = context;
        this.b = i7;
        this.f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.c = z10;
        this.n = h6Var;
        this.r = y1Var;
        this.s = lcVar;
        this.w = aVar;
        this.x = f2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x039b A[Catch: Exception -> 0x0362, TryCatch #2 {Exception -> 0x0362, blocks: (B:190:0x02f1, B:194:0x046b, B:202:0x0403, B:205:0x0330, B:207:0x0395, B:209:0x039b, B:211:0x03a1, B:213:0x03d3, B:214:0x03d8, B:216:0x03e0, B:218:0x03ef, B:222:0x03fc, B:224:0x0365, B:226:0x0410, B:228:0x0423, B:231:0x0435, B:236:0x0441, B:238:0x0447, B:240:0x0456, B:251:0x047e, B:253:0x048d, B:254:0x0499, B:256:0x049f, B:257:0x04af, B:259:0x04c4, B:261:0x04cd, B:263:0x04d5, B:265:0x0511, B:267:0x05ab, B:271:0x0524, B:276:0x0560, B:278:0x0566, B:284:0x0572, B:289:0x059e, B:291:0x05a4, B:297:0x05b5, B:300:0x05c0), top: B:189:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03fc A[Catch: Exception -> 0x0362, TryCatch #2 {Exception -> 0x0362, blocks: (B:190:0x02f1, B:194:0x046b, B:202:0x0403, B:205:0x0330, B:207:0x0395, B:209:0x039b, B:211:0x03a1, B:213:0x03d3, B:214:0x03d8, B:216:0x03e0, B:218:0x03ef, B:222:0x03fc, B:224:0x0365, B:226:0x0410, B:228:0x0423, B:231:0x0435, B:236:0x0441, B:238:0x0447, B:240:0x0456, B:251:0x047e, B:253:0x048d, B:254:0x0499, B:256:0x049f, B:257:0x04af, B:259:0x04c4, B:261:0x04cd, B:263:0x04d5, B:265:0x0511, B:267:0x05ab, B:271:0x0524, B:276:0x0560, B:278:0x0566, B:284:0x0572, B:289:0x059e, B:291:0x05a4, B:297:0x05b5, B:300:0x05c0), top: B:189:0x02f1 }] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x03f7 -> B:189:0x0360). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        final Runnable runnable;
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        final long j3;
        RequestDelegate b7Var;
        int i10;
        a0.h hVar;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4;
        boolean z10;
        int i12;
        a0.h hVar2;
        int i13;
        ?? r42;
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        w4 w4Var = this;
        int i14 = w4Var.a;
        Object obj = w4Var.x;
        Object obj2 = w4Var.w;
        Object obj3 = w4Var.s;
        Object obj4 = w4Var.r;
        Object obj5 = w4Var.n;
        Object obj6 = w4Var.h;
        Object obj7 = w4Var.f;
        Object obj8 = w4Var.e;
        int i15 = 1;
        switch (i14) {
            case 0:
                x4.d((Context) obj8, this.b, (TL_stars.TL_starGiftUnique) obj7, this.d, (TLRPC.TL_textWithEntities) obj6, this.c, (org.telegram.ui.ActionBar.h6) obj5, (ai.y1) obj4, (lc) obj3, (c1.a) obj2, (di.f2) obj);
                break;
            case 1:
                final si siVar = (si) obj8;
                a0.h hVar3 = (a0.h) obj6;
                AtomicInteger atomicInteger = (AtomicInteger) obj5;
                Runnable runnable2 = (Runnable) obj4;
                int i16 = w4Var.b;
                uz uzVar = (uz) obj3;
                a0.h hVar4 = (a0.h) obj2;
                a0.h hVar5 = (a0.h) obj;
                uz.a((tz) obj7);
                try {
                    siVar.getMessagesController().R1().k.d(hVar3, new gi(i15, atomicInteger, runnable2), i16, true, uzVar);
                } catch (Exception e10) {
                    e = e10;
                    runnable = runnable2;
                }
                if (!hVar4.i()) {
                    tz d = uz.d(uzVar, "loadReplyMessagesForMessages: getting reply messages");
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int m10 = hVar4.m();
                    int i17 = 0;
                    runnable2 = runnable2;
                    while (true) {
                        boolean z11 = w4Var.c;
                        runnable = runnable2;
                        long j10 = w4Var.d;
                        if (i17 < m10) {
                            AtomicInteger atomicInteger2 = atomicInteger;
                            try {
                                long j11 = hVar4.j(i17);
                                ArrayList arrayList14 = (ArrayList) hVar5.f(-j11);
                                if (arrayList14 == null) {
                                    i10 = i17;
                                    hVar = hVar4;
                                    arrayList3 = arrayList11;
                                    i11 = m10;
                                    arrayList4 = arrayList10;
                                } else {
                                    i10 = i17;
                                    int i18 = 0;
                                    int i19 = 2;
                                    while (i18 < i19) {
                                        if (i18 != 1 || z11) {
                                            z10 = z11;
                                            if (i18 == 1) {
                                                SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().b;
                                                Locale locale = Locale.US;
                                                i12 = i18;
                                                String join = TextUtils.join(",", arrayList14);
                                                hVar2 = hVar4;
                                                StringBuilder sb2 = new StringBuilder();
                                                i13 = m10;
                                                sb2.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                                                sb2.append(join);
                                                sb2.append(") AND uid = ");
                                                sb2.append(j10);
                                                SQLiteCursor sQLiteCursor2 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                                r42 = 0;
                                                sQLiteCursor = sQLiteCursor2;
                                                if (sQLiteCursor.next()) {
                                                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r42);
                                                    if (byteBufferValue != 0) {
                                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r42), r42);
                                                        arrayList7 = arrayList10;
                                                        arrayList8 = arrayList11;
                                                        TLdeserialize.readAttachPath(byteBufferValue, siVar.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.date = sQLiteCursor.intValue(2);
                                                        TLdeserialize.dialog_id = j10;
                                                        ur.e(TLdeserialize, arrayList12, arrayList13, null);
                                                        arrayList9.add(TLdeserialize);
                                                        TLRPC.Peer peer = TLdeserialize.peer_id;
                                                        long j12 = peer != null ? peer.channel_id : 0L;
                                                        ArrayList arrayList15 = (ArrayList) hVar5.f(j12);
                                                        if (arrayList15 != null) {
                                                            arrayList15.remove(Integer.valueOf(TLdeserialize.id));
                                                            if (arrayList15.isEmpty()) {
                                                                hVar5.l(j12);
                                                            }
                                                        }
                                                    } else {
                                                        arrayList7 = arrayList10;
                                                        arrayList8 = arrayList11;
                                                    }
                                                    arrayList10 = arrayList7;
                                                    arrayList11 = arrayList8;
                                                    sQLiteCursor2 = sQLiteCursor;
                                                    r42 = 0;
                                                    sQLiteCursor = sQLiteCursor2;
                                                    if (sQLiteCursor.next()) {
                                                    }
                                                } else {
                                                    arrayList5 = arrayList10;
                                                    arrayList6 = arrayList11;
                                                    i19 = 2;
                                                    sQLiteCursor.dispose();
                                                }
                                            } else {
                                                i12 = i18;
                                                hVar2 = hVar4;
                                                i13 = m10;
                                                SQLiteDatabase sQLiteDatabase2 = siVar.getMessagesStorage().b;
                                                Locale locale2 = Locale.US;
                                                r42 = 0;
                                                sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList14) + ") AND uid = " + j10, new Object[0]);
                                                if (sQLiteCursor.next()) {
                                                }
                                            }
                                        } else {
                                            i12 = i18;
                                            z10 = z11;
                                            hVar2 = hVar4;
                                            arrayList6 = arrayList11;
                                            i13 = m10;
                                            i19 = 2;
                                            arrayList5 = arrayList10;
                                        }
                                        i18 = i12 + 1;
                                        arrayList10 = arrayList5;
                                        z11 = z10;
                                        hVar4 = hVar2;
                                        m10 = i13;
                                        arrayList11 = arrayList6;
                                    }
                                    hVar = hVar4;
                                    arrayList3 = arrayList11;
                                    i11 = m10;
                                    arrayList4 = arrayList10;
                                    ArrayList arrayList16 = new ArrayList();
                                    int size = arrayList14.size();
                                    int i20 = 0;
                                    while (i20 < size) {
                                        Object obj9 = arrayList14.get(i20);
                                        i20++;
                                        int intValue = ((Integer) obj9).intValue();
                                        if (gj.f3(intValue)) {
                                            arrayList16.add(Integer.valueOf(gj.S(intValue)));
                                        }
                                    }
                                    if (!arrayList16.isEmpty()) {
                                        ArrayList Y = siVar.getMessagesStorage().Y(arrayList16, j10);
                                        int size2 = Y.size();
                                        int i21 = 0;
                                        while (i21 < size2) {
                                            Object obj10 = Y.get(i21);
                                            i21++;
                                            TLRPC.TL_message b10 = bg.x.b((TL_ephemeral.EphemeralMessage) obj10);
                                            ur.e(b10, arrayList12, arrayList13, null);
                                            arrayList9.add(b10);
                                        }
                                    }
                                }
                                w4Var = this;
                                i17 = i10 + 1;
                                arrayList10 = arrayList4;
                                atomicInteger = atomicInteger2;
                                runnable2 = runnable;
                                hVar4 = hVar;
                                m10 = i11;
                                arrayList11 = arrayList3;
                            } catch (Exception e11) {
                                e = e11;
                            }
                        } else {
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            final boolean z12 = z11;
                            a0.h hVar6 = hVar4;
                            ArrayList arrayList17 = arrayList10;
                            ArrayList arrayList18 = arrayList11;
                            if (arrayList12.isEmpty()) {
                                arrayList = arrayList17;
                                i7 = 0;
                            } else {
                                arrayList = arrayList17;
                                i7 = 0;
                                siVar.getMessagesStorage().n0(arrayList12, arrayList, false);
                            }
                            if (arrayList13.isEmpty()) {
                                arrayList2 = arrayList18;
                            } else {
                                arrayList2 = arrayList18;
                                siVar.getMessagesStorage().Q(TextUtils.join(",", arrayList13), arrayList2);
                            }
                            long j13 = j10;
                            uz uzVar2 = uzVar;
                            siVar.n(arrayList9, hVar6, arrayList, arrayList2, j13, true);
                            final a0.h hVar7 = hVar6;
                            if (hVar5.i()) {
                                uz.a(d);
                                if (atomicInteger3.decrementAndGet() == 0 && runnable != null) {
                                    org.telegram.messenger.g0.g3(runnable);
                                }
                            } else {
                                uz.a(d);
                                int m11 = hVar5.m();
                                runnable2 = runnable2;
                                while (i7 < m11) {
                                    final a0.h hVar8 = hVar7;
                                    final long j14 = hVar5.j(i7);
                                    if (z12) {
                                        final tz d2 = uz.d(uzVar2, "loadReplyMessagesForMessages: load scheduled");
                                        final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                                        tL_messages_getScheduledMessages.peer = siVar.getMessagesController().l1(j13);
                                        tL_messages_getScheduledMessages.id = (ArrayList) hVar5.n(i7);
                                        ConnectionsManager connectionsManager = siVar.getConnectionsManager();
                                        final uz uzVar3 = uzVar2;
                                        final long j15 = j13;
                                        b7Var = new RequestDelegate() { // from class: org.telegram.messenger.ki
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                Runnable runnable3;
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages;
                                                uz.a(d2);
                                                if (tL_error == null) {
                                                    final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                    int i22 = 0;
                                                    while (i22 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i22) instanceof TLRPC.TL_messageEmpty) {
                                                            messages_messages.messages.remove(i22);
                                                            i22--;
                                                        }
                                                        i22++;
                                                    }
                                                    int size3 = messages_messages.messages.size();
                                                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages2 = tL_messages_getScheduledMessages;
                                                    int size4 = tL_messages_getScheduledMessages2.id.size();
                                                    final si siVar2 = si.this;
                                                    final long j16 = j14;
                                                    final long j17 = j15;
                                                    final a0.h hVar9 = hVar8;
                                                    final boolean z13 = z12;
                                                    if (size3 < size4) {
                                                        if (j16 != 0) {
                                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                            tL_channels_getMessages.channel = siVar2.getMessagesController().j1(j16);
                                                            tL_channels_getMessages.id = tL_messages_getScheduledMessages2.id;
                                                            tL_messages_getMessages = tL_channels_getMessages;
                                                        } else {
                                                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                                                            tL_messages_getMessages2.id = tL_messages_getScheduledMessages2.id;
                                                            tL_messages_getMessages = tL_messages_getMessages2;
                                                        }
                                                        siVar2.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.ug
                                                            @Override // org.telegram.tgnet.RequestDelegate
                                                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                                                si siVar3 = si.this;
                                                                siVar3.getClass();
                                                                if (tL_error != null) {
                                                                    return;
                                                                }
                                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                                TLRPC.messages_Messages messages_messages3 = messages_messages;
                                                                messages_messages3.messages.addAll(messages_messages2.messages);
                                                                messages_messages3.users.addAll(messages_messages2.users);
                                                                messages_messages3.chats.addAll(messages_messages2.chats);
                                                                int i23 = 0;
                                                                while (true) {
                                                                    int size5 = messages_messages3.messages.size();
                                                                    long j18 = j17;
                                                                    if (i23 >= size5) {
                                                                        gj.b0(messages_messages3.messages, j16);
                                                                        fc.X(messages_messages3.messages);
                                                                        ArrayList<TLRPC.Message> arrayList19 = messages_messages3.messages;
                                                                        ArrayList<TLRPC.User> arrayList20 = messages_messages3.users;
                                                                        ArrayList<TLRPC.Chat> arrayList21 = messages_messages3.chats;
                                                                        a0.h hVar10 = hVar9;
                                                                        siVar3.n(arrayList19, hVar10, arrayList20, arrayList21, j18, false);
                                                                        siVar3.getMessagesStorage().m1(messages_messages3.users, messages_messages3.chats, true, true);
                                                                        siVar3.Y1(hVar10, messages_messages3.messages, z13);
                                                                        return;
                                                                    }
                                                                    TLRPC.Message message = messages_messages3.messages.get(i23);
                                                                    if (message.dialog_id == 0) {
                                                                        message.dialog_id = j18;
                                                                    }
                                                                    i23++;
                                                                }
                                                            }
                                                        });
                                                    } else {
                                                        for (int i23 = 0; i23 < messages_messages.messages.size(); i23++) {
                                                            TLRPC.Message message = messages_messages.messages.get(i23);
                                                            if (message.dialog_id == 0) {
                                                                message.dialog_id = j17;
                                                            }
                                                        }
                                                        gj.b0(messages_messages.messages, j16);
                                                        fc.X(messages_messages.messages);
                                                        siVar2.n(messages_messages.messages, hVar9, messages_messages.users, messages_messages.chats, j17, false);
                                                        siVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                        siVar2.Y1(hVar9, messages_messages.messages, z13);
                                                    }
                                                } else {
                                                    uz.c(uzVar3, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
                                                }
                                                if (atomicInteger3.decrementAndGet() != 0 || (runnable3 = runnable) == null) {
                                                    return;
                                                }
                                                g0.g3(runnable3);
                                            }
                                        };
                                        j3 = j15;
                                        hVar7 = hVar8;
                                        uzVar2 = uzVar3;
                                        int sendRequest = connectionsManager.sendRequest(tL_messages_getScheduledMessages, b7Var);
                                        if (i16 != 0) {
                                            siVar.getConnectionsManager().bindRequestToGuid(sendRequest, i16);
                                        }
                                    } else {
                                        hVar7 = hVar8;
                                        j3 = j13;
                                        if (j14 != 0) {
                                            final tz d10 = uz.d(uzVar2, "loadReplyMessagesForMessages: load channel messages");
                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                            tL_channels_getMessages.channel = siVar.getMessagesController().j1(j14);
                                            tL_channels_getMessages.id = (ArrayList) hVar5.n(i7);
                                            ConnectionsManager connectionsManager2 = siVar.getConnectionsManager();
                                            final boolean z13 = z12;
                                            final AtomicInteger atomicInteger4 = atomicInteger3;
                                            final Runnable runnable3 = runnable;
                                            final uz uzVar4 = uzVar2;
                                            try {
                                                b7Var = new RequestDelegate() { // from class: org.telegram.messenger.li
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                        Runnable runnable4;
                                                        long j16;
                                                        si siVar2 = si.this;
                                                        siVar2.getClass();
                                                        uz.a(d10);
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            int i22 = 0;
                                                            while (true) {
                                                                int size3 = messages_messages.messages.size();
                                                                j16 = j3;
                                                                if (i22 >= size3) {
                                                                    break;
                                                                }
                                                                TLRPC.Message message = messages_messages.messages.get(i22);
                                                                if (message.dialog_id == 0) {
                                                                    message.dialog_id = j16;
                                                                }
                                                                i22++;
                                                            }
                                                            gj.b0(messages_messages.messages, j14);
                                                            fc.X(messages_messages.messages);
                                                            ArrayList<TLRPC.Message> arrayList19 = messages_messages.messages;
                                                            ArrayList<TLRPC.User> arrayList20 = messages_messages.users;
                                                            ArrayList<TLRPC.Chat> arrayList21 = messages_messages.chats;
                                                            a0.h hVar9 = hVar7;
                                                            siVar2.n(arrayList19, hVar9, arrayList20, arrayList21, j16, false);
                                                            siVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                            siVar2.Y1(hVar9, messages_messages.messages, z13);
                                                        } else {
                                                            uz.c(uzVar4, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
                                                        }
                                                        if (atomicInteger4.decrementAndGet() != 0 || (runnable4 = runnable3) == null) {
                                                            return;
                                                        }
                                                        g0.g3(runnable4);
                                                    }
                                                };
                                                hVar7 = hVar7;
                                                uzVar2 = uzVar4;
                                                runnable = runnable3;
                                                z12 = z13;
                                                atomicInteger3 = atomicInteger4;
                                                int sendRequest2 = connectionsManager2.sendRequest(tL_channels_getMessages, b7Var);
                                                if (i16 != 0) {
                                                    siVar.getConnectionsManager().bindRequestToGuid(sendRequest2, i16);
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                runnable = runnable3;
                                            }
                                        } else {
                                            tz d11 = uz.d(uzVar2, "loadReplyMessagesForMessages: load messages");
                                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                            tL_messages_getMessages.id = (ArrayList) hVar5.n(i7);
                                            ConnectionsManager connectionsManager3 = siVar.getConnectionsManager();
                                            uz uzVar5 = uzVar2;
                                            boolean z14 = z12;
                                            AtomicInteger atomicInteger5 = atomicInteger3;
                                            Runnable runnable4 = runnable;
                                            try {
                                                b7Var = new fi.b7(siVar, d11, j3, hVar7, z14, uzVar5, atomicInteger5, runnable4);
                                                uzVar2 = uzVar5;
                                                atomicInteger3 = atomicInteger5;
                                                runnable = runnable4;
                                                z12 = z14;
                                                int sendRequest3 = connectionsManager3.sendRequest(tL_messages_getMessages, b7Var);
                                                if (i16 != 0) {
                                                    siVar.getConnectionsManager().bindRequestToGuid(sendRequest3, i16);
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                runnable = runnable4;
                                            }
                                        }
                                    }
                                    i7++;
                                    j13 = j3;
                                    runnable2 = b7Var;
                                }
                            }
                        }
                        if (runnable != null) {
                            org.telegram.messenger.g0.g3(runnable);
                        }
                        org.telegram.messenger.a8.g(e, true);
                        break;
                    }
                } else {
                    uz.c(uzVar, "loadReplyMessagesForMessages: empty replyMessageOwners");
                    if (atomicInteger.decrementAndGet() == 0 && runnable2 != null) {
                        org.telegram.messenger.g0.g3(runnable2);
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                cx cxVar = (cx) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                String str4 = LaunchActivity.C1;
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
                boolean z15 = w4Var.c;
                int i22 = w4Var.b;
                if (!z15 || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    np npVar = new np(user.id, -w4Var.d, tL_chatAdminRights2, null, null, str3, 2, true, !z15, str2);
                    npVar.Y0 = new o80(cxVar, i22);
                    ((ActionBarLayout) launchActivity.M()).T(npVar, false);
                    break;
                } else {
                    org.telegram.messenger.np.u1(launchActivity.P).m(chat.id, user, 0, str2, cxVar, true, new lp0(launchActivity, i22, chat, cxVar, 10), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ w4(si siVar, tz tzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, uz uzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.e = siVar;
        this.f = tzVar;
        this.h = hVar;
        this.n = atomicInteger;
        this.r = runnable;
        this.b = i7;
        this.s = uzVar;
        this.w = hVar2;
        this.x = hVar3;
        this.c = z10;
        this.d = j3;
    }

    public /* synthetic */ w4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.h = tL_chatAdminRights;
        this.c = z10;
        this.n = str2;
        this.b = i7;
        this.r = chat;
        this.s = cxVar;
        this.w = user;
        this.d = j3;
        this.x = str3;
    }
}

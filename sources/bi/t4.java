package bi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.fi;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.sz;
import org.telegram.messenger.tr;
import org.telegram.messenger.tz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.n80;
import org.telegram.ui.np;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements Runnable {
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

    public /* synthetic */ t4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ai.v1 v1Var, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.e = context;
        this.b = i7;
        this.f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.c = z10;
        this.n = i6Var;
        this.r = v1Var;
        this.s = lcVar;
        this.w = cVar;
        this.x = cVar2;
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
        t4 t4Var = this;
        int i14 = t4Var.a;
        Object obj = t4Var.x;
        Object obj2 = t4Var.w;
        Object obj3 = t4Var.s;
        Object obj4 = t4Var.r;
        Object obj5 = t4Var.n;
        Object obj6 = t4Var.h;
        Object obj7 = t4Var.f;
        Object obj8 = t4Var.e;
        int i15 = 1;
        switch (i14) {
            case 0:
                v4.d((Context) obj8, this.b, (TL_stars.TL_starGiftUnique) obj7, this.d, (TLRPC.TL_textWithEntities) obj6, this.c, (org.telegram.ui.ActionBar.i6) obj5, (ai.v1) obj4, (lc) obj3, (c1.c) obj2, (c1.c) obj);
                break;
            case 1:
                final ri riVar = (ri) obj8;
                a0.h hVar3 = (a0.h) obj6;
                AtomicInteger atomicInteger = (AtomicInteger) obj5;
                Runnable runnable2 = (Runnable) obj4;
                int i16 = t4Var.b;
                tz tzVar = (tz) obj3;
                a0.h hVar4 = (a0.h) obj2;
                a0.h hVar5 = (a0.h) obj;
                tz.a((sz) obj7);
                try {
                    riVar.getMessagesController().R1().k.d(hVar3, new fi(i15, atomicInteger, runnable2), i16, true, tzVar);
                } catch (Exception e10) {
                    e = e10;
                    runnable = runnable2;
                }
                if (!hVar4.i()) {
                    sz d = tz.d(tzVar, "loadReplyMessagesForMessages: getting reply messages");
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int m10 = hVar4.m();
                    int i17 = 0;
                    runnable2 = runnable2;
                    while (true) {
                        boolean z11 = t4Var.c;
                        runnable = runnable2;
                        long j10 = t4Var.d;
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
                                                SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().b;
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
                                                        TLdeserialize.readAttachPath(byteBufferValue, riVar.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.date = sQLiteCursor.intValue(2);
                                                        TLdeserialize.dialog_id = j10;
                                                        tr.e(TLdeserialize, arrayList12, arrayList13, null);
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
                                                SQLiteDatabase sQLiteDatabase2 = riVar.getMessagesStorage().b;
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
                                        if (fj.f3(intValue)) {
                                            arrayList16.add(Integer.valueOf(fj.S(intValue)));
                                        }
                                    }
                                    if (!arrayList16.isEmpty()) {
                                        ArrayList Y = riVar.getMessagesStorage().Y(arrayList16, j10);
                                        int size2 = Y.size();
                                        int i21 = 0;
                                        while (i21 < size2) {
                                            Object obj10 = Y.get(i21);
                                            i21++;
                                            TLRPC.TL_message b10 = bg.x.b((TL_ephemeral.EphemeralMessage) obj10);
                                            tr.e(b10, arrayList12, arrayList13, null);
                                            arrayList9.add(b10);
                                        }
                                    }
                                }
                                t4Var = this;
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
                                riVar.getMessagesStorage().n0(arrayList12, arrayList, false);
                            }
                            if (arrayList13.isEmpty()) {
                                arrayList2 = arrayList18;
                            } else {
                                arrayList2 = arrayList18;
                                riVar.getMessagesStorage().Q(TextUtils.join(",", arrayList13), arrayList2);
                            }
                            long j13 = j10;
                            tz tzVar2 = tzVar;
                            riVar.n(arrayList9, hVar6, arrayList, arrayList2, j13, true);
                            final a0.h hVar7 = hVar6;
                            if (hVar5.i()) {
                                tz.a(d);
                                if (atomicInteger3.decrementAndGet() == 0 && runnable != null) {
                                    org.telegram.messenger.g0.g3(runnable);
                                }
                            } else {
                                tz.a(d);
                                int m11 = hVar5.m();
                                runnable2 = runnable2;
                                while (i7 < m11) {
                                    final a0.h hVar8 = hVar7;
                                    final long j14 = hVar5.j(i7);
                                    if (z12) {
                                        final sz d2 = tz.d(tzVar2, "loadReplyMessagesForMessages: load scheduled");
                                        final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                                        tL_messages_getScheduledMessages.peer = riVar.getMessagesController().l1(j13);
                                        tL_messages_getScheduledMessages.id = (ArrayList) hVar5.n(i7);
                                        ConnectionsManager connectionsManager = riVar.getConnectionsManager();
                                        final tz tzVar3 = tzVar2;
                                        final long j15 = j13;
                                        b7Var = new RequestDelegate() { // from class: org.telegram.messenger.ji
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                Runnable runnable3;
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages;
                                                tz.a(d2);
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
                                                    final ri riVar2 = ri.this;
                                                    final long j16 = j14;
                                                    final long j17 = j15;
                                                    final a0.h hVar9 = hVar8;
                                                    final boolean z13 = z12;
                                                    if (size3 < size4) {
                                                        if (j16 != 0) {
                                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                            tL_channels_getMessages.channel = riVar2.getMessagesController().j1(j16);
                                                            tL_channels_getMessages.id = tL_messages_getScheduledMessages2.id;
                                                            tL_messages_getMessages = tL_channels_getMessages;
                                                        } else {
                                                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                                                            tL_messages_getMessages2.id = tL_messages_getScheduledMessages2.id;
                                                            tL_messages_getMessages = tL_messages_getMessages2;
                                                        }
                                                        riVar2.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.tg
                                                            @Override // org.telegram.tgnet.RequestDelegate
                                                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                                                ri riVar3 = ri.this;
                                                                riVar3.getClass();
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
                                                                        fj.b0(messages_messages3.messages, j16);
                                                                        ec.X(messages_messages3.messages);
                                                                        ArrayList<TLRPC.Message> arrayList19 = messages_messages3.messages;
                                                                        ArrayList<TLRPC.User> arrayList20 = messages_messages3.users;
                                                                        ArrayList<TLRPC.Chat> arrayList21 = messages_messages3.chats;
                                                                        a0.h hVar10 = hVar9;
                                                                        riVar3.n(arrayList19, hVar10, arrayList20, arrayList21, j18, false);
                                                                        riVar3.getMessagesStorage().m1(messages_messages3.users, messages_messages3.chats, true, true);
                                                                        riVar3.Y1(hVar10, messages_messages3.messages, z13);
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
                                                        fj.b0(messages_messages.messages, j16);
                                                        ec.X(messages_messages.messages);
                                                        riVar2.n(messages_messages.messages, hVar9, messages_messages.users, messages_messages.chats, j17, false);
                                                        riVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                        riVar2.Y1(hVar9, messages_messages.messages, z13);
                                                    }
                                                } else {
                                                    tz.c(tzVar3, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
                                                }
                                                if (atomicInteger3.decrementAndGet() != 0 || (runnable3 = runnable) == null) {
                                                    return;
                                                }
                                                g0.g3(runnable3);
                                            }
                                        };
                                        j3 = j15;
                                        hVar7 = hVar8;
                                        tzVar2 = tzVar3;
                                        int sendRequest = connectionsManager.sendRequest(tL_messages_getScheduledMessages, b7Var);
                                        if (i16 != 0) {
                                            riVar.getConnectionsManager().bindRequestToGuid(sendRequest, i16);
                                        }
                                    } else {
                                        hVar7 = hVar8;
                                        j3 = j13;
                                        if (j14 != 0) {
                                            final sz d10 = tz.d(tzVar2, "loadReplyMessagesForMessages: load channel messages");
                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                            tL_channels_getMessages.channel = riVar.getMessagesController().j1(j14);
                                            tL_channels_getMessages.id = (ArrayList) hVar5.n(i7);
                                            ConnectionsManager connectionsManager2 = riVar.getConnectionsManager();
                                            final boolean z13 = z12;
                                            final AtomicInteger atomicInteger4 = atomicInteger3;
                                            final Runnable runnable3 = runnable;
                                            final tz tzVar4 = tzVar2;
                                            try {
                                                b7Var = new RequestDelegate() { // from class: org.telegram.messenger.ki
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                        Runnable runnable4;
                                                        long j16;
                                                        ri riVar2 = ri.this;
                                                        riVar2.getClass();
                                                        tz.a(d10);
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
                                                            fj.b0(messages_messages.messages, j14);
                                                            ec.X(messages_messages.messages);
                                                            ArrayList<TLRPC.Message> arrayList19 = messages_messages.messages;
                                                            ArrayList<TLRPC.User> arrayList20 = messages_messages.users;
                                                            ArrayList<TLRPC.Chat> arrayList21 = messages_messages.chats;
                                                            a0.h hVar9 = hVar7;
                                                            riVar2.n(arrayList19, hVar9, arrayList20, arrayList21, j16, false);
                                                            riVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                                            riVar2.Y1(hVar9, messages_messages.messages, z13);
                                                        } else {
                                                            tz.c(tzVar4, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
                                                        }
                                                        if (atomicInteger4.decrementAndGet() != 0 || (runnable4 = runnable3) == null) {
                                                            return;
                                                        }
                                                        g0.g3(runnable4);
                                                    }
                                                };
                                                hVar7 = hVar7;
                                                tzVar2 = tzVar4;
                                                runnable = runnable3;
                                                z12 = z13;
                                                atomicInteger3 = atomicInteger4;
                                                int sendRequest2 = connectionsManager2.sendRequest(tL_channels_getMessages, b7Var);
                                                if (i16 != 0) {
                                                    riVar.getConnectionsManager().bindRequestToGuid(sendRequest2, i16);
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                runnable = runnable3;
                                            }
                                        } else {
                                            sz d11 = tz.d(tzVar2, "loadReplyMessagesForMessages: load messages");
                                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                            tL_messages_getMessages.id = (ArrayList) hVar5.n(i7);
                                            ConnectionsManager connectionsManager3 = riVar.getConnectionsManager();
                                            tz tzVar5 = tzVar2;
                                            boolean z14 = z12;
                                            AtomicInteger atomicInteger5 = atomicInteger3;
                                            Runnable runnable4 = runnable;
                                            try {
                                                b7Var = new fi.b7(riVar, d11, j3, hVar7, z14, tzVar5, atomicInteger5, runnable4);
                                                tzVar2 = tzVar5;
                                                atomicInteger3 = atomicInteger5;
                                                runnable = runnable4;
                                                z12 = z14;
                                                int sendRequest3 = connectionsManager3.sendRequest(tL_messages_getMessages, b7Var);
                                                if (i16 != 0) {
                                                    riVar.getConnectionsManager().bindRequestToGuid(sendRequest3, i16);
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
                    tz.c(tzVar, "loadReplyMessagesForMessages: empty replyMessageOwners");
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
                boolean z15 = t4Var.c;
                int i22 = t4Var.b;
                if (!z15 || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    np npVar = new np(user.id, -t4Var.d, tL_chatAdminRights2, null, null, str3, 2, true, !z15, str2);
                    npVar.Y0 = new n80(cxVar, i22);
                    ((ActionBarLayout) launchActivity.M()).T(npVar, false);
                    break;
                } else {
                    mp.u1(launchActivity.P).m(chat.id, user, 0, str2, cxVar, true, new kp0(launchActivity, i22, chat, cxVar, 9), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ t4(ri riVar, sz szVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, tz tzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.e = riVar;
        this.f = szVar;
        this.h = hVar;
        this.n = atomicInteger;
        this.r = runnable;
        this.b = i7;
        this.s = tzVar;
        this.w = hVar2;
        this.x = hVar3;
        this.c = z10;
        this.d = j3;
    }

    public /* synthetic */ t4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
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

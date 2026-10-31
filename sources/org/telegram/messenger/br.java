package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ br(hs hsVar, int i10) {
        this.a = i10;
        this.b = hsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f7  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r9v4, types: [org.telegram.SQLite.SQLiteCursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement;
        hs hsVar = this.b;
        ?? r32 = 1;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            arrayList.add(Long.valueOf(hsVar.getUserConfig().e()));
            ?? r11 = 0;
            ?? queryFinalized = hsVar.b.queryFinalized("SELECT id, ord, unread_count, flags, title, color, entities, noanimate FROM dialog_filter WHERE 1", new Object[0]);
            boolean z11 = false;
            boolean z12 = false;
            while (queryFinalized.next()) {
                try {
                    try {
                        ap apVar = new ap();
                        apVar.a = queryFinalized.intValue(r11);
                        apVar.f = queryFinalized.intValue(r32);
                        apVar.d = -1;
                        apVar.e = -1;
                        apVar.g = queryFinalized.intValue(3);
                        apVar.b = queryFinalized.stringValue(4);
                        apVar.m = queryFinalized.intValue(5);
                        apVar.c = new ArrayList();
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(6);
                        if (byteBufferValue != null) {
                            try {
                                apVar.c = Vector.deserialize(byteBufferValue, new e9(18), (boolean) r11);
                                byteBufferValue.reuse();
                            } catch (Exception e) {
                                e = e;
                                z10 = r32;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    hsVar.o(e, z10);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement == null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        apVar.n = queryFinalized.intValue(7) == r32 ? r32 : r11;
                        hsVar.H.add(apVar);
                        hsVar.I.put(apVar.a, apVar);
                        sparseArray.put(apVar.a, apVar);
                        boolean z13 = z12;
                        if (apVar.e < 0) {
                            z13 = r32;
                        }
                        int i10 = r11;
                        int i11 = r11;
                        while (i10 < 2) {
                            SQLiteCursor queryFinalized2 = i10 == 0 ? hsVar.b.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + apVar.a, new Object[i11]) : hsVar.b.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + apVar.a, new Object[i11]);
                            while (queryFinalized2.next()) {
                                long longValue = queryFinalized2.longValue(i11);
                                if (i10 == 0) {
                                    if (!o5.C(longValue)) {
                                        apVar.h.add(Long.valueOf(longValue));
                                    }
                                    int intValue = queryFinalized2.intValue(1);
                                    if (intValue != Integer.MIN_VALUE) {
                                        apVar.j.put(longValue, intValue);
                                        if (!arrayList4.contains(Long.valueOf(longValue))) {
                                            arrayList4.add(Long.valueOf(longValue));
                                        }
                                    }
                                } else if (!o5.C(longValue)) {
                                    apVar.i.add(Long.valueOf(longValue));
                                }
                                if (o5.z(longValue)) {
                                    long j10 = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j10))) {
                                        arrayList2.add(Long.valueOf(j10));
                                    }
                                } else if (!o5.E(longValue)) {
                                    int i12 = (int) (longValue & 4294967295L);
                                    if (!arrayList3.contains(Integer.valueOf(i12))) {
                                        arrayList3.add(Integer.valueOf(i12));
                                    }
                                } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                    arrayList.add(Long.valueOf(longValue));
                                }
                                i11 = 0;
                            }
                            queryFinalized2.dispose();
                            i10++;
                            i11 = 0;
                        }
                        if (apVar.a == 0) {
                            z11 = true;
                        }
                        r32 = 1;
                        r11 = 0;
                        z12 = z13;
                    } catch (Exception e7) {
                        e = e7;
                        sQLiteCursor = queryFinalized;
                        z10 = true;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            }
            queryFinalized.dispose();
            if (!z11) {
                ap apVar2 = new ap();
                apVar2.a = 0;
                apVar2.f = 0;
                apVar2.m = -1;
                apVar2.b = "ALL_CHATS";
                for (int i13 = 0; i13 < hsVar.H.size(); i13++) {
                    ((ap) hsVar.H.get(i13)).f++;
                }
                hsVar.H.add(apVar2);
                hsVar.I.put(apVar2.a, apVar2);
                sparseArray.put(apVar2.a, apVar2);
                SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    executeFast.bindInteger(1, apVar2.a);
                    executeFast.bindInteger(2, apVar2.f);
                    executeFast.bindInteger(3, apVar2.d);
                    executeFast.bindInteger(4, apVar2.g);
                    executeFast.bindString(5, apVar2.b);
                    executeFast.bindInteger(6, apVar2.m);
                    Vector vector = new Vector(new e9(18));
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
                    vector.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(7, nativeByteBuffer);
                    executeFast.bindInteger(8, apVar2.n ? 1 : 0);
                    executeFast.stepThis().dispose();
                    nativeByteBuffer.reuse();
                } catch (Exception e10) {
                    e = e10;
                    sQLitePreparedStatement = executeFast;
                    z10 = true;
                    sQLiteCursor = null;
                    hsVar.o(e, z10);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement == null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
            }
            Collections.sort(hsVar.H, new bk(11));
            if (z12) {
                hsVar.j(true);
            }
            TLRPC.TL_messages_dialogs H0 = !arrayList4.isEmpty() ? hsVar.H0(arrayList, arrayList2, arrayList3, TextUtils.join(",", arrayList4)) : new TLRPC.TL_messages_dialogs();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            if (!arrayList3.isEmpty()) {
                hsVar.V(TextUtils.join(",", arrayList3), arrayList7, arrayList);
            }
            if (!arrayList.isEmpty()) {
                hsVar.n0(arrayList, arrayList5, false);
            }
            if (!arrayList2.isEmpty()) {
                hsVar.Q(TextUtils.join(",", arrayList2), arrayList6);
            }
            vp messagesController = hsVar.getMessagesController();
            ArrayList arrayList8 = new ArrayList(hsVar.H);
            messagesController.getClass();
            Utilities.d.c(new jn(messagesController, H0, arrayList7, null, 0, arrayList8, arrayList5, arrayList6, null));
        } catch (Exception e11) {
            e = e11;
            z10 = true;
            sQLiteCursor = null;
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:3:0x0005, B:4:0x0010, B:6:0x0016, B:9:0x0020, B:10:0x0025, B:11:0x0028, B:13:0x03a2, B:16:0x002d, B:18:0x003f, B:20:0x0049, B:21:0x004e, B:22:0x0059, B:30:0x0083, B:40:0x0090, B:47:0x00ad, B:51:0x00b6, B:53:0x00c4, B:55:0x00ca, B:56:0x00cf, B:57:0x00da, B:59:0x00ee, B:61:0x00f4, B:63:0x00fa, B:64:0x0102, B:65:0x010d, B:66:0x0121, B:67:0x0169, B:69:0x017a, B:70:0x017f, B:78:0x01b1, B:86:0x01dd, B:87:0x01e2, B:88:0x01f8, B:89:0x0221, B:98:0x0251, B:99:0x0256, B:100:0x026f, B:102:0x027e, B:104:0x0284, B:105:0x0289, B:106:0x0294, B:112:0x02b2, B:113:0x02b7, B:114:0x02d5, B:115:0x0300, B:117:0x0338, B:120:0x0348, B:123:0x0352, B:126:0x035c, B:127:0x0362, B:128:0x0375, B:132:0x0387, B:133:0x038b, B:135:0x0395, B:138:0x03a7), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        final int readInt32;
        final boolean readBool;
        final hs hsVar = this.b;
        try {
            SQLiteCursor queryFinalized = hsVar.b.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                final long longValue = queryFinalized.longValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    final int readInt322 = byteBufferValue.readInt32(false);
                    switch (readInt322) {
                        case 0:
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                Utilities.d.c(new d4(hsVar, TLdeserialize, longValue, 21));
                            }
                            byteBufferValue.reuse();
                            break;
                        case 1:
                            long readInt323 = byteBufferValue.readInt32(false);
                            hs hsVar2 = hsVar;
                            int readInt324 = byteBufferValue.readInt32(false);
                            r5 r5Var = Utilities.d;
                            ir irVar = new ir(readInt324, readInt323, longValue, hsVar2);
                            hsVar = hsVar2;
                            r5Var.c(irVar);
                            byteBufferValue.reuse();
                            break;
                        case 2:
                        case 5:
                        case 8:
                        case 10:
                        case 14:
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.id = byteBufferValue.readInt64(false);
                            tL_dialog.top_message = byteBufferValue.readInt32(false);
                            tL_dialog.read_inbox_max_id = byteBufferValue.readInt32(false);
                            tL_dialog.read_outbox_max_id = byteBufferValue.readInt32(false);
                            tL_dialog.unread_count = byteBufferValue.readInt32(false);
                            tL_dialog.last_message_date = byteBufferValue.readInt32(false);
                            tL_dialog.pts = byteBufferValue.readInt32(false);
                            tL_dialog.flags = byteBufferValue.readInt32(false);
                            if (readInt322 >= 5) {
                                tL_dialog.pinned = byteBufferValue.readBool(false);
                                tL_dialog.pinnedNum = byteBufferValue.readInt32(false);
                            }
                            if (readInt322 >= 8) {
                                tL_dialog.unread_mentions_count = byteBufferValue.readInt32(false);
                            }
                            if (readInt322 >= 10) {
                                tL_dialog.unread_mark = byteBufferValue.readBool(false);
                            }
                            if (readInt322 >= 14) {
                                tL_dialog.folder_id = byteBufferValue.readInt32(false);
                            }
                            i0.g3(new wm(hsVar, tL_dialog, TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, 9));
                            byteBufferValue.reuse();
                            break;
                        case 3:
                            hsVar.getSendMessagesHelper().p0(TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC.TL_inputMediaGame) TLRPC.InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                            byteBufferValue.reuse();
                            break;
                        case 4:
                            i0.g3(new sq(hsVar, byteBufferValue.readInt64(false), byteBufferValue.readBool(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue));
                            byteBufferValue.reuse();
                            break;
                        case 6:
                            final long readInt325 = byteBufferValue.readInt32(false);
                            final hs hsVar3 = hsVar;
                            final int readInt326 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            r5 r5Var2 = Utilities.d;
                            final int i10 = 0;
                            Runnable runnable = new Runnable() { // from class: org.telegram.messenger.tq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            hsVar3.getMessagesController().I0(readInt325, readInt326, longValue, TLdeserialize2);
                                            break;
                                        default:
                                            hsVar3.getMessagesController().I0(readInt325, readInt326, longValue, TLdeserialize2);
                                            break;
                                    }
                                }
                            };
                            hsVar = hsVar3;
                            r5Var2.c(runnable);
                            byteBufferValue.reuse();
                            break;
                        case 7:
                            final long readInt327 = byteBufferValue.readInt32(false);
                            int readInt328 = byteBufferValue.readInt32(false);
                            final TLMethod TLdeserialize3 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt328, false);
                            if (TLdeserialize3 == null) {
                                TLdeserialize3 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt328, false);
                            }
                            if (TLdeserialize3 == null) {
                                hsVar.q1(longValue);
                            } else {
                                final int i11 = 0;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.uq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                hsVar.getMessagesController().a0(null, null, null, -readInt327, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                            default:
                                                hsVar.getMessagesController().a0(null, null, null, readInt327, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                        }
                                    }
                                });
                            }
                            byteBufferValue.reuse();
                            break;
                        case 9:
                            i0.g3(new y8(hsVar, byteBufferValue.readInt64(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, 4));
                            byteBufferValue.reuse();
                            break;
                        case 11:
                            hs hsVar4 = hsVar;
                            int readInt329 = byteBufferValue.readInt32(false);
                            long readInt3210 = byteBufferValue.readInt32(false);
                            mq mqVar = new mq(readInt329, byteBufferValue.readInt32(false), readInt3210, longValue, hsVar4, readInt3210 != 0 ? TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null);
                            hsVar = hsVar4;
                            i0.g3(mqVar);
                            byteBufferValue.reuse();
                            break;
                        case 12:
                        case 19:
                        case 20:
                            hsVar.q1(longValue);
                            byteBufferValue.reuse();
                            break;
                        case 13:
                            final long readInt64 = byteBufferValue.readInt64(false);
                            final boolean readBool2 = byteBufferValue.readBool(false);
                            final int readInt3211 = byteBufferValue.readInt32(false);
                            final int readInt3212 = byteBufferValue.readInt32(false);
                            final boolean readBool3 = byteBufferValue.readBool(false);
                            final TLRPC.InputPeer TLdeserialize4 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.oq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    long j10 = longValue;
                                    vp messagesController = hs.this.getMessagesController();
                                    long j11 = readInt64;
                                    boolean z10 = readBool2;
                                    messagesController.Y(j11, z10 ? 1 : 0, readInt3211, readInt3212, readBool3, TLdeserialize4, j10);
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 15:
                            final TLRPC.InputPeer TLdeserialize5 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final int i12 = 0;
                            Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.pq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            hsVar.getMessagesController().d3(TLdeserialize5, longValue);
                                            break;
                                        default:
                                            hsVar.getMessagesController().Y3(TLdeserialize5, longValue);
                                            break;
                                    }
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 16:
                            final hs hsVar5 = hsVar;
                            final int readInt3213 = byteBufferValue.readInt32(false);
                            int readInt3214 = byteBufferValue.readInt32(false);
                            final ArrayList arrayList = new ArrayList();
                            for (int i13 = 0; i13 < readInt3214; i13++) {
                                arrayList.add(TLRPC.InputDialogPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            final int i14 = 0;
                            Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.qq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            hsVar5.getMessagesController().j4(readInt3213, longValue, arrayList);
                                            break;
                                        default:
                                            hsVar5.getMessagesController().e(null, readInt3213, -1, arrayList, longValue);
                                            break;
                                    }
                                }
                            };
                            hsVar = hsVar5;
                            i0.g3(runnable2);
                            byteBufferValue.reuse();
                            break;
                        case 17:
                            final hs hsVar6 = hsVar;
                            final int readInt3215 = byteBufferValue.readInt32(false);
                            int readInt3216 = byteBufferValue.readInt32(false);
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i15 = 0; i15 < readInt3216; i15++) {
                                arrayList2.add(TLRPC.TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            final int i16 = 1;
                            Runnable runnable3 = new Runnable() { // from class: org.telegram.messenger.qq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            hsVar6.getMessagesController().j4(readInt3215, longValue, arrayList2);
                                            break;
                                        default:
                                            hsVar6.getMessagesController().e(null, readInt3215, -1, arrayList2, longValue);
                                            break;
                                    }
                                }
                            };
                            hsVar = hsVar6;
                            i0.g3(runnable3);
                            byteBufferValue.reuse();
                            break;
                        case 18:
                            long readInt642 = byteBufferValue.readInt64(false);
                            byteBufferValue.readInt32(false);
                            TLRPC.TL_messages_deleteScheduledMessages TLdeserialize6 = TLRPC.TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize6 == null) {
                                hsVar.q1(longValue);
                            } else {
                                i0.g3(new y8(hsVar, readInt642, longValue, TLdeserialize6, 3));
                            }
                            byteBufferValue.reuse();
                            break;
                        case 21:
                            org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
                            byteBufferValue.readInt64(false);
                            m6Var.i = byteBufferValue.readBool(false);
                            m6Var.j = byteBufferValue.readBool(false);
                            m6Var.d = byteBufferValue.readInt32(false);
                            m6Var.e = byteBufferValue.readInt32(false);
                            m6Var.h = byteBufferValue.readInt32(false);
                            m6Var.k = (float) byteBufferValue.readDouble(false);
                            boolean readBool4 = byteBufferValue.readBool(false);
                            m6Var.c = byteBufferValue.readString(false);
                            m6Var.b = byteBufferValue.readString(false);
                            i0.g3(new qg(hsVar, m6Var, readBool4, longValue, 5));
                            byteBufferValue.reuse();
                            break;
                        case 22:
                            final TLRPC.InputPeer TLdeserialize7 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final int i17 = 1;
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.pq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            hsVar.getMessagesController().d3(TLdeserialize7, longValue);
                                            break;
                                        default:
                                            hsVar.getMessagesController().Y3(TLdeserialize7, longValue);
                                            break;
                                    }
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 23:
                            final long readInt643 = byteBufferValue.readInt64(false);
                            final int readInt3217 = byteBufferValue.readInt32(false);
                            final int readInt3218 = byteBufferValue.readInt32(false);
                            if (!o5.C(readInt643) && o5.z(readInt643) && byteBufferValue.hasRemaining()) {
                                r2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            }
                            final TLRPC.InputChannel inputChannel = r2;
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.nq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hs.this.getMessagesController().n3(readInt643, readInt3217, inputChannel, readInt3218, longValue, readInt322 == 23);
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 24:
                            final long readInt644 = byteBufferValue.readInt64(false);
                            int readInt3219 = byteBufferValue.readInt32(false);
                            final TLMethod TLdeserialize8 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3219, false);
                            if (TLdeserialize8 == null) {
                                TLdeserialize8 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3219, false);
                            }
                            if (TLdeserialize8 == null) {
                                hsVar.q1(longValue);
                            } else {
                                final int i18 = 1;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.uq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                hsVar.getMessagesController().a0(null, null, null, -readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                            default:
                                                hsVar.getMessagesController().a0(null, null, null, readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                        }
                                    }
                                });
                            }
                            byteBufferValue.reuse();
                            break;
                        case 25:
                            final long readInt645 = byteBufferValue.readInt64(false);
                            final hs hsVar7 = hsVar;
                            final int readInt3220 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize9 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            r5 r5Var3 = Utilities.d;
                            final int i19 = 1;
                            try {
                                Runnable runnable4 = new Runnable() { // from class: org.telegram.messenger.tq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                hsVar7.getMessagesController().I0(readInt645, readInt3220, longValue, TLdeserialize9);
                                                break;
                                            default:
                                                hsVar7.getMessagesController().I0(readInt645, readInt3220, longValue, TLdeserialize9);
                                                break;
                                        }
                                    }
                                };
                                hsVar = hsVar7;
                                r5Var3.c(runnable4);
                                byteBufferValue.reuse();
                                break;
                            } catch (Exception e) {
                                e = e;
                                hsVar = hsVar7;
                                hsVar.o(e, true);
                                return;
                            }
                        default:
                            switch (readInt322) {
                                case zs.l1 /* 100 */:
                                    final hs hsVar8 = hsVar;
                                    try {
                                        readInt32 = byteBufferValue.readInt32(false);
                                        readBool = byteBufferValue.readBool(false);
                                    } catch (Exception e7) {
                                        e = e7;
                                        hsVar = hsVar8;
                                    }
                                    try {
                                        Runnable runnable5 = new Runnable() { // from class: org.telegram.messenger.rq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                hsVar8.getSecretChatHelper().e(readInt32, longValue, readBool);
                                            }
                                        };
                                        hsVar = hsVar8;
                                        i0.g3(runnable5);
                                        byteBufferValue.reuse();
                                        break;
                                    } catch (Exception e10) {
                                        e = e10;
                                        hsVar = hsVar8;
                                        hsVar.o(e, true);
                                        return;
                                    }
                                case 101:
                                    break;
                                case zs.n1 /* 102 */:
                                    i0.g3(new ir(hsVar, longValue, byteBufferValue.readInt64(false), byteBufferValue.readInt32(false), 3));
                                    byteBufferValue.reuse();
                                    break;
                                case zs.o1 /* 103 */:
                                    long readInt646 = byteBufferValue.readInt64(false);
                                    int readInt3221 = byteBufferValue.readInt32(false);
                                    int readInt3222 = byteBufferValue.readInt32(false);
                                    Object TLdeserialize10 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3222, false);
                                    if (TLdeserialize10 == null) {
                                        TLdeserialize10 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3222, false);
                                    }
                                    if (TLdeserialize10 == null) {
                                        hsVar.q1(longValue);
                                    } else {
                                        i0.g3(new vh(hsVar, readInt646, longValue, TLdeserialize10, readInt3221, 2));
                                    }
                                    byteBufferValue.reuse();
                                    break;
                                default:
                                    byteBufferValue.reuse();
                                    break;
                            }
                    }
                }
            }
            queryFinalized.dispose();
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                hsVar.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = vp.r1(hsVar.currentAccount).e7.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num = (Integer) entry.getValue();
                            if (num.intValue() != 2 && num.intValue() != 3) {
                            }
                            String replace = key.replace("notify2_", "");
                            long j10 = 1;
                            if (num.intValue() != 2) {
                                if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                    j10 = 1 | (r0.intValue() << 32);
                                }
                            }
                            try {
                                hVar.k(Long.valueOf(j10), Long.parseLong(replace));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    try {
                        hsVar.b.beginTransaction();
                        SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i10 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i10));
                            executeFast.bindLong(2, ((Long) hVar.n(i10)).longValue());
                            executeFast.step();
                            i10++;
                        }
                        executeFast.dispose();
                        hsVar.b.commitTransaction();
                        return;
                    } catch (Exception e7) {
                        hsVar.o(e7, true);
                        return;
                    }
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            case 1:
                hs hsVar2 = this.b;
                try {
                    hsVar2.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    hsVar2.o(e10, true);
                }
                int i11 = hsVar2.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
                i0.g3(new wd(i11, 12));
                return;
            case 2:
                hs hsVar3 = this.b;
                if (hsVar3.Q) {
                    hsVar3.Q = false;
                    zs.f(hsVar3.currentAccount).k(zs.S4, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                zs.f(this.b.currentAccount).k(zs.a5, new Object[0]);
                return;
            case 4:
                hs hsVar4 = this.b;
                hsVar4.Q = true;
                zs.f(hsVar4.currentAccount).k(zs.S4, Boolean.TRUE);
                return;
            case 5:
                hs hsVar5 = this.b;
                hsVar5.Q = false;
                zs.f(hsVar5.currentAccount).k(zs.S4, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return;
                }
            case 7:
                hs hsVar6 = this.b;
                ArrayList arrayList = hsVar6.getMessagesController().P0;
                int size = arrayList.size();
                while (i10 < size) {
                    ((ap) arrayList.get(i10)).d = ((ap) arrayList.get(i10)).e;
                    i10++;
                }
                hsVar6.K = hsVar6.M;
                hsVar6.L = hsVar6.N;
                return;
            case 8:
                hs hsVar7 = this.b;
                for (int i12 = 0; i12 < 2; i12++) {
                    hsVar7.getUserConfig().x(i12, 0, 0, 0L, 0L, 0L, 0L);
                    hsVar7.getUserConfig().z(i12, 0);
                }
                d20 userConfig = hsVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.P = false;
                d20 userConfig2 = hsVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                hsVar7.getNotificationCenter().k(zs.L4, new Object[0]);
                hsVar7.getMediaDataController().E0(false, true, null);
                hsVar7.getNotificationCenter().k(zs.t5, new Object[0]);
                hsVar7.getMessagesController().O1().q();
                return;
            case 9:
                this.b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 10:
                this.b.V0(1);
                return;
            case 11:
                hs hsVar8 = this.b;
                hsVar8.getClass();
                try {
                    hsVar8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    hsVar8.o(e12, true);
                    return;
                }
            case 12:
                hs hsVar9 = this.b;
                hsVar9.p(true);
                hsVar9.s();
                hsVar9.V0(1);
                i0.g3(new br(hsVar9, 18));
                return;
            case 13:
                hs hsVar10 = this.b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i13 = 1;
                try {
                    try {
                        queryFinalized = hsVar10.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (queryFinalized.next()) {
                        long intValue = queryFinalized.intValue(0);
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = intValue;
                        tL_contact.mutual = queryFinalized.intValue(1) == 1;
                        arrayList2.add(tL_contact);
                        arrayList4.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList4.isEmpty()) {
                        hsVar10.n0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    hsVar10.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    i5 contactsController = hsVar10.getContactsController();
                    contactsController.getClass();
                    i0.g3(new cg(contactsController, arrayList3, i13, arrayList2, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                i5 contactsController2 = hsVar10.getContactsController();
                contactsController2.getClass();
                i0.g3(new cg(contactsController2, arrayList3, i13, arrayList2, 3));
                return;
            case 14:
                this.b.getNotificationCenter().k(zs.F1, new Object[0]);
                return;
            case 15:
                this.b.z0();
                return;
            case 16:
                hs hsVar11 = this.b;
                hsVar11.getClass();
                try {
                    hsVar11.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    hsVar11.o(e15, true);
                    return;
                }
            case 17:
                hs hsVar12 = this.b;
                ArrayList arrayList5 = hsVar12.getMessagesController().P0;
                int size2 = arrayList5.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    ((ap) arrayList5.get(i14)).d = ((ap) arrayList5.get(i14)).e;
                }
                hsVar12.K = hsVar12.M;
                hsVar12.L = hsVar12.N;
                zs notificationCenter = hsVar12.getNotificationCenter();
                int i15 = vp.D8;
                notificationCenter.k(2, 256);
                return;
            case 18:
                hs hsVar13 = this.b;
                hsVar13.getNotificationCenter().k(zs.t5, new Object[0]);
                hsVar13.getNotificationCenter().k(zs.L4, new Object[0]);
                hsVar13.getMessagesController().F1().a();
                return;
            case 19:
                this.b.getMessagesController().F1().a();
                return;
            case 20:
                hs hsVar14 = this.b;
                hsVar14.getClass();
                try {
                    hsVar14.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    hsVar14.o(e16, true);
                    return;
                }
            case 21:
                this.b.D0();
                return;
            case 22:
                this.b.getNotificationCenter().k(zs.t5, new Object[0]);
                return;
            case 23:
                hs hsVar15 = this.b;
                try {
                    try {
                        sQLiteCursor = hsVar15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                        ArrayList arrayList6 = new ArrayList();
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.WallPaper TLdeserialize = TLRPC.WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    arrayList6.add(TLdeserialize);
                                }
                            }
                        }
                        i0.g3(new l(5, arrayList6));
                    } catch (Exception e17) {
                        hsVar15.o(e17, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th5) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th5;
                }
            case 24:
                hs hsVar16 = this.b;
                ArrayList arrayList7 = hsVar16.getMessagesController().P0;
                int size3 = arrayList7.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    ((ap) arrayList7.get(i16)).d = ((ap) arrayList7.get(i16)).e;
                }
                hsVar16.K = hsVar16.M;
                hsVar16.L = hsVar16.N;
                zs notificationCenter2 = hsVar16.getNotificationCenter();
                int i17 = vp.D8;
                notificationCenter2.k(2, 256);
                return;
            case 25:
                this.b.t1(true);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                this.b.getMessagesController().W0();
                return;
            default:
                this.b.C0();
                return;
        }
    }
}

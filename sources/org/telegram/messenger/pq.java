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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;

    public /* synthetic */ pq(tr trVar, int i7) {
        this.a = i7;
        this.b = trVar;
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
        tr trVar = this.b;
        ?? r32 = 1;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            arrayList.add(Long.valueOf(trVar.getUserConfig().e()));
            ?? r11 = 0;
            ?? queryFinalized = trVar.b.queryFinalized("SELECT id, ord, unread_count, flags, title, color, entities, noanimate FROM dialog_filter WHERE 1", new Object[0]);
            boolean z11 = false;
            boolean z12 = false;
            while (queryFinalized.next()) {
                try {
                    try {
                        ro roVar = new ro();
                        roVar.a = queryFinalized.intValue(r11);
                        roVar.f = queryFinalized.intValue(r32);
                        roVar.d = -1;
                        roVar.e = -1;
                        roVar.g = queryFinalized.intValue(3);
                        roVar.b = queryFinalized.stringValue(4);
                        roVar.m = queryFinalized.intValue(5);
                        roVar.c = new ArrayList();
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(6);
                        if (byteBufferValue != null) {
                            try {
                                roVar.c = Vector.deserialize(byteBufferValue, new ed(9), (boolean) r11);
                                byteBufferValue.reuse();
                            } catch (Exception e10) {
                                e = e10;
                                z10 = r32;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    trVar.o(e, z10);
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
                        roVar.n = queryFinalized.intValue(7) == r32 ? r32 : r11;
                        trVar.I.add(roVar);
                        trVar.J.put(roVar.a, roVar);
                        sparseArray.put(roVar.a, roVar);
                        boolean z13 = z12;
                        if (roVar.e < 0) {
                            z13 = r32;
                        }
                        int i7 = r11;
                        int i10 = r11;
                        while (i7 < 2) {
                            SQLiteCursor queryFinalized2 = i7 == 0 ? trVar.b.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + roVar.a, new Object[i10]) : trVar.b.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + roVar.a, new Object[i10]);
                            while (queryFinalized2.next()) {
                                long longValue = queryFinalized2.longValue(i10);
                                if (i7 == 0) {
                                    if (!n5.C(longValue)) {
                                        roVar.h.add(Long.valueOf(longValue));
                                    }
                                    int intValue = queryFinalized2.intValue(1);
                                    if (intValue != Integer.MIN_VALUE) {
                                        roVar.j.put(longValue, intValue);
                                        if (!arrayList4.contains(Long.valueOf(longValue))) {
                                            arrayList4.add(Long.valueOf(longValue));
                                        }
                                    }
                                } else if (!n5.C(longValue)) {
                                    roVar.i.add(Long.valueOf(longValue));
                                }
                                if (n5.z(longValue)) {
                                    long j3 = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j3))) {
                                        arrayList2.add(Long.valueOf(j3));
                                    }
                                } else if (!n5.E(longValue)) {
                                    int i11 = (int) (longValue & 4294967295L);
                                    if (!arrayList3.contains(Integer.valueOf(i11))) {
                                        arrayList3.add(Integer.valueOf(i11));
                                    }
                                } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                    arrayList.add(Long.valueOf(longValue));
                                }
                                i10 = 0;
                            }
                            queryFinalized2.dispose();
                            i7++;
                            i10 = 0;
                        }
                        if (roVar.a == 0) {
                            z11 = true;
                        }
                        r32 = 1;
                        r11 = 0;
                        z12 = z13;
                    } catch (Exception e11) {
                        e = e11;
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
                ro roVar2 = new ro();
                roVar2.a = 0;
                roVar2.f = 0;
                roVar2.m = -1;
                roVar2.b = "ALL_CHATS";
                for (int i12 = 0; i12 < trVar.I.size(); i12++) {
                    ((ro) trVar.I.get(i12)).f++;
                }
                trVar.I.add(roVar2);
                trVar.J.put(roVar2.a, roVar2);
                sparseArray.put(roVar2.a, roVar2);
                SQLitePreparedStatement executeFast = trVar.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    executeFast.bindInteger(1, roVar2.a);
                    executeFast.bindInteger(2, roVar2.f);
                    executeFast.bindInteger(3, roVar2.d);
                    executeFast.bindInteger(4, roVar2.g);
                    executeFast.bindString(5, roVar2.b);
                    executeFast.bindInteger(6, roVar2.m);
                    Vector vector = new Vector(new ed(9));
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
                    vector.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(7, nativeByteBuffer);
                    executeFast.bindInteger(8, roVar2.n ? 1 : 0);
                    executeFast.stepThis().dispose();
                    nativeByteBuffer.reuse();
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = executeFast;
                    z10 = true;
                    sQLiteCursor = null;
                    trVar.o(e, z10);
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
            Collections.sort(trVar.I, new dl(8));
            if (z12) {
                trVar.j(true);
            }
            TLRPC.TL_messages_dialogs H0 = !arrayList4.isEmpty() ? trVar.H0(arrayList, arrayList2, arrayList3, TextUtils.join(",", arrayList4)) : new TLRPC.TL_messages_dialogs();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            if (!arrayList3.isEmpty()) {
                trVar.V(TextUtils.join(",", arrayList3), arrayList7, arrayList);
            }
            if (!arrayList.isEmpty()) {
                trVar.n0(arrayList, arrayList5, false);
            }
            if (!arrayList2.isEmpty()) {
                trVar.Q(TextUtils.join(",", arrayList2), arrayList6);
            }
            mp messagesController = trVar.getMessagesController();
            ArrayList arrayList8 = new ArrayList(trVar.I);
            messagesController.getClass();
            Utilities.d.c(new xm(messagesController, H0, arrayList7, null, 0, arrayList8, arrayList5, arrayList6, null));
        } catch (Exception e13) {
            e = e13;
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
        final tr trVar = this.b;
        try {
            SQLiteCursor queryFinalized = trVar.b.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                final long longValue = queryFinalized.longValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    final int readInt322 = byteBufferValue.readInt32(false);
                    switch (readInt322) {
                        case 0:
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                Utilities.d.c(new d4(trVar, TLdeserialize, longValue, 21));
                            }
                            byteBufferValue.reuse();
                            break;
                        case 1:
                            long readInt323 = byteBufferValue.readInt32(false);
                            tr trVar2 = trVar;
                            int readInt324 = byteBufferValue.readInt32(false);
                            q5 q5Var = Utilities.d;
                            uq uqVar = new uq(readInt324, readInt323, longValue, trVar2);
                            trVar = trVar2;
                            q5Var.c(uqVar);
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
                            g0.g3(new fm(trVar, tL_dialog, TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, 8));
                            byteBufferValue.reuse();
                            break;
                        case 3:
                            trVar.getSendMessagesHelper().p0(TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC.TL_inputMediaGame) TLRPC.InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                            byteBufferValue.reuse();
                            break;
                        case 4:
                            g0.g3(new di.c8(trVar, byteBufferValue.readInt64(false), byteBufferValue.readBool(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue));
                            byteBufferValue.reuse();
                            break;
                        case 6:
                            final long readInt325 = byteBufferValue.readInt32(false);
                            final tr trVar3 = trVar;
                            final int readInt326 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            q5 q5Var2 = Utilities.d;
                            final int i7 = 0;
                            Runnable runnable = new Runnable() { // from class: org.telegram.messenger.hq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i7) {
                                        case 0:
                                            trVar3.getMessagesController().L0(readInt325, readInt326, longValue, TLdeserialize2);
                                            break;
                                        default:
                                            trVar3.getMessagesController().L0(readInt325, readInt326, longValue, TLdeserialize2);
                                            break;
                                    }
                                }
                            };
                            trVar = trVar3;
                            q5Var2.c(runnable);
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
                                trVar.q1(longValue);
                            } else {
                                final int i10 = 0;
                                g0.g3(new Runnable() { // from class: org.telegram.messenger.iq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                trVar.getMessagesController().a0(null, null, null, -readInt327, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                            default:
                                                trVar.getMessagesController().a0(null, null, null, readInt327, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                        }
                                    }
                                });
                            }
                            byteBufferValue.reuse();
                            break;
                        case 9:
                            g0.g3(new s8(trVar, byteBufferValue.readInt64(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, 4));
                            byteBufferValue.reuse();
                            break;
                        case 11:
                            tr trVar4 = trVar;
                            int readInt329 = byteBufferValue.readInt32(false);
                            long readInt3210 = byteBufferValue.readInt32(false);
                            bq bqVar = new bq(readInt329, byteBufferValue.readInt32(false), readInt3210, longValue, trVar4, readInt3210 != 0 ? TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null);
                            trVar = trVar4;
                            g0.g3(bqVar);
                            byteBufferValue.reuse();
                            break;
                        case 12:
                        case 19:
                        case 20:
                            trVar.q1(longValue);
                            byteBufferValue.reuse();
                            break;
                        case 13:
                            final long readInt64 = byteBufferValue.readInt64(false);
                            final boolean readBool2 = byteBufferValue.readBool(false);
                            final int readInt3211 = byteBufferValue.readInt32(false);
                            final int readInt3212 = byteBufferValue.readInt32(false);
                            final boolean readBool3 = byteBufferValue.readBool(false);
                            final TLRPC.InputPeer TLdeserialize4 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.dq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    long j3 = longValue;
                                    mp messagesController = tr.this.getMessagesController();
                                    long j10 = readInt64;
                                    boolean z10 = readBool2;
                                    messagesController.Y(j10, z10 ? 1 : 0, readInt3211, readInt3212, readBool3, TLdeserialize4, j3);
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 15:
                            final TLRPC.InputPeer TLdeserialize5 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final int i11 = 0;
                            Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.eq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            trVar.getMessagesController().l3(TLdeserialize5, longValue);
                                            break;
                                        default:
                                            trVar.getMessagesController().j4(TLdeserialize5, longValue);
                                            break;
                                    }
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 16:
                            final tr trVar5 = trVar;
                            final int readInt3213 = byteBufferValue.readInt32(false);
                            int readInt3214 = byteBufferValue.readInt32(false);
                            final ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < readInt3214; i12++) {
                                arrayList.add(TLRPC.InputDialogPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            final int i13 = 0;
                            Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.fq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            trVar5.getMessagesController().u4(readInt3213, longValue, arrayList);
                                            break;
                                        default:
                                            trVar5.getMessagesController().e(null, readInt3213, -1, arrayList, longValue);
                                            break;
                                    }
                                }
                            };
                            trVar = trVar5;
                            g0.g3(runnable2);
                            byteBufferValue.reuse();
                            break;
                        case 17:
                            final tr trVar6 = trVar;
                            final int readInt3215 = byteBufferValue.readInt32(false);
                            int readInt3216 = byteBufferValue.readInt32(false);
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i14 = 0; i14 < readInt3216; i14++) {
                                arrayList2.add(TLRPC.TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            final int i15 = 1;
                            Runnable runnable3 = new Runnable() { // from class: org.telegram.messenger.fq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            trVar6.getMessagesController().u4(readInt3215, longValue, arrayList2);
                                            break;
                                        default:
                                            trVar6.getMessagesController().e(null, readInt3215, -1, arrayList2, longValue);
                                            break;
                                    }
                                }
                            };
                            trVar = trVar6;
                            g0.g3(runnable3);
                            byteBufferValue.reuse();
                            break;
                        case 18:
                            long readInt642 = byteBufferValue.readInt64(false);
                            byteBufferValue.readInt32(false);
                            TLRPC.TL_messages_deleteScheduledMessages TLdeserialize6 = TLRPC.TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize6 == null) {
                                trVar.q1(longValue);
                            } else {
                                g0.g3(new s8(trVar, readInt642, longValue, TLdeserialize6, 3));
                            }
                            byteBufferValue.reuse();
                            break;
                        case 21:
                            org.telegram.ui.ActionBar.e6 e6Var = new org.telegram.ui.ActionBar.e6();
                            byteBufferValue.readInt64(false);
                            e6Var.i = byteBufferValue.readBool(false);
                            e6Var.j = byteBufferValue.readBool(false);
                            e6Var.d = byteBufferValue.readInt32(false);
                            e6Var.e = byteBufferValue.readInt32(false);
                            e6Var.h = byteBufferValue.readInt32(false);
                            e6Var.k = (float) byteBufferValue.readDouble(false);
                            boolean readBool4 = byteBufferValue.readBool(false);
                            e6Var.c = byteBufferValue.readString(false);
                            e6Var.b = byteBufferValue.readString(false);
                            g0.g3(new pg(trVar, e6Var, readBool4, longValue, 5));
                            byteBufferValue.reuse();
                            break;
                        case 22:
                            final TLRPC.InputPeer TLdeserialize7 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final int i16 = 1;
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.eq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            trVar.getMessagesController().l3(TLdeserialize7, longValue);
                                            break;
                                        default:
                                            trVar.getMessagesController().j4(TLdeserialize7, longValue);
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
                            if (!n5.C(readInt643) && n5.z(readInt643) && byteBufferValue.hasRemaining()) {
                                r2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            }
                            final TLRPC.InputChannel inputChannel = r2;
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.cq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tr.this.getMessagesController().x3(readInt643, readInt3217, inputChannel, readInt3218, longValue, readInt322 == 23);
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
                                trVar.q1(longValue);
                            } else {
                                final int i17 = 1;
                                g0.g3(new Runnable() { // from class: org.telegram.messenger.iq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                trVar.getMessagesController().a0(null, null, null, -readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                            default:
                                                trVar.getMessagesController().a0(null, null, null, readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                        }
                                    }
                                });
                            }
                            byteBufferValue.reuse();
                            break;
                        case 25:
                            final long readInt645 = byteBufferValue.readInt64(false);
                            final tr trVar7 = trVar;
                            final int readInt3220 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize9 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            q5 q5Var3 = Utilities.d;
                            final int i18 = 1;
                            try {
                                Runnable runnable4 = new Runnable() { // from class: org.telegram.messenger.hq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                trVar7.getMessagesController().L0(readInt645, readInt3220, longValue, TLdeserialize9);
                                                break;
                                            default:
                                                trVar7.getMessagesController().L0(readInt645, readInt3220, longValue, TLdeserialize9);
                                                break;
                                        }
                                    }
                                };
                                trVar = trVar7;
                                q5Var3.c(runnable4);
                                byteBufferValue.reuse();
                                break;
                            } catch (Exception e10) {
                                e = e10;
                                trVar = trVar7;
                                trVar.o(e, true);
                                return;
                            }
                        default:
                            switch (readInt322) {
                                case ks.l1 /* 100 */:
                                    final tr trVar8 = trVar;
                                    try {
                                        readInt32 = byteBufferValue.readInt32(false);
                                        readBool = byteBufferValue.readBool(false);
                                    } catch (Exception e11) {
                                        e = e11;
                                        trVar = trVar8;
                                    }
                                    try {
                                        Runnable runnable5 = new Runnable() { // from class: org.telegram.messenger.gq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                trVar8.getSecretChatHelper().e(readInt32, longValue, readBool);
                                            }
                                        };
                                        trVar = trVar8;
                                        g0.g3(runnable5);
                                        byteBufferValue.reuse();
                                        break;
                                    } catch (Exception e12) {
                                        e = e12;
                                        trVar = trVar8;
                                        trVar.o(e, true);
                                        return;
                                    }
                                case 101:
                                    break;
                                case ks.n1 /* 102 */:
                                    g0.g3(new uq(trVar, longValue, byteBufferValue.readInt64(false), byteBufferValue.readInt32(false), 3));
                                    byteBufferValue.reuse();
                                    break;
                                case ks.o1 /* 103 */:
                                    long readInt646 = byteBufferValue.readInt64(false);
                                    int readInt3221 = byteBufferValue.readInt32(false);
                                    int readInt3222 = byteBufferValue.readInt32(false);
                                    Object TLdeserialize10 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3222, false);
                                    if (TLdeserialize10 == null) {
                                        TLdeserialize10 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3222, false);
                                    }
                                    if (TLdeserialize10 == null) {
                                        trVar.q1(longValue);
                                    } else {
                                        g0.g3(new uh(trVar, readInt646, longValue, TLdeserialize10, readInt3221, 2));
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
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        int i7 = 0;
        switch (this.a) {
            case 0:
                tr trVar = this.b;
                trVar.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = mp.u1(trVar.currentAccount).g7.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num = (Integer) entry.getValue();
                            if (num.intValue() != 2 && num.intValue() != 3) {
                            }
                            String replace = key.replace("notify2_", "");
                            long j3 = 1;
                            if (num.intValue() != 2) {
                                if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                    j3 = 1 | (r0.intValue() << 32);
                                }
                            }
                            try {
                                hVar.k(Long.valueOf(j3), Long.parseLong(replace));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    try {
                        trVar.b.beginTransaction();
                        SQLitePreparedStatement executeFast = trVar.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i7 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i7));
                            executeFast.bindLong(2, ((Long) hVar.n(i7)).longValue());
                            executeFast.step();
                            i7++;
                        }
                        executeFast.dispose();
                        trVar.b.commitTransaction();
                        return;
                    } catch (Exception e11) {
                        trVar.o(e11, true);
                        return;
                    }
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            case 1:
                tr trVar2 = this.b;
                try {
                    trVar2.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e12) {
                    trVar2.o(e12, true);
                }
                int i10 = trVar2.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
                g0.g3(new jg.x(i10, 14));
                return;
            case 2:
                tr trVar3 = this.b;
                if (trVar3.R) {
                    trVar3.R = false;
                    ks.f(trVar3.currentAccount).k(ks.V4, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                ks.f(this.b.currentAccount).k(ks.d5, new Object[0]);
                return;
            case 4:
                tr trVar4 = this.b;
                trVar4.R = true;
                ks.f(trVar4.currentAccount).k(ks.V4, Boolean.TRUE);
                return;
            case 5:
                tr trVar5 = this.b;
                trVar5.R = false;
                ks.f(trVar5.currentAccount).k(ks.V4, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                tr trVar6 = this.b;
                ArrayList arrayList = trVar6.getMessagesController().Q0;
                int size = arrayList.size();
                while (i7 < size) {
                    ((ro) arrayList.get(i7)).d = ((ro) arrayList.get(i7)).e;
                    i7++;
                }
                trVar6.L = trVar6.N;
                trVar6.M = trVar6.O;
                return;
            case 8:
                this.b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 9:
                this.b.V0(1);
                return;
            case 10:
                tr trVar7 = this.b;
                for (int i11 = 0; i11 < 2; i11++) {
                    trVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    trVar7.getUserConfig().z(i11, 0);
                }
                i10 userConfig = trVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                i10 userConfig2 = trVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                trVar7.getNotificationCenter().k(ks.O4, new Object[0]);
                trVar7.getMediaDataController().H0(false, true, null);
                trVar7.getNotificationCenter().k(ks.w5, new Object[0]);
                trVar7.getMessagesController().R1().q();
                return;
            case 11:
                tr trVar8 = this.b;
                trVar8.getClass();
                try {
                    trVar8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    trVar8.o(e14, true);
                    return;
                }
            case 12:
                tr trVar9 = this.b;
                trVar9.p(true);
                trVar9.s();
                trVar9.V0(1);
                g0.g3(new pq(trVar9, 20));
                return;
            case 13:
                this.b.getNotificationCenter().k(ks.F1, new Object[0]);
                return;
            case 14:
                tr trVar10 = this.b;
                trVar10.getClass();
                try {
                    trVar10.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    trVar10.o(e15, true);
                    return;
                }
            case 15:
                tr trVar11 = this.b;
                ArrayList arrayList2 = trVar11.getMessagesController().Q0;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((ro) arrayList2.get(i12)).d = ((ro) arrayList2.get(i12)).e;
                }
                trVar11.L = trVar11.N;
                trVar11.M = trVar11.O;
                ks notificationCenter = trVar11.getNotificationCenter();
                int i13 = mp.I8;
                notificationCenter.k(2, 256);
                return;
            case 16:
                this.b.z0();
                return;
            case 17:
                this.b.getMessagesController().I1().a();
                return;
            case 18:
                tr trVar12 = this.b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i14 = 1;
                try {
                    try {
                        queryFinalized = trVar12.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e16) {
                        e = e16;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (queryFinalized.next()) {
                        long intValue = queryFinalized.intValue(0);
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = intValue;
                        tL_contact.mutual = queryFinalized.intValue(1) == 1;
                        arrayList3.add(tL_contact);
                        arrayList5.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        trVar12.n0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    trVar12.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    i5 contactsController = trVar12.getContactsController();
                    contactsController.getClass();
                    g0.g3(new dg(contactsController, arrayList4, i14, arrayList3, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                i5 contactsController2 = trVar12.getContactsController();
                contactsController2.getClass();
                g0.g3(new dg(contactsController2, arrayList4, i14, arrayList3, 3));
                return;
            case 19:
                tr trVar13 = this.b;
                trVar13.getClass();
                try {
                    trVar13.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    trVar13.o(e18, true);
                    return;
                }
            case 20:
                tr trVar14 = this.b;
                trVar14.getNotificationCenter().k(ks.w5, new Object[0]);
                trVar14.getNotificationCenter().k(ks.O4, new Object[0]);
                trVar14.getMessagesController().I1().a();
                return;
            case 21:
                this.b.D0();
                return;
            case 22:
                this.b.C0();
                return;
            case 23:
                tr trVar15 = this.b;
                try {
                    try {
                        sQLiteCursor = trVar15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        g0.g3(new k(5, arrayList6));
                    } catch (Throwable th5) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th5;
                    }
                } catch (Exception e19) {
                    trVar15.o(e19, true);
                    if (sQLiteCursor == null) {
                        return;
                    }
                }
                sQLiteCursor.dispose();
                return;
            case 24:
                this.b.getNotificationCenter().k(ks.w5, new Object[0]);
                return;
            case 25:
                tr trVar16 = this.b;
                ArrayList arrayList7 = trVar16.getMessagesController().Q0;
                int size3 = arrayList7.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((ro) arrayList7.get(i15)).d = ((ro) arrayList7.get(i15)).e;
                }
                trVar16.L = trVar16.N;
                trVar16.M = trVar16.O;
                ks notificationCenter2 = trVar16.getNotificationCenter();
                int i16 = mp.I8;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.b.t1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.b.getMessagesController().Z0();
                return;
        }
    }
}

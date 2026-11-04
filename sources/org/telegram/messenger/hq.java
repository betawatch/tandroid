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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ hq(qr qrVar, int i3) {
        this.a = i3;
        this.b = qrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f5  */
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
        qr qrVar = this.b;
        ?? r32 = 1;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            arrayList.add(Long.valueOf(qrVar.getUserConfig().e()));
            ?? r11 = 0;
            ?? queryFinalized = qrVar.b.queryFinalized("SELECT id, ord, unread_count, flags, title, color, entities, noanimate FROM dialog_filter WHERE 1", new Object[0]);
            boolean z11 = false;
            boolean z12 = false;
            while (queryFinalized.next()) {
                try {
                    try {
                        mo moVar = new mo();
                        moVar.a = queryFinalized.intValue(r11);
                        moVar.f = queryFinalized.intValue(r32);
                        moVar.d = -1;
                        moVar.e = -1;
                        moVar.g = queryFinalized.intValue(3);
                        moVar.b = queryFinalized.stringValue(4);
                        moVar.m = queryFinalized.intValue(5);
                        moVar.c = new ArrayList();
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(6);
                        if (byteBufferValue != null) {
                            try {
                                moVar.c = Vector.deserialize(byteBufferValue, new go(1), (boolean) r11);
                                byteBufferValue.reuse();
                            } catch (Exception e10) {
                                e = e10;
                                z10 = r32;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    qrVar.o(e, z10);
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
                        moVar.n = queryFinalized.intValue(7) == r32 ? r32 : r11;
                        qrVar.I.add(moVar);
                        qrVar.J.put(moVar.a, moVar);
                        sparseArray.put(moVar.a, moVar);
                        boolean z13 = z12;
                        if (moVar.e < 0) {
                            z13 = r32;
                        }
                        int i3 = r11;
                        int i10 = r11;
                        while (i3 < 2) {
                            SQLiteCursor queryFinalized2 = i3 == 0 ? qrVar.b.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + moVar.a, new Object[i10]) : qrVar.b.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + moVar.a, new Object[i10]);
                            while (queryFinalized2.next()) {
                                long longValue = queryFinalized2.longValue(i10);
                                if (i3 == 0) {
                                    if (!m5.C(longValue)) {
                                        moVar.h.add(Long.valueOf(longValue));
                                    }
                                    int intValue = queryFinalized2.intValue(1);
                                    if (intValue != Integer.MIN_VALUE) {
                                        moVar.j.put(longValue, intValue);
                                        if (!arrayList4.contains(Long.valueOf(longValue))) {
                                            arrayList4.add(Long.valueOf(longValue));
                                        }
                                    }
                                } else if (!m5.C(longValue)) {
                                    moVar.i.add(Long.valueOf(longValue));
                                }
                                if (m5.z(longValue)) {
                                    long j10 = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j10))) {
                                        arrayList2.add(Long.valueOf(j10));
                                    }
                                } else if (!m5.E(longValue)) {
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
                            i3++;
                            i10 = 0;
                        }
                        if (moVar.a == 0) {
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
                mo moVar2 = new mo();
                moVar2.a = 0;
                moVar2.f = 0;
                moVar2.m = -1;
                moVar2.b = "ALL_CHATS";
                for (int i12 = 0; i12 < qrVar.I.size(); i12++) {
                    ((mo) qrVar.I.get(i12)).f++;
                }
                qrVar.I.add(moVar2);
                qrVar.J.put(moVar2.a, moVar2);
                sparseArray.put(moVar2.a, moVar2);
                SQLitePreparedStatement executeFast = qrVar.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    executeFast.bindInteger(1, moVar2.a);
                    executeFast.bindInteger(2, moVar2.f);
                    executeFast.bindInteger(3, moVar2.d);
                    executeFast.bindInteger(4, moVar2.g);
                    executeFast.bindString(5, moVar2.b);
                    executeFast.bindInteger(6, moVar2.m);
                    Vector vector = new Vector(new go(1));
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
                    vector.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(7, nativeByteBuffer);
                    executeFast.bindInteger(8, moVar2.n ? 1 : 0);
                    executeFast.stepThis().dispose();
                    nativeByteBuffer.reuse();
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = executeFast;
                    z10 = true;
                    sQLiteCursor = null;
                    qrVar.o(e, z10);
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
            Collections.sort(qrVar.I, new o0.a(29));
            if (z12) {
                qrVar.j(true);
            }
            TLRPC.TL_messages_dialogs H0 = !arrayList4.isEmpty() ? qrVar.H0(arrayList, arrayList2, arrayList3, TextUtils.join(",", arrayList4)) : new TLRPC.TL_messages_dialogs();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            if (!arrayList3.isEmpty()) {
                qrVar.V(TextUtils.join(",", arrayList3), arrayList7, arrayList);
            }
            if (!arrayList.isEmpty()) {
                qrVar.n0(arrayList, arrayList5, false);
            }
            if (!arrayList2.isEmpty()) {
                qrVar.Q(TextUtils.join(",", arrayList2), arrayList6);
            }
            hp messagesController = qrVar.getMessagesController();
            ArrayList arrayList8 = new ArrayList(qrVar.I);
            messagesController.getClass();
            Utilities.d.c(new rm(messagesController, H0, arrayList7, null, 0, arrayList8, arrayList5, arrayList6, null));
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
        final qr qrVar = this.b;
        try {
            SQLiteCursor queryFinalized = qrVar.b.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                final long longValue = queryFinalized.longValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    final int readInt322 = byteBufferValue.readInt32(false);
                    switch (readInt322) {
                        case 0:
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                Utilities.d.c(new a4(qrVar, TLdeserialize, longValue, 21));
                            }
                            byteBufferValue.reuse();
                            break;
                        case 1:
                            long readInt323 = byteBufferValue.readInt32(false);
                            qr qrVar2 = qrVar;
                            int readInt324 = byteBufferValue.readInt32(false);
                            p5 p5Var = Utilities.d;
                            qq qqVar = new qq(readInt324, readInt323, longValue, qrVar2);
                            qrVar = qrVar2;
                            p5Var.c(qqVar);
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
                            g0.h3(new zl(qrVar, tL_dialog, TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, 8));
                            byteBufferValue.reuse();
                            break;
                        case 3:
                            qrVar.getSendMessagesHelper().p0(TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC.TL_inputMediaGame) TLRPC.InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                            byteBufferValue.reuse();
                            break;
                        case 4:
                            g0.h3(new ci.h8(qrVar, byteBufferValue.readInt64(false), byteBufferValue.readBool(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue));
                            byteBufferValue.reuse();
                            break;
                        case 6:
                            final long readInt325 = byteBufferValue.readInt32(false);
                            final qr qrVar3 = qrVar;
                            final int readInt326 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            p5 p5Var2 = Utilities.d;
                            final int i3 = 0;
                            Runnable runnable = new Runnable() { // from class: org.telegram.messenger.dq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            qrVar3.getMessagesController().J0(readInt325, readInt326, longValue, TLdeserialize2);
                                            break;
                                        default:
                                            qrVar3.getMessagesController().J0(readInt325, readInt326, longValue, TLdeserialize2);
                                            break;
                                    }
                                }
                            };
                            qrVar = qrVar3;
                            p5Var2.c(runnable);
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
                                qrVar.q1(longValue);
                            } else {
                                final int i10 = 0;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.eq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                qrVar.getMessagesController().a0(null, null, null, -readInt327, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                            default:
                                                qrVar.getMessagesController().a0(null, null, null, readInt327, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                        }
                                    }
                                });
                            }
                            byteBufferValue.reuse();
                            break;
                        case 9:
                            g0.h3(new t8(qrVar, byteBufferValue.readInt64(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, 4));
                            byteBufferValue.reuse();
                            break;
                        case 11:
                            qr qrVar4 = qrVar;
                            int readInt329 = byteBufferValue.readInt32(false);
                            long readInt3210 = byteBufferValue.readInt32(false);
                            xp xpVar = new xp(readInt329, byteBufferValue.readInt32(false), readInt3210, longValue, qrVar4, readInt3210 != 0 ? TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null);
                            qrVar = qrVar4;
                            g0.h3(xpVar);
                            byteBufferValue.reuse();
                            break;
                        case 12:
                        case 19:
                        case 20:
                            qrVar.q1(longValue);
                            byteBufferValue.reuse();
                            break;
                        case 13:
                            final long readInt64 = byteBufferValue.readInt64(false);
                            final boolean readBool2 = byteBufferValue.readBool(false);
                            final int readInt3211 = byteBufferValue.readInt32(false);
                            final int readInt3212 = byteBufferValue.readInt32(false);
                            final boolean readBool3 = byteBufferValue.readBool(false);
                            final TLRPC.InputPeer TLdeserialize4 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.zp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    long j10 = longValue;
                                    hp messagesController = qr.this.getMessagesController();
                                    long j11 = readInt64;
                                    boolean z10 = readBool2;
                                    messagesController.Y(j11, z10 ? 1 : 0, readInt3211, readInt3212, readBool3, TLdeserialize4, j10);
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 15:
                            final TLRPC.InputPeer TLdeserialize5 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final int i11 = 0;
                            Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.aq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            qrVar.getMessagesController().f3(TLdeserialize5, longValue);
                                            break;
                                        default:
                                            qrVar.getMessagesController().b4(TLdeserialize5, longValue);
                                            break;
                                    }
                                }
                            });
                            byteBufferValue.reuse();
                            break;
                        case 16:
                            final qr qrVar5 = qrVar;
                            final int readInt3213 = byteBufferValue.readInt32(false);
                            int readInt3214 = byteBufferValue.readInt32(false);
                            final ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < readInt3214; i12++) {
                                arrayList.add(TLRPC.InputDialogPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            final int i13 = 0;
                            Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.bq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            qrVar5.getMessagesController().m4(readInt3213, longValue, arrayList);
                                            break;
                                        default:
                                            qrVar5.getMessagesController().e(null, readInt3213, -1, arrayList, longValue);
                                            break;
                                    }
                                }
                            };
                            qrVar = qrVar5;
                            g0.h3(runnable2);
                            byteBufferValue.reuse();
                            break;
                        case 17:
                            final qr qrVar6 = qrVar;
                            final int readInt3215 = byteBufferValue.readInt32(false);
                            int readInt3216 = byteBufferValue.readInt32(false);
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i14 = 0; i14 < readInt3216; i14++) {
                                arrayList2.add(TLRPC.TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            final int i15 = 1;
                            Runnable runnable3 = new Runnable() { // from class: org.telegram.messenger.bq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            qrVar6.getMessagesController().m4(readInt3215, longValue, arrayList2);
                                            break;
                                        default:
                                            qrVar6.getMessagesController().e(null, readInt3215, -1, arrayList2, longValue);
                                            break;
                                    }
                                }
                            };
                            qrVar = qrVar6;
                            g0.h3(runnable3);
                            byteBufferValue.reuse();
                            break;
                        case 18:
                            long readInt642 = byteBufferValue.readInt64(false);
                            byteBufferValue.readInt32(false);
                            TLRPC.TL_messages_deleteScheduledMessages TLdeserialize6 = TLRPC.TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize6 == null) {
                                qrVar.q1(longValue);
                            } else {
                                g0.h3(new t8(qrVar, readInt642, longValue, TLdeserialize6, 3));
                            }
                            byteBufferValue.reuse();
                            break;
                        case 21:
                            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                            byteBufferValue.readInt64(false);
                            b6Var.i = byteBufferValue.readBool(false);
                            b6Var.j = byteBufferValue.readBool(false);
                            b6Var.d = byteBufferValue.readInt32(false);
                            b6Var.e = byteBufferValue.readInt32(false);
                            b6Var.h = byteBufferValue.readInt32(false);
                            b6Var.k = (float) byteBufferValue.readDouble(false);
                            boolean readBool4 = byteBufferValue.readBool(false);
                            b6Var.c = byteBufferValue.readString(false);
                            b6Var.b = byteBufferValue.readString(false);
                            g0.h3(new jg(qrVar, b6Var, readBool4, longValue, 5));
                            byteBufferValue.reuse();
                            break;
                        case 22:
                            final TLRPC.InputPeer TLdeserialize7 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final int i16 = 1;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.aq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            qrVar.getMessagesController().f3(TLdeserialize7, longValue);
                                            break;
                                        default:
                                            qrVar.getMessagesController().b4(TLdeserialize7, longValue);
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
                            if (!m5.C(readInt643) && m5.z(readInt643) && byteBufferValue.hasRemaining()) {
                                r2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            }
                            final TLRPC.InputChannel inputChannel = r2;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.yp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qr.this.getMessagesController().q3(readInt643, readInt3217, inputChannel, readInt3218, longValue, readInt322 == 23);
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
                                qrVar.q1(longValue);
                            } else {
                                final int i17 = 1;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.eq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                qrVar.getMessagesController().a0(null, null, null, -readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                            default:
                                                qrVar.getMessagesController().a0(null, null, null, readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                        }
                                    }
                                });
                            }
                            byteBufferValue.reuse();
                            break;
                        case 25:
                            final long readInt645 = byteBufferValue.readInt64(false);
                            final qr qrVar7 = qrVar;
                            final int readInt3220 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize9 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            p5 p5Var3 = Utilities.d;
                            final int i18 = 1;
                            try {
                                Runnable runnable4 = new Runnable() { // from class: org.telegram.messenger.dq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                qrVar7.getMessagesController().J0(readInt645, readInt3220, longValue, TLdeserialize9);
                                                break;
                                            default:
                                                qrVar7.getMessagesController().J0(readInt645, readInt3220, longValue, TLdeserialize9);
                                                break;
                                        }
                                    }
                                };
                                qrVar = qrVar7;
                                p5Var3.c(runnable4);
                                byteBufferValue.reuse();
                                break;
                            } catch (Exception e10) {
                                e = e10;
                                qrVar = qrVar7;
                                qrVar.o(e, true);
                                return;
                            }
                        default:
                            switch (readInt322) {
                                case hs.l1 /* 100 */:
                                    final qr qrVar8 = qrVar;
                                    try {
                                        readInt32 = byteBufferValue.readInt32(false);
                                        readBool = byteBufferValue.readBool(false);
                                    } catch (Exception e11) {
                                        e = e11;
                                        qrVar = qrVar8;
                                    }
                                    try {
                                        Runnable runnable5 = new Runnable() { // from class: org.telegram.messenger.cq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                qrVar8.getSecretChatHelper().e(readInt32, longValue, readBool);
                                            }
                                        };
                                        qrVar = qrVar8;
                                        g0.h3(runnable5);
                                        byteBufferValue.reuse();
                                        break;
                                    } catch (Exception e12) {
                                        e = e12;
                                        qrVar = qrVar8;
                                        qrVar.o(e, true);
                                        return;
                                    }
                                case 101:
                                    break;
                                case hs.n1 /* 102 */:
                                    g0.h3(new qq(qrVar, longValue, byteBufferValue.readInt64(false), byteBufferValue.readInt32(false), 3));
                                    byteBufferValue.reuse();
                                    break;
                                case hs.o1 /* 103 */:
                                    long readInt646 = byteBufferValue.readInt64(false);
                                    int readInt3221 = byteBufferValue.readInt32(false);
                                    int readInt3222 = byteBufferValue.readInt32(false);
                                    Object TLdeserialize10 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3222, false);
                                    if (TLdeserialize10 == null) {
                                        TLdeserialize10 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3222, false);
                                    }
                                    if (TLdeserialize10 == null) {
                                        qrVar.q1(longValue);
                                    } else {
                                        g0.h3(new nh(qrVar, readInt646, longValue, TLdeserialize10, readInt3221, 2));
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
        int i3 = 0;
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                try {
                    qrVar.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    qrVar.o(e10, true);
                }
                int i10 = qrVar.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
                g0.h3(new ii.i2(i10, 13));
                return;
            case 1:
                qr qrVar2 = this.b;
                qrVar2.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = hp.s1(qrVar2.currentAccount).d7.getAll();
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
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    try {
                        qrVar2.b.beginTransaction();
                        SQLitePreparedStatement executeFast = qrVar2.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i3 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i3));
                            executeFast.bindLong(2, ((Long) hVar.n(i3)).longValue());
                            executeFast.step();
                            i3++;
                        }
                        executeFast.dispose();
                        qrVar2.b.commitTransaction();
                        return;
                    } catch (Exception e12) {
                        qrVar2.o(e12, true);
                        return;
                    }
                } catch (Throwable th2) {
                    qrVar2.o(th2, true);
                    return;
                }
            case 2:
                qr qrVar3 = this.b;
                if (qrVar3.R) {
                    qrVar3.R = false;
                    hs.f(qrVar3.currentAccount).k(hs.S4, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                hs.f(this.b.currentAccount).k(hs.a5, new Object[0]);
                return;
            case 4:
                qr qrVar4 = this.b;
                qrVar4.R = true;
                hs.f(qrVar4.currentAccount).k(hs.S4, Boolean.TRUE);
                return;
            case 5:
                qr qrVar5 = this.b;
                qrVar5.R = false;
                hs.f(qrVar5.currentAccount).k(hs.S4, Boolean.FALSE);
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
                qr qrVar6 = this.b;
                ArrayList arrayList = qrVar6.getMessagesController().Q0;
                int size = arrayList.size();
                while (i3 < size) {
                    ((mo) arrayList.get(i3)).d = ((mo) arrayList.get(i3)).e;
                    i3++;
                }
                qrVar6.L = qrVar6.N;
                qrVar6.M = qrVar6.O;
                return;
            case 8:
                qr qrVar7 = this.b;
                for (int i11 = 0; i11 < 2; i11++) {
                    qrVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    qrVar7.getUserConfig().z(i11, 0);
                }
                h10 userConfig = qrVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                h10 userConfig2 = qrVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                qrVar7.getNotificationCenter().k(hs.L4, new Object[0]);
                qrVar7.getMediaDataController().E0(false, true, null);
                qrVar7.getNotificationCenter().k(hs.t5, new Object[0]);
                qrVar7.getMessagesController().P1().q();
                return;
            case 9:
                this.b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 10:
                this.b.V0(1);
                return;
            case 11:
                qr qrVar8 = this.b;
                qrVar8.getClass();
                try {
                    qrVar8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    qrVar8.o(e14, true);
                    return;
                }
            case 12:
                qr qrVar9 = this.b;
                qrVar9.p(true);
                qrVar9.s();
                qrVar9.V0(1);
                g0.h3(new hq(qrVar9, 19));
                return;
            case 13:
                qr qrVar10 = this.b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i12 = 1;
                try {
                    try {
                        queryFinalized = qrVar10.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e15) {
                        e = e15;
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
                        qrVar10.n0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    qrVar10.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    g5 contactsController = qrVar10.getContactsController();
                    contactsController.getClass();
                    g0.h3(new vf(contactsController, arrayList3, i12, arrayList2, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                g5 contactsController2 = qrVar10.getContactsController();
                contactsController2.getClass();
                g0.h3(new vf(contactsController2, arrayList3, i12, arrayList2, 3));
                return;
            case 14:
                this.b.getNotificationCenter().k(hs.F1, new Object[0]);
                return;
            case 15:
                qr qrVar11 = this.b;
                qrVar11.getClass();
                try {
                    qrVar11.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    qrVar11.o(e17, true);
                    return;
                }
            case 16:
                this.b.z0();
                return;
            case 17:
                qr qrVar12 = this.b;
                ArrayList arrayList5 = qrVar12.getMessagesController().Q0;
                int size2 = arrayList5.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((mo) arrayList5.get(i13)).d = ((mo) arrayList5.get(i13)).e;
                }
                qrVar12.L = qrVar12.N;
                qrVar12.M = qrVar12.O;
                hs notificationCenter = qrVar12.getNotificationCenter();
                int i14 = hp.C8;
                notificationCenter.k(2, 256);
                return;
            case 18:
                qr qrVar13 = this.b;
                qrVar13.getClass();
                try {
                    qrVar13.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    qrVar13.o(e18, true);
                    return;
                }
            case 19:
                qr qrVar14 = this.b;
                qrVar14.getNotificationCenter().k(hs.t5, new Object[0]);
                qrVar14.getNotificationCenter().k(hs.L4, new Object[0]);
                qrVar14.getMessagesController().G1().a();
                return;
            case 20:
                this.b.getMessagesController().G1().a();
                return;
            case 21:
                qr qrVar15 = this.b;
                try {
                    try {
                        sQLiteCursor = qrVar15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        g0.h3(new k(5, arrayList6));
                    } catch (Exception e19) {
                        qrVar15.o(e19, true);
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
            case 22:
                this.b.D0();
                return;
            case 23:
                this.b.getNotificationCenter().k(hs.t5, new Object[0]);
                return;
            case 24:
                qr qrVar16 = this.b;
                ArrayList arrayList7 = qrVar16.getMessagesController().Q0;
                int size3 = arrayList7.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((mo) arrayList7.get(i15)).d = ((mo) arrayList7.get(i15)).e;
                }
                qrVar16.L = qrVar16.N;
                qrVar16.M = qrVar16.O;
                hs notificationCenter2 = qrVar16.getNotificationCenter();
                int i16 = hp.C8;
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
                this.b.getMessagesController().X0();
                return;
            default:
                this.b.C0();
                return;
        }
    }
}

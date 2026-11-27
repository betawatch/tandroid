// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class be7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;

    public /* synthetic */ be7(jf7 jf7Var, byte b) {
        this.a = b;
        this.b = jf7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d9  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        boolean z;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor2;
        jf7 jf7Var = this.b;
        int i = 1;
        try {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            arrayList2.add(Long.valueOf(jf7Var.getUserConfig().e()));
            ?? r10 = 0;
            SQLiteCursor queryFinalized = jf7Var.b.queryFinalized("SELECT id, ord, unread_count, flags, title, color, entities, noanimate FROM dialog_filter WHERE 1", new Object[0]);
            boolean z2 = false;
            boolean z3 = false;
            while (queryFinalized.next()) {
                try {
                    try {
                        ac7 ac7Var = new ac7();
                        ac7Var.a = queryFinalized.intValue(r10);
                        ac7Var.f = queryFinalized.intValue(i == true ? 1 : 0);
                        ac7Var.d = -1;
                        ac7Var.e = -1;
                        ac7Var.g = queryFinalized.intValue(3);
                        ac7Var.b = queryFinalized.stringValue(4);
                        ac7Var.m = queryFinalized.intValue(5);
                        ac7Var.c = new ArrayList();
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(6);
                        if (byteBufferValue != null) {
                            try {
                                ac7Var.c = Vector.deserialize(byteBufferValue, new hz6((byte) 13), (boolean) r10);
                                byteBufferValue.reuse();
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = queryFinalized;
                                z = i == true ? 1 : 0;
                                sQLitePreparedStatement = null;
                                try {
                                    jf7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            }
                        }
                        ac7Var.n = queryFinalized.intValue(7) == i ? i == true ? 1 : 0 : r10;
                        jf7Var.I.add(ac7Var);
                        jf7Var.J.put(ac7Var.a, ac7Var);
                        sparseArray.put(ac7Var.a, ac7Var);
                        boolean z4 = z3;
                        if (ac7Var.e < 0) {
                            z4 = i == true ? 1 : 0;
                        }
                        int i2 = r10;
                        int i3 = r10;
                        while (i2 < 2) {
                            SQLiteDatabase sQLiteDatabase = jf7Var.b;
                            if (i2 == 0) {
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + ac7Var.a, new Object[i3]);
                            } else {
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + ac7Var.a, new Object[i3]);
                            }
                            while (sQLiteCursor2.next()) {
                                long longValue = sQLiteCursor2.longValue(i3);
                                if (i2 == 0) {
                                    if (!wf3.B(longValue)) {
                                        ac7Var.h.add(Long.valueOf(longValue));
                                        i = 1;
                                    }
                                    int intValue = sQLiteCursor2.intValue(i);
                                    if (intValue != Integer.MIN_VALUE) {
                                        ac7Var.j.put(longValue, intValue);
                                        if (!arrayList5.contains(Long.valueOf(longValue))) {
                                            arrayList5.add(Long.valueOf(longValue));
                                        }
                                    }
                                } else if (!wf3.B(longValue)) {
                                    ac7Var.i.add(Long.valueOf(longValue));
                                }
                                if (wf3.y(longValue)) {
                                    long j = -longValue;
                                    if (!arrayList3.contains(Long.valueOf(j))) {
                                        arrayList3.add(Long.valueOf(j));
                                    }
                                } else if (!wf3.D(longValue)) {
                                    int i4 = (int) (longValue & 4294967295L);
                                    if (!arrayList4.contains(Integer.valueOf(i4))) {
                                        arrayList4.add(Integer.valueOf(i4));
                                    }
                                } else if (!arrayList2.contains(Long.valueOf(longValue))) {
                                    arrayList2.add(Long.valueOf(longValue));
                                }
                                i = 1;
                                i3 = 0;
                            }
                            sQLiteCursor2.dispose();
                            i2++;
                            i = 1;
                            i3 = 0;
                        }
                        if (ac7Var.a == 0) {
                            z2 = true;
                        }
                        i = 1;
                        r10 = 0;
                        z3 = z4;
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = null;
                        z = true;
                        jf7Var.n(e, z);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
            }
            queryFinalized.dispose();
            if (!z2) {
                ac7 ac7Var2 = new ac7();
                ac7Var2.a = 0;
                ac7Var2.f = 0;
                ac7Var2.m = -1;
                ac7Var2.b = "ALL_CHATS";
                int i5 = 0;
                while (true) {
                    int size = jf7Var.I.size();
                    arrayList = jf7Var.I;
                    if (i5 >= size) {
                        break;
                    }
                    ((ac7) arrayList.get(i5)).f++;
                    i5++;
                }
                arrayList.add(ac7Var2);
                jf7Var.J.put(ac7Var2.a, ac7Var2);
                sparseArray.put(ac7Var2.a, ac7Var2);
                SQLitePreparedStatement executeFast = jf7Var.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    executeFast.bindInteger(1, ac7Var2.a);
                    executeFast.bindInteger(2, ac7Var2.f);
                    executeFast.bindInteger(3, ac7Var2.d);
                    executeFast.bindInteger(4, ac7Var2.g);
                    executeFast.bindString(5, ac7Var2.b);
                    executeFast.bindInteger(6, ac7Var2.m);
                    Vector vector = new Vector(new hz6((byte) 13));
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
                    vector.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(7, nativeByteBuffer);
                    executeFast.bindInteger(8, ac7Var2.n ? 1 : 0);
                    executeFast.stepThis().dispose();
                    nativeByteBuffer.reuse();
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    z = true;
                    jf7Var.n(e, z);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
            }
            Collections.sort(jf7Var.I, new vk6((byte) 24));
            if (z3) {
                jf7Var.i(true);
            }
            TLRPC.TL_messages_dialogs E0 = !arrayList5.isEmpty() ? jf7Var.E0(arrayList2, arrayList3, arrayList4, TextUtils.join(",", arrayList5)) : new TLRPC.TL_messages_dialogs();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            if (!arrayList4.isEmpty()) {
                jf7Var.T(TextUtils.join(",", arrayList4), arrayList8, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                jf7Var.k0(arrayList2, arrayList6, false);
            }
            if (!arrayList3.isEmpty()) {
                jf7Var.P(TextUtils.join(",", arrayList3), arrayList7);
            }
            uc7 messagesController = jf7Var.getMessagesController();
            ArrayList arrayList9 = new ArrayList(jf7Var.I);
            messagesController.getClass();
            Utilities.d.c(new oa7(messagesController, E0, arrayList8, null, 0, arrayList9, arrayList6, arrayList7, null));
        } catch (Exception e4) {
            e = e4;
            sQLitePreparedStatement = null;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[Catch: Exception -> 0x037b, TryCatch #0 {Exception -> 0x037b, blocks: (B:3:0x0005, B:4:0x0010, B:6:0x0016, B:9:0x0020, B:10:0x0025, B:11:0x0028, B:13:0x0372, B:16:0x002d, B:18:0x003f, B:20:0x0045, B:21:0x004a, B:22:0x0055, B:23:0x006b, B:24:0x007d, B:25:0x009b, B:27:0x00a9, B:29:0x00af, B:30:0x00b4, B:31:0x00bf, B:33:0x00d3, B:35:0x00d9, B:37:0x00df, B:38:0x00e7, B:39:0x00f2, B:40:0x0107, B:41:0x0150, B:43:0x0161, B:44:0x0166, B:45:0x0172, B:47:0x0182, B:49:0x0190, B:50:0x019b, B:52:0x01ab, B:54:0x01b9, B:55:0x01c4, B:56:0x01db, B:57:0x0204, B:58:0x0209, B:60:0x021e, B:61:0x0226, B:62:0x0231, B:63:0x024b, B:65:0x025a, B:67:0x0260, B:68:0x0265, B:69:0x0270, B:70:0x028f, B:71:0x02ad, B:72:0x02d0, B:74:0x0308, B:77:0x0318, B:80:0x0322, B:83:0x032c, B:84:0x0332, B:85:0x0345, B:86:0x035a, B:88:0x0364, B:91:0x0377), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        final jf7 jf7Var = this.b;
        try {
            SQLiteCursor queryFinalized = jf7Var.b.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                final long longValue = queryFinalized.longValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    final int readInt32 = byteBufferValue.readInt32(false);
                    switch (readInt32) {
                        case 0:
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                Utilities.d.c(new cq6((Object) jf7Var, (Object) TLdeserialize, longValue, (byte) 9));
                                break;
                            }
                            break;
                        case 1:
                            Utilities.d.c(new ae7(jf7Var, byteBufferValue.readInt32(false), byteBufferValue.readInt32(false), longValue));
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
                            if (readInt32 >= 5) {
                                tL_dialog.pinned = byteBufferValue.readBool(false);
                                tL_dialog.pinnedNum = byteBufferValue.readInt32(false);
                            }
                            if (readInt32 >= 8) {
                                tL_dialog.unread_mentions_count = byteBufferValue.readInt32(false);
                            }
                            if (readInt32 >= 10) {
                                tL_dialog.unread_mark = byteBufferValue.readBool(false);
                            }
                            if (readInt32 >= 14) {
                                tL_dialog.folder_id = byteBufferValue.readInt32(false);
                            }
                            hl.c3(new ba7((Object) jf7Var, (Object) tL_dialog, (Object) TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, (byte) 19));
                            break;
                        case 3:
                            jf7Var.getSendMessagesHelper().o0(TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC.TL_inputMediaGame) TLRPC.InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                            break;
                        case 4:
                            hl.c3(new qd7(jf7Var, byteBufferValue.readInt64(false), byteBufferValue.readBool(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue));
                            break;
                        case 6:
                            final long readInt322 = byteBufferValue.readInt32(false);
                            final int readInt323 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b = 0;
                            Utilities.d.c(new Runnable() { // from class: rd7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b2 = b;
                                    jf7 jf7Var2 = jf7Var;
                                    switch (b2) {
                                        case 0:
                                            jf7Var2.getMessagesController().J0(readInt322, readInt323, longValue, TLdeserialize2);
                                            break;
                                        default:
                                            jf7Var2.getMessagesController().J0(readInt322, readInt323, longValue, TLdeserialize2);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 7:
                            final long readInt324 = byteBufferValue.readInt32(false);
                            int readInt325 = byteBufferValue.readInt32(false);
                            final TLMethod TLdeserialize3 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt325, false);
                            if (TLdeserialize3 == null) {
                                TLdeserialize3 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt325, false);
                            }
                            if (TLdeserialize3 == null) {
                                jf7Var.n1(longValue);
                                break;
                            } else {
                                final byte b2 = 0;
                                hl.c3(new Runnable() { // from class: td7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        jf7 jf7Var2 = jf7Var;
                                        switch (b3) {
                                            case 0:
                                                jf7Var2.getMessagesController().Y(null, null, null, -readInt324, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                            default:
                                                jf7Var2.getMessagesController().Y(null, null, null, readInt324, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        case 9:
                            hl.c3(new o30((Object) jf7Var, byteBufferValue.readInt64(false), (TLObject) TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, (byte) 10));
                            break;
                        case 11:
                            int readInt326 = byteBufferValue.readInt32(false);
                            long readInt327 = byteBufferValue.readInt32(false);
                            hl.c3(new kd7(jf7Var, readInt327, readInt326, readInt327 != 0 ? TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null, byteBufferValue.readInt32(false), longValue));
                            break;
                        case 12:
                        case 19:
                        case 20:
                            jf7Var.n1(longValue);
                            break;
                        case 13:
                            final long readInt64 = byteBufferValue.readInt64(false);
                            final boolean readBool = byteBufferValue.readBool(false);
                            final int readInt328 = byteBufferValue.readInt32(false);
                            final int readInt329 = byteBufferValue.readInt32(false);
                            final boolean readBool2 = byteBufferValue.readBool(false);
                            final TLRPC.InputPeer TLdeserialize4 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            hl.c3(new Runnable() { // from class: md7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    long j = longValue;
                                    uc7 messagesController = jf7.this.getMessagesController();
                                    long j2 = readInt64;
                                    boolean z = readBool;
                                    messagesController.W(j2, z ? 1 : 0, readInt328, readInt329, readBool2, TLdeserialize4, j);
                                }
                            });
                            break;
                        case 15:
                            final TLRPC.InputPeer TLdeserialize5 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b3 = 0;
                            Utilities.d.c(new Runnable() { // from class: nd7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b4 = b3;
                                    long j = longValue;
                                    TLRPC.InputPeer inputPeer = TLdeserialize5;
                                    jf7 jf7Var2 = jf7Var;
                                    switch (b4) {
                                        case 0:
                                            jf7Var2.getMessagesController().n3(inputPeer, j);
                                            break;
                                        default:
                                            jf7Var2.getMessagesController().n4(inputPeer, j);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 16:
                            int readInt3210 = byteBufferValue.readInt32(false);
                            int readInt3211 = byteBufferValue.readInt32(false);
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < readInt3211; i++) {
                                arrayList.add(TLRPC.InputDialogPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            hl.c3(new od7(jf7Var, readInt3210, arrayList, longValue, (byte) 0));
                            break;
                        case 17:
                            int readInt3212 = byteBufferValue.readInt32(false);
                            int readInt3213 = byteBufferValue.readInt32(false);
                            ArrayList arrayList2 = new ArrayList();
                            for (int i2 = 0; i2 < readInt3213; i2++) {
                                arrayList2.add(TLRPC.TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            hl.c3(new od7(jf7Var, readInt3212, arrayList2, longValue, (byte) 1));
                            break;
                        case 18:
                            long readInt642 = byteBufferValue.readInt64(false);
                            byteBufferValue.readInt32(false);
                            TLRPC.TL_messages_deleteScheduledMessages TLdeserialize6 = TLRPC.TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize6 == null) {
                                jf7Var.n1(longValue);
                                break;
                            } else {
                                hl.c3(new o30((Object) jf7Var, readInt642, longValue, (Object) TLdeserialize6, (byte) 9));
                                break;
                            }
                        case 21:
                            unb unbVar = new unb();
                            byteBufferValue.readInt64(false);
                            unbVar.i = byteBufferValue.readBool(false);
                            unbVar.j = byteBufferValue.readBool(false);
                            unbVar.d = byteBufferValue.readInt32(false);
                            unbVar.e = byteBufferValue.readInt32(false);
                            unbVar.h = byteBufferValue.readInt32(false);
                            unbVar.k = (float) byteBufferValue.readDouble(false);
                            boolean readBool3 = byteBufferValue.readBool(false);
                            unbVar.c = byteBufferValue.readString(false);
                            unbVar.b = byteBufferValue.readString(false);
                            hl.c3(new j61((rf0) jf7Var, (Object) unbVar, readBool3, longValue, (byte) 8));
                            break;
                        case 22:
                            final TLRPC.InputPeer TLdeserialize7 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b4 = 1;
                            hl.c3(new Runnable() { // from class: nd7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b42 = b4;
                                    long j = longValue;
                                    TLRPC.InputPeer inputPeer = TLdeserialize7;
                                    jf7 jf7Var2 = jf7Var;
                                    switch (b42) {
                                        case 0:
                                            jf7Var2.getMessagesController().n3(inputPeer, j);
                                            break;
                                        default:
                                            jf7Var2.getMessagesController().n4(inputPeer, j);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 23:
                            final long readInt643 = byteBufferValue.readInt64(false);
                            final int readInt3214 = byteBufferValue.readInt32(false);
                            final int readInt3215 = byteBufferValue.readInt32(false);
                            if (!wf3.B(readInt643) && wf3.y(readInt643) && byteBufferValue.hasRemaining()) {
                                r0 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            }
                            final TLRPC.InputChannel inputChannel = r0;
                            hl.c3(new Runnable() { // from class: ld7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jf7.this.getMessagesController().y3(readInt643, readInt3214, inputChannel, readInt3215, longValue, readInt32 == 23);
                                }
                            });
                            break;
                        case 24:
                            final long readInt644 = byteBufferValue.readInt64(false);
                            int readInt3216 = byteBufferValue.readInt32(false);
                            final TLMethod TLdeserialize8 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3216, false);
                            if (TLdeserialize8 == null) {
                                TLdeserialize8 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3216, false);
                            }
                            if (TLdeserialize8 == null) {
                                jf7Var.n1(longValue);
                                break;
                            } else {
                                final byte b5 = 1;
                                hl.c3(new Runnable() { // from class: td7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b5;
                                        jf7 jf7Var2 = jf7Var;
                                        switch (b32) {
                                            case 0:
                                                jf7Var2.getMessagesController().Y(null, null, null, -readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                            default:
                                                jf7Var2.getMessagesController().Y(null, null, null, readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        case 25:
                            final long readInt645 = byteBufferValue.readInt64(false);
                            final int readInt3217 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize9 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b6 = 1;
                            Utilities.d.c(new Runnable() { // from class: rd7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b22 = b6;
                                    jf7 jf7Var2 = jf7Var;
                                    switch (b22) {
                                        case 0:
                                            jf7Var2.getMessagesController().J0(readInt645, readInt3217, longValue, TLdeserialize9);
                                            break;
                                        default:
                                            jf7Var2.getMessagesController().J0(readInt645, readInt3217, longValue, TLdeserialize9);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            switch (readInt32) {
                                case jn7.k1 /* 100 */:
                                    final int readInt3218 = byteBufferValue.readInt32(false);
                                    final boolean readBool4 = byteBufferValue.readBool(false);
                                    hl.c3(new Runnable() { // from class: pd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            jf7.this.getSecretChatHelper().e(readInt3218, longValue, readBool4);
                                        }
                                    });
                                    break;
                                case jn7.m1 /* 102 */:
                                    hl.c3(new ae7(jf7Var, longValue, byteBufferValue.readInt64(false), byteBufferValue.readInt32(false), (byte) 2));
                                    break;
                                case jn7.n1 /* 103 */:
                                    long readInt646 = byteBufferValue.readInt64(false);
                                    int readInt3219 = byteBufferValue.readInt32(false);
                                    int readInt3220 = byteBufferValue.readInt32(false);
                                    Object TLdeserialize10 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3220, false);
                                    if (TLdeserialize10 == null) {
                                        TLdeserialize10 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3220, false);
                                    }
                                    if (TLdeserialize10 == null) {
                                        jf7Var.n1(longValue);
                                        break;
                                    } else {
                                        hl.c3(new jc2(jf7Var, readInt646, longValue, TLdeserialize10, readInt3219, (byte) 3));
                                        break;
                                    }
                            }
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            jf7Var.n(e, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        int i = 0;
        switch (this.a) {
            case 0:
                jf7 jf7Var = this.b;
                try {
                    zh6 zh6Var = new zh6();
                    Map<String, ?> all = uc7.s1(jf7Var.currentAccount).W3.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num = (Integer) entry.getValue();
                            if (num.intValue() == 2 || num.intValue() == 3) {
                                String replace = key.replace("notify2_", "");
                                long j = 1;
                                if (num.intValue() != 2) {
                                    if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                        j = 1 | (r0.intValue() << 32);
                                    }
                                }
                                try {
                                    zh6Var.k(Long.parseLong(replace), Long.valueOf(j));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    try {
                        jf7Var.b.beginTransaction();
                        SQLitePreparedStatement executeFast = jf7Var.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i < zh6Var.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, zh6Var.j(i));
                            executeFast.bindLong(2, ((Long) zh6Var.n(i)).longValue());
                            executeFast.step();
                            i++;
                        }
                        executeFast.dispose();
                        jf7Var.b.commitTransaction();
                        return;
                    } catch (Exception e2) {
                        jf7Var.n(e2, true);
                        return;
                    }
                } catch (Throwable th) {
                    jf7Var.n(th, true);
                    return;
                }
            case 1:
                jf7 jf7Var2 = this.b;
                try {
                    jf7Var2.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e3) {
                    jf7Var2.n(e3, true);
                }
                int i2 = jf7Var2.currentAccount;
                ConcurrentHashMap concurrentHashMap = k0d.a;
                hl.c3(new gw0(i2, (byte) 18));
                return;
            case 2:
                jf7 jf7Var3 = this.b;
                if (jf7Var3.R) {
                    jf7Var3.R = false;
                    jn7.f(jf7Var3.currentAccount).k(jn7.V4, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                jn7.f(this.b.currentAccount).k(jn7.d5, new Object[0]);
                return;
            case 4:
                jf7 jf7Var4 = this.b;
                jf7Var4.R = true;
                jn7.f(jf7Var4.currentAccount).k(jn7.V4, Boolean.TRUE);
                return;
            case 5:
                jf7 jf7Var5 = this.b;
                jf7Var5.R = false;
                jn7.f(jf7Var5.currentAccount).k(jn7.V4, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            case 7:
                jf7 jf7Var6 = this.b;
                ArrayList arrayList = jf7Var6.getMessagesController().G0;
                int size = arrayList.size();
                while (i < size) {
                    ((ac7) arrayList.get(i)).d = ((ac7) arrayList.get(i)).e;
                    i++;
                }
                jf7Var6.L = jf7Var6.N;
                jf7Var6.M = jf7Var6.O;
                return;
            case 8:
                this.b.getNotificationCenter().k(79, new Object[0]);
                return;
            case 9:
                jf7 jf7Var7 = this.b;
                for (int i3 = 0; i3 < 2; i3++) {
                    jf7Var7.getUserConfig().w(i3, 0, 0, 0L, 0L, 0L, 0L);
                    jf7Var7.getUserConfig().y(i3, 0);
                }
                yac userConfig = jf7Var7.getUserConfig();
                userConfig.j().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                yac userConfig2 = jf7Var7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.j().edit();
                for (String str : userConfig2.j().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                jf7Var7.getNotificationCenter().k(jn7.O4, new Object[0]);
                jf7Var7.getMediaDataController().G0(false, true, null);
                jf7Var7.getNotificationCenter().k(jn7.w5, new Object[0]);
                jf7Var7.getMessagesController().O1().p();
                return;
            case 10:
                this.b.q1(true);
                return;
            case 11:
                jf7 jf7Var8 = this.b;
                try {
                    jf7Var8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e5) {
                    jf7Var8.n(e5, true);
                    return;
                }
            case 12:
                this.b.getNotificationCenter().k(jn7.F1, new Object[0]);
                return;
            case 13:
                jf7 jf7Var9 = this.b;
                try {
                    jf7Var9.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    jf7Var9.n(e6, true);
                    return;
                }
            case 14:
                jf7 jf7Var10 = this.b;
                try {
                    jf7Var10.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    jf7Var10.n(e7, true);
                    return;
                }
            case 15:
                jf7 jf7Var11 = this.b;
                jf7Var11.o(true);
                jf7Var11.r();
                jf7Var11.S0(1);
                hl.c3(new be7(jf7Var11, (byte) 20));
                return;
            case 16:
                jf7 jf7Var12 = this.b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i4 = 1;
                try {
                    try {
                        queryFinalized = jf7Var12.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e8) {
                        e = e8;
                    }
                } catch (Throwable th2) {
                    th = th2;
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
                        jf7Var12.k0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e9) {
                    e = e9;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    jf7Var12.n(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    lv2 contactsController = jf7Var12.getContactsController();
                    contactsController.getClass();
                    hl.c3(new av2(contactsController, arrayList3, i4, arrayList2, (byte) 0));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                lv2 contactsController2 = jf7Var12.getContactsController();
                contactsController2.getClass();
                hl.c3(new av2(contactsController2, arrayList3, i4, arrayList2, (byte) 0));
                return;
            case 17:
                jf7 jf7Var13 = this.b;
                ArrayList arrayList5 = jf7Var13.getMessagesController().G0;
                int size2 = arrayList5.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((ac7) arrayList5.get(i5)).d = ((ac7) arrayList5.get(i5)).e;
                }
                jf7Var13.L = jf7Var13.N;
                jf7Var13.M = jf7Var13.O;
                jn7 notificationCenter = jf7Var13.getNotificationCenter();
                int i6 = uc7.r5;
                notificationCenter.k(2, 256);
                return;
            case 18:
                this.b.w0();
                return;
            case 19:
                this.b.getMessagesController().F1().a();
                return;
            case 20:
                jf7 jf7Var14 = this.b;
                jf7Var14.getNotificationCenter().k(jn7.w5, new Object[0]);
                jf7Var14.getNotificationCenter().k(jn7.O4, new Object[0]);
                jf7Var14.getMessagesController().F1().a();
                return;
            case 21:
                this.b.A0();
                return;
            case 22:
                this.b.z0();
                return;
            case 23:
                this.b.getNotificationCenter().k(jn7.w5, new Object[0]);
                return;
            case 24:
                jf7 jf7Var15 = this.b;
                try {
                    try {
                        sQLiteCursor = jf7Var15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        hl.c3(new se(arrayList6, (byte) 6));
                    } catch (Throwable th4) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th4;
                    }
                } catch (Exception e10) {
                    jf7Var15.n(e10, true);
                    if (sQLiteCursor == null) {
                        return;
                    }
                }
                sQLiteCursor.dispose();
                return;
            case 25:
                jf7 jf7Var16 = this.b;
                ArrayList arrayList7 = jf7Var16.getMessagesController().G0;
                int size3 = arrayList7.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ((ac7) arrayList7.get(i7)).d = ((ac7) arrayList7.get(i7)).e;
                }
                jf7Var16.L = jf7Var16.N;
                jf7Var16.M = jf7Var16.O;
                jn7 notificationCenter2 = jf7Var16.getNotificationCenter();
                int i8 = uc7.r5;
                notificationCenter2.k(2, 256);
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
                this.b.S0(1);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ku0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pq(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        long j3;
        at atVar = (at) this.b;
        a0.h hVar = (a0.h) this.c;
        ArrayList arrayList = atVar.b;
        ArrayList arrayList2 = atVar.a;
        int m10 = hVar.m();
        boolean z10 = false;
        for (int i7 = 0; i7 < m10; i7++) {
            hVar.j(i7);
            ArrayList arrayList3 = (ArrayList) hVar.n(i7);
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                gj gjVar = (gj) arrayList3.get(i10);
                if (gjVar.J) {
                    j3 = gj.B0(gjVar.k);
                } else {
                    long j10 = gjVar.k.peer_id.channel_id;
                    j3 = j10 != 0 ? -j10 : 0L;
                }
                SparseArray sparseArray = (SparseArray) atVar.c.f(j3);
                if (sparseArray == null) {
                    break;
                }
                gj gjVar2 = (gj) sparseArray.get(gjVar.e1());
                if (gjVar2 != null && (gjVar2.I || gjVar2.J)) {
                    gjVar2 = null;
                }
                if (gjVar2 != null) {
                    sparseArray.put(gjVar.e1(), gjVar);
                    int indexOf = arrayList2.indexOf(gjVar2);
                    if (indexOf >= 0) {
                        arrayList2.set(indexOf, gjVar);
                    }
                    int indexOf2 = arrayList.indexOf(gjVar2);
                    if (indexOf2 >= 0) {
                        arrayList.set(indexOf2, gjVar);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            atVar.Z(false);
        }
    }

    private final void b() {
        bw bwVar = (bw) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        message.send_state = 2;
        bwVar.getNotificationCenter().k(ns.M, Integer.valueOf(message.id));
        bwVar.getSendMessagesHelper().d0(message.id);
        bwVar.getSendMessagesHelper().i0(message.id, false);
    }

    private final void c() {
        TLRPC.Message message;
        ez ezVar = (ez) this.b;
        gj gjVar = (gj) this.c;
        if (gjVar == null || (message = gjVar.k) == null) {
            return;
        }
        message.reqId = 0;
        if (message.send_state == 3) {
            message.send_state = 0;
            ezVar.getNotificationCenter().k(ns.m0, Long.valueOf(gj.B0(gjVar.k)), k5.j(gjVar));
        }
    }

    private final void d() {
        ez ezVar = (ez) this.b;
        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
        ezVar.getMessagesController().M3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    private final void f() {
        ty tyVar = (ty) this.b;
        String str = (String) this.c;
        vy vyVar = tyVar.b;
        HashSet hashSet = vyVar.c;
        hashSet.remove(str);
        vyVar.q.getNotificationCenter().k(ns.v1, Long.valueOf(vyVar.j));
        if (hashSet.isEmpty()) {
            vy.a(vyVar);
        }
    }

    private final void g() {
        zy zyVar = (zy) this.b;
        String str = (String) this.c;
        HashMap hashMap = zyVar.a;
        hashMap.remove(str);
        zyVar.o.getNotificationCenter().k(ns.w1, zyVar.e);
        if (hashMap.isEmpty()) {
            zyVar.b();
        }
    }

    private final void h() {
        h00 h00Var = (h00) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ur urVar = (ur) arrayList.get(i7);
            long j3 = -urVar.a;
            a0.h hVar = (a0.h) h00Var.b.f(j3);
            if (hVar != null) {
                hVar.l(urVar.b);
            }
            ArrayList arrayList2 = (ArrayList) h00Var.a.f(j3);
            if (arrayList2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if ((h00Var.getMessagesController().y2(urVar.a) ? m5.o(((TLRPC.TL_forumTopic) arrayList2.get(i10)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i10)).id) == urVar.b) {
                        arrayList2.remove(i10);
                        h00Var.getNotificationCenter().k(ns.y1, Long.valueOf(-j3), Long.valueOf(urVar.b));
                        hashSet.add(Long.valueOf(j3));
                        break;
                    }
                    i10++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            h00Var.y(((Long) it.next()).longValue(), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0285, code lost:
    
        if (r8 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0288, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.a(r3, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0290, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027e, code lost:
    
        r8.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027c, code lost:
    
        if (r8 == null) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0566  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        int i7;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor queryFinalized;
        TLRPC.TL_chatFull tL_chatFull;
        NativeByteBuffer byteBufferValue;
        vr vrVar;
        ?? r82 = 0;
        SQLiteCursor sQLiteCursor2 = null;
        r8 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r8 = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r8 = null;
        SQLiteCursor sQLiteCursor4 = null;
        int i10 = 2;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                vr vrVar2 = (vr) this.b;
                ai.u2 u2Var = (ai.u2) this.c;
                try {
                    try {
                        vrVar2.b.beginTransaction();
                        String[] strArr = {"messages_v2", "messages_topics"};
                        int i14 = 0;
                        i7 = 0;
                        while (i14 < i10) {
                            try {
                                String str = strArr[i14];
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                SQLiteCursor queryFinalized2 = vrVar2.b.queryFinalized("SELECT mid, uid, custom_params FROM " + str + " WHERE custom_params IS NOT NULL", new Object[i12]);
                                while (queryFinalized2.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i10);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            vi.b(tL_message, byteBufferValue2);
                                            byteBufferValue2.reuse();
                                            if (tL_message.voiceTranscriptionLocal) {
                                                tL_message.voiceTranscription = r82;
                                                tL_message.voiceTranscriptionWords = r82;
                                                tL_message.voiceTranscriptionLocal = i12;
                                                tL_message.voiceTranscriptionOpen = i12;
                                                tL_message.voiceTranscriptionFinal = i12;
                                                tL_message.voiceTranscriptionId = 0L;
                                                long intValue = queryFinalized2.intValue(i12 == true ? 1 : 0);
                                                long longValue = queryFinalized2.longValue(1);
                                                boolean z11 = i12 == true ? 1 : 0;
                                                long[] jArr = new long[2];
                                                jArr[z11 ? 1 : 0] = intValue;
                                                jArr[1] = longValue;
                                                arrayList.add(jArr);
                                                arrayList2.add(tL_message);
                                                i12 = z11 ? 1 : 0;
                                                r82 = 0;
                                                i10 = 2;
                                            }
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        sQLiteCursor = queryFinalized2;
                                        i11 = i7;
                                        z10 = true;
                                        sQLitePreparedStatement = null;
                                        try {
                                            vrVar2.o(e, z10);
                                            sQLiteDatabase2 = vrVar2.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            i7 = i11;
                                            g0.h3(new x0(u2Var, i7, 9));
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase = vrVar2.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteCursor = queryFinalized2;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = vrVar2.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                int i15 = i12 == true ? 1 : 0;
                                queryFinalized2.dispose();
                                SQLitePreparedStatement executeFast = vrVar2.b.executeFast("UPDATE " + str + " SET custom_params = ? WHERE mid = ? AND uid = ?");
                                int i16 = i15;
                                while (i16 < arrayList.size()) {
                                    try {
                                        try {
                                            executeFast.requery();
                                            NativeByteBuffer c10 = vi.c((TLRPC.Message) arrayList2.get(i16));
                                            if (c10 != null) {
                                                try {
                                                    executeFast.bindByteBuffer(1, c10);
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    sQLitePreparedStatement = executeFast;
                                                    z10 = true;
                                                    i11 = i7;
                                                    sQLiteCursor = null;
                                                    vrVar2.o(e, z10);
                                                    sQLiteDatabase2 = vrVar2.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    i7 = i11;
                                                    g0.h3(new x0(u2Var, i7, 9));
                                                    return;
                                                }
                                            } else {
                                                executeFast.bindNull(1);
                                            }
                                            ArrayList arrayList3 = arrayList2;
                                            executeFast.bindInteger(2, (int) ((long[]) arrayList.get(i16))[i15]);
                                            int i17 = i16;
                                            executeFast.bindLong(3, ((long[]) arrayList.get(i16))[1]);
                                            executeFast.step();
                                            if (c10 != null) {
                                                c10.reuse();
                                            }
                                            i16 = i17 + 1;
                                            arrayList2 = arrayList3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            sQLitePreparedStatement = executeFast;
                                            sQLiteCursor = null;
                                            sQLiteDatabase = vrVar2.b;
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.commitTransaction();
                                            }
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        sQLitePreparedStatement = executeFast;
                                        i11 = i7;
                                        z10 = true;
                                    }
                                }
                                executeFast.dispose();
                                if (str.equals("messages_v2")) {
                                    i7 = arrayList.size();
                                }
                                i14++;
                                i12 = i15;
                                r82 = 0;
                                i10 = 2;
                            } catch (Exception e13) {
                                e = e13;
                                i11 = i7;
                                z10 = true;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                vrVar2.o(e, z10);
                                sQLiteDatabase2 = vrVar2.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                i7 = i11;
                                g0.h3(new x0(u2Var, i7, 9));
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = vrVar2.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                    g0.h3(new x0(u2Var, i7, 9));
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
            case 1:
                vr vrVar3 = (vr) this.b;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) this.c;
                try {
                    try {
                        queryFinalized = vrVar3.b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                try {
                    new ArrayList();
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        tL_chatFull = 0;
                    } else {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                        TLdeserialize.online_count = queryFinalized.intValue(2);
                        TLdeserialize.inviterId = queryFinalized.longValue(3);
                        tL_chatFull = TLdeserialize;
                    }
                    queryFinalized.dispose();
                    if (tL_chatFull instanceof TLRPC.TL_chatFull) {
                        tL_chatFull.participants = chatParticipants;
                        g0.h3(new xq(vrVar3, tL_chatFull, i13));
                        SQLitePreparedStatement executeFast2 = vrVar3.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_chatFull.getObjectSize());
                        tL_chatFull.serializeToStream(nativeByteBuffer);
                        executeFast2.bindLong(1, tL_chatFull.id);
                        executeFast2.bindByteBuffer(2, nativeByteBuffer);
                        executeFast2.bindInteger(3, tL_chatFull.pinned_msg_id);
                        executeFast2.bindInteger(4, tL_chatFull.online_count);
                        executeFast2.bindLong(5, tL_chatFull.inviterId);
                        executeFast2.bindInteger(6, tL_chatFull.invitesCount);
                        executeFast2.bindInteger(7, tL_chatFull.participants_count);
                        executeFast2.step();
                        executeFast2.dispose();
                        nativeByteBuffer.reuse();
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor4 = queryFinalized;
                    vrVar3.o(e, true);
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor4 = queryFinalized;
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th;
                }
            case 2:
                ((vr) this.b).C((so) this.c);
                return;
            case 3:
                ((vr) this.b).getMessagesController().O3((TLRPC.TL_updates) this.c, false);
                return;
            case 4:
                ((bn) this.b).a(((int[]) this.c)[0]);
                return;
            case 5:
                vr vrVar4 = (vr) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = vrVar4.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
                        for (TLRPC.ChatTheme chatTheme : list) {
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindString(1, tL_chatThemeUniqueGift.gift.slug);
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_chatThemeUniqueGift.getObjectSize());
                                tL_chatThemeUniqueGift.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement2.bindByteBuffer(2, nativeByteBuffer2);
                                nativeByteBuffer2.reuse();
                                sQLitePreparedStatement2.step();
                            }
                        }
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (SQLiteException e17) {
                        vrVar4.o(e17, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e18) {
                        a8.g(e18, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                } finally {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                }
            case 6:
                vr vrVar5 = (vr) this.b;
                u3 u3Var = (u3) this.c;
                int i18 = 28;
                try {
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        SQLiteCursor queryFinalized3 = vrVar5.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
                        while (queryFinalized3.next()) {
                            try {
                                NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(0);
                                if (byteBufferValue3 != null) {
                                    TLRPC.ChatTheme TLdeserialize2 = TLRPC.ChatTheme.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                    byteBufferValue3.reuse();
                                    if (TLdeserialize2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                                        arrayList4.add((TLRPC.TL_chatThemeUniqueGift) TLdeserialize2);
                                    }
                                }
                            } catch (SQLiteException e19) {
                                e = e19;
                                sQLiteCursor3 = queryFinalized3;
                                vrVar5.o(e, true);
                                break;
                            } catch (Exception e20) {
                                e = e20;
                                sQLiteCursor3 = queryFinalized3;
                                a8.g(e, true);
                                break;
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteCursor2 = queryFinalized3;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized3.dispose();
                        g0.h3(new fi(i18, u3Var, arrayList4));
                        return;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (SQLiteException e21) {
                    e = e21;
                } catch (Exception e22) {
                    e = e22;
                }
            case 7:
                vr vrVar6 = (vr) this.b;
                zs zsVar = (zs) this.c;
                vrVar6.getClass();
                try {
                    vrVar6.b.executeFast("DELETE FROM story_pushes WHERE uid = " + zsVar.a).stepThis().dispose();
                    SQLitePreparedStatement executeFast3 = vrVar6.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : zsVar.c.entrySet()) {
                        int intValue2 = ((Integer) entry.getKey()).intValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue3 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast3.requery();
                        vrVar = vrVar6;
                        try {
                            executeFast3.bindLong(1, zsVar.a);
                            executeFast3.bindInteger(2, intValue2);
                            executeFast3.bindLong(3, longValue2);
                            if (zsVar.b == null) {
                                zsVar.b = "";
                            }
                            executeFast3.bindString(4, zsVar.b);
                            executeFast3.bindInteger(5, zsVar.d ? 1 : 0);
                            executeFast3.bindLong(6, longValue3);
                            executeFast3.step();
                            vrVar6 = vrVar;
                        } catch (Exception e23) {
                            e = e23;
                            vrVar.o(e, true);
                            return;
                        }
                    }
                    vrVar = vrVar6;
                    executeFast3.dispose();
                    return;
                } catch (Exception e24) {
                    e = e24;
                    vrVar = vrVar6;
                }
            case 8:
                vr vrVar7 = (vr) this.b;
                HashMap hashMap = (HashMap) this.c;
                vrVar7.getClass();
                for (ur urVar : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(urVar);
                    num.intValue();
                    try {
                        SQLiteDatabase sQLiteDatabase4 = vrVar7.b;
                        Locale locale = Locale.US;
                        long j3 = urVar.a;
                        long j10 = urVar.b;
                        sQLiteDatabase4.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j3 + " AND topic_id = " + j10 + "), " + num + ") WHERE did = " + j3 + " AND topic_id = " + j10).stepThis().dispose();
                    } catch (SQLiteException e25) {
                        vrVar7.o(e25, true);
                    }
                }
                return;
            case 9:
                ((an) this.b).a(((int[]) this.c)[0]);
                return;
            case 10:
                Intent intent = (Intent) this.b;
                Intent intent2 = (Intent) this.c;
                t0.b.sendBroadcast(intent);
                t0.b.sendBroadcast(intent2);
                return;
            case 11:
                try {
                    t0.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    return;
                } catch (Exception e26) {
                    a8.g(e26, true);
                    return;
                }
            case 12:
                at atVar = (at) this.b;
                if (atVar.s.remove((String) this.c)) {
                    atVar.Z(true);
                    return;
                }
                return;
            case 13:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    t0.b.revokeUriPermission(uri, 1);
                } catch (Exception e27) {
                    a8.g(e27, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e28) {
                        a8.g(e28, true);
                        return;
                    }
                }
                return;
            case 14:
                ((ku0) this.b).x((HashSet) this.c);
                return;
            case 15:
                a();
                return;
            case 16:
                ((s10) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 17:
                tv tvVar = (tv) this.c;
                try {
                    SQLitePreparedStatement executeFast4 = ((vr) this.b).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast4.requery();
                    executeFast4.bindLong(1, 0L);
                    executeFast4.step();
                    executeFast4.dispose();
                } catch (Exception e29) {
                    a8.g(e29, true);
                }
                g0.h3(new rv(tvVar, i10));
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case 21:
                f();
                return;
            case 22:
                g();
                return;
            case 23:
                h();
                return;
            default:
                m10 m10Var = (m10) this.b;
                TLObject tLObject = (TLObject) this.c;
                m10Var.getClass();
                if (tLObject != null) {
                    m10Var.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
                    m10Var.getNotificationCenter().k(ns.s5, new Object[0]);
                    m10Var.r0 = false;
                    m10Var.s0 = System.currentTimeMillis();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ pq(tv tvVar, vr vrVar) {
        this.a = 17;
        this.c = tvVar;
        this.b = vrVar;
    }
}

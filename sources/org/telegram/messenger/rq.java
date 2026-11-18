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
import org.telegram.ui.nu0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class rq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rq(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ((nu0) this.b).x((HashSet) this.c);
    }

    private final void b() {
        long j3;
        xs xsVar = (xs) this.b;
        a0.h hVar = (a0.h) this.c;
        ArrayList arrayList = xsVar.b;
        ArrayList arrayList2 = xsVar.a;
        int m10 = hVar.m();
        boolean z10 = false;
        for (int i7 = 0; i7 < m10; i7++) {
            hVar.j(i7);
            ArrayList arrayList3 = (ArrayList) hVar.n(i7);
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                fj fjVar = (fj) arrayList3.get(i10);
                if (fjVar.J) {
                    j3 = fj.B0(fjVar.k);
                } else {
                    long j10 = fjVar.k.peer_id.channel_id;
                    j3 = j10 != 0 ? -j10 : 0L;
                }
                SparseArray sparseArray = (SparseArray) xsVar.c.f(j3);
                if (sparseArray == null) {
                    break;
                }
                fj fjVar2 = (fj) sparseArray.get(fjVar.e1());
                if (fjVar2 != null && (fjVar2.I || fjVar2.J)) {
                    fjVar2 = null;
                }
                if (fjVar2 != null) {
                    sparseArray.put(fjVar.e1(), fjVar);
                    int indexOf = arrayList2.indexOf(fjVar2);
                    if (indexOf >= 0) {
                        arrayList2.set(indexOf, fjVar);
                    }
                    int indexOf2 = arrayList.indexOf(fjVar2);
                    if (indexOf2 >= 0) {
                        arrayList.set(indexOf2, fjVar);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            xsVar.Z(false);
        }
    }

    private final void c() {
        ((q10) this.b).a(null, ((Throwable) this.c).getMessage());
    }

    private final void d() {
        pv pvVar = (pv) this.c;
        try {
            SQLitePreparedStatement executeFast = ((tr) this.b).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
            executeFast.requery();
            executeFast.bindLong(1, 0L);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new nv(pvVar, 2));
    }

    private final void f() {
        xv xvVar = (xv) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        message.send_state = 2;
        xvVar.getNotificationCenter().k(ks.M, Integer.valueOf(message.id));
        xvVar.getSendMessagesHelper().d0(message.id);
        xvVar.getSendMessagesHelper().i0(message.id, false);
    }

    private final void g() {
        TLRPC.Message message;
        zy zyVar = (zy) this.b;
        fj fjVar = (fj) this.c;
        if (fjVar == null || (message = fjVar.k) == null) {
            return;
        }
        message.reqId = 0;
        if (message.send_state == 3) {
            message.send_state = 0;
            zyVar.getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.k)), f3.i(fjVar));
        }
    }

    private final void h() {
        zy zyVar = (zy) this.b;
        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
        zyVar.getMessagesController().T3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    private final void i() {
        oy oyVar = (oy) this.b;
        String str = (String) this.c;
        qy qyVar = oyVar.b;
        HashSet hashSet = qyVar.c;
        hashSet.remove(str);
        qyVar.q.getNotificationCenter().k(ks.v1, Long.valueOf(qyVar.j));
        if (hashSet.isEmpty()) {
            qy.a(qyVar);
        }
    }

    private final void j() {
        uy uyVar = (uy) this.b;
        String str = (String) this.c;
        HashMap hashMap = uyVar.a;
        hashMap.remove(str);
        uyVar.o.getNotificationCenter().k(ks.w1, uyVar.e);
        if (hashMap.isEmpty()) {
            uyVar.b();
        }
    }

    private final void k() {
        e00 e00Var = (e00) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            sr srVar = (sr) arrayList.get(i7);
            long j3 = -srVar.a;
            a0.h hVar = (a0.h) e00Var.b.f(j3);
            if (hVar != null) {
                hVar.l(srVar.b);
            }
            ArrayList arrayList2 = (ArrayList) e00Var.a.f(j3);
            if (arrayList2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if ((e00Var.getMessagesController().E2(srVar.a) ? n5.o(((TLRPC.TL_forumTopic) arrayList2.get(i10)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i10)).id) == srVar.b) {
                        arrayList2.remove(i10);
                        e00Var.getNotificationCenter().k(ks.y1, Long.valueOf(-j3), Long.valueOf(srVar.b));
                        hashSet.add(Long.valueOf(j3));
                        break;
                    }
                    i10++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e00Var.y(((Long) it.next()).longValue(), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0234, code lost:
    
        if (r7 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0237, code lost:
    
        org.telegram.messenger.g0.g3(new org.telegram.messenger.a(r3, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x023f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022d, code lost:
    
        r7.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022b, code lost:
    
        if (r7 == null) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x054c  */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        int i7;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor queryFinalized;
        TLRPC.TL_chatFull tL_chatFull;
        NativeByteBuffer byteBufferValue;
        int i10 = 2;
        ?? r72 = 0;
        SQLiteCursor sQLiteCursor2 = null;
        r7 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r7 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r7 = null;
        SQLiteCursor sQLiteCursor4 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                tr trVar = (tr) this.b;
                ai.u2 u2Var = (ai.u2) this.c;
                try {
                    try {
                        trVar.b.beginTransaction();
                        String[] strArr = {"messages_v2", "messages_topics"};
                        int i14 = 0;
                        i7 = 0;
                        while (i14 < i10) {
                            try {
                                String str = strArr[i14];
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                SQLiteCursor queryFinalized2 = trVar.b.queryFinalized("SELECT mid, uid, custom_params FROM " + str + " WHERE custom_params IS NOT NULL", new Object[i12]);
                                while (queryFinalized2.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i10);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            ui.b(tL_message, byteBufferValue2);
                                            byteBufferValue2.reuse();
                                            if (tL_message.voiceTranscriptionLocal) {
                                                tL_message.voiceTranscription = r72;
                                                tL_message.voiceTranscriptionWords = r72;
                                                tL_message.voiceTranscriptionLocal = i12;
                                                tL_message.voiceTranscriptionOpen = i12;
                                                tL_message.voiceTranscriptionFinal = i12;
                                                tL_message.voiceTranscriptionId = 0L;
                                                long intValue = queryFinalized2.intValue(i12 == true ? 1 : 0);
                                                boolean z11 = i12 == true ? 1 : 0;
                                                long longValue = queryFinalized2.longValue(1);
                                                long[] jArr = new long[2];
                                                jArr[z11 ? 1 : 0] = intValue;
                                                jArr[1] = longValue;
                                                arrayList.add(jArr);
                                                arrayList2.add(tL_message);
                                                i12 = z11 ? 1 : 0;
                                                i10 = 2;
                                                r72 = 0;
                                            }
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        sQLiteCursor = queryFinalized2;
                                        i11 = i7;
                                        z10 = true;
                                        sQLitePreparedStatement = null;
                                        try {
                                            trVar.o(e, z10);
                                            sQLiteDatabase2 = trVar.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            i7 = i11;
                                            g0.g3(new x0(u2Var, i7, 9));
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase = trVar.b;
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
                                        sQLiteDatabase = trVar.b;
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
                                SQLitePreparedStatement executeFast = trVar.b.executeFast("UPDATE " + str + " SET custom_params = ? WHERE mid = ? AND uid = ?");
                                for (int i16 = i15; i16 < arrayList.size(); i16++) {
                                    try {
                                        try {
                                            executeFast.requery();
                                            NativeByteBuffer c10 = ui.c((TLRPC.Message) arrayList2.get(i16));
                                            if (c10 != null) {
                                                z10 = true;
                                                try {
                                                    executeFast.bindByteBuffer(1, c10);
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    sQLitePreparedStatement = executeFast;
                                                    i11 = i7;
                                                    sQLiteCursor = null;
                                                    trVar.o(e, z10);
                                                    sQLiteDatabase2 = trVar.b;
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
                                                    g0.g3(new x0(u2Var, i7, 9));
                                                    return;
                                                }
                                            } else {
                                                executeFast.bindNull(1);
                                            }
                                            executeFast.bindInteger(2, (int) ((long[]) arrayList.get(i16))[i15]);
                                            executeFast.bindLong(3, ((long[]) arrayList.get(i16))[1]);
                                            executeFast.step();
                                            if (c10 != null) {
                                                c10.reuse();
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            sQLitePreparedStatement = executeFast;
                                            sQLiteCursor = null;
                                            sQLiteDatabase = trVar.b;
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
                                        sQLiteCursor = null;
                                        z10 = true;
                                    }
                                }
                                executeFast.dispose();
                                if (str.equals("messages_v2")) {
                                    i7 = arrayList.size();
                                }
                                i14++;
                                i12 = i15;
                                i10 = 2;
                                r72 = 0;
                            } catch (Exception e13) {
                                e = e13;
                                i11 = i7;
                                sQLiteCursor = null;
                                z10 = true;
                                sQLitePreparedStatement = null;
                                trVar.o(e, z10);
                                sQLiteDatabase2 = trVar.b;
                                if (sQLiteDatabase2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                i7 = i11;
                                g0.g3(new x0(u2Var, i7, 9));
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = trVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                    g0.g3(new x0(u2Var, i7, 9));
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
            case 1:
                sz szVar = (sz) this.b;
                xq xqVar = (xq) this.c;
                tz.a(szVar);
                xqVar.run();
                return;
            case 2:
                tr trVar2 = (tr) this.b;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) this.c;
                try {
                    try {
                        queryFinalized = trVar2.b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
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
                        g0.g3(new vq(trVar2, tL_chatFull, i13));
                        SQLitePreparedStatement executeFast2 = trVar2.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                    trVar2.o(e, true);
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
            case 3:
                ((tr) this.b).C((ro) this.c);
                return;
            case 4:
                ((tr) this.b).getMessagesController().V3((TLRPC.TL_updates) this.c, false);
                return;
            case 5:
                ((bn) this.b).a(((int[]) this.c)[0]);
                return;
            case 6:
                tr trVar3 = (tr) this.b;
                String str2 = (String) this.c;
                trVar3.getClass();
                try {
                    try {
                        sQLitePreparedStatement3 = trVar3.b.executeFast("DELETE FROM onchain_offer_intents WHERE slug = ?");
                        sQLitePreparedStatement3.bindString(1, str2);
                        sQLitePreparedStatement3.step();
                    } catch (Exception e17) {
                        trVar3.o(e17, true);
                        if (sQLitePreparedStatement3 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement3.dispose();
                    return;
                } catch (Throwable th8) {
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                    }
                    throw th8;
                }
            case 7:
                tr trVar4 = (tr) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = trVar4.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
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
                    } finally {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                    }
                } catch (SQLiteException e18) {
                    trVar4.o(e18, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Exception e19) {
                    a8.g(e19, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                }
            case 8:
                tr trVar5 = (tr) this.b;
                a4 a4Var = (a4) this.c;
                int i17 = 28;
                try {
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        SQLiteCursor queryFinalized3 = trVar5.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
                        while (queryFinalized3.next()) {
                            try {
                                NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(0);
                                if (byteBufferValue3 != null) {
                                    TLRPC.ChatTheme TLdeserialize2 = TLRPC.ChatTheme.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                    byteBufferValue3.reuse();
                                    if (TLdeserialize2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                                        arrayList3.add((TLRPC.TL_chatThemeUniqueGift) TLdeserialize2);
                                    }
                                }
                            } catch (SQLiteException e20) {
                                e = e20;
                                sQLiteCursor3 = queryFinalized3;
                                trVar5.o(e, true);
                                break;
                            } catch (Exception e21) {
                                e = e21;
                                sQLiteCursor3 = queryFinalized3;
                                a8.g(e, true);
                                break;
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteCursor2 = queryFinalized3;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized3.dispose();
                        g0.g3(new fi(i17, a4Var, arrayList3));
                        return;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (SQLiteException e22) {
                    e = e22;
                } catch (Exception e23) {
                    e = e23;
                }
            case 9:
                tr trVar6 = (tr) this.b;
                ws wsVar = (ws) this.c;
                trVar6.getClass();
                try {
                    trVar6.b.executeFast("DELETE FROM story_pushes WHERE uid = " + wsVar.a).stepThis().dispose();
                    SQLitePreparedStatement executeFast3 = trVar6.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : wsVar.c.entrySet()) {
                        int intValue2 = ((Integer) entry.getKey()).intValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue3 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast3.requery();
                        executeFast3.bindLong(1, wsVar.a);
                        executeFast3.bindInteger(2, intValue2);
                        executeFast3.bindLong(3, longValue2);
                        if (wsVar.b == null) {
                            wsVar.b = "";
                        }
                        executeFast3.bindString(4, wsVar.b);
                        executeFast3.bindInteger(5, wsVar.d ? 1 : 0);
                        executeFast3.bindLong(6, longValue3);
                        executeFast3.step();
                    }
                    executeFast3.dispose();
                    return;
                } catch (Exception e24) {
                    trVar6.o(e24, true);
                    return;
                }
            case 10:
                tr trVar7 = (tr) this.b;
                HashMap hashMap = (HashMap) this.c;
                trVar7.getClass();
                for (sr srVar : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(srVar);
                    num.intValue();
                    try {
                        SQLiteDatabase sQLiteDatabase4 = trVar7.b;
                        Locale locale = Locale.US;
                        long j3 = srVar.a;
                        long j10 = srVar.b;
                        sQLiteDatabase4.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j3 + " AND topic_id = " + j10 + "), " + num + ") WHERE did = " + j3 + " AND topic_id = " + j10).stepThis().dispose();
                    } catch (SQLiteException e25) {
                        trVar7.o(e25, true);
                    }
                }
                return;
            case 11:
                Intent intent = (Intent) this.b;
                Intent intent2 = (Intent) this.c;
                t0.b.sendBroadcast(intent);
                t0.b.sendBroadcast(intent2);
                return;
            case 12:
                try {
                    t0.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    return;
                } catch (Exception e26) {
                    a8.g(e26, true);
                    return;
                }
            case 13:
                xs xsVar = (xs) this.b;
                if (xsVar.s.remove((String) this.c)) {
                    xsVar.Z(true);
                    return;
                }
                return;
            case 14:
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
            case 15:
                a();
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                f();
                return;
            case 20:
                g();
                return;
            case 21:
                h();
                return;
            case 22:
                i();
                return;
            case 23:
                j();
                return;
            case 24:
                k();
                return;
            default:
                j10 j10Var = (j10) this.b;
                TLObject tLObject = (TLObject) this.c;
                j10Var.getClass();
                if (tLObject != null) {
                    j10Var.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
                    j10Var.getNotificationCenter().k(ks.u5, new Object[0]);
                    j10Var.r0 = false;
                    j10Var.s0 = System.currentTimeMillis();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rq(pv pvVar, tr trVar) {
        this.a = 18;
        this.c = pvVar;
        this.b = trVar;
    }
}

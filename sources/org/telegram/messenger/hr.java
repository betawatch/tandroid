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
import org.telegram.ui.xv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hr(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x049d, code lost:
    
        if (r5 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04a0, code lost:
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.a(r3, 28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0496, code lost:
    
        r5.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0494, code lost:
    
        if (r5 == null) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        long j10;
        long j11;
        TLRPC.Message message;
        int i10;
        long j12 = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        SQLiteCursor sQLiteCursor = null;
        r5 = null;
        SQLiteCursor sQLiteCursor2 = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        int i11 = 2;
        int i12 = 0;
        switch (this.a) {
            case 0:
                ((hs) this.b).getMessagesController().L3((TLRPC.TL_updates) this.c, false);
                return;
            case 1:
                ((nn) this.b).a(((int[]) this.c)[0]);
                return;
            case 2:
                hs hsVar = (hs) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
                        for (TLRPC.ChatTheme chatTheme : list) {
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindString(1, tL_chatThemeUniqueGift.gift.slug);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_chatThemeUniqueGift.getObjectSize());
                                tL_chatThemeUniqueGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                nativeByteBuffer.reuse();
                                sQLitePreparedStatement.step();
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                } catch (SQLiteException e) {
                    hsVar.o(e, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                }
            case 3:
                hs hsVar2 = (hs) this.b;
                x3 x3Var = (x3) this.c;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ?? r72 = 0;
                        SQLiteCursor queryFinalized = hsVar2.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r72);
                                if (byteBufferValue != 0) {
                                    TLRPC.ChatTheme TLdeserialize = TLRPC.ChatTheme.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                    byteBufferValue.reuse();
                                    if (TLdeserialize instanceof TLRPC.TL_chatThemeUniqueGift) {
                                        arrayList.add((TLRPC.TL_chatThemeUniqueGift) TLdeserialize);
                                    }
                                }
                                r72 = 0;
                            } catch (SQLiteException e10) {
                                e = e10;
                                sQLiteCursor2 = queryFinalized;
                                hsVar2.o(e, true);
                                break;
                            } catch (Exception e11) {
                                e = e11;
                                sQLiteCursor2 = queryFinalized;
                                f8.g(e, true);
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        i0.g3(new oi(26, x3Var, arrayList));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                }
            case 4:
                hs hsVar3 = (hs) this.b;
                nt ntVar = (nt) this.c;
                hsVar3.getClass();
                try {
                    hsVar3.b.executeFast("DELETE FROM story_pushes WHERE uid = " + ntVar.a).stepThis().dispose();
                    SQLitePreparedStatement executeFast = hsVar3.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : ntVar.c.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast.requery();
                        executeFast.bindLong(1, ntVar.a);
                        executeFast.bindInteger(2, intValue);
                        executeFast.bindLong(3, longValue);
                        if (ntVar.b == null) {
                            ntVar.b = "";
                        }
                        executeFast.bindString(4, ntVar.b);
                        executeFast.bindInteger(5, ntVar.d ? 1 : 0);
                        executeFast.bindLong(6, longValue2);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e14) {
                    hsVar3.o(e14, true);
                    return;
                }
            case 5:
                hs hsVar4 = (hs) this.b;
                HashMap hashMap = (HashMap) this.c;
                hsVar4.getClass();
                for (gs gsVar : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(gsVar);
                    num.intValue();
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar4.b;
                        Locale locale = Locale.US;
                        long j13 = gsVar.a;
                        long j14 = gsVar.b;
                        sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j13 + " AND topic_id = " + j14 + "), " + num + ") WHERE did = " + j13 + " AND topic_id = " + j14).stepThis().dispose();
                    } catch (SQLiteException e15) {
                        hsVar4.o(e15, true);
                    }
                }
                return;
            case 6:
                ((kn) this.b).a(((int[]) this.c)[0]);
                return;
            case 7:
                Intent intent = (Intent) this.b;
                Intent intent2 = (Intent) this.c;
                w0.b.sendBroadcast(intent);
                w0.b.sendBroadcast(intent2);
                return;
            case 8:
                try {
                    w0.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    return;
                } catch (Exception e16) {
                    f8.g(e16, true);
                    return;
                }
            case 9:
                ot otVar = (ot) this.b;
                if (otVar.s.remove((String) this.c)) {
                    otVar.Z(true);
                    return;
                }
                return;
            case 10:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    z10 = true;
                    try {
                        w0.b.revokeUriPermission(uri, 1);
                    } catch (Exception e17) {
                        e = e17;
                        f8.g(e, z10);
                        if (file == null) {
                        }
                    }
                } catch (Exception e18) {
                    e = e18;
                    z10 = true;
                }
                if (file == null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e19) {
                        f8.g(e19, z10);
                        return;
                    }
                }
                return;
            case 11:
                ((xv0) this.b).x((HashSet) this.c);
                return;
            case 12:
                ot otVar2 = (ot) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList2 = otVar2.b;
                ArrayList arrayList3 = otVar2.a;
                int m10 = hVar.m();
                int i13 = 0;
                boolean z11 = false;
                while (i13 < m10) {
                    hVar.j(i13);
                    ArrayList arrayList4 = (ArrayList) hVar.n(i13);
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            jj jjVar = (jj) arrayList4.get(i14);
                            j10 = j12;
                            if (jjVar.J) {
                                j11 = jj.B0(jjVar.k);
                            } else {
                                long j15 = jjVar.k.peer_id.channel_id;
                                j11 = j15 != j10 ? -j15 : j10;
                            }
                            SparseArray sparseArray = (SparseArray) otVar2.c.f(j11);
                            if (sparseArray == null) {
                                break;
                            }
                            jj jjVar2 = (jj) sparseArray.get(jjVar.f1());
                            if (jjVar2 != null && (jjVar2.I || jjVar2.J)) {
                                jjVar2 = null;
                            }
                            if (jjVar2 != null) {
                                sparseArray.put(jjVar.f1(), jjVar);
                                int indexOf = arrayList3.indexOf(jjVar2);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, jjVar);
                                }
                                int indexOf2 = arrayList2.indexOf(jjVar2);
                                if (indexOf2 >= 0) {
                                    arrayList2.set(indexOf2, jjVar);
                                }
                                z11 = true;
                            }
                            i14++;
                            j12 = j10;
                        } else {
                            j10 = j12;
                        }
                    }
                    i13++;
                    j12 = j10;
                }
                if (z11) {
                    otVar2.Z(false);
                    return;
                }
                return;
            case 13:
                ((j20) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 14:
                gw gwVar = (gw) this.c;
                try {
                    SQLitePreparedStatement executeFast2 = ((hs) this.b).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast2.requery();
                    executeFast2.bindLong(1, 0L);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e20) {
                    f8.g(e20, true);
                }
                i0.g3(new ew(gwVar, i11));
                return;
            case 15:
                ow owVar = (ow) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                owVar.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                owVar.getSendMessagesHelper().d0(message2.id);
                owVar.getSendMessagesHelper().i0(message2.id, false);
                return;
            case 16:
                qz qzVar = (qz) this.b;
                jj jjVar3 = (jj) this.c;
                if (jjVar3 == null || (message = jjVar3.k) == null) {
                    return;
                }
                message.reqId = 0;
                if (message.send_state == 3) {
                    message.send_state = 0;
                    qzVar.getNotificationCenter().k(49, Long.valueOf(jj.B0(jjVar3.k)), m5.j(jjVar3));
                    return;
                }
                return;
            case 17:
                qz qzVar2 = (qz) this.b;
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                qzVar2.getMessagesController().J3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 18:
                fz fzVar = (fz) this.b;
                String str = (String) this.c;
                hz hzVar = fzVar.b;
                HashSet hashSet = hzVar.c;
                hashSet.remove(str);
                hzVar.q.getNotificationCenter().k(zs.v1, Long.valueOf(hzVar.j));
                if (hashSet.isEmpty()) {
                    hz.a(hzVar);
                    return;
                }
                return;
            case 19:
                lz lzVar = (lz) this.b;
                String str2 = (String) this.c;
                HashMap hashMap2 = lzVar.a;
                hashMap2.remove(str2);
                lzVar.o.getNotificationCenter().k(zs.w1, lzVar.e);
                if (hashMap2.isEmpty()) {
                    lzVar.b();
                    return;
                }
                return;
            case 20:
                x00 x00Var = (x00) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = new HashSet();
                int i15 = 0;
                while (i15 < arrayList5.size()) {
                    gs gsVar2 = (gs) arrayList5.get(i15);
                    long j16 = -gsVar2.a;
                    a0.h hVar2 = (a0.h) x00Var.b.f(j16);
                    if (hVar2 != null) {
                        hVar2.l(gsVar2.b);
                    }
                    ArrayList arrayList6 = (ArrayList) x00Var.a.f(j16);
                    if (arrayList6 != null) {
                        int i16 = i12;
                        while (i16 < arrayList6.size()) {
                            i10 = i12;
                            if ((x00Var.getMessagesController().x2(gsVar2.a) ? o5.o(((TLRPC.TL_forumTopic) arrayList6.get(i16)).from_id) : ((TLRPC.TL_forumTopic) arrayList6.get(i16)).id) == gsVar2.b) {
                                arrayList6.remove(i16);
                                zs notificationCenter = x00Var.getNotificationCenter();
                                Long valueOf = Long.valueOf(-j16);
                                Long valueOf2 = Long.valueOf(gsVar2.b);
                                Object[] objArr = new Object[2];
                                objArr[i10] = valueOf;
                                objArr[1] = valueOf2;
                                notificationCenter.k(zs.y1, objArr);
                                hashSet2.add(Long.valueOf(j16));
                                i15++;
                                i12 = i10;
                            } else {
                                i16++;
                                i12 = i10;
                            }
                        }
                    }
                    i10 = i12;
                    i15++;
                    i12 = i10;
                }
                boolean z12 = true;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    x00Var.y(((Long) it.next()).longValue(), z12);
                    z12 = true;
                }
                return;
            default:
                d20 d20Var = (d20) this.b;
                TLObject tLObject = (TLObject) this.c;
                d20Var.getClass();
                if (tLObject != null) {
                    d20Var.p0 = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
                    d20Var.getNotificationCenter().k(zs.s5, new Object[0]);
                    d20Var.q0 = false;
                    d20Var.r0 = System.currentTimeMillis();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ hr(gw gwVar, hs hsVar) {
        this.a = 14;
        this.c = gwVar;
        this.b = hsVar;
    }
}

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
import org.telegram.ui.du0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pq(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x04a9, code lost:
    
        if (r5 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ac, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.a(r3, 27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04a2, code lost:
    
        r5.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a0, code lost:
    
        if (r5 == null) goto L190;
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
        int i3;
        long j12 = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        SQLiteCursor sQLiteCursor = null;
        r5 = null;
        SQLiteCursor sQLiteCursor2 = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        int i10 = 2;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ((qr) this.b).C((mo) this.c);
                return;
            case 1:
                ((qr) this.b).getMessagesController().O3((TLRPC.TL_updates) this.c, false);
                return;
            case 2:
                ((um) this.b).a(((int[]) this.c)[0]);
                return;
            case 3:
                qr qrVar = (qr) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement = qrVar.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
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
                } catch (SQLiteException e10) {
                    qrVar.o(e10, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                }
            case 4:
                qr qrVar2 = (qr) this.b;
                u3 u3Var = (u3) this.c;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ?? r72 = 0;
                        SQLiteCursor queryFinalized = qrVar2.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
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
                            } catch (SQLiteException e12) {
                                e = e12;
                                sQLiteCursor2 = queryFinalized;
                                qrVar2.o(e, true);
                                break;
                            } catch (Exception e13) {
                                e = e13;
                                sQLiteCursor2 = queryFinalized;
                                a8.g(e, true);
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
                        g0.h3(new pq(8, u3Var, arrayList));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                } catch (Exception e15) {
                    e = e15;
                }
            case 5:
                qr qrVar3 = (qr) this.b;
                ts tsVar = (ts) this.c;
                qrVar3.getClass();
                try {
                    qrVar3.b.executeFast("DELETE FROM story_pushes WHERE uid = " + tsVar.a).stepThis().dispose();
                    SQLitePreparedStatement executeFast = qrVar3.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : tsVar.c.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast.requery();
                        executeFast.bindLong(1, tsVar.a);
                        executeFast.bindInteger(2, intValue);
                        executeFast.bindLong(3, longValue);
                        if (tsVar.b == null) {
                            tsVar.b = "";
                        }
                        executeFast.bindString(4, tsVar.b);
                        executeFast.bindInteger(5, tsVar.d ? 1 : 0);
                        executeFast.bindLong(6, longValue2);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e16) {
                    qrVar3.o(e16, true);
                    return;
                }
            case 6:
                qr qrVar4 = (qr) this.b;
                HashMap hashMap = (HashMap) this.c;
                qrVar4.getClass();
                for (pr prVar : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(prVar);
                    num.intValue();
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar4.b;
                        Locale locale = Locale.US;
                        long j13 = prVar.a;
                        long j14 = prVar.b;
                        sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j13 + " AND topic_id = " + j14 + "), " + num + ") WHERE did = " + j13 + " AND topic_id = " + j14).stepThis().dispose();
                    } catch (SQLiteException e17) {
                        qrVar4.o(e17, true);
                    }
                }
                return;
            case 7:
                ((tm) this.b).a(((int[]) this.c)[0]);
                return;
            case 8:
                ((u3) this.b).a((ArrayList) this.c);
                return;
            case 9:
                Intent intent = (Intent) this.b;
                Intent intent2 = (Intent) this.c;
                t0.b.sendBroadcast(intent);
                t0.b.sendBroadcast(intent2);
                return;
            case 10:
                try {
                    t0.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    return;
                } catch (Exception e18) {
                    a8.g(e18, true);
                    return;
                }
            case 11:
                us usVar = (us) this.b;
                if (usVar.s.remove((String) this.c)) {
                    usVar.Z(true);
                    return;
                }
                return;
            case 12:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    z10 = true;
                    try {
                        t0.b.revokeUriPermission(uri, 1);
                    } catch (Exception e19) {
                        e = e19;
                        a8.g(e, z10);
                        if (file == null) {
                        }
                    }
                } catch (Exception e20) {
                    e = e20;
                    z10 = true;
                }
                if (file == null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e21) {
                        a8.g(e21, z10);
                        return;
                    }
                }
                return;
            case 13:
                ((du0) this.b).x((HashSet) this.c);
                return;
            case 14:
                us usVar2 = (us) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList2 = usVar2.b;
                ArrayList arrayList3 = usVar2.a;
                int m10 = hVar.m();
                int i12 = 0;
                boolean z11 = false;
                while (i12 < m10) {
                    hVar.j(i12);
                    ArrayList arrayList4 = (ArrayList) hVar.n(i12);
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            zi ziVar = (zi) arrayList4.get(i13);
                            j10 = j12;
                            if (ziVar.J) {
                                j11 = zi.B0(ziVar.k);
                            } else {
                                long j15 = ziVar.k.peer_id.channel_id;
                                j11 = j15 != j10 ? -j15 : j10;
                            }
                            SparseArray sparseArray = (SparseArray) usVar2.c.f(j11);
                            if (sparseArray == null) {
                                break;
                            }
                            zi ziVar2 = (zi) sparseArray.get(ziVar.f1());
                            if (ziVar2 != null && (ziVar2.I || ziVar2.J)) {
                                ziVar2 = null;
                            }
                            if (ziVar2 != null) {
                                sparseArray.put(ziVar.f1(), ziVar);
                                int indexOf = arrayList3.indexOf(ziVar2);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, ziVar);
                                }
                                int indexOf2 = arrayList2.indexOf(ziVar2);
                                if (indexOf2 >= 0) {
                                    arrayList2.set(indexOf2, ziVar);
                                }
                                z11 = true;
                            }
                            i13++;
                            j12 = j10;
                        } else {
                            j10 = j12;
                        }
                    }
                    i12++;
                    j12 = j10;
                }
                if (z11) {
                    usVar2.Z(false);
                    return;
                }
                return;
            case 15:
                ((n10) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 16:
                nv nvVar = (nv) this.c;
                try {
                    SQLitePreparedStatement executeFast2 = ((qr) this.b).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast2.requery();
                    executeFast2.bindLong(1, 0L);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e22) {
                    a8.g(e22, true);
                }
                g0.h3(new lv(nvVar, i10));
                return;
            case 17:
                vv vvVar = (vv) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                vvVar.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                vvVar.getSendMessagesHelper().d0(message2.id);
                vvVar.getSendMessagesHelper().i0(message2.id, false);
                return;
            case 18:
                yy yyVar = (yy) this.b;
                zi ziVar3 = (zi) this.c;
                if (ziVar3 == null || (message = ziVar3.k) == null) {
                    return;
                }
                message.reqId = 0;
                if (message.send_state == 3) {
                    message.send_state = 0;
                    yyVar.getNotificationCenter().k(49, Long.valueOf(zi.B0(ziVar3.k)), k5.k(ziVar3));
                    return;
                }
                return;
            case 19:
                yy yyVar2 = (yy) this.b;
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                yyVar2.getMessagesController().M3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 20:
                ny nyVar = (ny) this.b;
                String str = (String) this.c;
                py pyVar = nyVar.b;
                HashSet hashSet = pyVar.c;
                hashSet.remove(str);
                pyVar.q.getNotificationCenter().k(hs.v1, Long.valueOf(pyVar.j));
                if (hashSet.isEmpty()) {
                    py.a(pyVar);
                    return;
                }
                return;
            case 21:
                ty tyVar = (ty) this.b;
                String str2 = (String) this.c;
                HashMap hashMap2 = tyVar.a;
                hashMap2.remove(str2);
                tyVar.o.getNotificationCenter().k(hs.w1, tyVar.e);
                if (hashMap2.isEmpty()) {
                    tyVar.b();
                    return;
                }
                return;
            case 22:
                c00 c00Var = (c00) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = new HashSet();
                int i14 = 0;
                while (i14 < arrayList5.size()) {
                    pr prVar2 = (pr) arrayList5.get(i14);
                    long j16 = -prVar2.a;
                    a0.h hVar2 = (a0.h) c00Var.b.f(j16);
                    if (hVar2 != null) {
                        hVar2.l(prVar2.b);
                    }
                    ArrayList arrayList6 = (ArrayList) c00Var.a.f(j16);
                    if (arrayList6 != null) {
                        int i15 = i11;
                        while (i15 < arrayList6.size()) {
                            i3 = i11;
                            if ((c00Var.getMessagesController().y2(prVar2.a) ? m5.o(((TLRPC.TL_forumTopic) arrayList6.get(i15)).from_id) : ((TLRPC.TL_forumTopic) arrayList6.get(i15)).id) == prVar2.b) {
                                arrayList6.remove(i15);
                                hs notificationCenter = c00Var.getNotificationCenter();
                                Long valueOf = Long.valueOf(-j16);
                                Long valueOf2 = Long.valueOf(prVar2.b);
                                Object[] objArr = new Object[2];
                                objArr[i3] = valueOf;
                                objArr[1] = valueOf2;
                                notificationCenter.k(hs.y1, objArr);
                                hashSet2.add(Long.valueOf(j16));
                                i14++;
                                i11 = i3;
                            } else {
                                i15++;
                                i11 = i3;
                            }
                        }
                    }
                    i3 = i11;
                    i14++;
                    i11 = i3;
                }
                boolean z12 = true;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    c00Var.y(((Long) it.next()).longValue(), z12);
                    z12 = true;
                }
                return;
            default:
                h10 h10Var = (h10) this.b;
                TLObject tLObject = (TLObject) this.c;
                h10Var.getClass();
                if (tLObject != null) {
                    h10Var.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
                    h10Var.getNotificationCenter().k(hs.s5, new Object[0]);
                    h10Var.r0 = false;
                    h10Var.s0 = System.currentTimeMillis();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ pq(nv nvVar, qr qrVar) {
        this.a = 16;
        this.c = nvVar;
        this.b = qrVar;
    }
}

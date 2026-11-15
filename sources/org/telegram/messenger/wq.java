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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class wq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x04a9, code lost:
    
        if (r5 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ac, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.a(r3, 28));
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
        long j3;
        long j10;
        TLRPC.Message message;
        int i7;
        long j11 = 0;
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
                ((vr) this.b).C((so) this.c);
                return;
            case 1:
                ((vr) this.b).getMessagesController().O3((TLRPC.TL_updates) this.c, false);
                return;
            case 2:
                ((bn) this.b).a(((int[]) this.c)[0]);
                return;
            case 3:
                vr vrVar = (vr) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
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
                    vrVar.o(e10, true);
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
                vr vrVar2 = (vr) this.b;
                u3 u3Var = (u3) this.c;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ?? r72 = 0;
                        SQLiteCursor queryFinalized = vrVar2.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
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
                                vrVar2.o(e, true);
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
                        g0.h3(new wq(8, u3Var, arrayList));
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
                vr vrVar3 = (vr) this.b;
                zs zsVar = (zs) this.c;
                vrVar3.getClass();
                try {
                    vrVar3.b.executeFast("DELETE FROM story_pushes WHERE uid = " + zsVar.a).stepThis().dispose();
                    SQLitePreparedStatement executeFast = vrVar3.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : zsVar.c.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast.requery();
                        executeFast.bindLong(1, zsVar.a);
                        executeFast.bindInteger(2, intValue);
                        executeFast.bindLong(3, longValue);
                        if (zsVar.b == null) {
                            zsVar.b = "";
                        }
                        executeFast.bindString(4, zsVar.b);
                        executeFast.bindInteger(5, zsVar.d ? 1 : 0);
                        executeFast.bindLong(6, longValue2);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e16) {
                    vrVar3.o(e16, true);
                    return;
                }
            case 6:
                vr vrVar4 = (vr) this.b;
                HashMap hashMap = (HashMap) this.c;
                vrVar4.getClass();
                for (ur urVar : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(urVar);
                    num.intValue();
                    try {
                        SQLiteDatabase sQLiteDatabase = vrVar4.b;
                        Locale locale = Locale.US;
                        long j12 = urVar.a;
                        long j13 = urVar.b;
                        sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j12 + " AND topic_id = " + j13 + "), " + num + ") WHERE did = " + j12 + " AND topic_id = " + j13).stepThis().dispose();
                    } catch (SQLiteException e17) {
                        vrVar4.o(e17, true);
                    }
                }
                return;
            case 7:
                ((an) this.b).a(((int[]) this.c)[0]);
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
                at atVar = (at) this.b;
                if (atVar.s.remove((String) this.c)) {
                    atVar.Z(true);
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
                ((ku0) this.b).x((HashSet) this.c);
                return;
            case 14:
                at atVar2 = (at) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList2 = atVar2.b;
                ArrayList arrayList3 = atVar2.a;
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
                            gj gjVar = (gj) arrayList4.get(i13);
                            j3 = j11;
                            if (gjVar.J) {
                                j10 = gj.B0(gjVar.k);
                            } else {
                                long j14 = gjVar.k.peer_id.channel_id;
                                j10 = j14 != j3 ? -j14 : j3;
                            }
                            SparseArray sparseArray = (SparseArray) atVar2.c.f(j10);
                            if (sparseArray == null) {
                                break;
                            }
                            gj gjVar2 = (gj) sparseArray.get(gjVar.e1());
                            if (gjVar2 != null && (gjVar2.I || gjVar2.J)) {
                                gjVar2 = null;
                            }
                            if (gjVar2 != null) {
                                sparseArray.put(gjVar.e1(), gjVar);
                                int indexOf = arrayList3.indexOf(gjVar2);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, gjVar);
                                }
                                int indexOf2 = arrayList2.indexOf(gjVar2);
                                if (indexOf2 >= 0) {
                                    arrayList2.set(indexOf2, gjVar);
                                }
                                z11 = true;
                            }
                            i13++;
                            j11 = j3;
                        } else {
                            j3 = j11;
                        }
                    }
                    i12++;
                    j11 = j3;
                }
                if (z11) {
                    atVar2.Z(false);
                    return;
                }
                return;
            case 15:
                ((s10) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 16:
                tv tvVar = (tv) this.c;
                try {
                    SQLitePreparedStatement executeFast2 = ((vr) this.b).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast2.requery();
                    executeFast2.bindLong(1, 0L);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e22) {
                    a8.g(e22, true);
                }
                g0.h3(new rv(tvVar, i10));
                return;
            case 17:
                bw bwVar = (bw) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                bwVar.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                bwVar.getSendMessagesHelper().d0(message2.id);
                bwVar.getSendMessagesHelper().i0(message2.id, false);
                return;
            case 18:
                ez ezVar = (ez) this.b;
                gj gjVar3 = (gj) this.c;
                if (gjVar3 == null || (message = gjVar3.k) == null) {
                    return;
                }
                message.reqId = 0;
                if (message.send_state == 3) {
                    message.send_state = 0;
                    ezVar.getNotificationCenter().k(49, Long.valueOf(gj.B0(gjVar3.k)), k5.j(gjVar3));
                    return;
                }
                return;
            case 19:
                ez ezVar2 = (ez) this.b;
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                ezVar2.getMessagesController().M3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 20:
                ty tyVar = (ty) this.b;
                String str = (String) this.c;
                vy vyVar = tyVar.b;
                HashSet hashSet = vyVar.c;
                hashSet.remove(str);
                vyVar.q.getNotificationCenter().k(ns.v1, Long.valueOf(vyVar.j));
                if (hashSet.isEmpty()) {
                    vy.a(vyVar);
                    return;
                }
                return;
            case 21:
                zy zyVar = (zy) this.b;
                String str2 = (String) this.c;
                HashMap hashMap2 = zyVar.a;
                hashMap2.remove(str2);
                zyVar.o.getNotificationCenter().k(ns.w1, zyVar.e);
                if (hashMap2.isEmpty()) {
                    zyVar.b();
                    return;
                }
                return;
            case 22:
                h00 h00Var = (h00) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = new HashSet();
                int i14 = 0;
                while (i14 < arrayList5.size()) {
                    ur urVar2 = (ur) arrayList5.get(i14);
                    long j15 = -urVar2.a;
                    a0.h hVar2 = (a0.h) h00Var.b.f(j15);
                    if (hVar2 != null) {
                        hVar2.l(urVar2.b);
                    }
                    ArrayList arrayList6 = (ArrayList) h00Var.a.f(j15);
                    if (arrayList6 != null) {
                        int i15 = i11;
                        while (i15 < arrayList6.size()) {
                            i7 = i11;
                            if ((h00Var.getMessagesController().y2(urVar2.a) ? m5.o(((TLRPC.TL_forumTopic) arrayList6.get(i15)).from_id) : ((TLRPC.TL_forumTopic) arrayList6.get(i15)).id) == urVar2.b) {
                                arrayList6.remove(i15);
                                ns notificationCenter = h00Var.getNotificationCenter();
                                Long valueOf = Long.valueOf(-j15);
                                Long valueOf2 = Long.valueOf(urVar2.b);
                                Object[] objArr = new Object[2];
                                objArr[i7] = valueOf;
                                objArr[1] = valueOf2;
                                notificationCenter.k(ns.y1, objArr);
                                hashSet2.add(Long.valueOf(j15));
                                i14++;
                                i11 = i7;
                            } else {
                                i15++;
                                i11 = i7;
                            }
                        }
                    }
                    i7 = i11;
                    i14++;
                    i11 = i7;
                }
                boolean z12 = true;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    h00Var.y(((Long) it.next()).longValue(), z12);
                    z12 = true;
                }
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

    public /* synthetic */ wq(tv tvVar, vr vrVar) {
        this.a = 16;
        this.c = tvVar;
        this.b = vrVar;
    }
}

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
import org.telegram.ui.pu0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class zq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zq(int i7, Object obj, Object obj2) {
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
        boolean z9;
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
                ((yr) this.b).C((vo) this.c);
                return;
            case 1:
                ((yr) this.b).getMessagesController().O3((TLRPC.TL_updates) this.c, false);
                return;
            case 2:
                ((en) this.b).a(((int[]) this.c)[0]);
                return;
            case 3:
                yr yrVar = (yr) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
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
                    yrVar.o(e10, true);
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
                yr yrVar2 = (yr) this.b;
                u3 u3Var = (u3) this.c;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ?? r72 = 0;
                        SQLiteCursor queryFinalized = yrVar2.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
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
                                yrVar2.o(e, true);
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
                        g0.h3(new zq(8, u3Var, arrayList));
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
                yr yrVar3 = (yr) this.b;
                ct ctVar = (ct) this.c;
                yrVar3.getClass();
                try {
                    yrVar3.b.executeFast("DELETE FROM story_pushes WHERE uid = " + ctVar.a).stepThis().dispose();
                    SQLitePreparedStatement executeFast = yrVar3.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : ctVar.c.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast.requery();
                        executeFast.bindLong(1, ctVar.a);
                        executeFast.bindInteger(2, intValue);
                        executeFast.bindLong(3, longValue);
                        if (ctVar.b == null) {
                            ctVar.b = "";
                        }
                        executeFast.bindString(4, ctVar.b);
                        executeFast.bindInteger(5, ctVar.d ? 1 : 0);
                        executeFast.bindLong(6, longValue2);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e16) {
                    yrVar3.o(e16, true);
                    return;
                }
            case 6:
                yr yrVar4 = (yr) this.b;
                HashMap hashMap = (HashMap) this.c;
                yrVar4.getClass();
                for (xr xrVar : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(xrVar);
                    num.intValue();
                    try {
                        SQLiteDatabase sQLiteDatabase = yrVar4.b;
                        Locale locale = Locale.US;
                        long j12 = xrVar.a;
                        long j13 = xrVar.b;
                        sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j12 + " AND topic_id = " + j13 + "), " + num + ") WHERE did = " + j12 + " AND topic_id = " + j13).stepThis().dispose();
                    } catch (SQLiteException e17) {
                        yrVar4.o(e17, true);
                    }
                }
                return;
            case 7:
                ((dn) this.b).a(((int[]) this.c)[0]);
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
                dt dtVar = (dt) this.b;
                if (dtVar.s.remove((String) this.c)) {
                    dtVar.Z(true);
                    return;
                }
                return;
            case 12:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    z9 = true;
                    try {
                        t0.b.revokeUriPermission(uri, 1);
                    } catch (Exception e19) {
                        e = e19;
                        a8.g(e, z9);
                        if (file == null) {
                        }
                    }
                } catch (Exception e20) {
                    e = e20;
                    z9 = true;
                }
                if (file == null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e21) {
                        a8.g(e21, z9);
                        return;
                    }
                }
                return;
            case 13:
                ((pu0) this.b).x((HashSet) this.c);
                return;
            case 14:
                dt dtVar2 = (dt) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList2 = dtVar2.b;
                ArrayList arrayList3 = dtVar2.a;
                int m10 = hVar.m();
                int i12 = 0;
                boolean z10 = false;
                while (i12 < m10) {
                    hVar.j(i12);
                    ArrayList arrayList4 = (ArrayList) hVar.n(i12);
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            ij ijVar = (ij) arrayList4.get(i13);
                            j3 = j11;
                            if (ijVar.J) {
                                j10 = ij.B0(ijVar.k);
                            } else {
                                long j14 = ijVar.k.peer_id.channel_id;
                                j10 = j14 != j3 ? -j14 : j3;
                            }
                            SparseArray sparseArray = (SparseArray) dtVar2.c.f(j10);
                            if (sparseArray == null) {
                                break;
                            }
                            ij ijVar2 = (ij) sparseArray.get(ijVar.e1());
                            if (ijVar2 != null && (ijVar2.I || ijVar2.J)) {
                                ijVar2 = null;
                            }
                            if (ijVar2 != null) {
                                sparseArray.put(ijVar.e1(), ijVar);
                                int indexOf = arrayList3.indexOf(ijVar2);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, ijVar);
                                }
                                int indexOf2 = arrayList2.indexOf(ijVar2);
                                if (indexOf2 >= 0) {
                                    arrayList2.set(indexOf2, ijVar);
                                }
                                z10 = true;
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
                if (z10) {
                    dtVar2.Z(false);
                    return;
                }
                return;
            case 15:
                ((v10) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 16:
                vv vvVar = (vv) this.c;
                try {
                    SQLitePreparedStatement executeFast2 = ((yr) this.b).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast2.requery();
                    executeFast2.bindLong(1, 0L);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e22) {
                    a8.g(e22, true);
                }
                g0.h3(new tv(vvVar, i10));
                return;
            case 17:
                dw dwVar = (dw) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                dwVar.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                dwVar.getSendMessagesHelper().d0(message2.id);
                dwVar.getSendMessagesHelper().i0(message2.id, false);
                return;
            case 18:
                gz gzVar = (gz) this.b;
                ij ijVar3 = (ij) this.c;
                if (ijVar3 == null || (message = ijVar3.k) == null) {
                    return;
                }
                message.reqId = 0;
                if (message.send_state == 3) {
                    message.send_state = 0;
                    gzVar.getNotificationCenter().k(49, Long.valueOf(ij.B0(ijVar3.k)), k5.k(ijVar3));
                    return;
                }
                return;
            case 19:
                gz gzVar2 = (gz) this.b;
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                gzVar2.getMessagesController().M3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 20:
                vy vyVar = (vy) this.b;
                String str = (String) this.c;
                xy xyVar = vyVar.b;
                HashSet hashSet = xyVar.c;
                hashSet.remove(str);
                xyVar.q.getNotificationCenter().k(qs.v1, Long.valueOf(xyVar.j));
                if (hashSet.isEmpty()) {
                    xy.a(xyVar);
                    return;
                }
                return;
            case 21:
                bz bzVar = (bz) this.b;
                String str2 = (String) this.c;
                HashMap hashMap2 = bzVar.a;
                hashMap2.remove(str2);
                bzVar.o.getNotificationCenter().k(qs.w1, bzVar.e);
                if (hashMap2.isEmpty()) {
                    bzVar.b();
                    return;
                }
                return;
            case 22:
                k00 k00Var = (k00) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = new HashSet();
                int i14 = 0;
                while (i14 < arrayList5.size()) {
                    xr xrVar2 = (xr) arrayList5.get(i14);
                    long j15 = -xrVar2.a;
                    a0.h hVar2 = (a0.h) k00Var.b.f(j15);
                    if (hVar2 != null) {
                        hVar2.l(xrVar2.b);
                    }
                    ArrayList arrayList6 = (ArrayList) k00Var.a.f(j15);
                    if (arrayList6 != null) {
                        int i15 = i11;
                        while (i15 < arrayList6.size()) {
                            i7 = i11;
                            if ((k00Var.getMessagesController().y2(xrVar2.a) ? m5.o(((TLRPC.TL_forumTopic) arrayList6.get(i15)).from_id) : ((TLRPC.TL_forumTopic) arrayList6.get(i15)).id) == xrVar2.b) {
                                arrayList6.remove(i15);
                                qs notificationCenter = k00Var.getNotificationCenter();
                                Long valueOf = Long.valueOf(-j15);
                                Long valueOf2 = Long.valueOf(xrVar2.b);
                                Object[] objArr = new Object[2];
                                objArr[i7] = valueOf;
                                objArr[1] = valueOf2;
                                notificationCenter.k(qs.y1, objArr);
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
                boolean z11 = true;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    k00Var.y(((Long) it.next()).longValue(), z11);
                    z11 = true;
                }
                return;
            default:
                p10 p10Var = (p10) this.b;
                TLObject tLObject = (TLObject) this.c;
                p10Var.getClass();
                if (tLObject != null) {
                    p10Var.p0 = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
                    p10Var.getNotificationCenter().k(qs.s5, new Object[0]);
                    p10Var.q0 = false;
                    p10Var.r0 = System.currentTimeMillis();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zq(vv vvVar, yr yrVar) {
        this.a = 16;
        this.c = vvVar;
        this.b = yrVar;
    }
}

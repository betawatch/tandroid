// default package

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AutoMessageHeardReceiver;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c70 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c70(int i, int i2, long j, jf7 jf7Var, ArrayList arrayList) {
        this.a = (byte) 5;
        this.b = jf7Var;
        this.d = j;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x022b, code lost:
    
        if (r12 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x013e, code lost:
    
        r12.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x013c, code lost:
    
        if (r6 == 16) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cf A[Catch: all -> 0x0239, Exception -> 0x023b, TryCatch #10 {Exception -> 0x023b, all -> 0x0239, blocks: (B:151:0x0115, B:153:0x0126, B:154:0x0131, B:75:0x0153, B:88:0x01a0, B:89:0x01a4, B:91:0x01a8, B:93:0x01b5, B:94:0x01b7, B:96:0x01bb, B:97:0x01c3, B:99:0x01c7, B:100:0x01cb, B:102:0x01cf, B:103:0x01d3, B:105:0x01d7, B:106:0x01db, B:157:0x012e), top: B:150:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7 A[Catch: all -> 0x0239, Exception -> 0x023b, TryCatch #10 {Exception -> 0x023b, all -> 0x0239, blocks: (B:151:0x0115, B:153:0x0126, B:154:0x0131, B:75:0x0153, B:88:0x01a0, B:89:0x01a4, B:91:0x01a8, B:93:0x01b5, B:94:0x01b7, B:96:0x01bb, B:97:0x01c3, B:99:0x01c7, B:100:0x01cb, B:102:0x01cf, B:103:0x01d3, B:105:0x01d7, B:106:0x01db, B:157:0x012e), top: B:150:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0 A[Catch: all -> 0x0239, Exception -> 0x023b, TRY_ENTER, TryCatch #10 {Exception -> 0x023b, all -> 0x0239, blocks: (B:151:0x0115, B:153:0x0126, B:154:0x0131, B:75:0x0153, B:88:0x01a0, B:89:0x01a4, B:91:0x01a8, B:93:0x01b5, B:94:0x01b7, B:96:0x01bb, B:97:0x01c3, B:99:0x01c7, B:100:0x01cb, B:102:0x01cf, B:103:0x01d3, B:105:0x01d7, B:106:0x01db, B:157:0x012e), top: B:150:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8 A[Catch: all -> 0x0239, Exception -> 0x023b, TryCatch #10 {Exception -> 0x023b, all -> 0x0239, blocks: (B:151:0x0115, B:153:0x0126, B:154:0x0131, B:75:0x0153, B:88:0x01a0, B:89:0x01a4, B:91:0x01a8, B:93:0x01b5, B:94:0x01b7, B:96:0x01bb, B:97:0x01c3, B:99:0x01c7, B:100:0x01cb, B:102:0x01cf, B:103:0x01d3, B:105:0x01d7, B:106:0x01db, B:157:0x012e), top: B:150:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb A[Catch: all -> 0x0239, Exception -> 0x023b, TryCatch #10 {Exception -> 0x023b, all -> 0x0239, blocks: (B:151:0x0115, B:153:0x0126, B:154:0x0131, B:75:0x0153, B:88:0x01a0, B:89:0x01a4, B:91:0x01a8, B:93:0x01b5, B:94:0x01b7, B:96:0x01bb, B:97:0x01c3, B:99:0x01c7, B:100:0x01cb, B:102:0x01cf, B:103:0x01d3, B:105:0x01d7, B:106:0x01db, B:157:0x012e), top: B:150:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c7 A[Catch: all -> 0x0239, Exception -> 0x023b, TryCatch #10 {Exception -> 0x023b, all -> 0x0239, blocks: (B:151:0x0115, B:153:0x0126, B:154:0x0131, B:75:0x0153, B:88:0x01a0, B:89:0x01a4, B:91:0x01a8, B:93:0x01b5, B:94:0x01b7, B:96:0x01bb, B:97:0x01c3, B:99:0x01c7, B:100:0x01cb, B:102:0x01cf, B:103:0x01d3, B:105:0x01d7, B:106:0x01db, B:157:0x012e), top: B:150:0x0115 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        pm3 Z;
        String nativeSessionPush;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement executeFast;
        int i;
        TLRPC.TL_forumTopic tL_forumTopic;
        SQLitePreparedStatement executeFast2;
        SQLiteCursor sQLiteCursor2;
        int i2;
        byte b = this.a;
        long j = this.d;
        int i3 = this.e;
        int i4 = this.c;
        Object obj = this.f;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                int i5 = AutoMessageHeardReceiver.a;
                uc7.s1(((k5) obj2).a).i4((TLRPC.User) obj, true, false);
                uc7 s1 = uc7.s1(i4);
                long j2 = this.d;
                int i6 = this.e;
                s1.r3(j2, i6, i6, 0, false, 0L, 0, true, 0);
                uc7.s1(i4).B3(j2, 0L);
                return;
            case 1:
                int i7 = AutoMessageHeardReceiver.a;
                uc7.s1(((k5) obj2).a).a4((TLRPC.Chat) obj, true);
                uc7 s12 = uc7.s1(i4);
                long j3 = this.d;
                int i8 = this.e;
                s12.r3(j3, i8, i8, 0, false, 0L, 0, true, 0);
                uc7.s1(i4).B3(j3, 0L);
                return;
            case 2:
                t86 t86Var = (t86) obj2;
                float[] fArr = (float[]) obj;
                ByteArrayOutputStream byteArrayOutputStream = t86Var.q;
                boolean z = false;
                t86Var.u = false;
                if (i4 != t86Var.r || t86Var.d == null || fArr == null) {
                    return;
                }
                int i9 = 0;
                while (true) {
                    int[] iArr = DictationLid.j;
                    if (i9 >= iArr.length) {
                        i9 = -1;
                    } else if (iArr[i9] <= i3) {
                        i9++;
                    }
                }
                t86Var.s = i9;
                if (i9 < 0) {
                    t86Var.p.reset();
                    byteArrayOutputStream.reset();
                }
                mn3 l = DictationLid.l(DictationLid.h(i3), fArr);
                pm3 pm3Var = (pm3) t86Var.d.d;
                StringBuilder sb = new StringBuilder("live captions ");
                int i10 = t86Var.a;
                bs2.w(sb, i10, ": tinylid ", i3, " ms speech in ");
                sb.append(j);
                sb.append(" ms: ");
                sb.append(l);
                sb.append(" (");
                sb.append(pm3Var);
                sb.append(")");
                Log.d("Dictation", sb.toString());
                if (l != null) {
                    String str = l.a;
                    if (!l.c || (Z = DictationAsr.Z(str, pm3Var, false)) == null) {
                        return;
                    }
                    nm3 nm3Var = (nm3) Z.b;
                    int max = Math.max(0, i3 - t86Var.o);
                    t86Var.o = Math.max(t86Var.o, i3);
                    if (nm3Var == ((nm3) pm3Var.b) && ((String) Z.c).equals((String) pm3Var.c)) {
                        t86Var.v = true;
                        if (!str.equals(t86Var.k)) {
                            t86Var.l = 0;
                        }
                        t86Var.k = str;
                        t86Var.l = Math.min(30000, t86Var.l + max);
                        t86Var.m = null;
                        t86Var.n = 0;
                        return;
                    }
                    if (!t86Var.v || l.b >= 0.8f) {
                        if (!str.equals(t86Var.m)) {
                            t86Var.m = str;
                            t86Var.n = 0;
                        }
                        int min = Math.min(30000, t86Var.n + max);
                        t86Var.n = min;
                        if (min < t86Var.l / 4) {
                            StringBuilder m = uh9.m(i10, "live captions ", ": staying in ");
                            m.append(t86Var.k);
                            m.append(" (");
                            m.append(t86Var.l);
                            m.append(" ms), ");
                            m.append(t86Var.m);
                            m.append(" has ");
                            m.append(t86Var.n);
                            m.append(" ms");
                            Log.d("Dictation", m.toString());
                            return;
                        }
                        if (!DictationAsr.B(nm3Var)) {
                            hl.c3(new ea5(Z, (byte) 27));
                            return;
                        }
                        rm3 c = rm3.c(Z, t86Var);
                        if (c != null) {
                            t86Var.v = true;
                            t86Var.k = str;
                            t86Var.l = t86Var.n;
                            t86Var.m = null;
                            t86Var.n = 0;
                            StringBuilder m2 = uh9.m(i10, "live captions ", ": replaying ");
                            m2.append(byteArrayOutputStream.size() / 32);
                            m2.append(" ms in ");
                            m2.append(Z);
                            Log.d("Dictation", m2.toString());
                            rm3 rm3Var = t86Var.d;
                            long j4 = rm3Var.c;
                            if (j4 != 0) {
                                DictationAsr.nativeSessionFree(j4);
                                rm3Var.c = 0L;
                                DictationAsr.U((nm3) rm3Var.e);
                            }
                            t86Var.d = c;
                            t86Var.h = 0;
                            t86Var.g = 0;
                            int i11 = t86Var.w;
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            rm3 rm3Var2 = t86Var.d;
                            int length = byteArray.length;
                            long j5 = rm3Var2.c;
                            if (j5 != 0) {
                                nativeSessionPush = DictationAsr.nativeSessionPush(j5, byteArray, 0, length);
                                rm3Var2.b(nativeSessionPush);
                            }
                            if (t86Var.w != i11 || t86Var.j.isEmpty()) {
                                return;
                            }
                            t86Var.j = "";
                            hl.c3(new j61((Object) t86Var, t86Var.f, (Object) "", z, (byte) 2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ls6 ls6Var = (ls6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList == null) {
                        SQLitePreparedStatement executeFast3 = ls6Var.getMessagesStorage().b.executeFast("UPDATE stickers_v2 SET date = ?");
                        executeFast3.requery();
                        executeFast3.bindLong(1, i3);
                        executeFast3.step();
                        executeFast3.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast4 = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.requery();
                    int i12 = 4;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        i12 += ((TLRPC.TL_messages_stickerSet) arrayList.get(i13)).getObjectSize();
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i12);
                    nativeByteBuffer.writeInt32(arrayList.size());
                    while (r10 < arrayList.size()) {
                        ((TLRPC.TL_messages_stickerSet) arrayList.get(r10)).serializeToStream(nativeByteBuffer);
                        r10++;
                    }
                    executeFast4.bindInteger(1, i4 + 1);
                    executeFast4.bindByteBuffer(2, nativeByteBuffer);
                    executeFast4.bindInteger(3, i3);
                    executeFast4.bindLong(4, j);
                    executeFast4.step();
                    nativeByteBuffer.reuse();
                    executeFast4.dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 4:
                jf7 jf7Var = (jf7) obj2;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj;
                int i14 = this.c;
                int i15 = i14 & 16;
                long j6 = this.d;
                if (i15 != 0) {
                    try {
                        executeFast = jf7Var.b.executeFast("UPDATE topics SET total_messages_count = ? WHERE did = ? AND topic_id = ?");
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = null;
                        try {
                            jf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            jf7Var.b.commitTransaction();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            jf7Var.b.commitTransaction();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        jf7Var.b.commitTransaction();
                        throw th;
                    }
                    try {
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_forumTopic2.totalMessagesCount);
                        executeFast.bindLong(2, j6);
                        executeFast.bindLong(3, jf7Var.r0(4, j6) ? wf3.n(tL_forumTopic2.from_id) : tL_forumTopic2.id);
                        executeFast.step();
                        executeFast.dispose();
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        jf7Var.n(e, true);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        jf7Var.b.commitTransaction();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        jf7Var.b.commitTransaction();
                        throw th;
                    }
                } else {
                    executeFast = null;
                }
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data, edit_date FROM topics WHERE did = " + j6 + " AND topic_id = " + tL_forumTopic2.id, new Object[0]);
                try {
                    if (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        i = sQLiteCursor.intValue(1);
                        if (byteBufferValue != null) {
                            tL_forumTopic = TLRPC.TL_forumTopic.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                            byteBufferValue.reuse();
                            sQLiteCursor.dispose();
                            if (tL_forumTopic != null && (i == 0 || i <= i3)) {
                                if ((i14 & 1) != 0) {
                                    tL_forumTopic.title = tL_forumTopic2.title;
                                }
                                if ((i14 & 2) != 0) {
                                    tL_forumTopic.icon_emoji_id = tL_forumTopic2.icon_emoji_id;
                                    tL_forumTopic.flags |= 1;
                                    int i16 = tL_forumTopic2.icon_color;
                                    if (i16 != 0) {
                                        tL_forumTopic.icon_color = i16;
                                    }
                                }
                                if ((i14 & 4) != 0) {
                                    tL_forumTopic.pinned = tL_forumTopic2.pinned;
                                    tL_forumTopic.pinnedOrder = tL_forumTopic2.pinnedOrder;
                                }
                                r10 = tL_forumTopic.pinned ? tL_forumTopic.pinnedOrder + 1 : 0;
                                if ((i14 & 8) != 0) {
                                    tL_forumTopic.closed = tL_forumTopic2.closed;
                                }
                                if ((i14 & 32) != 0) {
                                    tL_forumTopic.hidden = tL_forumTopic2.hidden;
                                }
                                executeFast2 = jf7Var.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                                try {
                                    jf7Var.b.beginTransaction();
                                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                                    tL_forumTopic.serializeToStream(nativeByteBuffer2);
                                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                                    executeFast2.bindInteger(2, r10);
                                    executeFast2.bindInteger(3, tL_forumTopic.hidden ? 1 : 0);
                                    executeFast2.bindInteger(4, i3);
                                    executeFast2.bindLong(5, j6);
                                    executeFast2.bindLong(6, tL_forumTopic.id);
                                    executeFast2.step();
                                    nativeByteBuffer2.reuse();
                                    hl.c3(new r77((Object) jf7Var, j6, (Object) tL_forumTopic2, i14, (byte) 10));
                                    executeFast = executeFast2;
                                    break;
                                } catch (Exception e4) {
                                    e = e4;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    jf7Var.n(e, true);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    jf7Var.b.commitTransaction();
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    jf7Var.b.commitTransaction();
                                    throw th;
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    tL_forumTopic = null;
                    sQLiteCursor.dispose();
                    if (tL_forumTopic != null) {
                        if ((i14 & 1) != 0) {
                        }
                        if ((i14 & 2) != 0) {
                        }
                        if ((i14 & 4) != 0) {
                        }
                        if (tL_forumTopic.pinned) {
                        }
                        if ((i14 & 8) != 0) {
                        }
                        if ((i14 & 32) != 0) {
                        }
                        executeFast2 = jf7Var.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                        jf7Var.b.beginTransaction();
                        NativeByteBuffer nativeByteBuffer22 = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                        tL_forumTopic.serializeToStream(nativeByteBuffer22);
                        executeFast2.bindByteBuffer(1, nativeByteBuffer22);
                        executeFast2.bindInteger(2, r10);
                        executeFast2.bindInteger(3, tL_forumTopic.hidden ? 1 : 0);
                        executeFast2.bindInteger(4, i3);
                        executeFast2.bindLong(5, j6);
                        executeFast2.bindLong(6, tL_forumTopic.id);
                        executeFast2.step();
                        nativeByteBuffer22.reuse();
                        hl.c3(new r77((Object) jf7Var, j6, (Object) tL_forumTopic2, i14, (byte) 10));
                        executeFast = executeFast2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = executeFast;
                    jf7Var.n(e, true);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    jf7Var.b.commitTransaction();
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    jf7Var.b.commitTransaction();
                    throw th;
                }
                break;
            default:
                jf7 jf7Var2 = (jf7) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (j != 0) {
                    jf7Var2.Q0(i3, j, arrayList2);
                    return;
                }
                try {
                    zh6 zh6Var = new zh6();
                    zh6 zh6Var2 = new zh6();
                    SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT uid, mid, ttl FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList2) + ") AND is_channel = 0", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            int intValue = queryFinalized.intValue(1);
                            int intValue2 = queryFinalized.intValue(2);
                            if (intValue2 <= 0 || intValue2 == Integer.MAX_VALUE || i4 == 0 || (i2 = intValue2 + i4) < i3) {
                                ArrayList arrayList3 = (ArrayList) zh6Var.f(longValue);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    zh6Var.k(longValue, arrayList3);
                                }
                                arrayList3.add(Integer.valueOf(intValue));
                            } else {
                                SparseArray sparseArray = (SparseArray) zh6Var2.f(longValue);
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    zh6Var2.k(longValue, sparseArray);
                                }
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(i2);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    sparseArray.put(i2, arrayList4);
                                }
                                arrayList4.add(Integer.valueOf(intValue));
                            }
                        } catch (Exception e6) {
                            e = e6;
                            sQLiteCursor2 = queryFinalized;
                            try {
                                jf7Var2.n(e, true);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            sQLiteCursor2 = queryFinalized;
                            if (sQLiteCursor2 != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    int m3 = zh6Var.m();
                    for (int i17 = 0; i17 < m3; i17++) {
                        jf7Var2.Q0(i3, zh6Var.j(i17), (ArrayList) zh6Var.n(i17));
                    }
                    int m4 = zh6Var2.m();
                    while (r10 < m4) {
                        jf7Var2.A(zh6Var2.j(r10), (SparseArray) zh6Var2.n(r10));
                        r10++;
                    }
                    return;
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor2 = null;
                }
                break;
        }
    }

    public /* synthetic */ c70(k5 k5Var, TLObject tLObject, int i, long j, int i2, byte b) {
        this.a = b;
        this.b = k5Var;
        this.f = tLObject;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public /* synthetic */ c70(t86 t86Var, int i, float[] fArr, int i2, long j) {
        this.a = (byte) 2;
        this.b = t86Var;
        this.c = i;
        this.f = fArr;
        this.e = i2;
        this.d = j;
    }

    public /* synthetic */ c70(ls6 ls6Var, ArrayList arrayList, int i, int i2, long j) {
        this.a = (byte) 3;
        this.b = ls6Var;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
        this.d = j;
    }

    public /* synthetic */ c70(jf7 jf7Var, int i, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2) {
        this.a = (byte) 4;
        this.b = jf7Var;
        this.c = i;
        this.f = tL_forumTopic;
        this.d = j;
        this.e = i2;
    }
}

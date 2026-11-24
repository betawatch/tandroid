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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a70 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a70(int i, int i2, long j, ad7 ad7Var, ArrayList arrayList) {
        this.a = (byte) 5;
        this.b = ad7Var;
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
        xl3 X;
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
                na7.q1(((j5) obj2).a).a4((TLRPC.User) obj, true, false);
                na7 q1 = na7.q1(i4);
                long j2 = this.d;
                int i6 = this.e;
                q1.l3(j2, i6, i6, 0, false, 0L, 0, true, 0);
                na7.q1(i4).v3(j2, 0L);
                return;
            case 1:
                int i7 = AutoMessageHeardReceiver.a;
                na7.q1(((j5) obj2).a).T3((TLRPC.Chat) obj, true);
                na7 q12 = na7.q1(i4);
                long j3 = this.d;
                int i8 = this.e;
                q12.l3(j3, i8, i8, 0, false, 0L, 0, true, 0);
                na7.q1(i4).v3(j3, 0L);
                return;
            case 2:
                p66 p66Var = (p66) obj2;
                float[] fArr = (float[]) obj;
                ByteArrayOutputStream byteArrayOutputStream = p66Var.q;
                boolean z = false;
                p66Var.u = false;
                if (i4 != p66Var.r || p66Var.d == null || fArr == null) {
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
                p66Var.s = i9;
                if (i9 < 0) {
                    p66Var.p.reset();
                    byteArrayOutputStream.reset();
                }
                vm3 k = DictationLid.k(DictationLid.g(i3), fArr);
                xl3 xl3Var = (xl3) p66Var.d.d;
                StringBuilder sb = new StringBuilder("live captions ");
                int i10 = p66Var.a;
                ir2.w(sb, i10, ": tinylid ", i3, " ms speech in ");
                sb.append(j);
                sb.append(" ms: ");
                sb.append(k);
                sb.append(" (");
                sb.append(xl3Var);
                sb.append(")");
                Log.d("Dictation", sb.toString());
                if (k != null) {
                    String str = k.a;
                    if (!k.c || (X = DictationAsr.X(str, xl3Var, false)) == null) {
                        return;
                    }
                    vl3 vl3Var = (vl3) X.b;
                    int max = Math.max(0, i3 - p66Var.o);
                    p66Var.o = Math.max(p66Var.o, i3);
                    if (vl3Var == ((vl3) xl3Var.b) && ((String) X.c).equals((String) xl3Var.c)) {
                        p66Var.v = true;
                        if (!str.equals(p66Var.k)) {
                            p66Var.l = 0;
                        }
                        p66Var.k = str;
                        p66Var.l = Math.min(30000, p66Var.l + max);
                        p66Var.m = null;
                        p66Var.n = 0;
                        return;
                    }
                    if (!p66Var.v || k.b >= 0.8f) {
                        if (!str.equals(p66Var.m)) {
                            p66Var.m = str;
                            p66Var.n = 0;
                        }
                        int min = Math.min(30000, p66Var.n + max);
                        p66Var.n = min;
                        if (min < p66Var.l / 4) {
                            StringBuilder m = de9.m(i10, "live captions ", ": staying in ");
                            m.append(p66Var.k);
                            m.append(" (");
                            m.append(p66Var.l);
                            m.append(" ms), ");
                            m.append(p66Var.m);
                            m.append(" has ");
                            m.append(p66Var.n);
                            m.append(" ms");
                            Log.d("Dictation", m.toString());
                            return;
                        }
                        if (!DictationAsr.A(vl3Var)) {
                            gl.c3(new tp5(X, (byte) 12));
                            return;
                        }
                        zl3 c = zl3.c(X, p66Var);
                        if (c != null) {
                            p66Var.v = true;
                            p66Var.k = str;
                            p66Var.l = p66Var.n;
                            p66Var.m = null;
                            p66Var.n = 0;
                            StringBuilder m2 = de9.m(i10, "live captions ", ": replaying ");
                            m2.append(byteArrayOutputStream.size() / 32);
                            m2.append(" ms in ");
                            m2.append(X);
                            Log.d("Dictation", m2.toString());
                            zl3 zl3Var = p66Var.d;
                            long j4 = zl3Var.c;
                            if (j4 != 0) {
                                DictationAsr.nativeSessionFree(j4);
                                zl3Var.c = 0L;
                                DictationAsr.S((vl3) zl3Var.e);
                            }
                            p66Var.d = c;
                            p66Var.h = 0;
                            p66Var.g = 0;
                            int i11 = p66Var.w;
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            zl3 zl3Var2 = p66Var.d;
                            int length = byteArray.length;
                            long j5 = zl3Var2.c;
                            if (j5 != 0) {
                                nativeSessionPush = DictationAsr.nativeSessionPush(j5, byteArray, 0, length);
                                zl3Var2.b(nativeSessionPush);
                            }
                            if (p66Var.w != i11 || p66Var.j.isEmpty()) {
                                return;
                            }
                            p66Var.j = "";
                            gl.c3(new b61((Object) p66Var, p66Var.f, (Object) "", z, (byte) 2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hq6 hq6Var = (hq6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList == null) {
                        SQLitePreparedStatement executeFast3 = hq6Var.getMessagesStorage().b.executeFast("UPDATE stickers_v2 SET date = ?");
                        executeFast3.requery();
                        executeFast3.bindLong(1, i3);
                        executeFast3.step();
                        executeFast3.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast4 = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
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
                    fa4.g(e, true);
                    return;
                }
            case 4:
                ad7 ad7Var = (ad7) obj2;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj;
                int i14 = this.c;
                int i15 = i14 & 16;
                long j6 = this.d;
                if (i15 != 0) {
                    try {
                        executeFast = ad7Var.b.executeFast("UPDATE topics SET total_messages_count = ? WHERE did = ? AND topic_id = ?");
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = null;
                        try {
                            ad7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            ad7Var.b.commitTransaction();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            ad7Var.b.commitTransaction();
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
                        ad7Var.b.commitTransaction();
                        throw th;
                    }
                    try {
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_forumTopic2.totalMessagesCount);
                        executeFast.bindLong(2, j6);
                        executeFast.bindLong(3, ad7Var.r0(4, j6) ? cf3.n(tL_forumTopic2.from_id) : tL_forumTopic2.id);
                        executeFast.step();
                        executeFast.dispose();
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        ad7Var.n(e, true);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        ad7Var.b.commitTransaction();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        ad7Var.b.commitTransaction();
                        throw th;
                    }
                } else {
                    executeFast = null;
                }
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
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
                                executeFast2 = ad7Var.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                                try {
                                    ad7Var.b.beginTransaction();
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
                                    gl.c3(new o57((Object) ad7Var, j6, (Object) tL_forumTopic2, i14, (byte) 10));
                                    executeFast = executeFast2;
                                    break;
                                } catch (Exception e4) {
                                    e = e4;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    ad7Var.n(e, true);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    ad7Var.b.commitTransaction();
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLitePreparedStatement = executeFast2;
                                    sQLiteCursor = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    ad7Var.b.commitTransaction();
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
                        executeFast2 = ad7Var.b.executeFast("UPDATE topics SET data = ?, pinned = ?, hidden = ?, edit_date = ? WHERE did = ? AND topic_id = ?");
                        ad7Var.b.beginTransaction();
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
                        gl.c3(new o57((Object) ad7Var, j6, (Object) tL_forumTopic2, i14, (byte) 10));
                        executeFast = executeFast2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = executeFast;
                    ad7Var.n(e, true);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    ad7Var.b.commitTransaction();
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    ad7Var.b.commitTransaction();
                    throw th;
                }
                break;
            default:
                ad7 ad7Var2 = (ad7) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (j != 0) {
                    ad7Var2.Q0(i3, j, arrayList2);
                    return;
                }
                try {
                    vf6 vf6Var = new vf6();
                    vf6 vf6Var2 = new vf6();
                    SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT uid, mid, ttl FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList2) + ") AND is_channel = 0", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            int intValue = queryFinalized.intValue(1);
                            int intValue2 = queryFinalized.intValue(2);
                            if (intValue2 <= 0 || intValue2 == Integer.MAX_VALUE || i4 == 0 || (i2 = intValue2 + i4) < i3) {
                                ArrayList arrayList3 = (ArrayList) vf6Var.f(longValue);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    vf6Var.k(arrayList3, longValue);
                                }
                                arrayList3.add(Integer.valueOf(intValue));
                            } else {
                                SparseArray sparseArray = (SparseArray) vf6Var2.f(longValue);
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    vf6Var2.k(sparseArray, longValue);
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
                                ad7Var2.n(e, true);
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
                    int m3 = vf6Var.m();
                    for (int i17 = 0; i17 < m3; i17++) {
                        ad7Var2.Q0(i3, vf6Var.j(i17), (ArrayList) vf6Var.n(i17));
                    }
                    int m4 = vf6Var2.m();
                    while (r10 < m4) {
                        ad7Var2.A(vf6Var2.j(r10), (SparseArray) vf6Var2.n(r10));
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

    public /* synthetic */ a70(j5 j5Var, TLObject tLObject, int i, long j, int i2, byte b) {
        this.a = b;
        this.b = j5Var;
        this.f = tLObject;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public /* synthetic */ a70(p66 p66Var, int i, float[] fArr, int i2, long j) {
        this.a = (byte) 2;
        this.b = p66Var;
        this.c = i;
        this.f = fArr;
        this.e = i2;
        this.d = j;
    }

    public /* synthetic */ a70(hq6 hq6Var, ArrayList arrayList, int i, int i2, long j) {
        this.a = (byte) 3;
        this.b = hq6Var;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
        this.d = j;
    }

    public /* synthetic */ a70(ad7 ad7Var, int i, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2) {
        this.a = (byte) 4;
        this.b = ad7Var;
        this.c = i;
        this.f = tL_forumTopic;
        this.d = j;
        this.e = i2;
    }
}

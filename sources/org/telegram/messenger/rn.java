package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rn(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168 A[Catch: all -> 0x023d, Exception -> 0x0241, TRY_LEAVE, TryCatch #10 {Exception -> 0x0241, all -> 0x023d, blocks: (B:60:0x00e8, B:62:0x00ee, B:64:0x00ff, B:68:0x015c, B:72:0x0236, B:73:0x0168, B:113:0x0214, B:133:0x0246, B:135:0x0250), top: B:59:0x00e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        boolean z11;
        TLRPC.MessageReplies TLdeserialize;
        int i10;
        int i11;
        int i12;
        hs hsVar = (hs) this.c;
        a0.h hVar = (a0.h) this.d;
        a0.h hVar2 = (a0.h) this.e;
        a0.h hVar3 = (a0.h) this.f;
        boolean z12 = true;
        try {
            hsVar.b.beginTransaction();
            try {
                int i13 = 2;
                if (!hs.s0(hVar)) {
                    try {
                        SQLitePreparedStatement executeFast = hsVar.b.executeFast("UPDATE messages_v2 SET media = max((SELECT media FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                        int i14 = 0;
                        while (i14 < hVar.m()) {
                            try {
                                long j10 = hVar.j(i14);
                                SparseIntArray sparseIntArray = (SparseIntArray) hVar.n(i14);
                                int size = sparseIntArray.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    int valueAt = sparseIntArray.valueAt(i15);
                                    int keyAt = sparseIntArray.keyAt(i15);
                                    executeFast.requery();
                                    executeFast.bindInteger(1, keyAt);
                                    executeFast.bindLong(i13, j10);
                                    executeFast.bindInteger(3, valueAt);
                                    executeFast.bindInteger(4, keyAt);
                                    executeFast.bindLong(5, j10);
                                    executeFast.step();
                                    i15++;
                                    i13 = 2;
                                }
                                i14++;
                                i13 = 2;
                            } catch (Exception e) {
                                e = e;
                                z10 = true;
                                sQLitePreparedStatement = executeFast;
                                try {
                                    hsVar.o(e, z12);
                                    if (z10) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z12 = z10;
                                    if (z12 && (sQLiteDatabase = hsVar.b) != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                                if (z12) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast.dispose();
                    } catch (Exception e7) {
                        e = e7;
                        z10 = true;
                        sQLitePreparedStatement = null;
                        hsVar.o(e, z12);
                        if (z10) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement = null;
                        if (z12) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                }
                if (!hs.s0(hVar2)) {
                    sQLitePreparedStatement = hsVar.b.executeFast("UPDATE messages_v2 SET forwards = max((SELECT forwards FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                    for (int i16 = 0; i16 < hVar2.m(); i16++) {
                        try {
                            long j11 = hVar2.j(i16);
                            SparseIntArray sparseIntArray2 = (SparseIntArray) hVar2.n(i16);
                            int size2 = sparseIntArray2.size();
                            for (int i17 = 0; i17 < size2; i17++) {
                                int valueAt2 = sparseIntArray2.valueAt(i17);
                                int keyAt2 = sparseIntArray2.keyAt(i17);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, keyAt2);
                                sQLitePreparedStatement.bindLong(2, j11);
                                sQLitePreparedStatement.bindInteger(3, valueAt2);
                                sQLitePreparedStatement.bindInteger(4, keyAt2);
                                sQLitePreparedStatement.bindLong(5, j11);
                                sQLitePreparedStatement.step();
                            }
                        } catch (Exception e10) {
                            e = e10;
                            z10 = z12;
                            hsVar.o(e, z12);
                            if (z10) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (z12) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                }
                if (!hs.s0(hVar3)) {
                    SQLitePreparedStatement executeFast2 = hsVar.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                    int i18 = 0;
                    while (i18 < hVar3.m()) {
                        try {
                            long j12 = hVar3.j(i18);
                            SparseArray sparseArray = (SparseArray) hVar3.n(i18);
                            int size3 = sparseArray.size();
                            int i19 = 0;
                            while (i19 < size3) {
                                int keyAt3 = sparseArray.keyAt(i19);
                                SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + keyAt3 + " AND uid = " + j12, new Object[0]);
                                boolean next = queryFinalized.next();
                                if (next) {
                                    try {
                                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue != null) {
                                            z11 = z12;
                                            try {
                                                TLdeserialize = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                byteBufferValue.reuse();
                                                queryFinalized.dispose();
                                                if (next) {
                                                    TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(sparseArray.keyAt(i19));
                                                    boolean z13 = this.b;
                                                    if (z13 || TLdeserialize == null || (i12 = TLdeserialize.replies_pts) == 0 || messageReplies.replies_pts > i12 || messageReplies.read_max_id > TLdeserialize.read_max_id || messageReplies.max_id > TLdeserialize.max_id) {
                                                        if (z13) {
                                                            if (TLdeserialize == null) {
                                                                TLdeserialize = new TLRPC.TL_messageReplies();
                                                                TLdeserialize.flags |= 2;
                                                            }
                                                            TLdeserialize.replies += messageReplies.replies;
                                                            int size4 = messageReplies.recent_repliers.size();
                                                            int i20 = 0;
                                                            while (i20 < size4) {
                                                                long C1 = jj.C1(messageReplies.recent_repliers.get(i20));
                                                                int i21 = i18;
                                                                int size5 = TLdeserialize.recent_repliers.size();
                                                                int i22 = 0;
                                                                while (i22 < size5) {
                                                                    int i23 = size5;
                                                                    if (C1 == jj.C1(TLdeserialize.recent_repliers.get(i22))) {
                                                                        TLdeserialize.recent_repliers.remove(i22);
                                                                        i22--;
                                                                        size5 = i23 - 1;
                                                                    } else {
                                                                        size5 = i23;
                                                                    }
                                                                    i22++;
                                                                }
                                                                i20++;
                                                                i18 = i21;
                                                            }
                                                            i10 = i18;
                                                            TLdeserialize.recent_repliers.addAll(0, messageReplies.recent_repliers);
                                                            while (TLdeserialize.recent_repliers.size() > 3) {
                                                                TLdeserialize.recent_repliers.remove(0);
                                                            }
                                                            messageReplies = TLdeserialize;
                                                        } else {
                                                            i10 = i18;
                                                        }
                                                        if (TLdeserialize != null && (i11 = TLdeserialize.read_max_id) > messageReplies.read_max_id) {
                                                            messageReplies.read_max_id = i11;
                                                        }
                                                        executeFast2.requery();
                                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                                                        messageReplies.serializeToStream(nativeByteBuffer);
                                                        executeFast2.bindByteBuffer(z11 ? 1 : 0, nativeByteBuffer);
                                                        executeFast2.bindInteger(2, keyAt3);
                                                        executeFast2.bindLong(3, j12);
                                                        executeFast2.step();
                                                        nativeByteBuffer.reuse();
                                                        i19++;
                                                        i18 = i10;
                                                        z12 = true;
                                                    }
                                                }
                                                i10 = i18;
                                                i19++;
                                                i18 = i10;
                                                z12 = true;
                                            } catch (Exception e11) {
                                                e = e11;
                                                sQLitePreparedStatement = executeFast2;
                                                z12 = z11;
                                                z10 = z12;
                                                hsVar.o(e, z12);
                                                if (z10 && (sQLiteDatabase2 = hsVar.b) != null) {
                                                    sQLiteDatabase2.commitTransaction();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                sQLitePreparedStatement = executeFast2;
                                                z12 = z11;
                                                if (z12) {
                                                    sQLiteDatabase.commitTransaction();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        sQLitePreparedStatement = executeFast2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLitePreparedStatement = executeFast2;
                                    }
                                }
                                z11 = z12;
                                TLdeserialize = null;
                                queryFinalized.dispose();
                                if (next) {
                                }
                                i10 = i18;
                                i19++;
                                i18 = i10;
                                z12 = true;
                            }
                            i18++;
                            z12 = true;
                        } catch (Exception e13) {
                            e = e13;
                            sQLitePreparedStatement = executeFast2;
                            z12 = true;
                            z10 = true;
                            hsVar.o(e, z12);
                            if (z10) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLitePreparedStatement = executeFast2;
                            z12 = true;
                        }
                    }
                    executeFast2.dispose();
                }
                hsVar.b.commitTransaction();
            } catch (Exception e14) {
                e = e14;
                z12 = true;
                sQLitePreparedStatement = null;
            } catch (Throwable th9) {
                th = th9;
                z12 = true;
            }
        } catch (Exception e15) {
            e = e15;
            z10 = false;
            z12 = true;
        } catch (Throwable th10) {
            th = th10;
            z12 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f A[Catch: all -> 0x0201, Exception -> 0x0207, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x0207, all -> 0x0201, blocks: (B:107:0x01f5, B:116:0x021d, B:121:0x023f, B:300:0x022e), top: B:100:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031e A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0333 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0372 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0392 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ab A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bb A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c8 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e2 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f4 A[Catch: all -> 0x02bb, Exception -> 0x02be, TRY_ENTER, TryCatch #11 {Exception -> 0x02be, all -> 0x02bb, blocks: (B:129:0x027a, B:135:0x03fc, B:136:0x028c, B:183:0x03f4, B:185:0x03f9, B:235:0x02c5, B:239:0x0410, B:246:0x0424, B:254:0x043b, B:267:0x0444, B:271:0x0491, B:272:0x0494, B:274:0x049e, B:275:0x04a9, B:277:0x04af, B:280:0x04c2, B:282:0x04c8, B:284:0x04da, B:286:0x04f8, B:308:0x050a, B:309:0x050d), top: B:101:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03f9 A[Catch: all -> 0x02bb, Exception -> 0x02be, TryCatch #11 {Exception -> 0x02be, all -> 0x02bb, blocks: (B:129:0x027a, B:135:0x03fc, B:136:0x028c, B:183:0x03f4, B:185:0x03f9, B:235:0x02c5, B:239:0x0410, B:246:0x0424, B:254:0x043b, B:267:0x0444, B:271:0x0491, B:272:0x0494, B:274:0x049e, B:275:0x04a9, B:277:0x04af, B:280:0x04c2, B:282:0x04c8, B:284:0x04da, B:286:0x04f8, B:308:0x050a, B:309:0x050d), top: B:101:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e8 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c1 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039f A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0388 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0349 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0326 A[Catch: all -> 0x02ac, Exception -> 0x02b1, TryCatch #12 {Exception -> 0x02b1, all -> 0x02ac, blocks: (B:203:0x029c, B:206:0x02a6, B:207:0x02b7, B:139:0x02cd, B:141:0x02de, B:142:0x02e6, B:144:0x0306, B:148:0x030e, B:150:0x031e, B:151:0x032f, B:153:0x0333, B:154:0x034f, B:157:0x035b, B:159:0x0372, B:160:0x038e, B:162:0x0392, B:165:0x039b, B:166:0x03a5, B:168:0x03ab, B:169:0x03b6, B:171:0x03bb, B:173:0x03c8, B:175:0x03cf, B:177:0x03d8, B:178:0x03de, B:180:0x03e2, B:181:0x03ec, B:188:0x03e8, B:189:0x03c1, B:191:0x0399, B:192:0x039f, B:193:0x0388, B:198:0x0349, B:199:0x0326), top: B:202:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0491 A[Catch: all -> 0x02bb, Exception -> 0x02be, TRY_ENTER, TryCatch #11 {Exception -> 0x02be, all -> 0x02bb, blocks: (B:129:0x027a, B:135:0x03fc, B:136:0x028c, B:183:0x03f4, B:185:0x03f9, B:235:0x02c5, B:239:0x0410, B:246:0x0424, B:254:0x043b, B:267:0x0444, B:271:0x0491, B:272:0x0494, B:274:0x049e, B:275:0x04a9, B:277:0x04af, B:280:0x04c2, B:282:0x04c8, B:284:0x04da, B:286:0x04f8, B:308:0x050a, B:309:0x050d), top: B:101:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x049e A[Catch: all -> 0x02bb, Exception -> 0x02be, TryCatch #11 {Exception -> 0x02be, all -> 0x02bb, blocks: (B:129:0x027a, B:135:0x03fc, B:136:0x028c, B:183:0x03f4, B:185:0x03f9, B:235:0x02c5, B:239:0x0410, B:246:0x0424, B:254:0x043b, B:267:0x0444, B:271:0x0491, B:272:0x0494, B:274:0x049e, B:275:0x04a9, B:277:0x04af, B:280:0x04c2, B:282:0x04c8, B:284:0x04da, B:286:0x04f8, B:308:0x050a, B:309:0x050d), top: B:101:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04f8 A[Catch: all -> 0x02bb, Exception -> 0x02be, TRY_LEAVE, TryCatch #11 {Exception -> 0x02be, all -> 0x02bb, blocks: (B:129:0x027a, B:135:0x03fc, B:136:0x028c, B:183:0x03f4, B:185:0x03f9, B:235:0x02c5, B:239:0x0410, B:246:0x0424, B:254:0x043b, B:267:0x0444, B:271:0x0491, B:272:0x0494, B:274:0x049e, B:275:0x04a9, B:277:0x04af, B:280:0x04c2, B:282:0x04c8, B:284:0x04da, B:286:0x04f8, B:308:0x050a, B:309:0x050d), top: B:101:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x022e A[Catch: all -> 0x0201, Exception -> 0x0207, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x0207, all -> 0x0201, blocks: (B:107:0x01f5, B:116:0x021d, B:121:0x023f, B:300:0x022e), top: B:100:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x050a A[Catch: all -> 0x02bb, Exception -> 0x02be, TRY_ENTER, TryCatch #11 {Exception -> 0x02be, all -> 0x02bb, blocks: (B:129:0x027a, B:135:0x03fc, B:136:0x028c, B:183:0x03f4, B:185:0x03f9, B:235:0x02c5, B:239:0x0410, B:246:0x0424, B:254:0x043b, B:267:0x0444, B:271:0x0491, B:272:0x0494, B:274:0x049e, B:275:0x04a9, B:277:0x04af, B:280:0x04c2, B:282:0x04c8, B:284:0x04da, B:286:0x04f8, B:308:0x050a, B:309:0x050d), top: B:101:0x01c3 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v36, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor sQLiteCursor;
        int i10;
        NativeByteBuffer nativeByteBuffer;
        ArrayList arrayList;
        int i11;
        boolean z11;
        SQLiteDatabase sQLiteDatabase3;
        int i12;
        int i13;
        boolean z12;
        SQLitePreparedStatement sQLitePreparedStatement2;
        long j10;
        int i14;
        NativeByteBuffer nativeByteBuffer2;
        int i15;
        int i16;
        int i17;
        NativeByteBuffer nativeByteBuffer3;
        int i18;
        NativeByteBuffer nativeByteBuffer4;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i19;
        TLRPC.Peer peer;
        NativeByteBuffer nativeByteBuffer5;
        NativeByteBuffer nativeByteBuffer6;
        long j11;
        int i20;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        int i21;
        boolean isEmpty;
        TLRPC.Message message;
        ?? r22 = 0;
        r22 = 0;
        hs hsVar = null;
        int i22 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.s4.e0(((vp) this.c).currentAccount, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.k2) this.e, (TLRPC.TL_channels_editBanned) this.f, Boolean.valueOf(this.b));
                return;
            case 1:
                hs hsVar2 = (hs) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z13 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                try {
                } catch (Exception e) {
                    e = e;
                    sQLitePreparedStatement = null;
                    z10 = true;
                    hsVar = hsVar2;
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = null;
                    hsVar = hsVar2;
                }
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase4 = hsVar2.b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT uid, read_state, custom_params FROM messages_v2 WHERE mid = " + message2.id + " AND uid = " + jj.B0(message2) + " LIMIT 1", new Object[0]);
                            try {
                            } catch (Exception e7) {
                                e = e7;
                                i10 = 0;
                                hsVar2.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                nativeByteBuffer = null;
                                try {
                                    hsVar2.b.beginTransaction();
                                    if (message2.dialog_id == 0) {
                                    }
                                    hs.J(message2);
                                    jj.q5(message2);
                                    NativeByteBuffer nativeByteBuffer7 = new NativeByteBuffer(message2.getObjectSize());
                                    message2.serializeToStream(nativeByteBuffer7);
                                    long e10 = hsVar2.getUserConfig().e();
                                    arrayList = null;
                                    i11 = 0;
                                    for (int i23 = 2; i11 < i23; i23 = 2) {
                                    }
                                    hsVar = hsVar2;
                                    z11 = z13;
                                    NativeByteBuffer nativeByteBuffer8 = nativeByteBuffer7;
                                    if (ui.r(message2)) {
                                    }
                                    if (nativeByteBuffer != null) {
                                    }
                                    nativeByteBuffer8.reuse();
                                    hsVar.b.commitTransaction();
                                    if (z11) {
                                    }
                                    if (arrayList != null) {
                                    }
                                    sQLiteDatabase3 = hsVar.b;
                                    if (sQLiteDatabase3 == null) {
                                    }
                                    sQLiteDatabase3.commitTransaction();
                                    return;
                                } catch (Exception e11) {
                                    e = e11;
                                    hsVar = hsVar2;
                                    r22 = 0;
                                    z10 = true;
                                    sQLitePreparedStatement = null;
                                    r22 = r22;
                                    try {
                                        hsVar.o(e, z10);
                                        sQLiteDatabase2 = hsVar.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (r22 != 0) {
                                        }
                                        if (sQLitePreparedStatement == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteDatabase = hsVar.b;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.commitTransaction();
                                        }
                                        if (r22 != 0) {
                                            r22.dispose();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    hsVar = hsVar2;
                                    r22 = 0;
                                    sQLitePreparedStatement = null;
                                    sQLiteDatabase = hsVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (r22 != 0) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (0 != 0) {
                                r22.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        sQLiteCursor = null;
                    } catch (Throwable th6) {
                        th = th6;
                        if (0 != 0) {
                        }
                        throw th;
                    }
                    if (!sQLiteCursor.next()) {
                        sQLiteCursor.dispose();
                        sQLiteCursor.dispose();
                        sQLiteDatabase3 = hsVar2.b;
                        if (sQLiteDatabase3 == null) {
                            return;
                        }
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    i10 = sQLiteCursor.intValue(1);
                    try {
                        nativeByteBuffer = sQLiteCursor.byteBufferValue(2);
                        sQLiteCursor.dispose();
                    } catch (Exception e13) {
                        e = e13;
                        hsVar2.o(e, true);
                        if (sQLiteCursor != null) {
                        }
                        nativeByteBuffer = null;
                        hsVar2.b.beginTransaction();
                        if (message2.dialog_id == 0) {
                        }
                        hs.J(message2);
                        jj.q5(message2);
                        NativeByteBuffer nativeByteBuffer72 = new NativeByteBuffer(message2.getObjectSize());
                        message2.serializeToStream(nativeByteBuffer72);
                        long e102 = hsVar2.getUserConfig().e();
                        arrayList = null;
                        i11 = 0;
                        while (i11 < i23) {
                        }
                        hsVar = hsVar2;
                        z11 = z13;
                        NativeByteBuffer nativeByteBuffer82 = nativeByteBuffer72;
                        if (ui.r(message2)) {
                        }
                        if (nativeByteBuffer != null) {
                        }
                        nativeByteBuffer82.reuse();
                        hsVar.b.commitTransaction();
                        if (z11) {
                        }
                        if (arrayList != null) {
                        }
                        sQLiteDatabase3 = hsVar.b;
                        if (sQLiteDatabase3 == null) {
                        }
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    hsVar2.b.beginTransaction();
                    if (message2.dialog_id == 0) {
                        jj.B0(message2);
                    }
                    hs.J(message2);
                    jj.q5(message2);
                    NativeByteBuffer nativeByteBuffer722 = new NativeByteBuffer(message2.getObjectSize());
                    message2.serializeToStream(nativeByteBuffer722);
                    long e1022 = hsVar2.getUserConfig().e();
                    arrayList = null;
                    i11 = 0;
                    while (i11 < i23) {
                        int i24 = i11 == i22 ? i22 : 0;
                        NativeByteBuffer nativeByteBuffer9 = nativeByteBuffer722;
                        long a2 = jj.a2(hsVar2.currentAccount, message2, hsVar2.Z(message2.dialog_id));
                        hsVar = hsVar2;
                        long j12 = message2.dialog_id;
                        if (i24 == 0) {
                            i13 = i11;
                            z12 = z13;
                            sQLitePreparedStatement2 = hsVar.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                        } else if (a2 == 0) {
                            i13 = i11;
                            z12 = z13;
                            j10 = e1022;
                            nativeByteBuffer2 = nativeByteBuffer9;
                            i11 = i13 + 1;
                            hsVar2 = hsVar;
                            nativeByteBuffer722 = nativeByteBuffer2;
                            z13 = z12;
                            e1022 = j10;
                            i22 = 1;
                        } else {
                            i13 = i11;
                            z12 = z13;
                            r22 = hsVar.b.executeFast("REPLACE INTO messages_topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?)");
                            sQLitePreparedStatement2 = r22;
                            if (j12 == e1022) {
                                try {
                                    sQLitePreparedStatement2 = r22;
                                    if (jj.R1(e1022, message2) != 0) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(message2);
                                        sQLitePreparedStatement2 = r22;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    z10 = true;
                                    sQLitePreparedStatement = null;
                                    r22 = r22;
                                    hsVar.o(e, z10);
                                    sQLiteDatabase2 = hsVar.b;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    if (r22 != 0) {
                                    }
                                    if (sQLitePreparedStatement == null) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    sQLitePreparedStatement = null;
                                    sQLiteDatabase = hsVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (r22 != 0) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        sQLitePreparedStatement2.requery();
                        j10 = e1022;
                        sQLitePreparedStatement2.bindInteger(1, message2.id);
                        sQLitePreparedStatement2.bindLong(2, j12);
                        if (i24 != 0) {
                            sQLitePreparedStatement2.bindLong(3, a2);
                            i14 = 4;
                        } else {
                            i14 = 3;
                        }
                        sQLitePreparedStatement2.bindInteger(i14, i10);
                        sQLitePreparedStatement2.bindInteger(i14 + 1, message2.send_state);
                        sQLitePreparedStatement2.bindInteger(i14 + 2, message2.date);
                        int i25 = i14 + 4;
                        nativeByteBuffer2 = nativeByteBuffer9;
                        sQLitePreparedStatement2.bindByteBuffer(i14 + 3, nativeByteBuffer2);
                        int i26 = i14 + 5;
                        if (!message2.out && !message2.from_scheduled) {
                            i15 = 0;
                            sQLitePreparedStatement2.bindInteger(i25, i15);
                            int i27 = i14 + 6;
                            sQLitePreparedStatement2.bindInteger(i26, message2.ttl);
                            if ((message2.flags & 1024) == 0) {
                                i16 = i14 + 7;
                                sQLitePreparedStatement2.bindInteger(i27, message2.views);
                            } else {
                                i16 = i14 + 7;
                                sQLitePreparedStatement2.bindInteger(i27, hs.d0(message2));
                            }
                            if (message2.replyStory == null) {
                                nativeByteBuffer3 = new NativeByteBuffer(message2.replyStory.getObjectSize());
                                message2.replyStory.serializeToStream(nativeByteBuffer3);
                                i17 = i16 + 1;
                                sQLitePreparedStatement2.bindByteBuffer(i16, nativeByteBuffer3);
                            } else {
                                i17 = i16 + 1;
                                sQLitePreparedStatement2.bindNull(i16);
                                nativeByteBuffer3 = null;
                            }
                            int i28 = message2.stickerVerified;
                            sQLitePreparedStatement2.bindInteger(i17, i28 != 0 ? 1 : i28 == 2 ? 2 : 0);
                            sQLitePreparedStatement2.bindInteger(i17 + 1, message2.mentioned ? 1 : 0);
                            int i29 = i17 + 3;
                            sQLitePreparedStatement2.bindInteger(i17 + 2, message2.forwards);
                            if (message2.replies == null) {
                                nativeByteBuffer4 = new NativeByteBuffer(message2.replies.getObjectSize());
                                message2.replies.serializeToStream(nativeByteBuffer4);
                                i18 = i17 + 4;
                                sQLitePreparedStatement2.bindByteBuffer(i29, nativeByteBuffer4);
                            } else {
                                i18 = i17 + 4;
                                sQLitePreparedStatement2.bindNull(i29);
                                nativeByteBuffer4 = null;
                            }
                            messageReplyHeader = message2.reply_to;
                            if (messageReplyHeader == null) {
                                i19 = i18 + 1;
                                int i30 = messageReplyHeader.reply_to_top_id;
                                if (i30 == 0) {
                                    i30 = messageReplyHeader.reply_to_msg_id;
                                }
                                sQLitePreparedStatement2.bindInteger(i18, i30);
                            } else {
                                i19 = i18 + 1;
                                sQLitePreparedStatement2.bindInteger(i18, 0);
                            }
                            int i31 = i19 + 1;
                            peer = message2.peer_id;
                            if (peer == null) {
                                nativeByteBuffer5 = nativeByteBuffer4;
                                nativeByteBuffer6 = nativeByteBuffer3;
                                j11 = peer.channel_id;
                            } else {
                                nativeByteBuffer5 = nativeByteBuffer4;
                                nativeByteBuffer6 = nativeByteBuffer3;
                                j11 = 0;
                            }
                            sQLitePreparedStatement2.bindLong(i19, j11);
                            if (nativeByteBuffer == null) {
                                i20 = i19 + 2;
                                sQLitePreparedStatement2.bindByteBuffer(i31, nativeByteBuffer);
                            } else {
                                i20 = i19 + 2;
                                sQLitePreparedStatement2.bindNull(i31);
                            }
                            if (i24 == 0) {
                                if ((message2.flags & 131072) != 0) {
                                    i21 = i20 + 1;
                                    sQLitePreparedStatement2.bindLong(i20, message2.grouped_id);
                                } else {
                                    i21 = i20 + 1;
                                    sQLitePreparedStatement2.bindNull(i20);
                                }
                                i20 = i21;
                            }
                            messageReplyHeader2 = message2.reply_to;
                            if (messageReplyHeader2 == null) {
                                sQLitePreparedStatement2.bindInteger(i20, messageReplyHeader2.story_id);
                            } else {
                                sQLitePreparedStatement2.bindInteger(i20, 0);
                            }
                            sQLitePreparedStatement2.step();
                            sQLitePreparedStatement2.dispose();
                            if (nativeByteBuffer5 != null) {
                                nativeByteBuffer5.reuse();
                            }
                            if (nativeByteBuffer6 == null) {
                                nativeByteBuffer6.reuse();
                            }
                            i11 = i13 + 1;
                            hsVar2 = hsVar;
                            nativeByteBuffer722 = nativeByteBuffer2;
                            z13 = z12;
                            e1022 = j10;
                            i22 = 1;
                        }
                        i15 = 1;
                        sQLitePreparedStatement2.bindInteger(i25, i15);
                        int i272 = i14 + 6;
                        sQLitePreparedStatement2.bindInteger(i26, message2.ttl);
                        if ((message2.flags & 1024) == 0) {
                        }
                        if (message2.replyStory == null) {
                        }
                        int i282 = message2.stickerVerified;
                        sQLitePreparedStatement2.bindInteger(i17, i282 != 0 ? 1 : i282 == 2 ? 2 : 0);
                        sQLitePreparedStatement2.bindInteger(i17 + 1, message2.mentioned ? 1 : 0);
                        int i292 = i17 + 3;
                        sQLitePreparedStatement2.bindInteger(i17 + 2, message2.forwards);
                        if (message2.replies == null) {
                        }
                        messageReplyHeader = message2.reply_to;
                        if (messageReplyHeader == null) {
                        }
                        int i312 = i19 + 1;
                        peer = message2.peer_id;
                        if (peer == null) {
                        }
                        sQLitePreparedStatement2.bindLong(i19, j11);
                        if (nativeByteBuffer == null) {
                        }
                        if (i24 == 0) {
                        }
                        messageReplyHeader2 = message2.reply_to;
                        if (messageReplyHeader2 == null) {
                        }
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        if (nativeByteBuffer5 != null) {
                        }
                        if (nativeByteBuffer6 == null) {
                        }
                        i11 = i13 + 1;
                        hsVar2 = hsVar;
                        nativeByteBuffer722 = nativeByteBuffer2;
                        z13 = z12;
                        e1022 = j10;
                        i22 = 1;
                    }
                    hsVar = hsVar2;
                    z11 = z13;
                    NativeByteBuffer nativeByteBuffer822 = nativeByteBuffer722;
                    if (ui.r(message2)) {
                        int i32 = 2;
                        int i33 = 0;
                        while (i33 < i32) {
                            boolean z14 = i33 == 1;
                            long a22 = jj.a2(hsVar.currentAccount, message2, hsVar.Z(message2.dialog_id));
                            if (z14 && a22 == 0) {
                                i32 = 2;
                            } else {
                                SQLitePreparedStatement executeFast = i33 == 0 ? hsVar.b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)") : hsVar.b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
                                try {
                                    executeFast.requery();
                                    executeFast.bindInteger(1, message2.id);
                                    i32 = 2;
                                    executeFast.bindLong(2, message2.dialog_id);
                                    if (i33 != 0) {
                                        executeFast.bindLong(3, a22);
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    executeFast.bindInteger(i12, message2.date);
                                    executeFast.bindInteger(i12 + 1, ui.f0(message2));
                                    executeFast.bindByteBuffer(i12 + 2, nativeByteBuffer822);
                                    executeFast.step();
                                    executeFast.dispose();
                                } catch (Exception e15) {
                                    e = e15;
                                    sQLitePreparedStatement = executeFast;
                                    r22 = 0;
                                    z10 = true;
                                    hsVar.o(e, z10);
                                    sQLiteDatabase2 = hsVar.b;
                                    if (sQLiteDatabase2 != null) {
                                        sQLiteDatabase2.commitTransaction();
                                    }
                                    if (r22 != 0) {
                                        r22.dispose();
                                    }
                                    if (sQLitePreparedStatement == null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLitePreparedStatement = executeFast;
                                    r22 = 0;
                                    sQLiteDatabase = hsVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (r22 != 0) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                            i33++;
                        }
                    }
                    if (nativeByteBuffer != null) {
                        nativeByteBuffer.reuse();
                    }
                    nativeByteBuffer822.reuse();
                    hsVar.b.commitTransaction();
                    if (z11) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                            TLRPC.User user = (TLRPC.User) arrayList2.get(i34);
                            hashMap.put(Long.valueOf(user.id), user);
                        }
                        for (int i35 = 0; i35 < arrayList3.size(); i35++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i35);
                            hashMap2.put(Long.valueOf(chat.id), chat);
                        }
                        jj jjVar = new jj(hsVar.currentAccount, message2, (AbstractMap) hashMap, (AbstractMap) hashMap2, true, true);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(jjVar);
                        i0.g3(new kg(hsVar, jjVar, arrayList4, 20));
                    }
                    if (arrayList != null) {
                        i0.g3(new xp(hsVar, arrayList, 14));
                    }
                    sQLiteDatabase3 = hsVar.b;
                    if (sQLiteDatabase3 == null) {
                        return;
                    }
                    sQLiteDatabase3.commitTransaction();
                    return;
                } catch (Exception e16) {
                    e = e16;
                    r22 = 0;
                    z10 = true;
                    sQLitePreparedStatement = null;
                    r22 = r22;
                    hsVar.o(e, z10);
                    sQLiteDatabase2 = hsVar.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (r22 != 0) {
                    }
                    if (sQLitePreparedStatement == null) {
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r22 = 0;
                    sQLitePreparedStatement = null;
                    sQLiteDatabase = hsVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (r22 != 0) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                break;
            case 2:
                a7 a7Var = (a7) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
                boolean z15 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.d.c(new t6(i22, a7Var, tLObject));
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null && ((isEmpty = TextUtils.isEmpty(tL_textWithEntities.text)) || !z15)) {
                        m5.n(null, isEmpty ? 2131750854 : 2131750852, org.telegram.ui.Components.cc.a0(T), isEmpty ? R.raw.ic_delete : R.raw.contact_check, 36);
                    }
                }
                x1Var.dismiss();
                return;
            case 3:
                a();
                return;
            case 4:
                qz qzVar = (qz) this.c;
                TLRPC.Message message3 = (TLRPC.Message) this.d;
                boolean z16 = this.b;
                TLObject tLObject2 = (TLObject) this.e;
                cz czVar = (cz) this.f;
                qzVar.getClass();
                qzVar.i0(message3.id, z16);
                if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer;
                    TLRPC.InputMedia inputMedia = pollAnswer.input_media;
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        pollAnswer.input_media = czVar.t;
                    } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                        pollAnswer.input_media = czVar.t;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                        tL_messages_sendMedia.media = czVar.t;
                    } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_messages_sendMedia.media = czVar.t;
                    }
                } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                    TLObject tLObject3 = czVar.c;
                    if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject3;
                        TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            tL_messages_sendMedia2.media = czVar.t;
                        } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            tL_messages_sendMedia2.media = czVar.t;
                        }
                    }
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject2;
                    TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                        tL_sendMessage.media = czVar.t;
                    } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_sendMessage.media = czVar.t;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject2;
                    TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                        tL_messages_editMessage.media = czVar.t;
                    } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_messages_editMessage.media = czVar.t;
                    }
                }
                czVar.p = true;
                qzVar.M(czVar, -1);
                return;
            case 5:
                qz qzVar2 = (qz) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = (TLRPC.TL_messages_editMessage) this.d;
                jj jjVar2 = (jj) this.f;
                int sendRequest = qzVar2.getConnectionsManager().sendRequest(tL_messages_editMessage2, new t4(jjVar2, qzVar2, tL_messages_editMessage2, (org.telegram.ui.ActionBar.k2) this.e, this.b));
                if (jjVar2 == null || (message = jjVar2.k) == null) {
                    return;
                }
                message.reqId = sendRequest;
                return;
            default:
                a20 a20Var = (a20) this.c;
                boolean[] zArr = (boolean[]) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                boolean z17 = this.b;
                q20 q20Var = (q20) this.f;
                ArrayList arrayList6 = a20Var.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                for (int i36 = 0; i36 < zArr.length; i36++) {
                    if (zArr[i36]) {
                        z10 z10Var = (z10) arrayList5.get(i36);
                        arrayList7.add(z10Var);
                        hashSet.add(Long.valueOf(z10Var.b));
                    }
                }
                if (!z17) {
                    int i37 = 0;
                    while (i37 < arrayList6.size()) {
                        if (hashSet.contains(Long.valueOf(((z10) arrayList6.get(i37)).b))) {
                            arrayList6.remove(i37);
                            i37--;
                        }
                        i37++;
                    }
                    if (!hashSet.isEmpty()) {
                        a20Var.d();
                        zs.f(a20Var.a).k(zs.d3, new Object[0]);
                        a20Var.e();
                    }
                }
                q20Var.a(arrayList7);
                return;
        }
    }

    public /* synthetic */ rn(f1 f1Var, Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = z10;
    }

    public /* synthetic */ rn(f1 f1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = f1Var;
        this.d = message;
        this.b = z10;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ rn(jj jjVar, qz qzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.a = 5;
        this.c = qzVar;
        this.d = tL_messages_editMessage;
        this.f = jjVar;
        this.e = k2Var;
        this.b = z10;
    }
}

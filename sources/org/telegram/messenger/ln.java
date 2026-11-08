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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ln(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z9;
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
        boolean z9;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        boolean z10;
        TLRPC.MessageReplies TLdeserialize;
        int i7;
        int i10;
        int i11;
        yr yrVar = (yr) this.c;
        a0.h hVar = (a0.h) this.d;
        a0.h hVar2 = (a0.h) this.e;
        a0.h hVar3 = (a0.h) this.f;
        boolean z11 = true;
        try {
            yrVar.b.beginTransaction();
            try {
                int i12 = 2;
                if (!yr.s0(hVar)) {
                    try {
                        SQLitePreparedStatement executeFast = yrVar.b.executeFast("UPDATE messages_v2 SET media = max((SELECT media FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                        int i13 = 0;
                        while (i13 < hVar.m()) {
                            try {
                                long j3 = hVar.j(i13);
                                SparseIntArray sparseIntArray = (SparseIntArray) hVar.n(i13);
                                int size = sparseIntArray.size();
                                int i14 = 0;
                                while (i14 < size) {
                                    int valueAt = sparseIntArray.valueAt(i14);
                                    int keyAt = sparseIntArray.keyAt(i14);
                                    executeFast.requery();
                                    executeFast.bindInteger(1, keyAt);
                                    executeFast.bindLong(i12, j3);
                                    executeFast.bindInteger(3, valueAt);
                                    executeFast.bindInteger(4, keyAt);
                                    executeFast.bindLong(5, j3);
                                    executeFast.step();
                                    i14++;
                                    i12 = 2;
                                }
                                i13++;
                                i12 = 2;
                            } catch (Exception e10) {
                                e = e10;
                                z9 = true;
                                sQLitePreparedStatement = executeFast;
                                try {
                                    yrVar.o(e, z11);
                                    if (z9) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = z9;
                                    if (z11 && (sQLiteDatabase = yrVar.b) != null) {
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
                                if (z11) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast.dispose();
                    } catch (Exception e11) {
                        e = e11;
                        z9 = true;
                        sQLitePreparedStatement = null;
                        yrVar.o(e, z11);
                        if (z9) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement = null;
                        if (z11) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                }
                if (!yr.s0(hVar2)) {
                    sQLitePreparedStatement = yrVar.b.executeFast("UPDATE messages_v2 SET forwards = max((SELECT forwards FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                    for (int i15 = 0; i15 < hVar2.m(); i15++) {
                        try {
                            long j10 = hVar2.j(i15);
                            SparseIntArray sparseIntArray2 = (SparseIntArray) hVar2.n(i15);
                            int size2 = sparseIntArray2.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                int valueAt2 = sparseIntArray2.valueAt(i16);
                                int keyAt2 = sparseIntArray2.keyAt(i16);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, keyAt2);
                                sQLitePreparedStatement.bindLong(2, j10);
                                sQLitePreparedStatement.bindInteger(3, valueAt2);
                                sQLitePreparedStatement.bindInteger(4, keyAt2);
                                sQLitePreparedStatement.bindLong(5, j10);
                                sQLitePreparedStatement.step();
                            }
                        } catch (Exception e12) {
                            e = e12;
                            z9 = z11;
                            yrVar.o(e, z11);
                            if (z9) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (z11) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                }
                if (!yr.s0(hVar3)) {
                    SQLitePreparedStatement executeFast2 = yrVar.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                    int i17 = 0;
                    while (i17 < hVar3.m()) {
                        try {
                            long j11 = hVar3.j(i17);
                            SparseArray sparseArray = (SparseArray) hVar3.n(i17);
                            int size3 = sparseArray.size();
                            int i18 = 0;
                            while (i18 < size3) {
                                int keyAt3 = sparseArray.keyAt(i18);
                                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + keyAt3 + " AND uid = " + j11, new Object[0]);
                                boolean next = queryFinalized.next();
                                if (next) {
                                    try {
                                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue != null) {
                                            z10 = z11;
                                            try {
                                                TLdeserialize = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                byteBufferValue.reuse();
                                                queryFinalized.dispose();
                                                if (next) {
                                                    TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(sparseArray.keyAt(i18));
                                                    boolean z12 = this.b;
                                                    if (z12 || TLdeserialize == null || (i11 = TLdeserialize.replies_pts) == 0 || messageReplies.replies_pts > i11 || messageReplies.read_max_id > TLdeserialize.read_max_id || messageReplies.max_id > TLdeserialize.max_id) {
                                                        if (z12) {
                                                            if (TLdeserialize == null) {
                                                                TLdeserialize = new TLRPC.TL_messageReplies();
                                                                TLdeserialize.flags |= 2;
                                                            }
                                                            TLdeserialize.replies += messageReplies.replies;
                                                            int size4 = messageReplies.recent_repliers.size();
                                                            int i19 = 0;
                                                            while (i19 < size4) {
                                                                long C1 = ij.C1(messageReplies.recent_repliers.get(i19));
                                                                int i20 = i17;
                                                                int size5 = TLdeserialize.recent_repliers.size();
                                                                int i21 = 0;
                                                                while (i21 < size5) {
                                                                    int i22 = size5;
                                                                    if (C1 == ij.C1(TLdeserialize.recent_repliers.get(i21))) {
                                                                        TLdeserialize.recent_repliers.remove(i21);
                                                                        i21--;
                                                                        size5 = i22 - 1;
                                                                    } else {
                                                                        size5 = i22;
                                                                    }
                                                                    i21++;
                                                                }
                                                                i19++;
                                                                i17 = i20;
                                                            }
                                                            i7 = i17;
                                                            TLdeserialize.recent_repliers.addAll(0, messageReplies.recent_repliers);
                                                            while (TLdeserialize.recent_repliers.size() > 3) {
                                                                TLdeserialize.recent_repliers.remove(0);
                                                            }
                                                            messageReplies = TLdeserialize;
                                                        } else {
                                                            i7 = i17;
                                                        }
                                                        if (TLdeserialize != null && (i10 = TLdeserialize.read_max_id) > messageReplies.read_max_id) {
                                                            messageReplies.read_max_id = i10;
                                                        }
                                                        executeFast2.requery();
                                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                                                        messageReplies.serializeToStream(nativeByteBuffer);
                                                        executeFast2.bindByteBuffer(z10 ? 1 : 0, nativeByteBuffer);
                                                        executeFast2.bindInteger(2, keyAt3);
                                                        executeFast2.bindLong(3, j11);
                                                        executeFast2.step();
                                                        nativeByteBuffer.reuse();
                                                        i18++;
                                                        i17 = i7;
                                                        z11 = true;
                                                    }
                                                }
                                                i7 = i17;
                                                i18++;
                                                i17 = i7;
                                                z11 = true;
                                            } catch (Exception e13) {
                                                e = e13;
                                                sQLitePreparedStatement = executeFast2;
                                                z11 = z10;
                                                z9 = z11;
                                                yrVar.o(e, z11);
                                                if (z9 && (sQLiteDatabase2 = yrVar.b) != null) {
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
                                                z11 = z10;
                                                if (z11) {
                                                    sQLiteDatabase.commitTransaction();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        sQLitePreparedStatement = executeFast2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLitePreparedStatement = executeFast2;
                                    }
                                }
                                z10 = z11;
                                TLdeserialize = null;
                                queryFinalized.dispose();
                                if (next) {
                                }
                                i7 = i17;
                                i18++;
                                i17 = i7;
                                z11 = true;
                            }
                            i17++;
                            z11 = true;
                        } catch (Exception e15) {
                            e = e15;
                            sQLitePreparedStatement = executeFast2;
                            z11 = true;
                            z9 = true;
                            yrVar.o(e, z11);
                            if (z9) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLitePreparedStatement = executeFast2;
                            z11 = true;
                        }
                    }
                    executeFast2.dispose();
                }
                yrVar.b.commitTransaction();
            } catch (Exception e16) {
                e = e16;
                z11 = true;
                sQLitePreparedStatement = null;
            } catch (Throwable th9) {
                th = th9;
                z11 = true;
            }
        } catch (Exception e17) {
            e = e17;
            z9 = false;
            z11 = true;
        } catch (Throwable th10) {
            th = th10;
            z11 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0244 A[Catch: all -> 0x0202, Exception -> 0x0209, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0202, blocks: (B:107:0x01f6, B:116:0x0220, B:118:0x0237, B:121:0x0244, B:122:0x0247, B:127:0x026e, B:300:0x0233), top: B:101:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031d A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0332 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0371 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0391 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ae A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ba A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c7 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e1 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f3 A[Catch: all -> 0x02ba, Exception -> 0x02bd, TRY_ENTER, TryCatch #13 {Exception -> 0x02bd, all -> 0x02ba, blocks: (B:129:0x027d, B:135:0x03fd, B:136:0x028d, B:183:0x03f3, B:185:0x03f8, B:238:0x02c4, B:242:0x040b, B:249:0x041e, B:257:0x0435, B:270:0x043e, B:274:0x048c, B:275:0x048f, B:277:0x0499, B:278:0x04a4, B:280:0x04aa, B:283:0x04bd, B:285:0x04c3, B:287:0x04d5, B:289:0x04f3, B:311:0x0505, B:312:0x0508), top: B:101:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03f8 A[Catch: all -> 0x02ba, Exception -> 0x02bd, TryCatch #13 {Exception -> 0x02bd, all -> 0x02ba, blocks: (B:129:0x027d, B:135:0x03fd, B:136:0x028d, B:183:0x03f3, B:185:0x03f8, B:238:0x02c4, B:242:0x040b, B:249:0x041e, B:257:0x0435, B:270:0x043e, B:274:0x048c, B:275:0x048f, B:277:0x0499, B:278:0x04a4, B:280:0x04aa, B:283:0x04bd, B:285:0x04c3, B:287:0x04d5, B:289:0x04f3, B:311:0x0505, B:312:0x0508), top: B:101:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e7 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c0 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a0 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0387 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0348 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0325 A[Catch: all -> 0x02ad, Exception -> 0x02b1, TryCatch #14 {Exception -> 0x02b1, all -> 0x02ad, blocks: (B:203:0x029d, B:206:0x02a7, B:207:0x02b6, B:139:0x02cc, B:141:0x02dd, B:142:0x02e5, B:144:0x0305, B:148:0x030d, B:150:0x031d, B:151:0x032e, B:153:0x0332, B:154:0x034e, B:157:0x035a, B:159:0x0371, B:160:0x038d, B:162:0x0391, B:165:0x039c, B:166:0x03a8, B:168:0x03ae, B:169:0x03b5, B:171:0x03ba, B:173:0x03c7, B:175:0x03ce, B:177:0x03d7, B:178:0x03dd, B:180:0x03e1, B:181:0x03eb, B:188:0x03e7, B:189:0x03c0, B:191:0x039a, B:192:0x03a0, B:193:0x0387, B:198:0x0348, B:199:0x0325), top: B:202:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x048c A[Catch: all -> 0x02ba, Exception -> 0x02bd, TRY_ENTER, TryCatch #13 {Exception -> 0x02bd, all -> 0x02ba, blocks: (B:129:0x027d, B:135:0x03fd, B:136:0x028d, B:183:0x03f3, B:185:0x03f8, B:238:0x02c4, B:242:0x040b, B:249:0x041e, B:257:0x0435, B:270:0x043e, B:274:0x048c, B:275:0x048f, B:277:0x0499, B:278:0x04a4, B:280:0x04aa, B:283:0x04bd, B:285:0x04c3, B:287:0x04d5, B:289:0x04f3, B:311:0x0505, B:312:0x0508), top: B:101:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0499 A[Catch: all -> 0x02ba, Exception -> 0x02bd, TryCatch #13 {Exception -> 0x02bd, all -> 0x02ba, blocks: (B:129:0x027d, B:135:0x03fd, B:136:0x028d, B:183:0x03f3, B:185:0x03f8, B:238:0x02c4, B:242:0x040b, B:249:0x041e, B:257:0x0435, B:270:0x043e, B:274:0x048c, B:275:0x048f, B:277:0x0499, B:278:0x04a4, B:280:0x04aa, B:283:0x04bd, B:285:0x04c3, B:287:0x04d5, B:289:0x04f3, B:311:0x0505, B:312:0x0508), top: B:101:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04f3 A[Catch: all -> 0x02ba, Exception -> 0x02bd, TRY_LEAVE, TryCatch #13 {Exception -> 0x02bd, all -> 0x02ba, blocks: (B:129:0x027d, B:135:0x03fd, B:136:0x028d, B:183:0x03f3, B:185:0x03f8, B:238:0x02c4, B:242:0x040b, B:249:0x041e, B:257:0x0435, B:270:0x043e, B:274:0x048c, B:275:0x048f, B:277:0x0499, B:278:0x04a4, B:280:0x04aa, B:283:0x04bd, B:285:0x04c3, B:287:0x04d5, B:289:0x04f3, B:311:0x0505, B:312:0x0508), top: B:101:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0505 A[Catch: all -> 0x02ba, Exception -> 0x02bd, TRY_ENTER, TryCatch #13 {Exception -> 0x02bd, all -> 0x02ba, blocks: (B:129:0x027d, B:135:0x03fd, B:136:0x028d, B:183:0x03f3, B:185:0x03f8, B:238:0x02c4, B:242:0x040b, B:249:0x041e, B:257:0x0435, B:270:0x043e, B:274:0x048c, B:275:0x048f, B:277:0x0499, B:278:0x04a4, B:280:0x04aa, B:283:0x04bd, B:285:0x04c3, B:287:0x04d5, B:289:0x04f3, B:311:0x0505, B:312:0x0508), top: B:101:0x01c4 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v48 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        yr yrVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        yr yrVar2;
        Throwable th2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        int i7;
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer nativeByteBuffer;
        yr yrVar3;
        int i10;
        ArrayList arrayList;
        boolean z10;
        SQLiteDatabase sQLiteDatabase3;
        int i11;
        int i12;
        boolean z11;
        int i13;
        SQLitePreparedStatement executeFast;
        int i14;
        int i15;
        int i16;
        int i17;
        NativeByteBuffer nativeByteBuffer2;
        int i18;
        NativeByteBuffer nativeByteBuffer3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer nativeByteBuffer4;
        int i19;
        TLRPC.Peer peer;
        NativeByteBuffer nativeByteBuffer5;
        long j3;
        int i20;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        int i21;
        boolean isEmpty;
        TLRPC.Message message;
        SQLiteCursor sQLiteCursor2 = null;
        ?? r32 = 3;
        ?? r33 = 3;
        int i22 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.v4.c0(((qp) this.c).currentAccount, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.f2) this.e, (TLRPC.TL_channels_editBanned) this.f, Boolean.valueOf(this.b));
                return;
            case 1:
                yr yrVar4 = (yr) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z12 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                try {
                } catch (Exception e10) {
                    e = e10;
                    z9 = true;
                    yrVar = yrVar4;
                    sQLitePreparedStatement = null;
                }
                try {
                    try {
                        try {
                            try {
                                SQLiteDatabase sQLiteDatabase4 = yrVar4.b;
                                Locale locale = Locale.US;
                                sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT uid, read_state, custom_params FROM messages_v2 WHERE mid = " + message2.id + " AND uid = " + ij.B0(message2) + " LIMIT 1", new Object[0]);
                                try {
                                } catch (Exception e11) {
                                    e = e11;
                                    i7 = 0;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                r32 = yrVar4;
                                sQLitePreparedStatement = null;
                                yrVar2 = r32;
                                sQLitePreparedStatement2 = null;
                                sQLiteDatabase = yrVar2.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        i7 = 0;
                        sQLiteCursor = null;
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor2 = null;
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                    if (!sQLiteCursor.next()) {
                        sQLiteCursor.dispose();
                        sQLiteCursor.dispose();
                        sQLiteDatabase3 = yrVar4.b;
                        if (sQLiteDatabase3 == null) {
                            return;
                        }
                        sQLiteDatabase3.commitTransaction();
                        return;
                    }
                    i7 = sQLiteCursor.intValue(1);
                    try {
                        try {
                            nativeByteBuffer = sQLiteCursor.byteBufferValue(2);
                            sQLiteCursor.dispose();
                        } catch (Exception e13) {
                            e = e13;
                            yrVar4.o(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            nativeByteBuffer = null;
                            yrVar4.b.beginTransaction();
                            if (message2.dialog_id == 0) {
                            }
                            yr.J(message2);
                            ij.r5(message2);
                            NativeByteBuffer nativeByteBuffer6 = new NativeByteBuffer(message2.getObjectSize());
                            message2.serializeToStream(nativeByteBuffer6);
                            long e14 = yrVar4.getUserConfig().e();
                            i10 = 0;
                            arrayList = null;
                            for (int i23 = 2; i10 < i23; i23 = 2) {
                            }
                            yrVar2 = yrVar4;
                            z10 = z12;
                            if (ui.r(message2)) {
                            }
                            if (nativeByteBuffer != null) {
                            }
                            nativeByteBuffer6.reuse();
                            yrVar2.b.commitTransaction();
                            if (z10) {
                            }
                            if (arrayList != null) {
                            }
                            sQLiteDatabase3 = yrVar2.b;
                            if (sQLiteDatabase3 == null) {
                            }
                            sQLiteDatabase3.commitTransaction();
                            return;
                        }
                        yrVar4.b.beginTransaction();
                        if (message2.dialog_id == 0) {
                            ij.B0(message2);
                        }
                        yr.J(message2);
                        ij.r5(message2);
                        NativeByteBuffer nativeByteBuffer62 = new NativeByteBuffer(message2.getObjectSize());
                        message2.serializeToStream(nativeByteBuffer62);
                        long e142 = yrVar4.getUserConfig().e();
                        i10 = 0;
                        arrayList = null;
                        while (i10 < i23) {
                            int i24 = i10 == i22 ? i22 : 0;
                            int i25 = i7;
                            long a22 = ij.a2(yrVar4.currentAccount, message2, yrVar4.Z(message2.dialog_id));
                            yr yrVar5 = yrVar4;
                            long j10 = message2.dialog_id;
                            if (i24 == 0) {
                                z11 = z12;
                                i13 = i10;
                                executeFast = yrVar5.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                            } else if (a22 == 0) {
                                z11 = z12;
                                i13 = i10;
                                i7 = i25;
                                i10 = i13 + 1;
                                yrVar4 = yrVar5;
                                z12 = z11;
                                i22 = 1;
                            } else {
                                z11 = z12;
                                i13 = i10;
                                executeFast = yrVar5.b.executeFast("REPLACE INTO messages_topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?)");
                                if (j10 == e142) {
                                    try {
                                        if (ij.R1(e142, message2) != 0) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(message2);
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLitePreparedStatement = executeFast;
                                        yrVar3 = yrVar5;
                                        z9 = true;
                                        yrVar = yrVar3;
                                        sQLitePreparedStatement2 = null;
                                        yrVar2 = yrVar;
                                        try {
                                            yrVar2.o(e, z9);
                                            sQLiteDatabase2 = yrVar2.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 == null) {
                                            }
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            sQLiteDatabase = yrVar2.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th7) {
                                        th2 = th7;
                                        sQLitePreparedStatement = executeFast;
                                        yrVar2 = yrVar5;
                                        sQLitePreparedStatement2 = null;
                                        sQLiteDatabase = yrVar2.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        throw th2;
                                    }
                                }
                            }
                            executeFast.requery();
                            ArrayList arrayList4 = arrayList;
                            executeFast.bindInteger(1, message2.id);
                            executeFast.bindLong(2, j10);
                            if (i24 != 0) {
                                executeFast.bindLong(3, a22);
                                i14 = 4;
                            } else {
                                i14 = 3;
                            }
                            i7 = i25;
                            executeFast.bindInteger(i14, i7);
                            executeFast.bindInteger(i14 + 1, message2.send_state);
                            executeFast.bindInteger(i14 + 2, message2.date);
                            int i26 = i14 + 4;
                            executeFast.bindByteBuffer(i14 + 3, nativeByteBuffer62);
                            int i27 = i14 + 5;
                            if (!message2.out && !message2.from_scheduled) {
                                i15 = 0;
                                executeFast.bindInteger(i26, i15);
                                int i28 = i14 + 6;
                                executeFast.bindInteger(i27, message2.ttl);
                                if ((message2.flags & 1024) == 0) {
                                    i16 = i14 + 7;
                                    executeFast.bindInteger(i28, message2.views);
                                } else {
                                    i16 = i14 + 7;
                                    executeFast.bindInteger(i28, yr.d0(message2));
                                }
                                if (message2.replyStory == null) {
                                    nativeByteBuffer2 = new NativeByteBuffer(message2.replyStory.getObjectSize());
                                    message2.replyStory.serializeToStream(nativeByteBuffer2);
                                    i17 = i16 + 1;
                                    executeFast.bindByteBuffer(i16, nativeByteBuffer2);
                                } else {
                                    i17 = i16 + 1;
                                    executeFast.bindNull(i16);
                                    nativeByteBuffer2 = null;
                                }
                                int i29 = message2.stickerVerified;
                                executeFast.bindInteger(i17, i29 != 0 ? 1 : i29 == 2 ? 2 : 0);
                                executeFast.bindInteger(i17 + 1, message2.mentioned ? 1 : 0);
                                int i30 = i17 + 3;
                                executeFast.bindInteger(i17 + 2, message2.forwards);
                                if (message2.replies == null) {
                                    nativeByteBuffer3 = new NativeByteBuffer(message2.replies.getObjectSize());
                                    message2.replies.serializeToStream(nativeByteBuffer3);
                                    i18 = i17 + 4;
                                    executeFast.bindByteBuffer(i30, nativeByteBuffer3);
                                } else {
                                    i18 = i17 + 4;
                                    executeFast.bindNull(i30);
                                    nativeByteBuffer3 = null;
                                }
                                messageReplyHeader = message2.reply_to;
                                if (messageReplyHeader == null) {
                                    i19 = i18 + 1;
                                    nativeByteBuffer4 = nativeByteBuffer3;
                                    int i31 = messageReplyHeader.reply_to_top_id;
                                    if (i31 == 0) {
                                        i31 = messageReplyHeader.reply_to_msg_id;
                                    }
                                    executeFast.bindInteger(i18, i31);
                                } else {
                                    nativeByteBuffer4 = nativeByteBuffer3;
                                    i19 = i18 + 1;
                                    executeFast.bindInteger(i18, 0);
                                }
                                int i32 = i19 + 1;
                                peer = message2.peer_id;
                                if (peer == null) {
                                    nativeByteBuffer5 = nativeByteBuffer2;
                                    j3 = peer.channel_id;
                                } else {
                                    nativeByteBuffer5 = nativeByteBuffer2;
                                    j3 = 0;
                                }
                                executeFast.bindLong(i19, j3);
                                if (nativeByteBuffer == null) {
                                    i20 = i19 + 2;
                                    executeFast.bindByteBuffer(i32, nativeByteBuffer);
                                } else {
                                    i20 = i19 + 2;
                                    executeFast.bindNull(i32);
                                }
                                if (i24 == 0) {
                                    if ((message2.flags & 131072) != 0) {
                                        i21 = i20 + 1;
                                        executeFast.bindLong(i20, message2.grouped_id);
                                    } else {
                                        i21 = i20 + 1;
                                        executeFast.bindNull(i20);
                                    }
                                    i20 = i21;
                                }
                                messageReplyHeader2 = message2.reply_to;
                                if (messageReplyHeader2 == null) {
                                    executeFast.bindInteger(i20, messageReplyHeader2.story_id);
                                } else {
                                    executeFast.bindInteger(i20, 0);
                                }
                                executeFast.step();
                                executeFast.dispose();
                                if (nativeByteBuffer4 != null) {
                                    nativeByteBuffer4.reuse();
                                }
                                if (nativeByteBuffer5 != null) {
                                    nativeByteBuffer5.reuse();
                                }
                                arrayList = arrayList4;
                                i10 = i13 + 1;
                                yrVar4 = yrVar5;
                                z12 = z11;
                                i22 = 1;
                            }
                            i15 = 1;
                            executeFast.bindInteger(i26, i15);
                            int i282 = i14 + 6;
                            executeFast.bindInteger(i27, message2.ttl);
                            if ((message2.flags & 1024) == 0) {
                            }
                            if (message2.replyStory == null) {
                            }
                            int i292 = message2.stickerVerified;
                            executeFast.bindInteger(i17, i292 != 0 ? 1 : i292 == 2 ? 2 : 0);
                            executeFast.bindInteger(i17 + 1, message2.mentioned ? 1 : 0);
                            int i302 = i17 + 3;
                            executeFast.bindInteger(i17 + 2, message2.forwards);
                            if (message2.replies == null) {
                            }
                            messageReplyHeader = message2.reply_to;
                            if (messageReplyHeader == null) {
                            }
                            int i322 = i19 + 1;
                            peer = message2.peer_id;
                            if (peer == null) {
                            }
                            executeFast.bindLong(i19, j3);
                            if (nativeByteBuffer == null) {
                            }
                            if (i24 == 0) {
                            }
                            messageReplyHeader2 = message2.reply_to;
                            if (messageReplyHeader2 == null) {
                            }
                            executeFast.step();
                            executeFast.dispose();
                            if (nativeByteBuffer4 != null) {
                            }
                            if (nativeByteBuffer5 != null) {
                            }
                            arrayList = arrayList4;
                            i10 = i13 + 1;
                            yrVar4 = yrVar5;
                            z12 = z11;
                            i22 = 1;
                        }
                        yrVar2 = yrVar4;
                        z10 = z12;
                        if (ui.r(message2)) {
                            int i33 = 0;
                            int i34 = 2;
                            while (i33 < i34) {
                                boolean z13 = i33 == 1;
                                long a23 = ij.a2(yrVar2.currentAccount, message2, yrVar2.Z(message2.dialog_id));
                                if (z13 && a23 == 0) {
                                    i11 = 2;
                                } else {
                                    SQLitePreparedStatement executeFast2 = i33 == 0 ? yrVar2.b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)") : yrVar2.b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
                                    try {
                                        executeFast2.requery();
                                        executeFast2.bindInteger(1, message2.id);
                                        i11 = 2;
                                        executeFast2.bindLong(2, message2.dialog_id);
                                        if (i33 != 0) {
                                            executeFast2.bindLong(3, a23);
                                            i12 = 4;
                                        } else {
                                            i12 = 3;
                                        }
                                        executeFast2.bindInteger(i12, message2.date);
                                        executeFast2.bindInteger(i12 + 1, ui.f0(message2));
                                        executeFast2.bindByteBuffer(i12 + 2, nativeByteBuffer62);
                                        executeFast2.step();
                                        executeFast2.dispose();
                                    } catch (Exception e16) {
                                        e = e16;
                                        sQLitePreparedStatement2 = executeFast2;
                                        sQLitePreparedStatement = null;
                                        z9 = true;
                                        yrVar2 = yrVar2;
                                        yrVar2.o(e, z9);
                                        sQLiteDatabase2 = yrVar2.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLitePreparedStatement2 == null) {
                                        }
                                    } catch (Throwable th8) {
                                        th2 = th8;
                                        sQLitePreparedStatement2 = executeFast2;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = yrVar2.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        throw th2;
                                    }
                                }
                                i33++;
                                i34 = i11;
                            }
                        }
                        if (nativeByteBuffer != null) {
                            nativeByteBuffer.reuse();
                        }
                        nativeByteBuffer62.reuse();
                        yrVar2.b.commitTransaction();
                        if (z10) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            for (int i35 = 0; i35 < arrayList2.size(); i35++) {
                                TLRPC.User user = (TLRPC.User) arrayList2.get(i35);
                                hashMap.put(Long.valueOf(user.id), user);
                            }
                            for (int i36 = 0; i36 < arrayList3.size(); i36++) {
                                TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i36);
                                hashMap2.put(Long.valueOf(chat.id), chat);
                            }
                            ij ijVar = new ij(yrVar2.currentAccount, message2, (AbstractMap) hashMap, (AbstractMap) hashMap2, true, true);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ijVar);
                            g0.h3(new lg(yrVar2, ijVar, arrayList5, 20));
                        }
                        if (arrayList != null) {
                            g0.h3(new sp(yrVar2, arrayList, 14));
                        }
                        sQLiteDatabase3 = yrVar2.b;
                        if (sQLiteDatabase3 == null) {
                            return;
                        }
                        sQLiteDatabase3.commitTransaction();
                        return;
                    } catch (Exception e17) {
                        e = e17;
                        r33 = yrVar4;
                        sQLitePreparedStatement = null;
                        yrVar3 = r33;
                        z9 = true;
                        yrVar = yrVar3;
                        sQLitePreparedStatement2 = null;
                        yrVar2 = yrVar;
                        yrVar2.o(e, z9);
                        sQLiteDatabase2 = yrVar2.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Exception e18) {
                    e = e18;
                    sQLitePreparedStatement = null;
                    yrVar3 = r33;
                    z9 = true;
                    yrVar = yrVar3;
                    sQLitePreparedStatement2 = null;
                    yrVar2 = yrVar;
                    yrVar2.o(e, z9);
                    sQLiteDatabase2 = yrVar2.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    sQLitePreparedStatement = null;
                    yrVar2 = r32;
                    sQLitePreparedStatement2 = null;
                    sQLiteDatabase = yrVar2.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th2;
                }
                break;
            case 2:
                x6 x6Var = (x6) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
                boolean z14 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.d.c(new x4(r32, x6Var, tLObject));
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null && ((isEmpty = TextUtils.isEmpty(tL_textWithEntities.text)) || !z14)) {
                        k5.o(null, isEmpty ? 2131750854 : 2131750852, org.telegram.ui.Components.hc.a0(T), isEmpty ? R.raw.ic_delete : R.raw.contact_check, 36);
                    }
                }
                u1Var.dismiss();
                return;
            case 3:
                a();
                return;
            case 4:
                gz gzVar = (gz) this.c;
                TLRPC.Message message3 = (TLRPC.Message) this.d;
                boolean z15 = this.b;
                TLObject tLObject2 = (TLObject) this.e;
                sy syVar = (sy) this.f;
                gzVar.getClass();
                gzVar.i0(message3.id, z15);
                if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer;
                    TLRPC.InputMedia inputMedia = pollAnswer.input_media;
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        pollAnswer.input_media = syVar.t;
                    } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                        pollAnswer.input_media = syVar.t;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                        tL_messages_sendMedia.media = syVar.t;
                    } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_messages_sendMedia.media = syVar.t;
                    }
                } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                    TLObject tLObject3 = syVar.c;
                    if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject3;
                        TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            tL_messages_sendMedia2.media = syVar.t;
                        } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            tL_messages_sendMedia2.media = syVar.t;
                        }
                    }
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject2;
                    TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                        tL_sendMessage.media = syVar.t;
                    } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_sendMessage.media = syVar.t;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject2;
                    TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                        tL_messages_editMessage.media = syVar.t;
                    } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_messages_editMessage.media = syVar.t;
                    }
                }
                syVar.p = true;
                gzVar.M(syVar, -1);
                return;
            case 5:
                gz gzVar2 = (gz) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = (TLRPC.TL_messages_editMessage) this.d;
                ij ijVar2 = (ij) this.f;
                int sendRequest = gzVar2.getConnectionsManager().sendRequest(tL_messages_editMessage2, new p4(ijVar2, gzVar2, tL_messages_editMessage2, (org.telegram.ui.ActionBar.f2) this.e, this.b));
                if (ijVar2 == null || (message = ijVar2.k) == null) {
                    return;
                }
                message.reqId = sendRequest;
                return;
            default:
                m10 m10Var = (m10) this.c;
                boolean[] zArr = (boolean[]) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z16 = this.b;
                c20 c20Var = (c20) this.f;
                ArrayList arrayList7 = m10Var.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (int i37 = 0; i37 < zArr.length; i37++) {
                    if (zArr[i37]) {
                        l10 l10Var = (l10) arrayList6.get(i37);
                        arrayList8.add(l10Var);
                        hashSet.add(Long.valueOf(l10Var.b));
                    }
                }
                if (!z16) {
                    int i38 = 0;
                    while (i38 < arrayList7.size()) {
                        if (hashSet.contains(Long.valueOf(((l10) arrayList7.get(i38)).b))) {
                            arrayList7.remove(i38);
                            i38--;
                        }
                        i38++;
                    }
                    if (!hashSet.isEmpty()) {
                        m10Var.d();
                        qs.f(m10Var.a).k(qs.d3, new Object[0]);
                        m10Var.e();
                    }
                }
                c20Var.a(arrayList8);
                return;
        }
    }

    public /* synthetic */ ln(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = c1Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = z9;
    }

    public /* synthetic */ ln(c1 c1Var, TLRPC.Message message, boolean z9, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.c = c1Var;
        this.d = message;
        this.b = z9;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ ln(ij ijVar, gz gzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this.a = 5;
        this.c = gzVar;
        this.d = tL_messages_editMessage;
        this.f = ijVar;
        this.e = f2Var;
        this.b = z9;
    }
}

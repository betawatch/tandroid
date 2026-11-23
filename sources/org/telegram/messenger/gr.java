package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class gr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ gr(tr trVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = trVar;
        this.c = j3;
        this.d = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.d;
        long j3 = this.c;
        tr trVar = this.b;
        trVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = trVar.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                trVar.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase2 = trVar.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase2.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e3 A[Catch: all -> 0x02c7, Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02cb, blocks: (B:215:0x02c0, B:159:0x02e3, B:163:0x02f6, B:170:0x0332, B:174:0x0350, B:177:0x0357, B:183:0x0371, B:205:0x0355), top: B:214:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f6 A[Catch: all -> 0x02c7, Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02cb, blocks: (B:215:0x02c0, B:159:0x02e3, B:163:0x02f6, B:170:0x0332, B:174:0x0350, B:177:0x0357, B:183:0x0371, B:205:0x0355), top: B:214:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0332 A[Catch: all -> 0x02c7, Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02cb, blocks: (B:215:0x02c0, B:159:0x02e3, B:163:0x02f6, B:170:0x0332, B:174:0x0350, B:177:0x0357, B:183:0x0371, B:205:0x0355), top: B:214:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0350 A[Catch: all -> 0x02c7, Exception -> 0x02cb, TRY_ENTER, TryCatch #9 {Exception -> 0x02cb, blocks: (B:215:0x02c0, B:159:0x02e3, B:163:0x02f6, B:170:0x0332, B:174:0x0350, B:177:0x0357, B:183:0x0371, B:205:0x0355), top: B:214:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0363 A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0371 A[Catch: all -> 0x02c7, Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02cb, blocks: (B:215:0x02c0, B:159:0x02e3, B:163:0x02f6, B:170:0x0332, B:174:0x0350, B:177:0x0357, B:183:0x0371, B:205:0x0355), top: B:214:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0383 A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0397 A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a9 A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ae A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b3 A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039d A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038e A[Catch: all -> 0x02c7, Exception -> 0x0389, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0346 A[Catch: all -> 0x02c7, Exception -> 0x0389, TRY_ENTER, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030a A[Catch: all -> 0x02c7, Exception -> 0x0389, TRY_ENTER, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e9 A[Catch: all -> 0x02c7, Exception -> 0x0389, TRY_ENTER, TryCatch #10 {Exception -> 0x0389, blocks: (B:151:0x027b, B:153:0x0283, B:156:0x02d1, B:160:0x02f0, B:164:0x030e, B:167:0x0319, B:171:0x034a, B:178:0x035f, B:180:0x0363, B:181:0x0368, B:184:0x037a, B:186:0x0383, B:187:0x0391, B:189:0x0397, B:190:0x03a1, B:192:0x03a9, B:194:0x03ae, B:196:0x03b3, B:198:0x03b6, B:200:0x039d, B:201:0x038e, B:203:0x0377, B:207:0x035c, B:208:0x0346, B:212:0x030a, B:213:0x02e9, B:223:0x03c3, B:224:0x03c7, B:225:0x03d8), top: B:150:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        tr trVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor2;
        tr trVar2;
        boolean z10;
        tr trVar3;
        int i7;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer c10;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        tr trVar4;
        tr trVar5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        tr trVar6;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j3;
        int i10 = this.a;
        int i11 = 7;
        int i12 = 3;
        tr trVar7 = this.b;
        long j10 = this.c;
        ArrayList arrayList4 = this.d;
        int i13 = 2;
        int i14 = 1;
        SQLiteCursor sQLiteCursor3 = null;
        switch (i10) {
            case 0:
                ArrayList arrayList5 = new ArrayList();
                try {
                    try {
                        String join = TextUtils.join(",", arrayList4);
                        SQLiteDatabase sQLiteDatabase3 = trVar7.b;
                        Locale locale = Locale.US;
                        boolean z11 = false;
                        sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (" + join + ")", new Object[0]);
                        while (sQLiteCursor.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(z11 ? 1 : 0);
                                if (byteBufferValue != null) {
                                    try {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z11), z11);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, trVar7.getUserConfig().n);
                                            if (!TLdeserialize.out && TLdeserialize.media_unread && fj.R4(TLdeserialize)) {
                                                z11 = false;
                                                arrayList5.add(new fj(trVar7.currentAccount, TLdeserialize, false, false));
                                                byteBufferValue.reuse();
                                            }
                                        }
                                        z11 = false;
                                    } finally {
                                        byteBufferValue.reuse();
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                trVar7.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (arrayList5.isEmpty()) {
                                }
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor3 = null;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                if (arrayList5.isEmpty()) {
                    g0.g3(new qp(trVar7, arrayList5, 2));
                    return;
                }
                return;
            case 1:
                tr trVar8 = this.b;
                long j11 = this.c;
                ArrayList arrayList6 = this.d;
                trVar8.S0(0, 0, j11, arrayList6);
                trVar8.getNotificationCenter().k(65, Long.valueOf(j11), arrayList6);
                return;
            case 2:
                tr trVar9 = this.b;
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase4 = trVar9.b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data, mid, date, uid, custom_params FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList4) + ") AND uid = " + j10, new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                try {
                                    try {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            TLdeserialize2.readAttachPath(byteBufferValue2, trVar9.getUserConfig().n);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize2.media != null) {
                                                tr trVar10 = trVar9;
                                                try {
                                                    boolean b10 = trVar10.b(TLdeserialize2, arrayList7, arrayList9, arrayList8, true);
                                                    trVar4 = trVar10;
                                                    arrayList = arrayList7;
                                                    arrayList2 = arrayList9;
                                                    arrayList3 = arrayList8;
                                                    if (b10) {
                                                        try {
                                                            TLRPC.MessageMedia messageMedia = TLdeserialize2.media;
                                                            if (messageMedia.document != null) {
                                                                messageMedia.document = new TLRPC.TL_documentEmpty();
                                                            } else if (messageMedia.photo != null) {
                                                                messageMedia.photo = new TLRPC.TL_photoEmpty();
                                                            }
                                                            TLdeserialize2.media.flags &= -2;
                                                            TLdeserialize2.id = queryFinalized.intValue(1);
                                                            TLdeserialize2.date = queryFinalized.intValue(2);
                                                            TLdeserialize2.dialog_id = queryFinalized.longValue(3);
                                                            NativeByteBuffer byteBufferValue3 = queryFinalized.byteBufferValue(4);
                                                            if (byteBufferValue3 != null) {
                                                                ui.b(TLdeserialize2, byteBufferValue3);
                                                            }
                                                            arrayList10.add(TLdeserialize2);
                                                            trVar5 = trVar4;
                                                            trVar9 = trVar5;
                                                            arrayList7 = arrayList;
                                                            arrayList8 = arrayList3;
                                                            arrayList9 = arrayList2;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            sQLiteCursor2 = queryFinalized;
                                                            z10 = 1;
                                                            sQLitePreparedStatement = null;
                                                            trVar3 = trVar4;
                                                            try {
                                                                trVar3.o(e, z10);
                                                                if (sQLiteCursor2 != null) {
                                                                }
                                                                if (sQLitePreparedStatement == null) {
                                                                }
                                                                sQLitePreparedStatement.dispose();
                                                                return;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                if (sQLiteCursor2 != null) {
                                                                }
                                                                if (sQLitePreparedStatement != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        trVar9 = trVar4;
                                                        arrayList7 = arrayList;
                                                        arrayList8 = arrayList3;
                                                        arrayList9 = arrayList2;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    trVar4 = trVar10;
                                                }
                                            }
                                        }
                                        trVar5 = trVar9;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList9;
                                        arrayList3 = arrayList8;
                                        trVar9 = trVar5;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList3;
                                        arrayList9 = arrayList2;
                                    } catch (Exception e14) {
                                        e = e14;
                                        trVar4 = trVar9;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    trVar = trVar9;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor2 = queryFinalized;
                                sQLitePreparedStatement = null;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                        trVar = trVar9;
                        ArrayList arrayList11 = arrayList7;
                        ArrayList arrayList12 = arrayList9;
                        ArrayList arrayList13 = arrayList8;
                        try {
                            queryFinalized.dispose();
                        } catch (Exception e16) {
                            e = e16;
                            sQLiteCursor2 = queryFinalized;
                            sQLitePreparedStatement = null;
                            trVar2 = trVar;
                            z10 = 1;
                            trVar3 = trVar2;
                            trVar3.o(e, z10);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        try {
                            trVar.D(arrayList12, true);
                            if (arrayList10.isEmpty()) {
                                sQLitePreparedStatement = null;
                            } else {
                                sQLitePreparedStatement = trVar.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                                int i15 = 0;
                                while (true) {
                                    try {
                                        try {
                                            int i16 = 16;
                                            if (i15 < arrayList10.size()) {
                                                TLRPC.Message message = (TLRPC.Message) arrayList10.get(i15);
                                                fj.q5(message);
                                                NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(message.getObjectSize());
                                                message.serializeToStream(nativeByteBuffer3);
                                                sQLitePreparedStatement.requery();
                                                sQLitePreparedStatement.bindInteger(i14, message.id);
                                                sQLitePreparedStatement.bindLong(i13, message.dialog_id);
                                                sQLitePreparedStatement.bindInteger(i12, fj.c2(message));
                                                sQLitePreparedStatement.bindInteger(4, message.send_state);
                                                sQLitePreparedStatement.bindInteger(5, message.date);
                                                sQLitePreparedStatement.bindByteBuffer(6, nativeByteBuffer3);
                                                if (!message.out) {
                                                    try {
                                                        if (!message.from_scheduled) {
                                                            i7 = 0;
                                                            sQLitePreparedStatement.bindInteger(i11, i7);
                                                            sQLitePreparedStatement.bindInteger(8, message.ttl);
                                                            if ((message.flags & 1024) == 0) {
                                                                sQLitePreparedStatement.bindInteger(9, message.views);
                                                            } else {
                                                                sQLitePreparedStatement.bindInteger(9, tr.d0(message));
                                                            }
                                                            if (message.replyStory == null) {
                                                                nativeByteBuffer = new NativeByteBuffer(message.replyStory.getObjectSize());
                                                                message.replyStory.serializeToStream(nativeByteBuffer);
                                                                sQLitePreparedStatement.bindByteBuffer(10, nativeByteBuffer);
                                                            } else {
                                                                sQLitePreparedStatement.bindNull(10);
                                                                nativeByteBuffer = null;
                                                            }
                                                            int i17 = message.stickerVerified;
                                                            sQLitePreparedStatement.bindInteger(11, i17 != 0 ? i14 : i17 == i13 ? i13 : 0);
                                                            sQLitePreparedStatement.bindInteger(12, message.mentioned ? 1 : 0);
                                                            sQLitePreparedStatement.bindInteger(13, message.forwards);
                                                            if (message.replies == null) {
                                                                nativeByteBuffer2 = new NativeByteBuffer(message.replies.getObjectSize());
                                                                message.replies.serializeToStream(nativeByteBuffer2);
                                                                sQLitePreparedStatement.bindByteBuffer(14, nativeByteBuffer2);
                                                            } else {
                                                                sQLitePreparedStatement.bindNull(14);
                                                                nativeByteBuffer2 = null;
                                                            }
                                                            messageReplyHeader = message.reply_to;
                                                            if (messageReplyHeader == null) {
                                                                int i18 = messageReplyHeader.reply_to_top_id;
                                                                if (i18 == 0) {
                                                                    i18 = messageReplyHeader.reply_to_msg_id;
                                                                }
                                                                sQLitePreparedStatement.bindInteger(15, i18);
                                                            } else {
                                                                sQLitePreparedStatement.bindInteger(15, 0);
                                                            }
                                                            TLRPC.Peer peer = message.peer_id;
                                                            sQLitePreparedStatement.bindLong(16, peer == null ? peer.channel_id : 0L);
                                                            c10 = ui.c(message);
                                                            if (c10 == null) {
                                                                sQLitePreparedStatement.bindByteBuffer(16, c10);
                                                            } else {
                                                                sQLitePreparedStatement.bindNull(17);
                                                            }
                                                            if ((message.flags & 131072) == 0) {
                                                                sQLitePreparedStatement.bindLong(18, message.grouped_id);
                                                            } else {
                                                                sQLitePreparedStatement.bindNull(18);
                                                            }
                                                            messageReplyHeader2 = message.reply_to;
                                                            if (messageReplyHeader2 == null) {
                                                                sQLitePreparedStatement.bindInteger(19, messageReplyHeader2.story_id);
                                                            } else {
                                                                sQLitePreparedStatement.bindInteger(19, 0);
                                                            }
                                                            sQLitePreparedStatement.step();
                                                            nativeByteBuffer3.reuse();
                                                            if (nativeByteBuffer2 != null) {
                                                                nativeByteBuffer2.reuse();
                                                            }
                                                            if (c10 != null) {
                                                                c10.reuse();
                                                            }
                                                            if (nativeByteBuffer == null) {
                                                                nativeByteBuffer.reuse();
                                                            }
                                                            i15++;
                                                            i11 = 7;
                                                            i12 = 3;
                                                            i13 = 2;
                                                            i14 = 1;
                                                        }
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        z10 = i14;
                                                        sQLiteCursor2 = null;
                                                        trVar3 = trVar;
                                                        trVar3.o(e, z10);
                                                        if (sQLiteCursor2 != null) {
                                                        }
                                                        if (sQLitePreparedStatement == null) {
                                                        }
                                                        sQLitePreparedStatement.dispose();
                                                        return;
                                                    }
                                                }
                                                i7 = i14;
                                                sQLitePreparedStatement.bindInteger(i11, i7);
                                                sQLitePreparedStatement.bindInteger(8, message.ttl);
                                                if ((message.flags & 1024) == 0) {
                                                }
                                                if (message.replyStory == null) {
                                                }
                                                int i172 = message.stickerVerified;
                                                sQLitePreparedStatement.bindInteger(11, i172 != 0 ? i14 : i172 == i13 ? i13 : 0);
                                                sQLitePreparedStatement.bindInteger(12, message.mentioned ? 1 : 0);
                                                sQLitePreparedStatement.bindInteger(13, message.forwards);
                                                if (message.replies == null) {
                                                }
                                                messageReplyHeader = message.reply_to;
                                                if (messageReplyHeader == null) {
                                                }
                                                TLRPC.Peer peer2 = message.peer_id;
                                                sQLitePreparedStatement.bindLong(16, peer2 == null ? peer2.channel_id : 0L);
                                                c10 = ui.c(message);
                                                if (c10 == null) {
                                                }
                                                if ((message.flags & 131072) == 0) {
                                                }
                                                messageReplyHeader2 = message.reply_to;
                                                if (messageReplyHeader2 == null) {
                                                }
                                                sQLitePreparedStatement.step();
                                                nativeByteBuffer3.reuse();
                                                if (nativeByteBuffer2 != null) {
                                                }
                                                if (c10 != null) {
                                                }
                                                if (nativeByteBuffer == null) {
                                                }
                                                i15++;
                                                i11 = 7;
                                                i12 = 3;
                                                i13 = 2;
                                                i14 = 1;
                                            } else {
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                    sQLitePreparedStatement = null;
                                                }
                                                g0.g3(new qp(trVar, arrayList10, i16));
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            sQLiteCursor2 = null;
                                            trVar2 = trVar;
                                            z10 = 1;
                                            trVar3 = trVar2;
                                            trVar3.o(e, z10);
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement == null) {
                                            }
                                            sQLitePreparedStatement.dispose();
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteCursor2 = null;
                                        if (sQLiteCursor2 != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            g0.g3(new qp(trVar, arrayList13, 17));
                            trVar.getFileLoader().getClass();
                            w7.p(0, arrayList11);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                        } catch (Exception e19) {
                            e = e19;
                            sQLitePreparedStatement = null;
                            sQLiteCursor2 = null;
                            trVar2 = trVar;
                            z10 = 1;
                            trVar3 = trVar2;
                            trVar3.o(e, z10);
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement == null) {
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLitePreparedStatement = null;
                    }
                } catch (Exception e20) {
                    e = e20;
                    trVar = trVar9;
                }
                sQLitePreparedStatement.dispose();
                return;
            case 3:
                int i19 = 0;
                long j12 = this.c;
                tr trVar11 = this.b;
                trVar11.getClass();
                long j13 = -j12;
                try {
                    trVar11.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j13).stepThis().dispose();
                    trVar11.b.beginTransaction();
                    SQLitePreparedStatement executeFast = trVar11.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
                    try {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        while (i19 < arrayList4.size()) {
                            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList4.get(i19);
                            executeFast.requery();
                            executeFast.bindLong(1, j13);
                            executeFast.bindLong(2, fj.B1(channelParticipant.peer));
                            executeFast.bindInteger(3, currentTimeMillis);
                            NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(channelParticipant.getObjectSize());
                            channelParticipant.serializeToStream(nativeByteBuffer4);
                            executeFast.bindByteBuffer(4, nativeByteBuffer4);
                            executeFast.step();
                            nativeByteBuffer4.reuse();
                            currentTimeMillis--;
                            i19++;
                            j12 = j12;
                        }
                        j3 = j12;
                        executeFast.dispose();
                        trVar11.b.commitTransaction();
                        trVar6 = trVar11;
                    } catch (Exception e21) {
                        e = e21;
                        trVar6 = trVar11;
                        sQLitePreparedStatement2 = executeFast;
                        try {
                            trVar6.o(e, true);
                            sQLiteDatabase2 = trVar6.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement2 == null) {
                                sQLitePreparedStatement2.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase = trVar6.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        trVar6 = trVar11;
                        sQLitePreparedStatement2 = executeFast;
                        sQLiteDatabase = trVar6.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e22) {
                    e = e22;
                    trVar6 = trVar11;
                } catch (Throwable th10) {
                    th = th10;
                    trVar6 = trVar11;
                }
                try {
                    trVar6.F0(j3, true, null, false, true, 0);
                    SQLiteDatabase sQLiteDatabase5 = trVar6.b;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e23) {
                    e = e23;
                    sQLitePreparedStatement2 = null;
                    trVar6.o(e, true);
                    sQLiteDatabase2 = trVar6.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    sQLitePreparedStatement2 = null;
                    sQLiteDatabase = trVar6.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            case 4:
                trVar7.getClass();
                HashSet hashSet = new HashSet();
                int size = arrayList4.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList4.get(i20);
                    i20++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (trVar7.getMessagesController().N3(message2)) {
                        hashSet.add(Long.valueOf(fj.Q1(j10, message2)));
                        sQLiteCursor3 = 1;
                    }
                }
                if (sQLiteCursor3 != null) {
                    trVar7.getMessagesController().D5(hashSet);
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                tr trVar12 = this.b;
                long j14 = this.c;
                ArrayList arrayList14 = this.d;
                trVar12.S0(0, 0, j14, arrayList14);
                trVar12.getNotificationCenter().k(65, Long.valueOf(j14), arrayList14);
                return;
            case 7:
                trVar7.getNotificationCenter().k(7, arrayList4, Long.valueOf(n5.z(j10) ? -j10 : 0L), Boolean.FALSE);
                return;
            default:
                trVar7.getMessagesController().s3(arrayList4, j10);
                trVar7.getNotificationCenter().k(7, arrayList4, 0L, Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ gr(tr trVar, ArrayList arrayList, long j3, int i7) {
        this.a = i7;
        this.b = trVar;
        this.d = arrayList;
        this.c = j3;
    }
}

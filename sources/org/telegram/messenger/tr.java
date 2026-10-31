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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ tr(hs hsVar, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.d = j10;
        this.c = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.c;
        long j10 = this.d;
        hs hsVar = this.b;
        hsVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = hsVar.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                hsVar.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase2 = hsVar.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase2.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0308 A[Catch: all -> 0x02ec, Exception -> 0x02f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02f0, blocks: (B:217:0x02e5, B:161:0x0308, B:165:0x031b, B:172:0x0357, B:176:0x0375, B:179:0x037c, B:185:0x0396, B:207:0x037a), top: B:216:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031b A[Catch: all -> 0x02ec, Exception -> 0x02f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02f0, blocks: (B:217:0x02e5, B:161:0x0308, B:165:0x031b, B:172:0x0357, B:176:0x0375, B:179:0x037c, B:185:0x0396, B:207:0x037a), top: B:216:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0357 A[Catch: all -> 0x02ec, Exception -> 0x02f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02f0, blocks: (B:217:0x02e5, B:161:0x0308, B:165:0x031b, B:172:0x0357, B:176:0x0375, B:179:0x037c, B:185:0x0396, B:207:0x037a), top: B:216:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0375 A[Catch: all -> 0x02ec, Exception -> 0x02f0, TRY_ENTER, TryCatch #0 {Exception -> 0x02f0, blocks: (B:217:0x02e5, B:161:0x0308, B:165:0x031b, B:172:0x0357, B:176:0x0375, B:179:0x037c, B:185:0x0396, B:207:0x037a), top: B:216:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0388 A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396 A[Catch: all -> 0x02ec, Exception -> 0x02f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02f0, blocks: (B:217:0x02e5, B:161:0x0308, B:165:0x031b, B:172:0x0357, B:176:0x0375, B:179:0x037c, B:185:0x0396, B:207:0x037a), top: B:216:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a8 A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03bc A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ce A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d3 A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d8 A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c2 A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b3 A[Catch: all -> 0x02ec, Exception -> 0x03ae, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x036b A[Catch: all -> 0x02ec, Exception -> 0x03ae, TRY_ENTER, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032f A[Catch: all -> 0x02ec, Exception -> 0x03ae, TRY_ENTER, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x030e A[Catch: all -> 0x02ec, Exception -> 0x03ae, TRY_ENTER, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x02a0, B:155:0x02a8, B:158:0x02f6, B:162:0x0315, B:166:0x0333, B:169:0x033e, B:173:0x036f, B:180:0x0384, B:182:0x0388, B:183:0x038d, B:186:0x039f, B:188:0x03a8, B:189:0x03b6, B:191:0x03bc, B:192:0x03c6, B:194:0x03ce, B:196:0x03d3, B:198:0x03d8, B:200:0x03db, B:202:0x03c2, B:203:0x03b3, B:205:0x039c, B:209:0x0381, B:210:0x036b, B:214:0x032f, B:215:0x030e, B:225:0x03e8, B:226:0x03ec, B:227:0x03fd), top: B:152:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        hs hsVar;
        SQLiteCursor sQLiteCursor2;
        hs hsVar2;
        boolean z10;
        hs hsVar3;
        ArrayList arrayList;
        SQLiteCursor queryFinalized;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer c10;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        hs hsVar4;
        hs hsVar5;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        hs hsVar6;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        int i11 = this.a;
        int i12 = 7;
        int i13 = 3;
        hs hsVar7 = this.b;
        long j10 = this.d;
        ArrayList arrayList8 = this.c;
        int i14 = 2;
        int i15 = 1;
        SQLiteCursor sQLiteCursor3 = null;
        switch (i11) {
            case 0:
                ArrayList arrayList9 = new ArrayList();
                try {
                    try {
                        String join = TextUtils.join(",", arrayList8);
                        SQLiteDatabase sQLiteDatabase3 = hsVar7.b;
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
                                            TLdeserialize.readAttachPath(byteBufferValue, hsVar7.getUserConfig().n);
                                            if (!TLdeserialize.out && TLdeserialize.media_unread && jj.R4(TLdeserialize)) {
                                                z11 = false;
                                                arrayList9.add(new jj(hsVar7.currentAccount, TLdeserialize, false, false));
                                                byteBufferValue.reuse();
                                            }
                                        }
                                        z11 = false;
                                    } finally {
                                        byteBufferValue.reuse();
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                hsVar7.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (arrayList9.isEmpty()) {
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
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor3 = null;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                if (arrayList9.isEmpty()) {
                    i0.g3(new xp(hsVar7, arrayList9, 20));
                    return;
                }
                return;
            case 1:
                hs hsVar8 = this.b;
                try {
                    try {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        arrayList = new ArrayList();
                        SQLiteDatabase sQLiteDatabase4 = hsVar8.b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data, mid, date, uid, custom_params FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList8) + ") AND uid = " + j10, new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                try {
                                    try {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            TLdeserialize2.readAttachPath(byteBufferValue2, hsVar8.getUserConfig().n);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize2.media != null) {
                                                hs hsVar9 = hsVar8;
                                                try {
                                                    boolean b10 = hsVar9.b(TLdeserialize2, arrayList10, arrayList12, arrayList11, true);
                                                    hsVar4 = hsVar9;
                                                    arrayList5 = arrayList10;
                                                    arrayList6 = arrayList12;
                                                    arrayList7 = arrayList11;
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
                                                                xi.b(TLdeserialize2, byteBufferValue3);
                                                            }
                                                            arrayList.add(TLdeserialize2);
                                                            hsVar5 = hsVar4;
                                                            hsVar8 = hsVar5;
                                                            arrayList10 = arrayList5;
                                                            arrayList11 = arrayList7;
                                                            arrayList12 = arrayList6;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            sQLiteCursor2 = queryFinalized;
                                                            z10 = 1;
                                                            sQLitePreparedStatement = null;
                                                            hsVar3 = hsVar4;
                                                            try {
                                                                hsVar3.o(e, z10);
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
                                                        hsVar8 = hsVar4;
                                                        arrayList10 = arrayList5;
                                                        arrayList11 = arrayList7;
                                                        arrayList12 = arrayList6;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    hsVar4 = hsVar9;
                                                }
                                            }
                                        }
                                        hsVar5 = hsVar8;
                                        arrayList5 = arrayList10;
                                        arrayList6 = arrayList12;
                                        arrayList7 = arrayList11;
                                        hsVar8 = hsVar5;
                                        arrayList10 = arrayList5;
                                        arrayList11 = arrayList7;
                                        arrayList12 = arrayList6;
                                    } catch (Exception e12) {
                                        e = e12;
                                        hsVar4 = hsVar8;
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
                            } catch (Exception e13) {
                                e = e13;
                                hsVar = hsVar8;
                            }
                        }
                        hsVar = hsVar8;
                        arrayList2 = arrayList10;
                        arrayList3 = arrayList12;
                        arrayList4 = arrayList11;
                    } catch (Exception e14) {
                        e = e14;
                        hsVar = hsVar8;
                    }
                    try {
                        queryFinalized.dispose();
                    } catch (Exception e15) {
                        e = e15;
                        sQLiteCursor2 = queryFinalized;
                        sQLitePreparedStatement = null;
                        hsVar2 = hsVar;
                        z10 = 1;
                        hsVar3 = hsVar2;
                        hsVar3.o(e, z10);
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement == null) {
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    try {
                        hsVar.D(arrayList3, true);
                        if (arrayList.isEmpty()) {
                            sQLitePreparedStatement = null;
                        } else {
                            sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                            int i16 = 0;
                            while (true) {
                                try {
                                    try {
                                        int i17 = 16;
                                        if (i16 < arrayList.size()) {
                                            TLRPC.Message message = (TLRPC.Message) arrayList.get(i16);
                                            jj.q5(message);
                                            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(message.getObjectSize());
                                            message.serializeToStream(nativeByteBuffer3);
                                            sQLitePreparedStatement.requery();
                                            sQLitePreparedStatement.bindInteger(i15, message.id);
                                            sQLitePreparedStatement.bindLong(i14, message.dialog_id);
                                            sQLitePreparedStatement.bindInteger(i13, jj.d2(message));
                                            sQLitePreparedStatement.bindInteger(4, message.send_state);
                                            sQLitePreparedStatement.bindInteger(5, message.date);
                                            sQLitePreparedStatement.bindByteBuffer(6, nativeByteBuffer3);
                                            if (!message.out) {
                                                try {
                                                    if (!message.from_scheduled) {
                                                        i10 = 0;
                                                        sQLitePreparedStatement.bindInteger(i12, i10);
                                                        sQLitePreparedStatement.bindInteger(8, message.ttl);
                                                        if ((message.flags & 1024) == 0) {
                                                            sQLitePreparedStatement.bindInteger(9, message.views);
                                                        } else {
                                                            sQLitePreparedStatement.bindInteger(9, hs.d0(message));
                                                        }
                                                        if (message.replyStory == null) {
                                                            nativeByteBuffer = new NativeByteBuffer(message.replyStory.getObjectSize());
                                                            message.replyStory.serializeToStream(nativeByteBuffer);
                                                            sQLitePreparedStatement.bindByteBuffer(10, nativeByteBuffer);
                                                        } else {
                                                            sQLitePreparedStatement.bindNull(10);
                                                            nativeByteBuffer = null;
                                                        }
                                                        int i18 = message.stickerVerified;
                                                        sQLitePreparedStatement.bindInteger(11, i18 != 0 ? i15 : i18 == i14 ? i14 : 0);
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
                                                            int i19 = messageReplyHeader.reply_to_top_id;
                                                            if (i19 == 0) {
                                                                i19 = messageReplyHeader.reply_to_msg_id;
                                                            }
                                                            sQLitePreparedStatement.bindInteger(15, i19);
                                                        } else {
                                                            sQLitePreparedStatement.bindInteger(15, 0);
                                                        }
                                                        TLRPC.Peer peer = message.peer_id;
                                                        sQLitePreparedStatement.bindLong(16, peer == null ? peer.channel_id : 0L);
                                                        c10 = xi.c(message);
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
                                                        i16++;
                                                        i12 = 7;
                                                        i13 = 3;
                                                        i14 = 2;
                                                        i15 = 1;
                                                    }
                                                } catch (Exception e16) {
                                                    e = e16;
                                                    z10 = i15;
                                                    sQLiteCursor2 = null;
                                                    hsVar3 = hsVar;
                                                    hsVar3.o(e, z10);
                                                    if (sQLiteCursor2 != null) {
                                                        sQLiteCursor2.dispose();
                                                    }
                                                    if (sQLitePreparedStatement == null) {
                                                        return;
                                                    }
                                                    sQLitePreparedStatement.dispose();
                                                    return;
                                                }
                                            }
                                            i10 = i15;
                                            sQLitePreparedStatement.bindInteger(i12, i10);
                                            sQLitePreparedStatement.bindInteger(8, message.ttl);
                                            if ((message.flags & 1024) == 0) {
                                            }
                                            if (message.replyStory == null) {
                                            }
                                            int i182 = message.stickerVerified;
                                            sQLitePreparedStatement.bindInteger(11, i182 != 0 ? i15 : i182 == i14 ? i14 : 0);
                                            sQLitePreparedStatement.bindInteger(12, message.mentioned ? 1 : 0);
                                            sQLitePreparedStatement.bindInteger(13, message.forwards);
                                            if (message.replies == null) {
                                            }
                                            messageReplyHeader = message.reply_to;
                                            if (messageReplyHeader == null) {
                                            }
                                            TLRPC.Peer peer2 = message.peer_id;
                                            sQLitePreparedStatement.bindLong(16, peer2 == null ? peer2.channel_id : 0L);
                                            c10 = xi.c(message);
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
                                            i16++;
                                            i12 = 7;
                                            i13 = 3;
                                            i14 = 2;
                                            i15 = 1;
                                        } else {
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                                sQLitePreparedStatement = null;
                                            }
                                            i0.g3(new xp(hsVar, arrayList, i17));
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        sQLiteCursor2 = null;
                                        hsVar2 = hsVar;
                                        z10 = 1;
                                        hsVar3 = hsVar2;
                                        hsVar3.o(e, z10);
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
                        i0.g3(new xp(hsVar, arrayList4, 17));
                        hsVar.getFileLoader().getClass();
                        b8.p(0, arrayList2);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e18) {
                        e = e18;
                        sQLitePreparedStatement = null;
                        sQLiteCursor2 = null;
                        hsVar2 = hsVar;
                        z10 = 1;
                        hsVar3 = hsVar2;
                        hsVar3.o(e, z10);
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement == null) {
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                }
            case 2:
                int i20 = 0;
                long j11 = this.d;
                hs hsVar10 = this.b;
                hsVar10.getClass();
                long j12 = -j11;
                try {
                    hsVar10.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j12).stepThis().dispose();
                    hsVar10.b.beginTransaction();
                    executeFast = hsVar10.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
                } catch (Exception e19) {
                    e = e19;
                    hsVar6 = hsVar10;
                } catch (Throwable th8) {
                    th = th8;
                    hsVar6 = hsVar10;
                }
                try {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    while (i20 < arrayList8.size()) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList8.get(i20);
                        executeFast.requery();
                        executeFast.bindLong(1, j12);
                        executeFast.bindLong(2, jj.C1(channelParticipant.peer));
                        executeFast.bindInteger(3, currentTimeMillis);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer4);
                        executeFast.bindByteBuffer(4, nativeByteBuffer4);
                        executeFast.step();
                        nativeByteBuffer4.reuse();
                        currentTimeMillis--;
                        i20++;
                        j11 = j11;
                    }
                    long j13 = j11;
                    executeFast.dispose();
                    hsVar10.b.commitTransaction();
                    hsVar6 = hsVar10;
                    try {
                        hsVar6.F0(j13, true, null, false, true, 0);
                        SQLiteDatabase sQLiteDatabase5 = hsVar6.b;
                        if (sQLiteDatabase5 != null) {
                            sQLiteDatabase5.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e20) {
                        e = e20;
                        sQLitePreparedStatement2 = null;
                        try {
                            hsVar6.o(e, true);
                            sQLiteDatabase2 = hsVar6.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement2 == null) {
                                sQLitePreparedStatement2.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th9) {
                            th = th9;
                            sQLiteDatabase = hsVar6.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        sQLitePreparedStatement2 = null;
                        sQLiteDatabase = hsVar6.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e21) {
                    e = e21;
                    hsVar6 = hsVar10;
                    sQLitePreparedStatement2 = executeFast;
                    hsVar6.o(e, true);
                    sQLiteDatabase2 = hsVar6.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    hsVar6 = hsVar10;
                    sQLitePreparedStatement2 = executeFast;
                    sQLiteDatabase = hsVar6.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            case 3:
                hsVar7.getClass();
                HashSet hashSet = new HashSet();
                int size = arrayList8.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj = arrayList8.get(i21);
                    i21++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (hsVar7.getMessagesController().D3(message2)) {
                        hashSet.add(Long.valueOf(jj.R1(j10, message2)));
                        sQLiteCursor3 = 1;
                    }
                }
                if (sQLiteCursor3 != null) {
                    hsVar7.getMessagesController().o5(hashSet);
                    return;
                }
                return;
            case 4:
                a();
                return;
            case 5:
                hs hsVar11 = this.b;
                long j14 = this.d;
                ArrayList arrayList13 = this.c;
                hsVar11.S0(0, 0, j14, arrayList13);
                hsVar11.getNotificationCenter().k(65, Long.valueOf(j14), arrayList13);
                return;
            case 6:
                hsVar7.getNotificationCenter().k(7, arrayList8, Long.valueOf(o5.z(j10) ? -j10 : 0L), Boolean.FALSE);
                return;
            case 7:
                hsVar7.getMessagesController().j3(arrayList8, j10);
                hsVar7.getNotificationCenter().k(7, arrayList8, 0L, Boolean.FALSE);
                return;
            default:
                hs hsVar12 = this.b;
                long j15 = this.d;
                ArrayList arrayList14 = this.c;
                hsVar12.S0(0, 0, j15, arrayList14);
                hsVar12.getNotificationCenter().k(65, Long.valueOf(j15), arrayList14);
                return;
        }
    }

    public /* synthetic */ tr(hs hsVar, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = arrayList;
        this.d = j10;
    }
}

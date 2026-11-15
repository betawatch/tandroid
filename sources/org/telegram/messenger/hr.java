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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ hr(vr vrVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = j3;
        this.d = arrayList;
    }

    private final void a() {
        ArrayList arrayList = this.d;
        long j3 = this.c;
        vr vrVar = this.b;
        vrVar.getClass();
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = vrVar.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                vrVar.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase2 = vrVar.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase2.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f4 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0330 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034e A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0361 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0373 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0385 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0396 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a8 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ad A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b2 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039c A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038c A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0377 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0359 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0344 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0308 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e7 A[Catch: all -> 0x02c6, Exception -> 0x02ca, TryCatch #21 {Exception -> 0x02ca, all -> 0x02c6, blocks: (B:144:0x027a, B:146:0x0282, B:148:0x02bf, B:152:0x02cf, B:154:0x02e1, B:155:0x02ee, B:157:0x02f4, B:158:0x030c, B:161:0x0317, B:163:0x0330, B:164:0x0348, B:166:0x034e, B:169:0x0355, B:170:0x035d, B:172:0x0361, B:173:0x036a, B:175:0x0373, B:176:0x037c, B:178:0x0385, B:179:0x0390, B:181:0x0396, B:182:0x03a0, B:184:0x03a8, B:186:0x03ad, B:188:0x03b2, B:190:0x03b5, B:192:0x039c, B:193:0x038c, B:194:0x0377, B:196:0x0353, B:197:0x0359, B:198:0x0344, B:202:0x0308, B:203:0x02e7, B:208:0x03c3, B:209:0x03c7, B:210:0x03da), top: B:143:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
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
        SQLitePreparedStatement sQLitePreparedStatement;
        vr vrVar;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i7;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Peer peer;
        NativeByteBuffer nativeByteBuffer3;
        long j3;
        NativeByteBuffer c10;
        ArrayList arrayList6;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        vr vrVar2;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j10;
        int i10 = this.a;
        int i11 = 7;
        vr vrVar3 = this.b;
        int i12 = 3;
        long j11 = this.c;
        int i13 = 2;
        ArrayList arrayList10 = this.d;
        boolean z10 = false;
        switch (i10) {
            case 0:
                ArrayList arrayList11 = new ArrayList();
                try {
                    String join = TextUtils.join(",", arrayList10);
                    SQLiteDatabase sQLiteDatabase3 = vrVar3.b;
                    Locale locale = Locale.US;
                    boolean z11 = false;
                    sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j11 + " AND mid IN (" + join + ")", new Object[0]);
                    while (sQLiteCursor.next()) {
                        try {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(z11 ? 1 : 0);
                                if (byteBufferValue != null) {
                                    try {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z11), z11);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, vrVar3.getUserConfig().n);
                                            if (!TLdeserialize.out && TLdeserialize.media_unread && gj.R4(TLdeserialize)) {
                                                z11 = false;
                                                arrayList11.add(new gj(vrVar3.currentAccount, TLdeserialize, false, false));
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
                                vrVar3.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (arrayList11.isEmpty()) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLiteCursor.dispose();
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                if (arrayList11.isEmpty()) {
                    g0.h3(new sp(vrVar3, arrayList11, 3));
                    return;
                }
                return;
            case 1:
                vr vrVar4 = this.b;
                long j12 = this.c;
                ArrayList arrayList12 = this.d;
                vrVar4.S0(0, 0, j12, arrayList12);
                vrVar4.getNotificationCenter().k(65, Long.valueOf(j12), arrayList12);
                return;
            case 2:
                vr vrVar5 = this.b;
                try {
                    try {
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = new ArrayList();
                        arrayList = new ArrayList();
                        SQLiteDatabase sQLiteDatabase4 = vrVar5.b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data, mid, date, uid, custom_params FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList10) + ") AND uid = " + j11, new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                try {
                                    NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                    if (byteBufferValue2 != null) {
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                        TLdeserialize2.readAttachPath(byteBufferValue2, vrVar5.getUserConfig().n);
                                        byteBufferValue2.reuse();
                                        if (TLdeserialize2.media != null) {
                                            vr vrVar6 = vrVar5;
                                            try {
                                                boolean b10 = vrVar6.b(TLdeserialize2, arrayList13, arrayList15, arrayList14, true);
                                                vrVar = vrVar6;
                                                arrayList7 = arrayList13;
                                                arrayList8 = arrayList15;
                                                arrayList9 = arrayList14;
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
                                                            vi.b(TLdeserialize2, byteBufferValue3);
                                                        }
                                                        arrayList.add(TLdeserialize2);
                                                        vrVar5 = vrVar;
                                                        arrayList13 = arrayList7;
                                                        arrayList14 = arrayList9;
                                                        arrayList15 = arrayList8;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        sQLiteCursor2 = queryFinalized;
                                                        sQLitePreparedStatement = null;
                                                        try {
                                                            vrVar.o(e, true);
                                                            if (sQLiteCursor2 != null) {
                                                                sQLiteCursor2.dispose();
                                                            }
                                                            if (sQLitePreparedStatement == null) {
                                                                return;
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
                                                    vrVar5 = vrVar;
                                                    arrayList13 = arrayList7;
                                                    arrayList14 = arrayList9;
                                                    arrayList15 = arrayList8;
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                vrVar = vrVar6;
                                                sQLiteCursor2 = queryFinalized;
                                                sQLitePreparedStatement = null;
                                                vrVar.o(e, true);
                                                if (sQLiteCursor2 != null) {
                                                }
                                                if (sQLitePreparedStatement == null) {
                                                }
                                                sQLitePreparedStatement.dispose();
                                                return;
                                            }
                                        }
                                    }
                                    vrVar = vrVar5;
                                    arrayList7 = arrayList13;
                                    arrayList8 = arrayList15;
                                    arrayList9 = arrayList14;
                                    vrVar5 = vrVar;
                                    arrayList13 = arrayList7;
                                    arrayList14 = arrayList9;
                                    arrayList15 = arrayList8;
                                } catch (Exception e14) {
                                    e = e14;
                                    vrVar = vrVar5;
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
                        vrVar = vrVar5;
                        arrayList2 = arrayList13;
                        arrayList3 = arrayList15;
                        arrayList4 = arrayList14;
                        queryFinalized.dispose();
                    } catch (Exception e15) {
                        e = e15;
                        vrVar = vrVar5;
                    }
                    try {
                        vrVar.D(arrayList3, true);
                        if (arrayList.isEmpty()) {
                            arrayList5 = arrayList4;
                            sQLitePreparedStatement = null;
                        } else {
                            sQLitePreparedStatement = vrVar.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                            int i14 = 0;
                            while (true) {
                                try {
                                    int i15 = 16;
                                    if (i14 < arrayList.size()) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i14);
                                        gj.q5(message);
                                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(message.getObjectSize());
                                        message.serializeToStream(nativeByteBuffer4);
                                        sQLitePreparedStatement.requery();
                                        sQLitePreparedStatement.bindInteger(1, message.id);
                                        sQLitePreparedStatement.bindLong(i13, message.dialog_id);
                                        sQLitePreparedStatement.bindInteger(i12, gj.c2(message));
                                        sQLitePreparedStatement.bindInteger(4, message.send_state);
                                        sQLitePreparedStatement.bindInteger(5, message.date);
                                        sQLitePreparedStatement.bindByteBuffer(6, nativeByteBuffer4);
                                        if (!message.out && !message.from_scheduled) {
                                            i7 = 0;
                                            sQLitePreparedStatement.bindInteger(i11, i7);
                                            sQLitePreparedStatement.bindInteger(8, message.ttl);
                                            if ((message.flags & 1024) == 0) {
                                                sQLitePreparedStatement.bindInteger(9, message.views);
                                            } else {
                                                sQLitePreparedStatement.bindInteger(9, vr.d0(message));
                                            }
                                            if (message.replyStory == null) {
                                                nativeByteBuffer = new NativeByteBuffer(message.replyStory.getObjectSize());
                                                message.replyStory.serializeToStream(nativeByteBuffer);
                                                sQLitePreparedStatement.bindByteBuffer(10, nativeByteBuffer);
                                            } else {
                                                sQLitePreparedStatement.bindNull(10);
                                                nativeByteBuffer = null;
                                            }
                                            int i16 = message.stickerVerified;
                                            sQLitePreparedStatement.bindInteger(11, i16 != 0 ? 1 : i16 == i13 ? i13 : 0);
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
                                                int i17 = messageReplyHeader.reply_to_top_id;
                                                if (i17 == 0) {
                                                    i17 = messageReplyHeader.reply_to_msg_id;
                                                }
                                                sQLitePreparedStatement.bindInteger(15, i17);
                                            } else {
                                                sQLitePreparedStatement.bindInteger(15, 0);
                                            }
                                            peer = message.peer_id;
                                            if (peer == null) {
                                                nativeByteBuffer3 = nativeByteBuffer4;
                                                j3 = peer.channel_id;
                                            } else {
                                                nativeByteBuffer3 = nativeByteBuffer4;
                                                j3 = 0;
                                            }
                                            sQLitePreparedStatement.bindLong(16, j3);
                                            c10 = vi.c(message);
                                            if (c10 == null) {
                                                sQLitePreparedStatement.bindByteBuffer(16, c10);
                                            } else {
                                                sQLitePreparedStatement.bindNull(17);
                                            }
                                            if ((message.flags & 131072) == 0) {
                                                arrayList6 = arrayList4;
                                                sQLitePreparedStatement.bindLong(18, message.grouped_id);
                                            } else {
                                                arrayList6 = arrayList4;
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
                                            i14++;
                                            arrayList4 = arrayList6;
                                            i11 = 7;
                                            i12 = 3;
                                            i13 = 2;
                                        }
                                        i7 = 1;
                                        sQLitePreparedStatement.bindInteger(i11, i7);
                                        sQLitePreparedStatement.bindInteger(8, message.ttl);
                                        if ((message.flags & 1024) == 0) {
                                        }
                                        if (message.replyStory == null) {
                                        }
                                        int i162 = message.stickerVerified;
                                        sQLitePreparedStatement.bindInteger(11, i162 != 0 ? 1 : i162 == i13 ? i13 : 0);
                                        sQLitePreparedStatement.bindInteger(12, message.mentioned ? 1 : 0);
                                        sQLitePreparedStatement.bindInteger(13, message.forwards);
                                        if (message.replies == null) {
                                        }
                                        messageReplyHeader = message.reply_to;
                                        if (messageReplyHeader == null) {
                                        }
                                        peer = message.peer_id;
                                        if (peer == null) {
                                        }
                                        sQLitePreparedStatement.bindLong(16, j3);
                                        c10 = vi.c(message);
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
                                        i14++;
                                        arrayList4 = arrayList6;
                                        i11 = 7;
                                        i12 = 3;
                                        i13 = 2;
                                    } else {
                                        arrayList5 = arrayList4;
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                            sQLitePreparedStatement = null;
                                        }
                                        g0.h3(new sp(vrVar, arrayList, i15));
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    sQLiteCursor2 = null;
                                    vrVar.o(e, true);
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement == null) {
                                    }
                                    sQLitePreparedStatement.dispose();
                                    return;
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
                        g0.h3(new sp(vrVar, arrayList5, 17));
                        vrVar.getFileLoader().getClass();
                        w7.p(0, arrayList2);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        sQLitePreparedStatement = null;
                        sQLiteCursor2 = null;
                        vrVar.o(e, true);
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
                break;
            case 3:
                int i18 = 0;
                long j13 = this.c;
                vr vrVar7 = this.b;
                vrVar7.getClass();
                long j14 = -j13;
                try {
                    vrVar7.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j14).stepThis().dispose();
                    vrVar7.b.beginTransaction();
                    SQLitePreparedStatement executeFast = vrVar7.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
                    try {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        while (i18 < arrayList10.size()) {
                            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList10.get(i18);
                            executeFast.requery();
                            executeFast.bindLong(1, j14);
                            executeFast.bindLong(2, gj.B1(channelParticipant.peer));
                            executeFast.bindInteger(3, currentTimeMillis);
                            NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(channelParticipant.getObjectSize());
                            channelParticipant.serializeToStream(nativeByteBuffer5);
                            executeFast.bindByteBuffer(4, nativeByteBuffer5);
                            executeFast.step();
                            nativeByteBuffer5.reuse();
                            currentTimeMillis--;
                            i18++;
                            j13 = j13;
                        }
                        j10 = j13;
                        executeFast.dispose();
                        vrVar7.b.commitTransaction();
                        vrVar2 = vrVar7;
                    } catch (Exception e18) {
                        e = e18;
                        vrVar2 = vrVar7;
                        sQLitePreparedStatement2 = executeFast;
                        try {
                            vrVar2.o(e, true);
                            sQLiteDatabase2 = vrVar2.b;
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
                            sQLiteDatabase = vrVar2.b;
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
                        vrVar2 = vrVar7;
                        sQLitePreparedStatement2 = executeFast;
                        sQLiteDatabase = vrVar2.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e19) {
                    e = e19;
                    vrVar2 = vrVar7;
                } catch (Throwable th10) {
                    th = th10;
                    vrVar2 = vrVar7;
                }
                try {
                    vrVar2.F0(j10, true, null, false, true, 0);
                    SQLiteDatabase sQLiteDatabase5 = vrVar2.b;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e20) {
                    e = e20;
                    sQLitePreparedStatement2 = null;
                    vrVar2.o(e, true);
                    sQLiteDatabase2 = vrVar2.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    sQLitePreparedStatement2 = null;
                    sQLiteDatabase = vrVar2.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            case 4:
                vrVar3.getClass();
                HashSet hashSet = new HashSet();
                int size = arrayList10.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList10.get(i19);
                    i19++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (vrVar3.getMessagesController().G3(message2)) {
                        hashSet.add(Long.valueOf(gj.Q1(j11, message2)));
                        z10 = true;
                    }
                }
                if (z10) {
                    vrVar3.getMessagesController().s5(hashSet);
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                vr vrVar8 = this.b;
                long j15 = this.c;
                ArrayList arrayList16 = this.d;
                vrVar8.S0(0, 0, j15, arrayList16);
                vrVar8.getNotificationCenter().k(65, Long.valueOf(j15), arrayList16);
                return;
            case 7:
                vrVar3.getNotificationCenter().k(7, arrayList10, Long.valueOf(m5.z(j11) ? -j11 : 0L), Boolean.FALSE);
                return;
            default:
                vrVar3.getMessagesController().l3(arrayList10, j11);
                vrVar3.getNotificationCenter().k(7, arrayList10, 0L, Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ hr(vr vrVar, ArrayList arrayList, long j3, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.d = arrayList;
        this.c = j3;
    }
}

package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x00 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ p00(x00 x00Var, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.a = i10;
        this.b = x00Var;
        this.c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        ArrayList arrayList;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                x00 x00Var = this.b;
                x00Var.getMessagesStorage().a.c(new p00(x00Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                long j11 = this.c;
                ArrayList arrayList3 = this.d;
                long j12 = this.f;
                x00 x00Var2 = this.b;
                a0.h hVar = x00Var2.e;
                try {
                    SQLiteDatabase sQLiteDatabase = x00Var2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    int i10 = 0;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id, top_message FROM topics WHERE did = " + j11 + " AND top_message IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                    arrayList = null;
                    while (queryFinalized.next()) {
                        try {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = queryFinalized.intValue(0);
                            tL_forumTopic.top_message = queryFinalized.intValue(1);
                            if (this.e) {
                                tL_forumTopic.from_id = x00Var2.getMessagesController().y1(tL_forumTopic.id);
                            } else {
                                tL_forumTopic.from_id = x00Var2.getMessagesController().y1(x00Var2.getUserConfig().e());
                            }
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            arrayList.add(tL_forumTopic);
                        } catch (Exception e) {
                            e = e;
                            j10 = j12;
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList != null) {
                        int i11 = 0;
                        while (i11 < arrayList.size()) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList.get(i11);
                            SQLiteDatabase sQLiteDatabase2 = x00Var2.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j11 + " AND topic_id = " + tL_forumTopic2.id + " ORDER BY mid DESC LIMIT 1", new Object[i10]);
                            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(1)) == null) {
                                long j13 = j12;
                                sQLiteCursor = queryFinalized2;
                                j10 = j13;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i10), i10);
                                long j14 = j12;
                                try {
                                    TLdeserialize.readAttachPath(byteBufferValue, x00Var2.getUserConfig().n);
                                    byteBufferValue.reuse();
                                    sQLiteCursor = queryFinalized2;
                                    j10 = j14;
                                } catch (Exception e7) {
                                    e = e7;
                                    j10 = j14;
                                    e.printStackTrace();
                                    arrayList2 = arrayList;
                                    x00Var2.getMessagesStorage().J0(arrayList2, j11);
                                    if (arrayList2 != null) {
                                        return;
                                    }
                                }
                                try {
                                    hVar.l(x00.p(tL_forumTopic2.top_message, j10));
                                    int i12 = TLdeserialize.id;
                                    tL_forumTopic2.top_message = i12;
                                    tL_forumTopic2.topMessage = TLdeserialize;
                                    tL_forumTopic2.groupedMessages = null;
                                    hVar.k(tL_forumTopic2, x00.p(i12, j10));
                                } catch (Exception e10) {
                                    e = e10;
                                    e.printStackTrace();
                                    arrayList2 = arrayList;
                                    x00Var2.getMessagesStorage().J0(arrayList2, j11);
                                    if (arrayList2 != null) {
                                    }
                                }
                            }
                            sQLiteCursor.dispose();
                            i11++;
                            j12 = j10;
                            i10 = 0;
                        }
                        j10 = j12;
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            SQLiteDatabase sQLiteDatabase3 = x00Var2.getMessagesStorage().b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase3.executeFast("UPDATE topics SET top_message = " + ((TLRPC.TL_forumTopic) arrayList.get(i13)).top_message + " WHERE did = " + j11 + " AND topic_id = " + ((TLRPC.TL_forumTopic) arrayList.get(i13)).id).stepThis().dispose();
                        }
                    } else {
                        j10 = j12;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = j12;
                    arrayList = null;
                }
                arrayList2 = arrayList;
                x00Var2.getMessagesStorage().J0(arrayList2, j11);
                if (arrayList2 != null) {
                    i0.g3(new or(x00Var2, arrayList2, j10, 6));
                    break;
                }
                break;
        }
    }
}

package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class d00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k00 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ d00(k00 k00Var, long j3, ArrayList arrayList, boolean z9, long j10, int i7) {
        this.a = i7;
        this.b = k00Var;
        this.c = j3;
        this.d = arrayList;
        this.e = z9;
        this.f = j10;
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
        long j3;
        ArrayList arrayList;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                k00 k00Var = this.b;
                k00Var.getMessagesStorage().a.c(new d00(k00Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                long j10 = this.c;
                ArrayList arrayList3 = this.d;
                long j11 = this.f;
                k00 k00Var2 = this.b;
                a0.h hVar = k00Var2.e;
                try {
                    SQLiteDatabase sQLiteDatabase = k00Var2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    int i7 = 0;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id, top_message FROM topics WHERE did = " + j10 + " AND top_message IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
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
                                tL_forumTopic.from_id = k00Var2.getMessagesController().z1(tL_forumTopic.id);
                            } else {
                                tL_forumTopic.from_id = k00Var2.getMessagesController().z1(k00Var2.getUserConfig().e());
                            }
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            arrayList.add(tL_forumTopic);
                        } catch (Exception e10) {
                            e = e10;
                            j3 = j11;
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList != null) {
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList.get(i10);
                            SQLiteDatabase sQLiteDatabase2 = k00Var2.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j10 + " AND topic_id = " + tL_forumTopic2.id + " ORDER BY mid DESC LIMIT 1", new Object[i7]);
                            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(1)) == null) {
                                long j12 = j11;
                                sQLiteCursor = queryFinalized2;
                                j3 = j12;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i7), i7);
                                long j13 = j11;
                                try {
                                    TLdeserialize.readAttachPath(byteBufferValue, k00Var2.getUserConfig().n);
                                    byteBufferValue.reuse();
                                    sQLiteCursor = queryFinalized2;
                                    j3 = j13;
                                } catch (Exception e11) {
                                    e = e11;
                                    j3 = j13;
                                    e.printStackTrace();
                                    arrayList2 = arrayList;
                                    k00Var2.getMessagesStorage().J0(arrayList2, j10);
                                    if (arrayList2 != null) {
                                        return;
                                    }
                                }
                                try {
                                    hVar.l(k00.p(tL_forumTopic2.top_message, j3));
                                    int i11 = TLdeserialize.id;
                                    tL_forumTopic2.top_message = i11;
                                    tL_forumTopic2.topMessage = TLdeserialize;
                                    tL_forumTopic2.groupedMessages = null;
                                    hVar.k(tL_forumTopic2, k00.p(i11, j3));
                                } catch (Exception e12) {
                                    e = e12;
                                    e.printStackTrace();
                                    arrayList2 = arrayList;
                                    k00Var2.getMessagesStorage().J0(arrayList2, j10);
                                    if (arrayList2 != null) {
                                    }
                                }
                            }
                            sQLiteCursor.dispose();
                            i10++;
                            j11 = j3;
                            i7 = 0;
                        }
                        j3 = j11;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            SQLiteDatabase sQLiteDatabase3 = k00Var2.getMessagesStorage().b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase3.executeFast("UPDATE topics SET top_message = " + ((TLRPC.TL_forumTopic) arrayList.get(i12)).top_message + " WHERE did = " + j10 + " AND topic_id = " + ((TLRPC.TL_forumTopic) arrayList.get(i12)).id).stepThis().dispose();
                        }
                    } else {
                        j3 = j11;
                    }
                } catch (Exception e13) {
                    e = e13;
                    j3 = j11;
                    arrayList = null;
                }
                arrayList2 = arrayList;
                k00Var2.getMessagesStorage().J0(arrayList2, j10);
                if (arrayList2 != null) {
                    g0.h3(new ir(k00Var2, arrayList2, j3, 6));
                    break;
                }
                break;
        }
    }
}

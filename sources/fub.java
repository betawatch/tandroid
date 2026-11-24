// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class fub implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pub b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ fub(pub pubVar, long j, ArrayList arrayList, boolean z, long j2, byte b) {
        this.a = b;
        this.b = pubVar;
        this.c = j;
        this.d = arrayList;
        this.e = z;
        this.f = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0173  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                pub pubVar = this.b;
                pubVar.getMessagesStorage().a.c(new fub(pubVar, this.c, this.d, this.e, this.f, (byte) 1));
                break;
            default:
                long j = this.c;
                ArrayList arrayList3 = this.d;
                long j2 = this.f;
                pub pubVar2 = this.b;
                vf6 vf6Var = pubVar2.e;
                try {
                    SQLiteDatabase sQLiteDatabase = pubVar2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id, top_message FROM topics WHERE did = " + j + " AND top_message IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                    ArrayList arrayList4 = null;
                    while (queryFinalized.next()) {
                        try {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = queryFinalized.intValue(0);
                            tL_forumTopic.top_message = queryFinalized.intValue(1);
                            if (this.e) {
                                tL_forumTopic.from_id = pubVar2.getMessagesController().w1(tL_forumTopic.id);
                            } else {
                                tL_forumTopic.from_id = pubVar2.getMessagesController().w1(pubVar2.getUserConfig().e());
                            }
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            arrayList4.add(tL_forumTopic);
                        } catch (Exception e) {
                            e = e;
                            arrayList = arrayList4;
                            e.printStackTrace();
                            arrayList2 = arrayList;
                            pubVar2.getMessagesStorage().G0(arrayList2, j);
                            if (arrayList2 == null) {
                                return;
                            }
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList4 != null) {
                        for (int i = 0; i < arrayList4.size(); i++) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList4.get(i);
                            SQLiteDatabase sQLiteDatabase2 = pubVar2.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j + " AND topic_id = " + tL_forumTopic2.id + " ORDER BY mid DESC LIMIT 1", new Object[0]);
                            if (queryFinalized2.next() && (byteBufferValue = queryFinalized2.byteBufferValue(1)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, pubVar2.getUserConfig().n);
                                byteBufferValue.reuse();
                                vf6Var.l(pub.p(tL_forumTopic2.top_message, j2));
                                int i2 = TLdeserialize.id;
                                tL_forumTopic2.top_message = i2;
                                tL_forumTopic2.topMessage = TLdeserialize;
                                tL_forumTopic2.groupedMessages = null;
                                vf6Var.k(tL_forumTopic2, pub.p(i2, j2));
                            }
                            queryFinalized2.dispose();
                        }
                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                            SQLiteDatabase sQLiteDatabase3 = pubVar2.getMessagesStorage().b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase3.executeFast("UPDATE topics SET top_message = " + ((TLRPC.TL_forumTopic) arrayList4.get(i3)).top_message + " WHERE did = " + j + " AND topic_id = " + ((TLRPC.TL_forumTopic) arrayList4.get(i3)).id).stepThis().dispose();
                        }
                    }
                    arrayList2 = arrayList4;
                } catch (Exception e2) {
                    e = e2;
                    arrayList = null;
                }
                pubVar2.getMessagesStorage().G0(arrayList2, j);
                if (arrayList2 == null) {
                    gl.c3(new d2b(pubVar2, arrayList2, j2, (byte) 7));
                    break;
                }
                break;
        }
    }
}

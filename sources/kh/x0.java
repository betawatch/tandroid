package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ x0(int i9, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = i9;
        this.b = messagesStorage;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = this.b;
                ArrayList arrayList = this.c;
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    if (database == null) {
                        return;
                    }
                    database.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                MessagesStorage messagesStorage2 = this.b;
                ArrayList arrayList2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase database2 = messagesStorage2.getDatabase();
                        database2.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = database2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i9);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i9);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            default:
                MessagesStorage messagesStorage3 = this.b;
                ArrayList arrayList3 = this.c;
                try {
                    messagesStorage3.getDatabase().executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
        }
    }
}

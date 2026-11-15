package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.vr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ y0(vr vrVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                ArrayList arrayList = this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = vrVar.b;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLiteDatabase.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                vr vrVar2 = this.b;
                ArrayList arrayList2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = vrVar2.b;
                        sQLiteDatabase2.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i7);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i7);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                vr vrVar3 = this.b;
                ArrayList arrayList3 = this.c;
                try {
                    vrVar3.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}

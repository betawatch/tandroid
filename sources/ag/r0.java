package ag;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ r0(hs hsVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                ArrayList arrayList = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, i10);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
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
            case 1:
                hs hsVar2 = this.b;
                ArrayList arrayList2 = this.c;
                try {
                    hsVar2.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList2) + ")").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            default:
                hs hsVar3 = this.b;
                ArrayList arrayList3 = this.c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = hsVar3.b;
                    if (sQLiteDatabase2 == null) {
                        return;
                    }
                    sQLiteDatabase2.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
        }
    }
}

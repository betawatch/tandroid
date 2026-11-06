package fi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ x0(yr yrVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = yrVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yr yrVar = this.b;
                ArrayList arrayList = this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
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
                yr yrVar2 = this.b;
                ArrayList arrayList2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = yrVar2.b;
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
                yr yrVar3 = this.b;
                ArrayList arrayList3 = this.c;
                try {
                    yrVar3.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}

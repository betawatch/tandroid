// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class hq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq3 b;

    public /* synthetic */ hq3(lq3 lq3Var, byte b) {
        this.a = b;
        this.b = lq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lq3 lq3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = lq3Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, yac.h(lq3Var.currentAccount).n);
                                r47 r47Var = new r47(lq3Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(r47Var);
                                if (intValue == 0) {
                                    arrayList.add(r47Var);
                                } else {
                                    arrayList2.add(r47Var);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                lq3Var.getFileLoader().l(arrayList);
                lq3Var.getFileLoader().l(arrayList2);
                hl.c3(new cv2(lq3Var, arrayList, arrayList2, (byte) 14));
                break;
            case 1:
                lq3Var.getNotificationCenter().a(lq3Var, jn7.Z1);
                lq3Var.getNotificationCenter().a(lq3Var, jn7.Y1);
                lq3Var.getNotificationCenter().a(lq3Var, jn7.X1);
                lq3Var.getNotificationCenter().a(lq3Var, jn7.W1);
                lq3Var.getNotificationCenter().a(lq3Var, jn7.R1);
                lq3Var.getNotificationCenter().a(lq3Var, jn7.S1);
                lq3Var.s(false);
                break;
            default:
                try {
                    lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}

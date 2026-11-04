package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ w5(z5 z5Var, int i3) {
        this.a = i3;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    z5Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = z5Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, h10.i(z5Var.currentAccount).n);
                                zi ziVar = new zi(z5Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(ziVar);
                                if (intValue == 0) {
                                    arrayList.add(ziVar);
                                } else {
                                    arrayList2.add(ziVar);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                z5Var.getFileLoader().l(arrayList);
                z5Var.getFileLoader().l(arrayList2);
                g0.h3(new fg(z5Var, arrayList, arrayList2, 18));
                break;
            case 1:
                z5 z5Var2 = this.b;
                z5Var2.getNotificationCenter().b(z5Var2, hs.Z1);
                z5Var2.getNotificationCenter().b(z5Var2, hs.Y1);
                z5Var2.getNotificationCenter().b(z5Var2, hs.X1);
                z5Var2.getNotificationCenter().b(z5Var2, hs.W1);
                z5Var2.getNotificationCenter().b(z5Var2, hs.R1);
                z5Var2.getNotificationCenter().b(z5Var2, hs.S1);
                z5Var2.s(false);
                break;
            default:
                try {
                    this.b.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}

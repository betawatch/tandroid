package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ y5(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    b6Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = b6Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, e20.i(b6Var.currentAccount).n);
                                kj kjVar = new kj(b6Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(kjVar);
                                if (intValue == 0) {
                                    arrayList.add(kjVar);
                                } else {
                                    arrayList2.add(kjVar);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                b6Var.getFileLoader().l(arrayList);
                b6Var.getFileLoader().l(arrayList2);
                i0.g3(new ng(b6Var, arrayList, arrayList2, 18));
                break;
            case 1:
                b6 b6Var2 = this.b;
                b6Var2.getNotificationCenter().b(b6Var2, at.Z1);
                b6Var2.getNotificationCenter().b(b6Var2, at.Y1);
                b6Var2.getNotificationCenter().b(b6Var2, at.X1);
                b6Var2.getNotificationCenter().b(b6Var2, at.W1);
                b6Var2.getNotificationCenter().b(b6Var2, at.R1);
                b6Var2.getNotificationCenter().b(b6Var2, at.S1);
                b6Var2.s(false);
                break;
            default:
                try {
                    this.b.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
        }
    }
}

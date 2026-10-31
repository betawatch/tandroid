package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                                TLdeserialize.readAttachPath(byteBufferValue, d20.i(b6Var.currentAccount).n);
                                jj jjVar = new jj(b6Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(jjVar);
                                if (intValue == 0) {
                                    arrayList.add(jjVar);
                                } else {
                                    arrayList2.add(jjVar);
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
                i0.g3(new mg(b6Var, arrayList, arrayList2, 18));
                break;
            case 1:
                b6 b6Var2 = this.b;
                b6Var2.getNotificationCenter().b(b6Var2, zs.Z1);
                b6Var2.getNotificationCenter().b(b6Var2, zs.Y1);
                b6Var2.getNotificationCenter().b(b6Var2, zs.X1);
                b6Var2.getNotificationCenter().b(b6Var2, zs.W1);
                b6Var2.getNotificationCenter().b(b6Var2, zs.R1);
                b6Var2.getNotificationCenter().b(b6Var2, zs.S1);
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

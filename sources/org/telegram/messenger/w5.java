package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ w5(z5 z5Var, int i7) {
        this.a = i7;
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
                                TLdeserialize.readAttachPath(byteBufferValue, p10.i(z5Var.currentAccount).n);
                                ij ijVar = new ij(z5Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(ijVar);
                                if (intValue == 0) {
                                    arrayList.add(ijVar);
                                } else {
                                    arrayList2.add(ijVar);
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
                g0.h3(new ng(z5Var, arrayList, arrayList2, 18));
                break;
            case 1:
                z5 z5Var2 = this.b;
                z5Var2.getNotificationCenter().b(z5Var2, qs.Z1);
                z5Var2.getNotificationCenter().b(z5Var2, qs.Y1);
                z5Var2.getNotificationCenter().b(z5Var2, qs.X1);
                z5Var2.getNotificationCenter().b(z5Var2, qs.W1);
                z5Var2.getNotificationCenter().b(z5Var2, qs.R1);
                z5Var2.getNotificationCenter().b(z5Var2, qs.S1);
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

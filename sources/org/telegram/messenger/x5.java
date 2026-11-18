package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ x5(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a6 a6Var = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    a6Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = a6Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, j10.i(a6Var.currentAccount).n);
                                fj fjVar = new fj(a6Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(fjVar);
                                if (intValue == 0) {
                                    arrayList.add(fjVar);
                                } else {
                                    arrayList2.add(fjVar);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                a6Var.getFileLoader().l(arrayList);
                a6Var.getFileLoader().l(arrayList2);
                g0.g3(new yf(a6Var, arrayList, arrayList2, 18));
                break;
            case 1:
                a6 a6Var2 = this.b;
                a6Var2.getNotificationCenter().b(a6Var2, ks.Z1);
                a6Var2.getNotificationCenter().b(a6Var2, ks.Y1);
                a6Var2.getNotificationCenter().b(a6Var2, ks.X1);
                a6Var2.getNotificationCenter().b(a6Var2, ks.W1);
                a6Var2.getNotificationCenter().b(a6Var2, ks.R1);
                a6Var2.getNotificationCenter().b(a6Var2, ks.S1);
                a6Var2.s(false);
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

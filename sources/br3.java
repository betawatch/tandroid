// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class br3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er3 b;

    public /* synthetic */ br3(er3 er3Var, byte b) {
        this.a = b;
        this.b = er3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        er3 er3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    er3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = er3Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, z8c.h(er3Var.currentAccount).n);
                                k47 k47Var = new k47(er3Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(k47Var);
                                if (intValue == 0) {
                                    arrayList.add(k47Var);
                                } else {
                                    arrayList2.add(k47Var);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                er3Var.getFileLoader().l(arrayList);
                er3Var.getFileLoader().l(arrayList2);
                gm.c3(new pz2(er3Var, arrayList, arrayList2, (byte) 12));
                break;
            case 1:
                er3Var.getNotificationCenter().a(er3Var, nm7.Z1);
                er3Var.getNotificationCenter().a(er3Var, nm7.Y1);
                er3Var.getNotificationCenter().a(er3Var, nm7.X1);
                er3Var.getNotificationCenter().a(er3Var, nm7.W1);
                er3Var.getNotificationCenter().a(er3Var, nm7.R1);
                er3Var.getNotificationCenter().a(er3Var, nm7.S1);
                er3Var.s(false);
                break;
            default:
                try {
                    er3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}

// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class bw9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw9 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ bw9(dw9 dw9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    k47 k47Var = new k47(dw9Var.currentAccount, (TLRPC.Message) arrayList.get(i), false, true);
                    k47Var.C0 = true;
                    dw9Var.getSendMessagesHelper().j0(0L, k47Var, true);
                }
                break;
            default:
                dw9Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    k47 k47Var2 = (k47) dw9Var.getMessagesController().T.f(((Long) arrayList.get(i2)).longValue());
                    if (k47Var2 != null) {
                        k47Var2.Z = true;
                    }
                }
                break;
        }
    }
}

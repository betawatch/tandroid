// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class k2c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b3c b;
    public final /* synthetic */ long c;

    public /* synthetic */ k2c(b3c b3cVar, long j, byte b) {
        this.a = b;
        this.b = b3cVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        b3c b3cVar = this.b;
        switch (b) {
            case 0:
                nm7.f(b3cVar.currentAccount).k(nm7.O1, Long.valueOf(j));
                break;
            default:
                ArrayList arrayList = (ArrayList) b3cVar.n.S.f(j);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        k47 k47Var = (k47) arrayList.get(i);
                        if (k47Var == null || k47Var.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(b3cVar.getMessagesStorage().c0(k47Var.e1(), k47.B0(k47Var.k)));
                        }
                    }
                    gm.c3(new op6((Object) b3cVar, (Object) arrayList2, (Object) arrayList, (byte) 5));
                    break;
                }
                break;
        }
    }
}

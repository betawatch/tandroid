// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class k0c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1c b;
    public final /* synthetic */ long c;

    public /* synthetic */ k0c(b1c b1cVar, long j, byte b) {
        this.a = b;
        this.b = b1cVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        b1c b1cVar = this.b;
        switch (b) {
            case 0:
                kk7.f(b1cVar.currentAccount).k(kk7.N1, Long.valueOf(j));
                break;
            default:
                ArrayList arrayList = (ArrayList) b1cVar.n.S.f(j);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        k27 k27Var = (k27) arrayList.get(i);
                        if (k27Var == null || k27Var.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(b1cVar.getMessagesStorage().c0(k27Var.e1(), k27.B0(k27Var.k)));
                        }
                    }
                    gl.c3(new nn6((Object) b1cVar, (Object) arrayList2, (Object) arrayList, (byte) 5));
                    break;
                }
                break;
        }
    }
}

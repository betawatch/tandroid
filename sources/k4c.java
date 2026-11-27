// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class k4c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5c b;
    public final /* synthetic */ long c;

    public /* synthetic */ k4c(a5c a5cVar, long j, byte b) {
        this.a = b;
        this.b = a5cVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        a5c a5cVar = this.b;
        switch (b) {
            case 0:
                jn7.f(a5cVar.currentAccount).k(jn7.O1, Long.valueOf(j));
                break;
            default:
                ArrayList arrayList = (ArrayList) a5cVar.n.S.f(j);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        r47 r47Var = (r47) arrayList.get(i);
                        if (r47Var == null || r47Var.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(a5cVar.getMessagesStorage().e0(r47Var.e1(), r47.B0(r47Var.k)));
                        }
                    }
                    hl.c3(new es6((Object) a5cVar, (Object) arrayList2, (Object) arrayList, (byte) 5));
                    break;
                }
                break;
        }
    }
}

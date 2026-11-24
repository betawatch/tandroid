// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb4 b;
    public final /* synthetic */ mb4 c;

    public /* synthetic */ hb4(lb4 lb4Var, mb4 mb4Var, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = mb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb4 lb4Var = this.b;
                mb4 mb4Var = this.c;
                if (lb4Var.m != null) {
                    fc4.d("FileLoadOperation " + lb4Var.r + " removing stream listener " + mb4Var);
                    lb4Var.m.remove(mb4Var);
                    break;
                }
                break;
            default:
                lb4 lb4Var2 = this.b;
                mb4 mb4Var2 = this.c;
                ArrayList arrayList = lb4Var2.m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    lb4Var2.m = arrayList;
                }
                if (mb4Var2 != null && !arrayList.contains(mb4Var2)) {
                    lb4Var2.m.add(mb4Var2);
                }
                if (!lb4Var2.m.isEmpty()) {
                    Utilities.d.a(lb4Var2.f1);
                }
                if (mb4Var2 != null && lb4Var2.Y != 1 && lb4Var2.Y != 0) {
                    mb4Var2.a();
                    break;
                }
                break;
        }
    }
}

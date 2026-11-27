// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id6 b;
    public final /* synthetic */ hd6 c;

    public /* synthetic */ dd6(id6 id6Var, hd6 hd6Var, byte b) {
        this.a = b;
        this.b = id6Var;
        this.c = hd6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd6 hd6Var = this.c;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = id6Var.J;
                arrayList.remove(hd6Var);
                id6Var.K.l(hd6Var.a);
                if (arrayList.isEmpty()) {
                    id6.s();
                }
                jn7.e().k(jn7.G4, new Object[0]);
                break;
            case 1:
                ArrayList arrayList2 = id6Var.J;
                arrayList2.remove(hd6Var);
                id6Var.K.l(hd6Var.a);
                if (arrayList2.isEmpty()) {
                    id6.s();
                }
                jn7.e().k(jn7.G4, new Object[0]);
                break;
            default:
                ArrayList arrayList3 = id6Var.J;
                arrayList3.remove(hd6Var);
                id6Var.K.l(hd6Var.a);
                if (arrayList3.isEmpty()) {
                    id6.s();
                }
                jn7.e().k(jn7.G4, new Object[0]);
                break;
        }
    }
}

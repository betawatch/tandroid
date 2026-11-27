// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ed6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id6 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ed6(id6 id6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = id6Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = id6Var.b;
                arrayList2.addAll(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    hd6 hd6Var = (hd6) arrayList2.get(i);
                    id6Var.a.k(hd6Var.a, hd6Var);
                }
                hl.c3(new ed6(id6Var, arrayList, (byte) 1));
                break;
            default:
                id6Var.J.addAll(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    hd6 hd6Var2 = (hd6) arrayList.get(i2);
                    id6Var.K.k(hd6Var2.a, hd6Var2);
                }
                id6.q();
                jn7.e().k(jn7.G4, new Object[0]);
                break;
        }
    }
}

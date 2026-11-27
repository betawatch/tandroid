// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gt3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(int i, boolean z) {
        wa waVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((it3) obj).b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((gt3) obj2).a(i, z);
                }
                break;
            case 1:
                vy4 vy4Var = (vy4) obj;
                vy4Var.h++;
                vy4Var.j += z ? 1 : -1;
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                uqc uqcVar = (uqc) obj;
                bva bvaVar = uqcVar.w;
                if ((i == 1 || i == 3) && (waVar = uqcVar.a) != null) {
                    uqcVar.s = z;
                    waVar.removeCallbacks(bvaVar);
                    bvaVar.run();
                    break;
                }
                break;
        }
    }
}

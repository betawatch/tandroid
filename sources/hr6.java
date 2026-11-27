// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class hr6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ is6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ hr6(is6 is6Var, ArrayList arrayList, String str, byte b) {
        this.a = b;
        this.b = is6Var;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        ArrayList arrayList = this.c;
        is6 is6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new hr6(is6Var, arrayList, str, (byte) 2));
                break;
            case 1:
                is6Var.b(str, arrayList);
                break;
            default:
                is6Var.b(str, arrayList);
                break;
        }
    }
}

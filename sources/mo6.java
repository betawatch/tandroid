// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class mo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ no6 b;

    public /* synthetic */ mo6(no6 no6Var, byte b) {
        this.a = b;
        this.b = no6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        no6 no6Var = this.b;
        switch (b) {
            case 0:
                no6Var.d();
                hl.c3(new mo6(no6Var, (byte) 1));
                break;
            default:
                no6Var.X = false;
                ArrayList arrayList = no6Var.Y;
                no6Var.Y = null;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Runnable) arrayList.get(i)).run();
                    }
                    break;
                }
                break;
        }
    }
}

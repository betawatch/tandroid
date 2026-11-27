// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class oed implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kfd b;

    public /* synthetic */ oed(kfd kfdVar, byte b) {
        this.a = b;
        this.b = kfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kfd kfdVar = this.b;
        switch (b) {
            case 0:
                k7b k7bVar = kfdVar.e;
                lw6 lw6Var = (lw6) k7bVar.c;
                if (lw6Var == null) {
                    lw6Var = lw6.d((Context) k7bVar.b);
                    k7bVar.c = lw6Var;
                }
                lw6Var.h(kfdVar);
                break;
            default:
                kfdVar.n();
                break;
        }
    }
}

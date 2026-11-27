// default package

import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jj3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ lj3 b;
    public final /* synthetic */ ac7 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jj3(lj3 lj3Var, ac7 ac7Var, boolean z) {
        this.b = lj3Var;
        this.c = ac7Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        ac7 ac7Var = this.c;
        lj3 lj3Var = this.b;
        switch (b) {
            case 0:
                lj3Var.b.presentFragment(z ? new FiltersSetupActivity() : new nf4(ac7Var, null));
                break;
            default:
                lj3Var.b.getMessagesController().W4(ac7Var, !z);
                break;
        }
    }

    public /* synthetic */ jj3(lj3 lj3Var, boolean z, ac7 ac7Var) {
        this.b = lj3Var;
        this.d = z;
        this.c = ac7Var;
    }
}

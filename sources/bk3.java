// default package

import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bk3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ dk3 b;
    public final /* synthetic */ ub7 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ bk3(dk3 dk3Var, ub7 ub7Var, boolean z) {
        this.b = dk3Var;
        this.c = ub7Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        ub7 ub7Var = this.c;
        dk3 dk3Var = this.b;
        switch (b) {
            case 0:
                dk3Var.b.presentFragment(z ? new FiltersSetupActivity() : new qf4(ub7Var, null));
                break;
            default:
                dk3Var.b.getMessagesController().Q4(ub7Var, !z);
                break;
        }
    }

    public /* synthetic */ bk3(dk3 dk3Var, boolean z, ub7 ub7Var) {
        this.b = dk3Var;
        this.d = z;
        this.c = ub7Var;
    }
}

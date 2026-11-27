// default package

import android.app.Activity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class eb9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ r47 e;

    public /* synthetic */ eb9(zu1 zu1Var, Activity activity, vnb vnbVar, r47 r47Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = activity;
        this.d = vnbVar;
        this.e = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.e;
        vnb vnbVar = this.d;
        Activity activity = this.c;
        zu1 zu1Var = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                d31.b0(zu1Var).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new n9(activity, (byte) 3), vnbVar)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                break;
            case 1:
                d31.b0(zu1Var).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new n9(activity, b2), vnbVar)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                break;
            default:
                d31.b0(zu1Var).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new n9(activity, (byte) 4), vnbVar)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                break;
        }
    }
}

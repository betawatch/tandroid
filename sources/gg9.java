// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch9 b;
    public final /* synthetic */ ll0 c;

    public /* synthetic */ gg9(ch9 ch9Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ll0 ll0Var = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                View C1 = ch9Var.C1(ll0Var);
                if (C1 instanceof xk9) {
                    xk9 xk9Var = (xk9) C1;
                    xk9Var.A();
                    xk9Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                ch9Var.Z2(ll0Var);
                break;
            case 2:
                ch9Var.Z2(ll0Var);
                break;
            case 3:
                ch9Var.a3(ll0Var);
                break;
            case 4:
                ch9Var.Z2(ll0Var);
                break;
            default:
                ch9Var.Z2(ll0Var);
                break;
        }
    }
}

// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class d55 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n55 b;

    public /* synthetic */ d55(n55 n55Var, byte b) {
        this.a = b;
        this.b = n55Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        n55 n55Var = this.b;
        switch (b) {
            case 0:
                if (!n55Var.a() && !n55Var.d) {
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        n55Var.b.c();
                    }
                    if (!n55Var.e) {
                        n55Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                if (!n55Var.a() && !n55Var.d) {
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        n55Var.b.c();
                    }
                    if (!n55Var.e) {
                        n55Var.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}

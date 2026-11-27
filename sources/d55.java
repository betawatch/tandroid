// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

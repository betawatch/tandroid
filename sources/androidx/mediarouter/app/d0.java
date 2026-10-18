package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ d0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                n0 n0Var = this.b;
                if (n0Var.r.g()) {
                    n0Var.f.getClass();
                    p4.x.j(2);
                }
                n0Var.dismiss();
                break;
        }
    }
}

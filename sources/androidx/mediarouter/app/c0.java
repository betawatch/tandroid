package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ c0(n0 n0Var, int i7) {
        this.a = i7;
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
                    s4.x.j(2);
                }
                n0Var.dismiss();
                break;
        }
    }
}

package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ d0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                o0 o0Var = this.b;
                if (o0Var.r.g()) {
                    o0Var.f.getClass();
                    p4.y.j(2);
                }
                o0Var.dismiss();
                break;
        }
    }
}

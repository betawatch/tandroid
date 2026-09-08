package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ e0(o0 o0Var, int i10) {
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
                    p4.x.j(2);
                }
                o0Var.dismiss();
                break;
        }
    }
}

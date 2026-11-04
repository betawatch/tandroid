package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ d0(o0 o0Var, int i3) {
        this.a = i3;
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
                    r4.y.j(2);
                }
                o0Var.dismiss();
                break;
        }
    }
}

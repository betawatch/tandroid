package bg;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ k2(q2 q2Var, int i9) {
        this.a = i9;
        this.b = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.a0.clear();
                q2Var.U.d.b(true);
                q2Var.a0(true, false);
                break;
            default:
                this.b.V(false);
                break;
        }
    }
}

package eg;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ b2(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                g2Var.a0.clear();
                g2Var.U.d.b(true);
                g2Var.b0(true, false);
                break;
            default:
                this.b.W(false);
                break;
        }
    }
}

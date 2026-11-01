package mg;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ q1(v1 v1Var, int i10) {
        this.a = i10;
        this.b = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v1 v1Var = this.b;
                v1Var.W1.clear();
                v1Var.Q1.d.b(true);
                v1Var.n1(true, false);
                break;
            default:
                this.b.i1(false);
                break;
        }
    }
}

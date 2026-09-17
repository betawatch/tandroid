package di;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ p8(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.U();
                break;
            default:
                this.b.X();
                break;
        }
    }
}

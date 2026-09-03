package hg;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ a2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.b0.clear();
                f2Var.V.d.b(true);
                f2Var.b0(true, false);
                break;
            default:
                this.b.W(false);
                break;
        }
    }
}

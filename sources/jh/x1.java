package jh;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ x1(h5 h5Var, int i10, int i11) {
        this.a = i11;
        this.b = h5Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h5 h5Var = this.b;
                int i10 = this.c;
                h5Var.N0 = i10;
                p3 p3Var = h5Var.V;
                p3Var.D(p3Var.getCurrentPosition() + (i10 > h5Var.G1() ? 1 : -1));
                break;
            case 1:
                h5 h5Var2 = this.b;
                int i11 = this.c;
                h5Var2.N0 = i11;
                p3 p3Var2 = h5Var2.V;
                p3Var2.D(p3Var2.getCurrentPosition() + (i11 > h5Var2.G1() ? 1 : -1));
                break;
            case 2:
                h5 h5Var3 = this.b;
                int i12 = this.c;
                h5Var3.N0 = i12;
                p3 p3Var3 = h5Var3.V;
                p3Var3.D(p3Var3.getCurrentPosition() + (i12 > h5Var3.G1() ? 1 : -1));
                break;
            default:
                h5 h5Var4 = this.b;
                int i13 = this.c;
                h5Var4.N0 = i13;
                p3 p3Var4 = h5Var4.V;
                p3Var4.D(p3Var4.getCurrentPosition() + (i13 > h5Var4.G1() ? 1 : -1));
                break;
        }
    }
}

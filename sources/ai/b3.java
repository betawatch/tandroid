package ai;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ b3(k7 k7Var, int i10, int i11) {
        this.a = i11;
        this.b = k7Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                int i10 = this.c;
                k7Var.U0 = i10;
                h5 h5Var = k7Var.Z;
                h5Var.D(h5Var.getCurrentPosition() + (i10 > k7Var.U1() ? 1 : -1));
                break;
            case 1:
                k7 k7Var2 = this.b;
                int i11 = this.c;
                k7Var2.U0 = i11;
                h5 h5Var2 = k7Var2.Z;
                h5Var2.D(h5Var2.getCurrentPosition() + (i11 > k7Var2.U1() ? 1 : -1));
                break;
            case 2:
                k7 k7Var3 = this.b;
                int i12 = this.c;
                k7Var3.U0 = i12;
                h5 h5Var3 = k7Var3.Z;
                h5Var3.D(h5Var3.getCurrentPosition() + (i12 > k7Var3.U1() ? 1 : -1));
                break;
            default:
                k7 k7Var4 = this.b;
                int i13 = this.c;
                k7Var4.U0 = i13;
                h5 h5Var4 = k7Var4.Z;
                h5Var4.D(h5Var4.getCurrentPosition() + (i13 > k7Var4.U1() ? 1 : -1));
                break;
        }
    }
}

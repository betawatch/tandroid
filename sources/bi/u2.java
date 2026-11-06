package bi;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u2(k7 k7Var, int i7, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                int i7 = this.c;
                k7Var.M2 = i7;
                f5 f5Var = k7Var.R1;
                f5Var.E(f5Var.getCurrentPosition() + (i7 > k7Var.D1() ? 1 : -1));
                break;
            case 1:
                k7 k7Var2 = this.b;
                int i10 = this.c;
                k7Var2.M2 = i10;
                f5 f5Var2 = k7Var2.R1;
                f5Var2.E(f5Var2.getCurrentPosition() + (i10 > k7Var2.D1() ? 1 : -1));
                break;
            case 2:
                k7 k7Var3 = this.b;
                int i11 = this.c;
                k7Var3.M2 = i11;
                f5 f5Var3 = k7Var3.R1;
                f5Var3.E(f5Var3.getCurrentPosition() + (i11 > k7Var3.D1() ? 1 : -1));
                break;
            default:
                k7 k7Var4 = this.b;
                int i12 = this.c;
                k7Var4.M2 = i12;
                f5 f5Var4 = k7Var4.R1;
                f5Var4.E(f5Var4.getCurrentPosition() + (i12 > k7Var4.D1() ? 1 : -1));
                break;
        }
    }
}

package gh;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z1(k5 k5Var, int i9, int i10) {
        this.a = i10;
        this.b = k5Var;
        this.c = i9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                int i9 = this.c;
                k5Var.N0 = i9;
                q3 q3Var = k5Var.V;
                q3Var.D(q3Var.getCurrentPosition() + (i9 > k5Var.G1() ? 1 : -1));
                break;
            case 1:
                k5 k5Var2 = this.b;
                int i10 = this.c;
                k5Var2.N0 = i10;
                q3 q3Var2 = k5Var2.V;
                q3Var2.D(q3Var2.getCurrentPosition() + (i10 > k5Var2.G1() ? 1 : -1));
                break;
            case 2:
                k5 k5Var3 = this.b;
                int i11 = this.c;
                k5Var3.N0 = i11;
                q3 q3Var3 = k5Var3.V;
                q3Var3.D(q3Var3.getCurrentPosition() + (i11 > k5Var3.G1() ? 1 : -1));
                break;
            default:
                k5 k5Var4 = this.b;
                int i12 = this.c;
                k5Var4.N0 = i12;
                q3 q3Var4 = k5Var4.V;
                q3Var4.D(q3Var4.getCurrentPosition() + (i12 > k5Var4.G1() ? 1 : -1));
                break;
        }
    }
}

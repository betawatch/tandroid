package hh;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z1(i5 i5Var, int i10, int i11) {
        this.a = i11;
        this.b = i5Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                int i10 = this.c;
                i5Var.N0 = i10;
                p3 p3Var = i5Var.V;
                p3Var.D(p3Var.getCurrentPosition() + (i10 > i5Var.G1() ? 1 : -1));
                break;
            case 1:
                i5 i5Var2 = this.b;
                int i11 = this.c;
                i5Var2.N0 = i11;
                p3 p3Var2 = i5Var2.V;
                p3Var2.D(p3Var2.getCurrentPosition() + (i11 > i5Var2.G1() ? 1 : -1));
                break;
            case 2:
                i5 i5Var3 = this.b;
                int i12 = this.c;
                i5Var3.N0 = i12;
                p3 p3Var3 = i5Var3.V;
                p3Var3.D(p3Var3.getCurrentPosition() + (i12 > i5Var3.G1() ? 1 : -1));
                break;
            default:
                i5 i5Var4 = this.b;
                int i13 = this.c;
                i5Var4.N0 = i13;
                p3 p3Var4 = i5Var4.V;
                p3Var4.D(p3Var4.getCurrentPosition() + (i13 > i5Var4.G1() ? 1 : -1));
                break;
        }
    }
}

package ci;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ j2(l6 l6Var, int i3, int i10) {
        this.a = i10;
        this.b = l6Var;
        this.c = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l6 l6Var = this.b;
                int i3 = this.c;
                l6Var.N2 = i3;
                n4 n4Var = l6Var.S1;
                n4Var.D(n4Var.getCurrentPosition() + (i3 > l6Var.D1() ? 1 : -1));
                break;
            case 1:
                l6 l6Var2 = this.b;
                int i10 = this.c;
                l6Var2.N2 = i10;
                n4 n4Var2 = l6Var2.S1;
                n4Var2.D(n4Var2.getCurrentPosition() + (i10 > l6Var2.D1() ? 1 : -1));
                break;
            case 2:
                l6 l6Var3 = this.b;
                int i11 = this.c;
                l6Var3.N2 = i11;
                n4 n4Var3 = l6Var3.S1;
                n4Var3.D(n4Var3.getCurrentPosition() + (i11 > l6Var3.D1() ? 1 : -1));
                break;
            default:
                l6 l6Var4 = this.b;
                int i12 = this.c;
                l6Var4.N2 = i12;
                n4 n4Var4 = l6Var4.S1;
                n4Var4.D(n4Var4.getCurrentPosition() + (i12 > l6Var4.D1() ? 1 : -1));
                break;
        }
    }
}

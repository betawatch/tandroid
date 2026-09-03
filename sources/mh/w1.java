package mh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w1(g5 g5Var, int i10, int i11) {
        this.a = i11;
        this.b = g5Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                int i10 = this.c;
                g5Var.O0 = i10;
                o3 o3Var = g5Var.W;
                o3Var.D(o3Var.getCurrentPosition() + (i10 > g5Var.G1() ? 1 : -1));
                break;
            case 1:
                g5 g5Var2 = this.b;
                int i11 = this.c;
                g5Var2.O0 = i11;
                o3 o3Var2 = g5Var2.W;
                o3Var2.D(o3Var2.getCurrentPosition() + (i11 > g5Var2.G1() ? 1 : -1));
                break;
            case 2:
                g5 g5Var3 = this.b;
                int i12 = this.c;
                g5Var3.O0 = i12;
                o3 o3Var3 = g5Var3.W;
                o3Var3.D(o3Var3.getCurrentPosition() + (i12 > g5Var3.G1() ? 1 : -1));
                break;
            default:
                g5 g5Var4 = this.b;
                int i13 = this.c;
                g5Var4.O0 = i13;
                o3 o3Var4 = g5Var4.W;
                o3Var4.D(o3Var4.getCurrentPosition() + (i13 > g5Var4.G1() ? 1 : -1));
                break;
        }
    }
}

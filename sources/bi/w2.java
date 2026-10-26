package bi;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w2(h7 h7Var, int i10, int i11) {
        this.a = i11;
        this.b = h7Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                int i10 = this.c;
                h7Var.U0 = i10;
                d5 d5Var = h7Var.Z;
                d5Var.E(d5Var.getCurrentPosition() + (i10 > h7Var.a2() ? 1 : -1));
                break;
            case 1:
                h7 h7Var2 = this.b;
                int i11 = this.c;
                h7Var2.U0 = i11;
                d5 d5Var2 = h7Var2.Z;
                d5Var2.E(d5Var2.getCurrentPosition() + (i11 > h7Var2.a2() ? 1 : -1));
                break;
            case 2:
                h7 h7Var3 = this.b;
                int i12 = this.c;
                h7Var3.U0 = i12;
                d5 d5Var3 = h7Var3.Z;
                d5Var3.E(d5Var3.getCurrentPosition() + (i12 > h7Var3.a2() ? 1 : -1));
                break;
            default:
                h7 h7Var4 = this.b;
                int i13 = this.c;
                h7Var4.U0 = i13;
                d5 d5Var4 = h7Var4.Z;
                d5Var4.E(d5Var4.getCurrentPosition() + (i13 > h7Var4.a2() ? 1 : -1));
                break;
        }
    }
}

package di;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d2(c6 c6Var, int i7, int i10) {
        this.a = i10;
        this.b = c6Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c6 c6Var = this.b;
                int i7 = this.c;
                c6Var.Q2 = i7;
                e4 e4Var = c6Var.V1;
                e4Var.C(e4Var.getCurrentPosition() + (i7 > c6Var.D1() ? 1 : -1));
                break;
            case 1:
                c6 c6Var2 = this.b;
                int i10 = this.c;
                c6Var2.Q2 = i10;
                e4 e4Var2 = c6Var2.V1;
                e4Var2.C(e4Var2.getCurrentPosition() + (i10 > c6Var2.D1() ? 1 : -1));
                break;
            case 2:
                c6 c6Var3 = this.b;
                int i11 = this.c;
                c6Var3.Q2 = i11;
                e4 e4Var3 = c6Var3.V1;
                e4Var3.C(e4Var3.getCurrentPosition() + (i11 > c6Var3.D1() ? 1 : -1));
                break;
            default:
                c6 c6Var4 = this.b;
                int i12 = this.c;
                c6Var4.Q2 = i12;
                e4 e4Var4 = c6Var4.V1;
                e4Var4.C(e4Var4.getCurrentPosition() + (i12 > c6Var4.D1() ? 1 : -1));
                break;
        }
    }
}

package di;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ j1(f6 f6Var, int i7, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                int i7 = this.c;
                f6Var.Q2 = i7;
                h4 h4Var = f6Var.V1;
                h4Var.C(h4Var.getCurrentPosition() + (i7 > f6Var.I1() ? 1 : -1));
                break;
            case 1:
                f6 f6Var2 = this.b;
                int i10 = this.c;
                f6Var2.Q2 = i10;
                h4 h4Var2 = f6Var2.V1;
                h4Var2.C(h4Var2.getCurrentPosition() + (i10 > f6Var2.I1() ? 1 : -1));
                break;
            case 2:
                f6 f6Var3 = this.b;
                int i11 = this.c;
                f6Var3.Q2 = i11;
                h4 h4Var3 = f6Var3.V1;
                h4Var3.C(h4Var3.getCurrentPosition() + (i11 > f6Var3.I1() ? 1 : -1));
                break;
            default:
                f6 f6Var4 = this.b;
                int i12 = this.c;
                f6Var4.Q2 = i12;
                h4 h4Var4 = f6Var4.V1;
                h4Var4.C(h4Var4.getCurrentPosition() + (i12 > f6Var4.I1() ? 1 : -1));
                break;
        }
    }
}

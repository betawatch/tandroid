package ai;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a3(l7 l7Var, int i10, int i11) {
        this.a = i11;
        this.b = l7Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                int i10 = this.c;
                l7Var.U0 = i10;
                i5 i5Var = l7Var.Z;
                i5Var.D(i5Var.getCurrentPosition() + (i10 > l7Var.b2() ? 1 : -1));
                break;
            case 1:
                l7 l7Var2 = this.b;
                int i11 = this.c;
                l7Var2.U0 = i11;
                i5 i5Var2 = l7Var2.Z;
                i5Var2.D(i5Var2.getCurrentPosition() + (i11 > l7Var2.b2() ? 1 : -1));
                break;
            case 2:
                l7 l7Var3 = this.b;
                int i12 = this.c;
                l7Var3.U0 = i12;
                i5 i5Var3 = l7Var3.Z;
                i5Var3.D(i5Var3.getCurrentPosition() + (i12 > l7Var3.b2() ? 1 : -1));
                break;
            default:
                l7 l7Var4 = this.b;
                int i13 = this.c;
                l7Var4.U0 = i13;
                i5 i5Var4 = l7Var4.Z;
                i5Var4.D(i5Var4.getCurrentPosition() + (i13 > l7Var4.b2() ? 1 : -1));
                break;
        }
    }
}

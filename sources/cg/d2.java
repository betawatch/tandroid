package cg;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ d2(i2 i2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i2 i2Var = this.b;
                i2Var.a0.clear();
                i2Var.U.d.b(true);
                i2Var.b0(true, false);
                break;
            default:
                this.b.W(false);
                break;
        }
    }
}

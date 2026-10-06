package ci;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ l8(t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.S();
                break;
            default:
                this.b.W();
                break;
        }
    }
}

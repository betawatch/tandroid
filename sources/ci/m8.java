package ci;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ m8(u8 u8Var, int i10) {
        this.a = i10;
        this.b = u8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.U();
                break;
            default:
                this.b.X();
                break;
        }
    }
}

package ci;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

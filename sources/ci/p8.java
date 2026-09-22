package ci;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ p8(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
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

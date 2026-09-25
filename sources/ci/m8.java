package ci;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

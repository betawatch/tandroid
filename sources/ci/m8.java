package ci;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

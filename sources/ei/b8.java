package ei;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ b8(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
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

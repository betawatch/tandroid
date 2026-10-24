package di;

import android.view.View;
import ci.s6;
import org.telegram.ui.Components.ms0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ e(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                ms0 ms0Var = rVar.W;
                s6 s6Var = rVar.a;
                ms0Var.a(s6Var == null ? "" : s6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.W.b(rVar2.a.E);
                break;
        }
    }
}

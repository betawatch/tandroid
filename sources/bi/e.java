package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ e(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u uVar = this.b;
                nr0 nr0Var = uVar.W;
                t8 t8Var = uVar.a;
                nr0Var.a(t8Var == null ? "" : t8Var.E);
                break;
            default:
                u uVar2 = this.b;
                uVar2.W.b(uVar2.a.E);
                break;
        }
    }
}

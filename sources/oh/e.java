package oh;

import android.view.View;
import nh.d6;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.a;
                nr0Var.a(d6Var == null ? "" : d6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.T.b(rVar2.a.E);
                break;
        }
    }
}

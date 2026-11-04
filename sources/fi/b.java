package fi;

import android.view.View;
import ei.k6;
import org.telegram.ui.Components.tp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ b(m mVar, int i3) {
        this.a = i3;
        this.b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                tp0 tp0Var = mVar.a0;
                k6 k6Var = mVar.a;
                tp0Var.a(k6Var == null ? "" : k6Var.E);
                break;
            default:
                m mVar2 = this.b;
                mVar2.a0.b(mVar2.a.E);
                break;
        }
    }
}

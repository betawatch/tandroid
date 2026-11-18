package gi;

import android.view.View;
import fi.z5;
import org.telegram.ui.Components.dq0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ b(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                dq0 dq0Var = mVar.a0;
                z5 z5Var = mVar.a;
                dq0Var.a(z5Var == null ? "" : z5Var.E);
                break;
            default:
                m mVar2 = this.b;
                mVar2.a0.b(mVar2.a.E);
                break;
        }
    }
}

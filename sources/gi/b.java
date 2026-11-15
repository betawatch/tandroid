package gi;

import android.view.View;
import fi.c6;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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
                vp0 vp0Var = mVar.a0;
                c6 c6Var = mVar.a;
                vp0Var.a(c6Var == null ? "" : c6Var.E);
                break;
            default:
                m mVar2 = this.b;
                mVar2.a0.b(mVar2.a.E);
                break;
        }
    }
}

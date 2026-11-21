package gi;

import android.view.View;
import fi.a6;
import org.telegram.ui.Components.fq0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                fq0 fq0Var = mVar.a0;
                a6 a6Var = mVar.a;
                fq0Var.a(a6Var == null ? "" : a6Var.E);
                break;
            default:
                m mVar2 = this.b;
                mVar2.a0.b(mVar2.a.E);
                break;
        }
    }
}

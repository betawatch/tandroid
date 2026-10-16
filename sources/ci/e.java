package ci;

import android.view.View;
import bi.f8;
import org.telegram.ui.Components.ms0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ e(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                ms0 ms0Var = tVar.W;
                f8 f8Var = tVar.a;
                ms0Var.a(f8Var == null ? "" : f8Var.E);
                break;
            default:
                t tVar2 = this.b;
                tVar2.W.b(tVar2.a.E);
                break;
        }
    }
}

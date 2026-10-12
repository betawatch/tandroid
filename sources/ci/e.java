package ci;

import android.view.View;
import bi.f8;
import org.telegram.ui.Components.ms0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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

package ci;

import android.view.View;
import bi.b8;
import org.telegram.ui.Components.lr0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                lr0 lr0Var = tVar.W;
                b8 b8Var = tVar.a;
                lr0Var.a(b8Var == null ? "" : b8Var.E);
                break;
            default:
                t tVar2 = this.b;
                tVar2.W.b(tVar2.a.E);
                break;
        }
    }
}

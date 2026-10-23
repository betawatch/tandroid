package di;

import android.view.View;
import ci.s6;
import org.telegram.ui.Components.ms0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

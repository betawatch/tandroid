package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                zr0 zr0Var = uVar.W;
                t8 t8Var = uVar.a;
                zr0Var.a(t8Var == null ? "" : t8Var.E);
                break;
            default:
                u uVar2 = this.b;
                uVar2.W.b(uVar2.a.E);
                break;
        }
    }
}

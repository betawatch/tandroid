package bi;

import ai.u8;
import android.view.View;
import org.telegram.ui.Components.mr0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                mr0 mr0Var = uVar.W;
                u8 u8Var = uVar.a;
                mr0Var.a(u8Var == null ? "" : u8Var.E);
                break;
            default:
                u uVar2 = this.b;
                uVar2.W.b(uVar2.a.E);
                break;
        }
    }
}

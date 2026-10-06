package bi;

import ai.u8;
import android.view.View;
import org.telegram.ui.Components.es0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                es0 es0Var = uVar.W;
                u8 u8Var = uVar.a;
                es0Var.a(u8Var == null ? "" : u8Var.E);
                break;
            default:
                u uVar2 = this.b;
                uVar2.W.b(uVar2.a.E);
                break;
        }
    }
}

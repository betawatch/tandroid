package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.xr0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                xr0 xr0Var = uVar.W;
                t8 t8Var = uVar.a;
                xr0Var.a(t8Var == null ? "" : t8Var.E);
                break;
            default:
                u uVar2 = this.b;
                uVar2.W.b(uVar2.a.E);
                break;
        }
    }
}

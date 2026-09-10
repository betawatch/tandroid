package ai;

import android.view.View;
import org.telegram.ui.Components.vr0;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ i(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                vr0 vr0Var = a0Var.W;
                s4 s4Var = a0Var.a;
                vr0Var.a(s4Var == null ? "" : s4Var.E);
                break;
            default:
                a0 a0Var2 = this.b;
                a0Var2.W.b(a0Var2.a.E);
                break;
        }
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.sv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb0 b;

    public /* synthetic */ ib0(sb0 sb0Var, int i10) {
        this.a = i10;
        this.b = sb0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        sb0 sb0Var = this.b;
        sb0Var.T.a(sb0Var.e);
        sb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        switch (this.a) {
            case 2:
                sb0 sb0Var = this.b;
                if (i10 >= sb0Var.P.size()) {
                    sb0Var.w.setText("");
                    break;
                } else {
                    sb0Var.w.setText(LocaleController.formatDateAudio(sb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                sb0 sb0Var2 = this.b;
                sb0Var2.F.clearFocus();
                sb0Var2.O = true;
                ArrayList arrayList = sb0Var2.R;
                if (i10 < arrayList.size()) {
                    sb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    sb0Var2.F.setText("");
                }
                sb0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

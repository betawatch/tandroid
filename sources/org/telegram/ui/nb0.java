package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.sv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ nb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xb0 xb0Var = this.b;
        xb0Var.T.a(xb0Var.e);
        xb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        switch (this.a) {
            case 2:
                xb0 xb0Var = this.b;
                if (i10 >= xb0Var.P.size()) {
                    xb0Var.w.setText("");
                    break;
                } else {
                    xb0Var.w.setText(LocaleController.formatDateAudio(xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                xb0 xb0Var2 = this.b;
                xb0Var2.F.clearFocus();
                xb0Var2.O = true;
                ArrayList arrayList = xb0Var2.R;
                if (i10 < arrayList.size()) {
                    xb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    xb0Var2.F.setText("");
                }
                xb0Var2.O = false;
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

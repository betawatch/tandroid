package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb0 b;

    public /* synthetic */ lb0(vb0 vb0Var, int i10) {
        this.a = i10;
        this.b = vb0Var;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        vb0 vb0Var = this.b;
        vb0Var.T.a(vb0Var.e);
        vb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.vw0
    public void g(int i10) {
        switch (this.a) {
            case 2:
                vb0 vb0Var = this.b;
                if (i10 >= vb0Var.P.size()) {
                    vb0Var.w.setText("");
                    break;
                } else {
                    vb0Var.w.setText(LocaleController.formatDateAudio(vb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                vb0 vb0Var2 = this.b;
                vb0Var2.F.clearFocus();
                vb0Var2.O = true;
                ArrayList arrayList = vb0Var2.R;
                if (i10 < arrayList.size()) {
                    vb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    vb0Var2.F.setText("");
                }
                vb0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.rw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac0 b;

    public /* synthetic */ qb0(ac0 ac0Var, int i10) {
        this.a = i10;
        this.b = ac0Var;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.Components.rw0
    public void f(int i10) {
        switch (this.a) {
            case 2:
                ac0 ac0Var = this.b;
                if (i10 >= ac0Var.P.size()) {
                    ac0Var.w.setText("");
                    break;
                } else {
                    ac0Var.w.setText(LocaleController.formatDateAudio(ac0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                ac0 ac0Var2 = this.b;
                ac0Var2.F.clearFocus();
                ac0Var2.O = true;
                ArrayList arrayList = ac0Var2.R;
                if (i10 < arrayList.size()) {
                    ac0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    ac0Var2.F.setText("");
                }
                ac0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ac0 ac0Var = this.b;
        ac0Var.T.a(ac0Var.e);
        ac0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

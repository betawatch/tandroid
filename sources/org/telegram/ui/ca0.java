package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.xu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma0 b;

    public /* synthetic */ ca0(ma0 ma0Var, int i10) {
        this.a = i10;
        this.b = ma0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        this.b.Z(i10);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ma0 ma0Var = this.b;
        ma0Var.S.a(ma0Var.e);
        ma0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.xu0
    public void m(int i10) {
        switch (this.a) {
            case 2:
                ma0 ma0Var = this.b;
                if (i10 >= ma0Var.O.size()) {
                    ma0Var.x.setText("");
                    break;
                } else {
                    ma0Var.x.setText(org.telegram.messenger.cd.s(ma0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                ma0 ma0Var2 = this.b;
                ma0Var2.F.clearFocus();
                ma0Var2.N = true;
                ArrayList arrayList = ma0Var2.Q;
                if (i10 < arrayList.size()) {
                    ma0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    ma0Var2.F.setText("");
                }
                ma0Var2.N = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

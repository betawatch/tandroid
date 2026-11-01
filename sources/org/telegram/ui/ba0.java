package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.yu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ ba0(la0 la0Var, int i10) {
        this.a = i10;
        this.b = la0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        this.b.a0(i10);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        la0 la0Var = this.b;
        la0Var.S.a(la0Var.e);
        la0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.yu0
    public void m(int i10) {
        switch (this.a) {
            case 2:
                la0 la0Var = this.b;
                if (i10 >= la0Var.O.size()) {
                    la0Var.x.setText("");
                    break;
                } else {
                    la0Var.x.setText(org.telegram.messenger.dd.s(la0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                la0 la0Var2 = this.b;
                la0Var2.F.clearFocus();
                la0Var2.N = true;
                ArrayList arrayList = la0Var2.Q;
                if (i10 < arrayList.size()) {
                    la0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    la0Var2.F.setText("");
                }
                la0Var2.N = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public /* synthetic */ void r() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements org.telegram.ui.Components.s4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.vt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k90 b;

    public /* synthetic */ a90(k90 k90Var, int i7) {
        this.a = i7;
        this.b = k90Var;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        this.b.a0(i7);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k90 k90Var = this.b;
        k90Var.S.a(k90Var.e);
        k90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.vt0
    public void m(int i7) {
        switch (this.a) {
            case 2:
                k90 k90Var = this.b;
                if (i7 >= k90Var.O.size()) {
                    k90Var.x.setText("");
                    break;
                } else {
                    k90Var.x.setText(org.telegram.messenger.id.s(k90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i7)).intValue(), false));
                    break;
                }
            default:
                k90 k90Var2 = this.b;
                k90Var2.F.clearFocus();
                k90Var2.N = true;
                ArrayList arrayList = k90Var2.Q;
                if (i7 < arrayList.size()) {
                    k90Var2.F.setText(((Integer) arrayList.get(i7)).toString());
                } else {
                    k90Var2.F.setText("");
                }
                k90Var2.N = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void n() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

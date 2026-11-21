package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements org.telegram.ui.Components.a5, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k90 b;

    public /* synthetic */ a90(k90 k90Var, int i7) {
        this.a = i7;
        this.b = k90Var;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        this.b.a0(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k90 k90Var = this.b;
        k90Var.T.a(k90Var.e);
        k90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        switch (this.a) {
            case 2:
                k90 k90Var = this.b;
                if (i7 >= k90Var.P.size()) {
                    k90Var.x.setText("");
                    break;
                } else {
                    k90Var.x.setText(org.telegram.messenger.gd.s(k90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i7)).intValue(), false));
                    break;
                }
            default:
                k90 k90Var2 = this.b;
                k90Var2.G.clearFocus();
                k90Var2.O = true;
                ArrayList arrayList = k90Var2.R;
                if (i7 < arrayList.size()) {
                    k90Var2.G.setText(((Integer) arrayList.get(i7)).toString());
                } else {
                    k90Var2.G.setText("");
                }
                k90Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

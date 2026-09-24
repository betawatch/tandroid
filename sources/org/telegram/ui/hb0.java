package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.dw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;

    public /* synthetic */ hb0(rb0 rb0Var, int i10) {
        this.a = i10;
        this.b = rb0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        rb0 rb0Var = this.b;
        rb0Var.T.a(rb0Var.e);
        rb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                rb0 rb0Var = this.b;
                if (i10 >= rb0Var.P.size()) {
                    rb0Var.w.setText("");
                    break;
                } else {
                    rb0Var.w.setText(LocaleController.formatDateAudio(rb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                rb0 rb0Var2 = this.b;
                rb0Var2.F.clearFocus();
                rb0Var2.O = true;
                ArrayList arrayList = rb0Var2.R;
                if (i10 < arrayList.size()) {
                    rb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    rb0Var2.F.setText("");
                }
                rb0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ew0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ ob0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yb0 yb0Var = this.b;
        yb0Var.T.a(yb0Var.e);
        yb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.ew0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                yb0 yb0Var = this.b;
                if (i10 >= yb0Var.P.size()) {
                    yb0Var.w.setText("");
                    break;
                } else {
                    yb0Var.w.setText(LocaleController.formatDateAudio(yb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                yb0 yb0Var2 = this.b;
                yb0Var2.F.clearFocus();
                yb0Var2.O = true;
                ArrayList arrayList = yb0Var2.R;
                if (i10 < arrayList.size()) {
                    yb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    yb0Var2.F.setText("");
                }
                yb0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ew0
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

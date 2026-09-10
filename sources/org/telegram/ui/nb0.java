package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.dw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ nb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xb0 xb0Var = this.b;
        xb0Var.T.a(xb0Var.e);
        xb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
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

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

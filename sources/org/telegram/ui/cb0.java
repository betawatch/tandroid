package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.tv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb0 b;

    public /* synthetic */ cb0(nb0 nb0Var, int i10) {
        this.a = i10;
        this.b = nb0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.Components.tv0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                nb0 nb0Var = this.b;
                if (i10 >= nb0Var.M.size()) {
                    nb0Var.w.setText("");
                    break;
                } else {
                    nb0Var.w.setText(LocaleController.formatDateAudio(nb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                nb0 nb0Var2 = this.b;
                nb0Var2.C.clearFocus();
                nb0Var2.L = true;
                ArrayList arrayList = nb0Var2.O;
                if (i10 < arrayList.size()) {
                    nb0Var2.C.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    nb0Var2.C.setText("");
                }
                nb0Var2.L = false;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        nb0 nb0Var = this.b;
        nb0Var.Q.a(nb0Var.e);
        nb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

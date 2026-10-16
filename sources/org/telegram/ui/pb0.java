package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.rw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ pb0(zb0 zb0Var, int i10) {
        this.a = i10;
        this.b = zb0Var;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zb0 zb0Var = this.b;
        zb0Var.T.a(zb0Var.e);
        zb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.rw0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                zb0 zb0Var = this.b;
                if (i10 >= zb0Var.P.size()) {
                    zb0Var.w.setText("");
                    break;
                } else {
                    zb0Var.w.setText(LocaleController.formatDateAudio(zb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                zb0 zb0Var2 = this.b;
                zb0Var2.F.clearFocus();
                zb0Var2.O = true;
                ArrayList arrayList = zb0Var2.R;
                if (i10 < arrayList.size()) {
                    zb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    zb0Var2.F.setText("");
                }
                zb0Var2.O = false;
                break;
        }
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

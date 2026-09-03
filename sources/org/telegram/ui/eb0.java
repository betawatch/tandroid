package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.tv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;

    public /* synthetic */ eb0(pb0 pb0Var, int i10) {
        this.a = i10;
        this.b = pb0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        switch (this.a) {
            case 2:
                pb0 pb0Var = this.b;
                if (i10 >= pb0Var.M.size()) {
                    pb0Var.w.setText("");
                    break;
                } else {
                    pb0Var.w.setText(LocaleController.formatDateAudio(pb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                pb0 pb0Var2 = this.b;
                pb0Var2.C.clearFocus();
                pb0Var2.L = true;
                ArrayList arrayList = pb0Var2.O;
                if (i10 < arrayList.size()) {
                    pb0Var2.C.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    pb0Var2.C.setText("");
                }
                pb0Var2.L = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        pb0 pb0Var = this.b;
        pb0Var.Q.a(pb0Var.e);
        pb0Var.finishFragment();
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

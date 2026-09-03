package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.tv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ db0(ob0 ob0Var, int i10) {
        this.a = i10;
        this.b = ob0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.Components.tv0
    public void i(int i10) {
        switch (this.a) {
            case 2:
                ob0 ob0Var = this.b;
                if (i10 >= ob0Var.M.size()) {
                    ob0Var.w.setText("");
                    break;
                } else {
                    ob0Var.w.setText(LocaleController.formatDateAudio(ob0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                ob0 ob0Var2 = this.b;
                ob0Var2.C.clearFocus();
                ob0Var2.L = true;
                ArrayList arrayList = ob0Var2.O;
                if (i10 < arrayList.size()) {
                    ob0Var2.C.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    ob0Var2.C.setText("");
                }
                ob0Var2.L = false;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ob0 ob0Var = this.b;
        ob0Var.Q.a(ob0Var.e);
        ob0Var.finishFragment();
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

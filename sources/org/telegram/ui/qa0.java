package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab0 b;

    public /* synthetic */ qa0(ab0 ab0Var, int i10) {
        this.a = i10;
        this.b = ab0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ab0 ab0Var = this.b;
        ab0Var.T.a(ab0Var.e);
        ab0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.nw0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                ab0 ab0Var = this.b;
                if (i10 >= ab0Var.P.size()) {
                    ab0Var.w.setText("");
                    break;
                } else {
                    ab0Var.w.setText(LocaleController.formatDateAudio(ab0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                ab0 ab0Var2 = this.b;
                ab0Var2.F.clearFocus();
                ab0Var2.O = true;
                ArrayList arrayList = ab0Var2.R;
                if (i10 < arrayList.size()) {
                    ab0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    ab0Var2.F.setText("");
                }
                ab0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.nw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}

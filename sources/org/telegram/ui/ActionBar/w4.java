package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ w4(z4 z4Var, int i7) {
        this.a = i7;
        this.b = z4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z4 z4Var = this.b;
                if (!z4Var.H && z4Var.G) {
                    z4Var.o(true);
                    break;
                } else {
                    j jVar = z4Var.W;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
            default:
                z4 z4Var2 = this.b;
                if (z4Var2.s.length() != 0) {
                    z4Var2.s.setText("");
                } else {
                    TextView textView = z4Var2.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        z4Var2.n();
                    }
                }
                z4Var2.s.requestFocus();
                org.telegram.messenger.g0.I3(z4Var2.s);
                break;
        }
    }
}

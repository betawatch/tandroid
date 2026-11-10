package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (!z4Var.G && z4Var.F) {
                    z4Var.l(true);
                    break;
                } else {
                    k kVar = z4Var.V;
                    if (kVar != null) {
                        kVar.b(-1);
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
                        z4Var2.k();
                    }
                }
                z4Var2.s.requestFocus();
                org.telegram.messenger.g0.K3(z4Var2.s);
                break;
        }
    }
}

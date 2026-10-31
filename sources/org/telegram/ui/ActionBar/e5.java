package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ e5(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                if (!i5Var.G && i5Var.F) {
                    i5Var.j(true);
                    break;
                } else {
                    k kVar = i5Var.V;
                    if (kVar != null) {
                        kVar.b(-1);
                        break;
                    }
                }
                break;
            default:
                i5 i5Var2 = this.b;
                if (i5Var2.s.length() != 0) {
                    i5Var2.s.setText("");
                } else {
                    TextView textView = i5Var2.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        i5Var2.i();
                    }
                }
                i5Var2.s.requestFocus();
                org.telegram.messenger.i0.J3(i5Var2.s);
                break;
        }
    }
}

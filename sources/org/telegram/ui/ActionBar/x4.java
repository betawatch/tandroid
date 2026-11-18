package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ x4(a5 a5Var, int i7) {
        this.a = i7;
        this.b = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                if (!a5Var.H && a5Var.G) {
                    a5Var.o(true);
                    break;
                } else {
                    j jVar = a5Var.W;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
            default:
                a5 a5Var2 = this.b;
                if (a5Var2.s.length() != 0) {
                    a5Var2.s.setText("");
                } else {
                    TextView textView = a5Var2.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        a5Var2.n();
                    }
                }
                a5Var2.s.requestFocus();
                org.telegram.messenger.g0.I3(a5Var2.s);
                break;
        }
    }
}

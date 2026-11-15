package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ t4(w4 w4Var, int i7) {
        this.a = i7;
        this.b = w4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w4 w4Var = this.b;
                if (!w4Var.H && w4Var.G) {
                    w4Var.m(true);
                    break;
                } else {
                    j jVar = w4Var.W;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
            default:
                w4 w4Var2 = this.b;
                if (w4Var2.s.length() != 0) {
                    w4Var2.s.setText("");
                } else {
                    TextView textView = w4Var2.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        w4Var2.l();
                    }
                }
                w4Var2.s.requestFocus();
                org.telegram.messenger.g0.J3(w4Var2.s);
                break;
        }
    }
}

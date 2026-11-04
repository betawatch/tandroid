package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    public /* synthetic */ v4(y4 y4Var, int i3) {
        this.a = i3;
        this.b = y4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y4 y4Var = this.b;
                if (!y4Var.H && y4Var.G) {
                    y4Var.j(true);
                    break;
                } else {
                    j jVar = y4Var.W;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
            default:
                y4 y4Var2 = this.b;
                if (y4Var2.s.length() != 0) {
                    y4Var2.s.setText("");
                } else {
                    TextView textView = y4Var2.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        y4Var2.i();
                    }
                }
                y4Var2.s.requestFocus();
                org.telegram.messenger.g0.K3(y4Var2.s);
                break;
        }
    }
}

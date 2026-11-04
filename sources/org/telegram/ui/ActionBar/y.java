package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ y(q0 q0Var, int i3) {
        this.a = i3;
        this.b = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m0 m0Var;
        f1 f1Var;
        int i3 = this.a;
        q0 q0Var = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = q0Var.h0;
                if (q0Var.e.length() != 0) {
                    q0Var.e.setText("");
                } else if (q0Var.r()) {
                    q0Var.e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (q0Var.I != null && ((kg.l0) arrayList.get(i10)).h) {
                            q0Var.I.j((kg.l0) arrayList.get(i10));
                        }
                    }
                    q0Var.m();
                } else {
                    TextView textView = q0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((m0Var = q0Var.I) == null || m0Var.a())) {
                        q0Var.h.setVisibility(8);
                        m0 m0Var2 = q0Var.I;
                        if (m0Var2 != null) {
                            m0Var2.f();
                        }
                    }
                }
                q0Var.e.requestFocus();
                org.telegram.messenger.g0.K3(q0Var.e);
                break;
            case 1:
                if (q0Var.x()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.q();
                    }
                }
                x xVar = q0Var.c;
                if (xVar != null) {
                    xVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    l0 l0Var = q0Var.Q;
                    if (l0Var != null) {
                        l0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                x xVar2 = q0Var.c;
                if (xVar2 != null) {
                    xVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    l0 l0Var2 = q0Var.Q;
                    if (l0Var2 != null) {
                        l0Var2.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                if (q0Var.x()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        if (!q0Var.S && (f1Var = q0Var.d) != null) {
                            f1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        q0Var.q();
                    }
                }
                x xVar3 = q0Var.c;
                if (xVar3 != null) {
                    xVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    l0 l0Var3 = q0Var.Q;
                    if (l0Var3 != null) {
                        l0Var3.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}

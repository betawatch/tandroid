package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ z(q0 q0Var, int i7) {
        this.a = i7;
        this.b = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m0 m0Var;
        g1 g1Var;
        int i7 = this.a;
        q0 q0Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = q0Var.h0;
                if (q0Var.e.length() != 0) {
                    q0Var.e.setText("");
                } else if (q0Var.s()) {
                    q0Var.e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (q0Var.I != null && ((jg.o0) arrayList.get(i10)).h) {
                            q0Var.I.j((jg.o0) arrayList.get(i10));
                        }
                    }
                    q0Var.n();
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
                org.telegram.messenger.g0.I3(q0Var.e);
                break;
            case 1:
                if (q0Var.y()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.r();
                    }
                }
                y yVar = q0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    l0 l0Var = q0Var.Q;
                    if (l0Var != null) {
                        l0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                y yVar2 = q0Var.c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    l0 l0Var2 = q0Var.Q;
                    if (l0Var2 != null) {
                        l0Var2.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                if (q0Var.y()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        if (!q0Var.S && (g1Var = q0Var.d) != null) {
                            g1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        q0Var.r();
                    }
                }
                y yVar3 = q0Var.c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    l0 l0Var3 = q0Var.Q;
                    if (l0Var3 != null) {
                        l0Var3.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}

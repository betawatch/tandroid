package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ z(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n0 n0Var;
        g1 g1Var;
        int i7 = this.a;
        r0 r0Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = r0Var.g0;
                if (r0Var.e.length() != 0) {
                    r0Var.e.setText("");
                } else if (r0Var.r()) {
                    r0Var.e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (r0Var.H != null && ((jg.o0) arrayList.get(i10)).h) {
                            r0Var.H.j((jg.o0) arrayList.get(i10));
                        }
                    }
                    r0Var.m();
                } else {
                    TextView textView = r0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((n0Var = r0Var.H) == null || n0Var.a())) {
                        r0Var.h.setVisibility(8);
                        n0 n0Var2 = r0Var.H;
                        if (n0Var2 != null) {
                            n0Var2.f();
                        }
                    }
                }
                r0Var.e.requestFocus();
                org.telegram.messenger.g0.K3(r0Var.e);
                break;
            case 1:
                if (r0Var.x()) {
                    if (!r0Var.T) {
                        r0Var.T = true;
                        r0Var.q();
                    }
                }
                y yVar = r0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m0 m0Var = r0Var.P;
                    if (m0Var != null) {
                        m0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                y yVar2 = r0Var.c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m0 m0Var2 = r0Var.P;
                    if (m0Var2 != null) {
                        m0Var2.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                if (r0Var.x()) {
                    if (!r0Var.T) {
                        r0Var.T = true;
                        if (!r0Var.R && (g1Var = r0Var.d) != null) {
                            g1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        r0Var.q();
                    }
                }
                y yVar3 = r0Var.c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m0 m0Var3 = r0Var.P;
                    if (m0Var3 != null) {
                        m0Var3.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}

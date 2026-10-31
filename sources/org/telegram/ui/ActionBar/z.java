package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ z(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p0 p0Var;
        k1 k1Var;
        int i10 = this.a;
        t0 t0Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = t0Var.g0;
                if (t0Var.e.length() != 0) {
                    t0Var.e.setText("");
                } else if (t0Var.r()) {
                    t0Var.e.m();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (t0Var.H != null && ((zf.e0) arrayList.get(i11)).h) {
                            t0Var.H.j((zf.e0) arrayList.get(i11));
                        }
                    }
                    t0Var.m();
                } else {
                    TextView textView = t0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((p0Var = t0Var.H) == null || p0Var.a())) {
                        t0Var.h.setVisibility(8);
                        p0 p0Var2 = t0Var.H;
                        if (p0Var2 != null) {
                            p0Var2.f();
                        }
                    }
                }
                t0Var.e.requestFocus();
                org.telegram.messenger.i0.J3(t0Var.e);
                break;
            case 1:
                if (t0Var.x()) {
                    if (!t0Var.T) {
                        t0Var.T = true;
                        t0Var.q();
                    }
                }
                y yVar = t0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    o0 o0Var = t0Var.P;
                    if (o0Var != null) {
                        o0Var.k(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                y yVar2 = t0Var.c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    o0 o0Var2 = t0Var.P;
                    if (o0Var2 != null) {
                        o0Var2.k(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                if (t0Var.x()) {
                    if (!t0Var.T) {
                        t0Var.T = true;
                        if (!t0Var.R && (k1Var = t0Var.d) != null) {
                            k1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        t0Var.q();
                    }
                }
                y yVar3 = t0Var.c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    o0 o0Var3 = t0Var.P;
                    if (o0Var3 != null) {
                        o0Var3.k(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ a0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n0 n0Var;
        h1 h1Var;
        int i7 = this.a;
        r0 r0Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = r0Var.h0;
                if (r0Var.e.length() != 0) {
                    r0Var.e.setText("");
                } else if (r0Var.s()) {
                    r0Var.e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (r0Var.I != null && ((jg.o0) arrayList.get(i10)).h) {
                            r0Var.I.j((jg.o0) arrayList.get(i10));
                        }
                    }
                    r0Var.n();
                } else {
                    TextView textView = r0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((n0Var = r0Var.I) == null || n0Var.a())) {
                        r0Var.h.setVisibility(8);
                        n0 n0Var2 = r0Var.I;
                        if (n0Var2 != null) {
                            n0Var2.f();
                        }
                    }
                }
                r0Var.e.requestFocus();
                org.telegram.messenger.g0.I3(r0Var.e);
                break;
            case 1:
                if (r0Var.y()) {
                    if (!r0Var.U) {
                        r0Var.U = true;
                        r0Var.r();
                    }
                }
                z zVar = r0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m0 m0Var = r0Var.Q;
                    if (m0Var != null) {
                        m0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                z zVar2 = r0Var.c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m0 m0Var2 = r0Var.Q;
                    if (m0Var2 != null) {
                        m0Var2.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                if (r0Var.y()) {
                    if (!r0Var.U) {
                        r0Var.U = true;
                        if (!r0Var.S && (h1Var = r0Var.d) != null) {
                            h1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        r0Var.r();
                    }
                }
                z zVar3 = r0Var.c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m0 m0Var3 = r0Var.Q;
                    if (m0Var3 != null) {
                        m0Var3.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}

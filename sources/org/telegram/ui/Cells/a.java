package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.b00;
import org.telegram.ui.oi0;
import org.telegram.ui.om0;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((j) obj).h();
                break;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() != 1) {
                    new bi.g(mVar.getContext()).show();
                    break;
                } else {
                    new bi.y(mVar.getContext(), null, null, (org.telegram.messenger.q9) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                qh0 qh0Var = ((a3) obj).f;
                if (!qh0Var.b()) {
                    qh0Var.setProgress(0.0f);
                    qh0Var.d();
                    break;
                }
                break;
            case 4:
                ((r3) obj).getClass();
                break;
            case 5:
                g4 g4Var = (g4) obj;
                g4Var.d(g4Var);
                break;
            case 6:
                ((r4) obj).performClick();
                break;
            case 7:
                b5 b5Var = (b5) obj;
                b5Var.M.c(b5Var, true);
                break;
            case 8:
                s5 s5Var = (s5) obj;
                s5Var.d = s5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                s5Var.b(true);
                s5Var.c.onClick(s5Var);
                break;
            case 9:
                w5 w5Var = (w5) obj;
                v5 v5Var = w5Var.d;
                if (v5Var != null) {
                    om0.Z((om0) ((org.telegram.ui.l4) ((oi0) v5Var).b).e, w5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                p7 p7Var = (p7) obj;
                if (p7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = p7Var.d;
                    int i10 = p7Var.c[intValue];
                    fj fjVar = p7Var.b[intValue];
                    b00 b00Var = ((zz) ((org.telegram.ui.f) n7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = b00.t0;
                    b00Var.f(i10, p7Var, fjVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

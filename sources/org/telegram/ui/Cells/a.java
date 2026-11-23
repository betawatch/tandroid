package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.a00;
import org.telegram.ui.c00;
import org.telegram.ui.qi0;
import org.telegram.ui.qm0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                    new bi.y(mVar.getContext(), null, null, (org.telegram.messenger.r9) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                rh0 rh0Var = ((a3) obj).f;
                if (!rh0Var.b()) {
                    rh0Var.setProgress(0.0f);
                    rh0Var.d();
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
                b5Var.M.b(b5Var, true);
                break;
            case 8:
                t5 t5Var = (t5) obj;
                t5Var.d = t5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.c.onClick(t5Var);
                break;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    qm0.Z((qm0) ((org.telegram.ui.l4) ((qi0) w5Var).b).e, x5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                q7 q7Var = (q7) obj;
                if (q7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    o7 o7Var = q7Var.d;
                    int i10 = q7Var.c[intValue];
                    gj gjVar = q7Var.b[intValue];
                    c00 c00Var = ((a00) ((org.telegram.ui.f) o7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
                    c00Var.f(i10, q7Var, gjVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

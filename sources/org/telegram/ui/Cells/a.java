package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.a00;
import org.telegram.ui.c00;
import org.telegram.ui.qi0;
import org.telegram.ui.qm0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ph0 ph0Var = ((z2) obj).f;
                if (!ph0Var.b()) {
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
                    break;
                }
                break;
            case 4:
                ((q3) obj).getClass();
                break;
            case 5:
                f4 f4Var = (f4) obj;
                f4Var.d(f4Var);
                break;
            case 6:
                ((q4) obj).performClick();
                break;
            case 7:
                a5 a5Var = (a5) obj;
                a5Var.M.b(a5Var, true);
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
                    qm0.Z((qm0) ((org.telegram.ui.l4) ((qi0) v5Var).b).e, w5Var.b[((Integer) view.getTag()).intValue()]);
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
                    c00 c00Var = ((a00) ((org.telegram.ui.f) n7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
                    c00Var.f(i10, p7Var, fjVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

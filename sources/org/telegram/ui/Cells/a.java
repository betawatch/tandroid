package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.tj0;
import org.telegram.ui.x00;
import org.telegram.ui.yn0;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((i) obj).h();
                break;
            case 1:
                l lVar = (l) obj;
                if (lVar.e.size() != 1) {
                    new ph.e(lVar.getContext()).show();
                    break;
                } else {
                    new ph.m(lVar.getContext(), null, null, (org.telegram.messenger.t9) lVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                ei0 ei0Var = ((b3) obj).f;
                if (!ei0Var.b()) {
                    ei0Var.setProgress(0.0f);
                    ei0Var.d();
                    break;
                }
                break;
            case 4:
                ((s3) obj).getClass();
                break;
            case 5:
                h4 h4Var = (h4) obj;
                h4Var.d(h4Var);
                break;
            case 6:
                ((s4) obj).performClick();
                break;
            case 7:
                e5 e5Var = (e5) obj;
                e5Var.L.c(e5Var, true);
                break;
            case 8:
                w5 w5Var = (w5) obj;
                w5Var.d = w5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                w5Var.b(true);
                w5Var.c.onClick(w5Var);
                break;
            case 9:
                a6 a6Var = (a6) obj;
                z5 z5Var = a6Var.d;
                if (z5Var != null) {
                    yn0.Y((yn0) ((fg.j) ((tj0) z5Var).b).e, a6Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = t7Var.d;
                    int i11 = t7Var.c[intValue];
                    jj jjVar = t7Var.b[intValue];
                    z00 z00Var = ((x00) ((org.telegram.ui.e) r7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = z00.s0;
                    z00Var.f(i11, t7Var, jjVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

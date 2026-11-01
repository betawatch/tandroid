package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.rj0;
import org.telegram.ui.w00;
import org.telegram.ui.wn0;
import org.telegram.ui.y00;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    new ph.m(lVar.getContext(), null, null, (org.telegram.messenger.u9) lVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                fi0 fi0Var = ((b3) obj).f;
                if (!fi0Var.b()) {
                    fi0Var.setProgress(0.0f);
                    fi0Var.d();
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
                    wn0.Z((wn0) ((fg.j) ((rj0) z5Var).b).e, a6Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = t7Var.d;
                    int i11 = t7Var.c[intValue];
                    kj kjVar = t7Var.b[intValue];
                    y00 y00Var = ((w00) ((org.telegram.ui.e) r7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = y00.s0;
                    y00Var.f(i11, t7Var, kjVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

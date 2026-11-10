package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.b00;
import org.telegram.ui.oi0;
import org.telegram.ui.pm0;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    new zh.f(mVar.getContext()).show();
                    break;
                } else {
                    new zh.l(mVar.getContext(), null, null, (org.telegram.messenger.s9) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                ch0 ch0Var = ((z2) obj).f;
                if (!ch0Var.b()) {
                    ch0Var.setProgress(0.0f);
                    ch0Var.d();
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
                a5Var.L.b(a5Var, true);
                break;
            case 8:
                r5 r5Var = (r5) obj;
                r5Var.d = r5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                r5Var.b(true);
                r5Var.c.onClick(r5Var);
                break;
            case 9:
                v5 v5Var = (v5) obj;
                u5 u5Var = v5Var.d;
                if (u5Var != null) {
                    pm0.Z((pm0) ((org.telegram.ui.l4) ((oi0) u5Var).b).e, v5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                p7 p7Var = (p7) obj;
                if (p7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = p7Var.d;
                    int i10 = p7Var.c[intValue];
                    ij ijVar = p7Var.b[intValue];
                    b00 b00Var = ((zz) ((org.telegram.ui.f) n7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = b00.s0;
                    b00Var.f(i10, p7Var, ijVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.ci0;
import org.telegram.ui.hm0;
import org.telegram.ui.uz;
import org.telegram.ui.wz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((j) obj).h();
                break;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() != 1) {
                    new ai.j(mVar.getContext()).show();
                    break;
                } else {
                    new ai.e0(mVar.getContext(), null, null, (org.telegram.messenger.m9) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                fh0 fh0Var = ((z2) obj).f;
                if (!fh0Var.b()) {
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
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
                r5 r5Var = (r5) obj;
                r5Var.d = r5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                r5Var.b(true);
                r5Var.c.onClick(r5Var);
                break;
            case 9:
                v5 v5Var = (v5) obj;
                u5 u5Var = v5Var.d;
                if (u5Var != null) {
                    hm0.Z((hm0) ((org.telegram.ui.n4) ((ci0) u5Var).b).e, v5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                o7 o7Var = (o7) obj;
                if (o7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    m7 m7Var = o7Var.d;
                    int i10 = o7Var.c[intValue];
                    zi ziVar = o7Var.b[intValue];
                    wz wzVar = ((uz) ((org.telegram.ui.f) m7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = wz.t0;
                    wzVar.f(i10, o7Var, ziVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

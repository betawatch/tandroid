package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.ni0;
import org.telegram.ui.om0;
import org.telegram.ui.xz;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                a5Var.M.c(a5Var, true);
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
                    om0.Z((om0) ((org.telegram.ui.l4) ((ni0) u5Var).b).e, v5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                o7 o7Var = (o7) obj;
                if (o7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    m7 m7Var = o7Var.d;
                    int i10 = o7Var.c[intValue];
                    gj gjVar = o7Var.b[intValue];
                    zz zzVar = ((xz) ((org.telegram.ui.f) m7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = zz.t0;
                    zzVar.f(i10, o7Var, gjVar, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

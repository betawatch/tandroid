package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.c10;
import org.telegram.ui.e10;
import org.telegram.ui.pp0;
import org.telegram.ui.qp0;
import org.telegram.ui.sp0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                ((j) obj).h();
                break;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() != 1) {
                    new yh.e(mVar.getContext()).show();
                    break;
                } else {
                    new yh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                xj0 xj0Var = ((x2) obj).f;
                if (!xj0Var.b()) {
                    xj0Var.setProgress(0.0f);
                    xj0Var.d();
                    break;
                }
                break;
            case 4:
                ((o3) obj).getClass();
                break;
            case 5:
                d4 d4Var = (d4) obj;
                d4Var.d(d4Var);
                break;
            case 6:
                ((o4) obj).performClick();
                break;
            case 7:
                a5 a5Var = (a5) obj;
                a5Var.L.d(a5Var, true);
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
                    sp0.U(((qp0) ((pp0) w5Var).b).d, x5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    q7 q7Var = t7Var.d;
                    int i11 = t7Var.c[intValue];
                    MessageObject messageObject = t7Var.b[intValue];
                    e10 e10Var = ((c10) ((org.telegram.ui.g) q7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = e10.s0;
                    e10Var.f(i11, t7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

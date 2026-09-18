package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.jq0;
import org.telegram.ui.lq0;
import org.telegram.ui.nl0;
import org.telegram.ui.x10;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    new xh.e(mVar.getContext()).show();
                    break;
                } else {
                    new xh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                bj0 bj0Var = ((x2) obj).f;
                if (!bj0Var.b()) {
                    bj0Var.setProgress(0.0f);
                    bj0Var.d();
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
                a5Var.L.c(a5Var, true);
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
                    lq0.U(((jq0) ((nl0) w5Var).b).d, x5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.c[intValue];
                    MessageObject messageObject = u7Var.b[intValue];
                    z10 z10Var = ((x10) ((org.telegram.ui.g) r7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
                    z10Var.f(i11, u7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

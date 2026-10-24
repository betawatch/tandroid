package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.g10;
import org.telegram.ui.i10;
import org.telegram.ui.sp0;
import org.telegram.ui.tp0;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                ((v) obj).toggle();
                break;
            case 3:
                bk0 bk0Var = ((w2) obj).f;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
                    break;
                }
                break;
            case 4:
                ((n3) obj).getClass();
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
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    vp0.U(((tp0) ((sp0) x5Var).b).d, y5Var.b[((Integer) view.getTag()).intValue()]);
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
                    i10 i10Var = ((g10) ((org.telegram.ui.f) q7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.s0;
                    i10Var.f(i11, t7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

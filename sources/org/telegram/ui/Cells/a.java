package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.kl0;
import org.telegram.ui.s10;
import org.telegram.ui.u10;
import org.telegram.ui.up0;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    new kh.f(mVar.getContext()).show();
                    break;
                } else {
                    new kh.s(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                jj0 jj0Var = ((w2) obj).f;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
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
                a5Var.I.c(a5Var, true);
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
                    wp0.U(((up0) ((kl0) w5Var).b).d, x5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                r7 r7Var = (r7) obj;
                if (r7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    o7 o7Var = r7Var.d;
                    int i11 = r7Var.c[intValue];
                    MessageObject messageObject = r7Var.b[intValue];
                    u10 u10Var = ((s10) ((org.telegram.ui.h) o7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = u10.p0;
                    u10Var.f(i11, r7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

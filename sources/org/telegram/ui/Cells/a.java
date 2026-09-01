package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.kl0;
import org.telegram.ui.pp0;
import org.telegram.ui.r10;
import org.telegram.ui.rp0;
import org.telegram.ui.t10;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                    new lh.f(mVar.getContext()).show();
                    break;
                } else {
                    new lh.s(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                lj0 lj0Var = ((x2) obj).f;
                if (!lj0Var.b()) {
                    lj0Var.setProgress(0.0f);
                    lj0Var.d();
                    break;
                }
                break;
            case 4:
                ((o3) obj).getClass();
                break;
            case 5:
                e4 e4Var = (e4) obj;
                e4Var.d(e4Var);
                break;
            case 6:
                ((p4) obj).performClick();
                break;
            case 7:
                b5 b5Var = (b5) obj;
                b5Var.I.c(b5Var, true);
                break;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.c.onClick(u5Var);
                break;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    rp0.U(((pp0) ((kl0) x5Var).b).d, y5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                s7 s7Var = (s7) obj;
                if (s7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    p7 p7Var = s7Var.d;
                    int i11 = s7Var.c[intValue];
                    MessageObject messageObject = s7Var.b[intValue];
                    t10 t10Var = ((r10) ((org.telegram.ui.h) p7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.p0;
                    t10Var.f(i11, s7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.iq0;
import org.telegram.ui.kq0;
import org.telegram.ui.v10;
import org.telegram.ui.vl0;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                aj0 aj0Var = ((x2) obj).f;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
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
                    kq0.U(((iq0) ((vl0) w5Var).b).d, x5Var.b[((Integer) view.getTag()).intValue()]);
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
                    x10 x10Var = ((v10) ((org.telegram.ui.g) r7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.s0;
                    x10Var.f(i11, u7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.bq0;
import org.telegram.ui.dq0;
import org.telegram.ui.nl0;
import org.telegram.ui.s10;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                e4 e4Var = (e4) obj;
                e4Var.d(e4Var);
                break;
            case 6:
                ((p4) obj).performClick();
                break;
            case 7:
                b5 b5Var = (b5) obj;
                b5Var.L.c(b5Var, true);
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
                    dq0.U(((bq0) ((nl0) x5Var).b).d, y5Var.b[((Integer) view.getTag()).intValue()]);
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
                    u10 u10Var = ((s10) ((org.telegram.ui.g) r7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = u10.s0;
                    u10Var.f(i11, u7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

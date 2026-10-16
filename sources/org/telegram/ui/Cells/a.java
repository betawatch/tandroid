package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.b20;
import org.telegram.ui.lq0;
import org.telegram.ui.mq0;
import org.telegram.ui.oq0;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                    new yh.f(mVar.getContext()).show();
                    break;
                } else {
                    new yh.n(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                bk0 bk0Var = ((y2) obj).f;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
                    break;
                }
                break;
            case 4:
                ((p3) obj).getClass();
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
                b5Var.L.d(b5Var, true);
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
                    oq0.U(((mq0) ((lq0) x5Var).b).d, y5Var.b[((Integer) view.getTag()).intValue()]);
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
                    b20 b20Var = ((z10) ((org.telegram.ui.g) r7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = b20.s0;
                    b20Var.f(i11, u7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

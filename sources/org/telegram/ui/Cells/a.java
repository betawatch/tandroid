package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.aq0;
import org.telegram.ui.f10;
import org.telegram.ui.h10;
import org.telegram.ui.hl0;
import org.telegram.ui.yp0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    new zh.e(mVar.getContext()).show();
                    break;
                } else {
                    new zh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((v) obj).toggle();
                break;
            case 3:
                ak0 ak0Var = ((v2) obj).f;
                if (!ak0Var.b()) {
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
                    break;
                }
                break;
            case 4:
                ((m3) obj).getClass();
                break;
            case 5:
                i4 i4Var = (i4) obj;
                i4Var.d(i4Var);
                break;
            case 6:
                ((t4) obj).performClick();
                break;
            case 7:
                f5 f5Var = (f5) obj;
                f5Var.L.b(f5Var, true);
                break;
            case 8:
                y5 y5Var = (y5) obj;
                y5Var.d = y5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                y5Var.b(true);
                y5Var.c.onClick(y5Var);
                break;
            case 9:
                c6 c6Var = (c6) obj;
                b6 b6Var = c6Var.d;
                if (b6Var != null) {
                    aq0.V(((yp0) ((hl0) b6Var).b).d, c6Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                x7 x7Var = (x7) obj;
                if (x7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    u7 u7Var = x7Var.d;
                    int i11 = x7Var.c[intValue];
                    MessageObject messageObject = x7Var.b[intValue];
                    h10 h10Var = ((f10) ((org.telegram.ui.f) u7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = h10.s0;
                    h10Var.f(i11, x7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.jq0;
import org.telegram.ui.lq0;
import org.telegram.ui.ol0;
import org.telegram.ui.v10;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                nj0 nj0Var = ((y2) obj).f;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
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
                c5 c5Var = (c5) obj;
                c5Var.L.c(c5Var, true);
                break;
            case 8:
                v5 v5Var = (v5) obj;
                v5Var.d = v5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                v5Var.b(true);
                v5Var.c.onClick(v5Var);
                break;
            case 9:
                z5 z5Var = (z5) obj;
                y5 y5Var = z5Var.d;
                if (y5Var != null) {
                    lq0.U(((jq0) ((ol0) y5Var).b).d, z5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                v7 v7Var = (v7) obj;
                if (v7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    s7 s7Var = v7Var.d;
                    int i11 = v7Var.c[intValue];
                    MessageObject messageObject = v7Var.b[intValue];
                    x10 x10Var = ((v10) ((org.telegram.ui.g) s7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.s0;
                    x10Var.f(i11, v7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.f10;
import org.telegram.ui.fp0;
import org.telegram.ui.h10;
import org.telegram.ui.hp0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                    new ih.f(mVar.getContext()).show();
                    break;
                } else {
                    new ih.t(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                aj0 aj0Var = ((v2) obj).f;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    break;
                }
                break;
            case 4:
                ((m3) obj).getClass();
                break;
            case 5:
                c4 c4Var = (c4) obj;
                c4Var.d(c4Var);
                break;
            case 6:
                ((n4) obj).performClick();
                break;
            case 7:
                z4 z4Var = (z4) obj;
                z4Var.H.d(z4Var, true);
                break;
            case 8:
                s5 s5Var = (s5) obj;
                s5Var.d = s5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                s5Var.b(true);
                s5Var.c.onClick(s5Var);
                break;
            case 9:
                w5 w5Var = (w5) obj;
                v5 v5Var = w5Var.d;
                if (v5Var != null) {
                    hp0.U(((fp0) ((zk0) v5Var).b).d, w5Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 10:
                q7 q7Var = (q7) obj;
                if (q7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = q7Var.d;
                    int i11 = q7Var.c[intValue];
                    MessageObject messageObject = q7Var.b[intValue];
                    h10 h10Var = ((f10) ((org.telegram.ui.h) n7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = h10.o0;
                    h10Var.f(i11, q7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

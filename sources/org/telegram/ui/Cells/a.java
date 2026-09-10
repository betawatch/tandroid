package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.iq0;
import org.telegram.ui.kq0;
import org.telegram.ui.ul0;
import org.telegram.ui.x10;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    new wh.e(mVar.getContext()).show();
                    break;
                } else {
                    new wh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    break;
                }
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                kj0 kj0Var = ((x2) obj).f;
                if (!kj0Var.b()) {
                    kj0Var.setProgress(0.0f);
                    kj0Var.d();
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
                ((p4) obj).performClick();
                break;
            case 7:
                b5 b5Var = (b5) obj;
                b5Var.L.e(b5Var, true);
                break;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.c.onClick(u5Var);
                break;
            case 9:
                z5 z5Var = (z5) obj;
                y5 y5Var = z5Var.d;
                if (y5Var != null) {
                    kq0.U(((iq0) ((ul0) y5Var).b).d, z5Var.b[((Integer) view.getTag()).intValue()]);
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
                    z10 z10Var = ((x10) ((org.telegram.ui.g) s7Var).b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
                    z10Var.f(i11, v7Var, messageObject, intValue);
                    break;
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

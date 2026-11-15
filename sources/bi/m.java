package bi;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ m(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        y yVar = this.b;
        switch (i7) {
            case 0:
                yVar.dismiss();
                break;
            case 1:
                int value = yVar.Y1.getValue();
                int e10 = (int) yVar.h2.e();
                if (value >= e10) {
                    yVar.g1(value);
                    break;
                } else {
                    org.telegram.messenger.g0.E3(yVar.W1);
                    i20.t(hd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new cc(yVar.c, yVar.J0), R.raw.info, 36);
                    break;
                }
            default:
                yVar.Y1.setValueAnimated((int) yVar.h2.e());
                break;
        }
    }
}

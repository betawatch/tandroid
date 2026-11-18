package bi;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                    yVar.h1(value);
                    break;
                } else {
                    org.telegram.messenger.g0.D3(yVar.W1);
                    n10.u(gd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new lc(yVar.c, yVar.J0), R.raw.info, 36);
                    break;
                }
            default:
                yVar.Y1.setValueAnimated((int) yVar.h2.e());
                break;
        }
    }
}

// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class iz implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tz b;

    public /* synthetic */ iz(tz tzVar, byte b) {
        this.a = b;
        this.b = tzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        tz tzVar = this.b;
        switch (b) {
            case 0:
                tzVar.dismiss();
                break;
            case 1:
                int value = tzVar.X1.getValue();
                int e = (int) tzVar.g2.e();
                if (value >= e) {
                    tzVar.b1(value);
                    break;
                } else {
                    gm.z3(tzVar.V1);
                    b10.u(jb6.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new c41(tzVar.c, tzVar.J0), R.raw.info, 36);
                    break;
                }
            default:
                tzVar.X1.setValueAnimated((int) tzVar.g2.e());
                break;
        }
    }
}

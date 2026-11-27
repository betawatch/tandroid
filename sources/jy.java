// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jy implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uy b;

    public /* synthetic */ jy(uy uyVar, byte b) {
        this.a = b;
        this.b = uyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        uy uyVar = this.b;
        switch (b) {
            case 0:
                uyVar.dismiss();
                break;
            case 1:
                int value = uyVar.X1.getValue();
                int e = (int) uyVar.g2.e();
                if (value >= e) {
                    uyVar.c1(value);
                    break;
                } else {
                    hl.z3(uyVar.V1);
                    c00.v(ob6.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new d31(uyVar.c, uyVar.J0), R.raw.info, 36);
                    break;
                }
            default:
                uyVar.X1.setValueAnimated((int) uyVar.g2.e());
                break;
        }
    }
}

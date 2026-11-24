// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class iy implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ty b;

    public /* synthetic */ iy(ty tyVar, byte b) {
        this.a = b;
        this.b = tyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ty tyVar = this.b;
        switch (b) {
            case 0:
                tyVar.dismiss();
                break;
            case 1:
                int value = tyVar.X1.getValue();
                int e = (int) tyVar.g2.e();
                if (value >= e) {
                    tyVar.b1(value);
                    break;
                } else {
                    gl.z3(tyVar.V1);
                    b00.u(k96.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new u21(tyVar.c, tyVar.J0), R.raw.info, 36);
                    break;
                }
            default:
                tyVar.X1.setValueAnimated((int) tyVar.g2.e());
                break;
        }
    }
}

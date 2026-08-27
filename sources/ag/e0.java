package ag;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ e0(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                AndroidUtilities.addToClipboard(i1Var.p1());
                i1Var.dismiss();
                break;
            case 1:
                r0 r0Var = this.b.A0;
                if (!r0Var.h) {
                    r0Var.r.performClick();
                    break;
                } else {
                    r0Var.e.performClick();
                    break;
                }
            case 2:
                r0 r0Var2 = this.b.A0;
                if (!r0Var2.h) {
                    r0Var2.r.performClick();
                    break;
                } else {
                    r0Var2.e.performClick();
                    break;
                }
            default:
                i1.S(this.b);
                break;
        }
    }
}

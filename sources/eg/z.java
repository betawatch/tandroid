package eg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ z(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                break;
            case 1:
                g0 g0Var = this.b.B0;
                if (!g0Var.h) {
                    g0Var.r.performClick();
                    break;
                } else {
                    g0Var.e.performClick();
                    break;
                }
            case 2:
                g0 g0Var2 = this.b.B0;
                if (!g0Var2.h) {
                    g0Var2.r.performClick();
                    break;
                } else {
                    g0Var2.e.performClick();
                    break;
                }
            default:
                v0.S(this.b);
                break;
        }
    }
}

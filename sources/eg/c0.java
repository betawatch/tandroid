package eg;

import android.view.View;
import gg.v2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements org.telegram.ui.ActionBar.c2, jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ c0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        v0 v0Var = this.b;
        v0Var.d.getOnItemClickListener().d(i10, view);
        if (v0Var.e0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.H0.presentFragment(new PremiumPreviewFragment(0, null));
                v0Var.dismiss();
                d2Var.dismiss();
                break;
            case 1:
                d2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                v2.e0(0, null);
                break;
        }
    }
}

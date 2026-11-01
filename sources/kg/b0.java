package kg;

import android.view.View;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements org.telegram.ui.ActionBar.u1, jk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ b0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        q0 q0Var = this.b;
        q0Var.k1.getOnItemClickListener().f(i10, view);
        if (q0Var.Z1 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.C2.presentFragment(new PremiumPreviewFragment(0, null));
                q0Var.dismiss();
                x1Var.dismiss();
                break;
            default:
                x1Var.dismiss();
                this.b.i1();
                break;
        }
    }
}

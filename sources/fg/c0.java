package fg;

import android.view.View;
import hg.v2;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements org.telegram.ui.ActionBar.c2, kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ c0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        v0 v0Var = this.b;
        v0Var.d.getOnItemClickListener().f(i10, view);
        if (v0Var.e0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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

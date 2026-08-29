package cg;

import android.view.View;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements org.telegram.ui.ActionBar.b2, bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ c0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        v0 v0Var = this.b;
        v0Var.d.getOnItemClickListener().c(i10, view);
        if (v0Var.d0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.G0.presentFragment(new PremiumPreviewFragment(0, null));
                v0Var.dismiss();
                c2Var.dismiss();
                break;
            case 1:
                c2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                eg.w2.e0(0, null);
                break;
        }
    }
}

package ag;

import android.view.View;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements org.telegram.ui.ActionBar.a2, rk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ i0(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        i1 i1Var = this.b;
        i1Var.d.getOnItemClickListener().a(i10, view);
        if (i1Var.d0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                i1Var.G0.presentFragment(new PremiumPreviewFragment(0, null));
                i1Var.dismiss();
                b2Var.dismiss();
                break;
            case 1:
                b2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                cg.y2.e0(0, null);
                break;
        }
    }
}

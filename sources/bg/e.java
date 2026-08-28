package bg;

import android.view.View;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements org.telegram.ui.ActionBar.b2, ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf.j0 b;

    public /* synthetic */ e(zf.j0 j0Var, int i9) {
        this.a = i9;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        zf.j0 j0Var = this.b;
        j0Var.d.getOnItemClickListener().a(i9, view);
        if (j0Var.d0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                g3.d0(0, null);
                break;
            case 1:
                zf.j0 j0Var = this.b;
                j0Var.G0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                this.b.n1();
                break;
        }
    }
}
